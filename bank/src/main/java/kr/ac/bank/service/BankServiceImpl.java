package kr.ac.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import kr.ac.bank.dto.AccountInfoDTO;
import kr.ac.bank.dto.AccountTransferInfoDTO;
import kr.ac.bank.dto.MemberInfoDTO;
import kr.ac.bank.mapper.BankMapper;
import kr.ac.bank.util.SecurityUtil;
import kr.ac.bank.util.SendSMS;
import kr.ac.bank.util.Token;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService{
	private final BankMapper mapper;
	
	//토큰 생성
	@Override
	public String createToken() {
		return Token.createToken();
	}
	
	
	//한명의 계좌 리스트
	@Override
	public List<AccountInfoDTO> getAccountList(MemberInfoDTO memberInfoDTO) {
		List<AccountInfoDTO> getAccountList = null;
		if(Token.checkExpToken(memberInfoDTO.getToken())) {
			//정보 가져오기
			String id = memberInfoDTO.getId();
			System.out.println("은행 서버 계좌리스트 서비스 id : " + id);
			MemberInfoDTO member = mapper.getMemberInfo(id);
			System.out.println("은행 서버 계좌리스트 서비스 member : " + member);
			getAccountList = mapper.selectAccountInfoList(member);
			System.out.println("은행 서버 계좌리스트 서비스 getAccountList : " + getAccountList);
			
		}
		
		return getAccountList;
	}
	
	
	//특정 계좌 정보
	@Override
	public List<AccountInfoDTO> getAccount(Map<String, String> map) {
		List<AccountInfoDTO> accountInfoList = new ArrayList<AccountInfoDTO>();
		
		String token = map.get("token") ;
		if(Token.checkExpToken(token) ) {
			//정보 가져오기
			String id = map.get("id");
			//주민 아이디 가져오기
			MemberInfoDTO member = mapper.getMemberInfo(id);
			
			map.put("juminNo", member.getJuminNo());
			map.put("name", member.getName());
			
			accountInfoList.add(mapper.selectAccountInfo(map));
		}
		
		return accountInfoList;
	}
	/*
	@Override
	public List<AccountInfoDTO> getAccount(Map<String, String> map) {
		List<AccountInfoDTO> accountInfoList = new ArrayList<AccountInfoDTO>();
		MemberInfoDTO memberInfoDTO = new MemberInfoDTO();
		memberInfoDTO.setToken(map.get("token"));
		
		if(Token.checkExpToken(memberInfoDTO) ) {
			//정보 가져오기
			map.put("juminNo", Token.getJuminNo(memberInfoDTO));
			map.put("name", Token.getName(memberInfoDTO));
			
			accountInfoList.add(mapper.selectAccountInfo(map));
		}
		
		return accountInfoList;
	}
	*/
	
	@Override
	public List<AccountTransferInfoDTO> getTranInfoList(AccountTransferInfoDTO tranInfo) {
		List<AccountTransferInfoDTO> tranInfoList = null;
		
		String token = tranInfo.getToken();
		if(Token.checkExpToken(token) ) {
			
			tranInfoList = mapper.selectTranInfoList(tranInfo);
		}
		
		return tranInfoList;
	}
	
	
	//총 예치금
	@Override
	public String getTotalDeposit(MemberInfoDTO memberInfoDTO) {
		String total = "";
		
		String token = memberInfoDTO.getToken();
		
		if(Token.checkExpToken(token) ) {
			//정보 가져오기
			total = mapper.selectTotalDeposit(memberInfoDTO.getId());
		}
		
		return total;
	}
	/*
	@Override
	public String getTotalDeposit(String token) {
		String paramToken = "";
		try {
			JSONObject jObject = new JSONObject(token);
			paramToken = jObject.getString("token");
			
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		String total = "";
		MemberInfoDTO memberInfoDTO = new MemberInfoDTO();
		memberInfoDTO.setToken(paramToken);
		
		if(Token.checkExpToken(memberInfoDTO) ) {
			//정보 가져오기
			total = mapper.selectTotalDeposit(paramToken);
		}
		
		return total;
	}
	*/
	
	//이체
	@Override
	public String addTranInfo(List<AccountTransferInfoDTO> accountTranInfoList) {
		String result = "fail";
		
		//dao로 가져갈 파라미터 생성
		List<AccountTransferInfoDTO> param = new ArrayList<>();
		
		int cnt = 0;
		for(AccountTransferInfoDTO accountTranInfo : accountTranInfoList) {
			//토큰 유효한지 확인
			MemberInfoDTO memberInfoDTO = new MemberInfoDTO();
			memberInfoDTO.setToken(accountTranInfo.getToken());
			
			if(Token.checkExpToken(accountTranInfo.getToken()) ) {
				//정보 가져오기
				String id = "transfer" + mapper.selectAccountTranInfoSeq(); //시퀀스값 가져오기
				
				//추가 정보 넣기
				accountTranInfo.setId(id);
				accountTranInfo.setJuminNo(Token.getJuminNo(memberInfoDTO));
				accountTranInfo.setName(Token.getName(memberInfoDTO));
				
				//이체 테이블에 insert
				cnt += mapper.insertAccountTranInfo(accountTranInfo);
				
			}
			
		}
		
		if(cnt == accountTranInfoList.size()) {
			result = "success";
		}
		
		
		return result;
	}
	/*
	@Override
	public String addTranInfo(List<AccountTransferInfoDTO> accountTranInfoList) {
		String result = "fail";
		
		//dao로 가져갈 파라미터 생성
		List<AccountTransferInfoDTO> param = new ArrayList<>();
		
		int cnt = 0;
		for(AccountTransferInfoDTO accountTranInfo : accountTranInfoList) {
			//토큰 유효한지 확인
			MemberInfoDTO memberInfoDTO = new MemberInfoDTO();
			memberInfoDTO.setToken(accountTranInfo.getToken());
			
			if(Token.checkExpToken(memberInfoDTO) ) {
				//정보 가져오기
				String id = "transfer" + mapper.selectAccountTranInfoSeq(); //시퀀스값 가져오기
				
				//추가 정보 넣기
				accountTranInfo.setId(id);
				accountTranInfo.setJuminNo(Token.getJuminNo(memberInfoDTO));
				accountTranInfo.setName(Token.getName(memberInfoDTO));
				
				//이체 테이블에 insert
				cnt += mapper.insertAccountTranInfo(accountTranInfo);
				
			}
			
		}
		
		if(cnt == accountTranInfoList.size()) {
			result = "success";
		}
		
		
		return result;
	}
	 */
	
	//핸드폰 인증
	@Override
	public String phoneAuth(String phone) {
		String ranNo = SendSMS.autoTranInfoPhone(phone);
		return ranNo;
	}
	//핸드폰 인증번호 맞는지 확인
	@Override
	public String phoneAuthCheck(String ranNo, String inputRanNo, String phone) {
		String apiResult = "";
		if(ranNo.equals(inputRanNo)) {
			//인증상태 y로 업데이트
			mapper.updateAuthAgree(phone);
			
			//id값 가져오기
			String id = mapper.selectOpenbankingSeq(phone);
			
			String url = "http://localhost:8080/arttech/authResult";
			RestTemplate restTemplate = new RestTemplate();
			Map<String, String> data = (Map<String, String>) restTemplate.postForObject(url,id, Object.class);
			apiResult = data.get("data");
			
		}
		return apiResult;
	}
}
