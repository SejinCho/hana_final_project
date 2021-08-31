package kr.ac.arttech.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import kr.ac.arttech.artscan.vo.WalletInfoVO;
import kr.ac.arttech.member.dao.MemberDAO;
import kr.ac.arttech.member.vo.MemberVO;
import kr.ac.arttech.member.vo.MyHistoryVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

	private final MemberDAO dao;

	//아이디 중복검사
	@Override
	public int checkUserId(String userId) {
		return dao.checkUserId(userId);
	}
	
	//회원가입
	@Override
	public boolean addMember(MemberVO member) {
		boolean result = false;
		if(dao.insertMember(member) == 1) {
			result = true;
		}
		return result;
	}
	
	//member id(pk) 가져오기
	@Override
	public String getMemberId(String userId) {
		return dao.selectMemberId(userId);
	}
	
	//회원정보 가져오기
	@Override
	public MemberVO getMemberInfo(String id) {
		return dao.selectMemberInfo(id);
	}
	
	//로그인 검사
	@Override
	public int checkSignin(MemberVO member) {
		int result = 0; //아이디가 존재하지 않음
		
		result += dao.checkUserId(member.getUserId()); //1 : 비번과 아이디 일치하지 않음
		result += dao.checkUserIdPassword(member); // 2: 로그인 성공~
		
		return result;
	}
	
	//my history all
	@Override
	public List<MyHistoryVO> getMyHistoryListAll(String memberId) {
		return dao.selectMyHistoryListAll(memberId);
	}
	//myhistory 옵션 선택했을 때 list 
	@Override
	public List<MyHistoryVO> getMyHistoryListOption(Map<String, String> map) {
		List<MyHistoryVO> myHistoryList = null;
		String option = map.get("option");
		String memberId = map.get("memberId");
		
		switch (option) {
		case "all": //전체
			myHistoryList = dao.selectMyHistoryListAll(memberId);
			break;
		
		case "ing" : //모집중
			myHistoryList = dao.selectMyHistoryListRecruit(memberId);
			break;
		
		case "end" : //모집완료
			
			break;
			
		case "": //매각작품
			break;
		}
		
		return myHistoryList;
	}
	
	//지갑 생성
	@Override
	public String createWalletInfo(String id) {
		String result = "";
		//지갑 생성
		String url = "http://localhost:18080/wallet";
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Object> data = (Map<String, Object>) restTemplate.postForObject(url,null, Object.class);
		Map<String, String> wallet = (Map<String, String>) data.get("data");
		wallet.put("id", id);
		
		int cnt = dao.updateWalletInfo(wallet);
		if(cnt == 1) {
			result = wallet.get("publicKey");
		}
		return result;
	}
}
