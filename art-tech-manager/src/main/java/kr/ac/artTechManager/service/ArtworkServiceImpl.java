package kr.ac.artTechManager.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.JsonObject;

import kr.ac.artTechManager.dao.ArtworkDAO;
import kr.ac.artTechManager.dao.MemberDAO;
import kr.ac.artTechManager.util.AuthUtil;
import kr.ac.artTechManager.vo.ArtworkInfoImg;
import kr.ac.artTechManager.vo.ArtworkInfoVO;
import kr.ac.artTechManager.vo.MemberVO;
import kr.ac.artTechManager.vo.VoteVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArtworkServiceImpl implements ArtworkService{
	
	private final ArtworkDAO dao;
	
	//add artwork
	@Transactional
	@Override
	public boolean addArtworkInfo(ArtworkInfoVO artworkInfo, List<MultipartFile> multipartFile) throws Exception{
		boolean result = false;
		
		String id = "artwork" + dao.selectArtworkInfoId();
		
		//db에 저장 후 성공하면 트랜잭션 추가(admin 지갑에 추가)
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		JsonObject parameters = new	JsonObject();
		parameters.addProperty("artId", id);
		parameters.addProperty("value", artworkInfo.getTargetPiece());
		
		HttpEntity<Object> entity = new HttpEntity<Object>(parameters.toString(), headers);
		
		String url = "http://localhost:18080/art";
		
		RestTemplate restTemplate = new RestTemplate();
		Object blockHash = restTemplate.postForObject(url,entity, Object.class);
		
		System.out.println(blockHash);
		
		
		
		//작품 이미지 데이터 
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		String filePath = "C:/art-tech/artwork_img";
		List<ArtworkInfoImg> artworkInfoImgList = new ArrayList<ArtworkInfoImg>();
		
		
		
		List<String> fileNameList = new ArrayList<>();
		
		//파일이 존재할 때
		if(multipartFile.size() > 0 && !multipartFile.get(0).getOriginalFilename().equals("")) {
			for(MultipartFile file : multipartFile) {
				ArtworkInfoImg artworkInfoImg = new ArtworkInfoImg();
				
				artworkInfoImg.setOrgnFileName(file.getOriginalFilename());
				String fileChanName = UUID.randomUUID().toString().replace("-", "") + file.getOriginalFilename();
				artworkInfoImg.setFileChanName(fileChanName);
				artworkInfoImg.setFileSize(file.getSize());
				artworkInfoImg.setArtworkInfoId(id);
				artworkInfoImg.setFilePath(filePath);
				artworkInfoImg.setId("artworkImg" + dao.selectArtworkInfoImgId());
				artworkInfoImgList.add(artworkInfoImg);
				fileNameList.add(fileChanName);
			
			}
			paramMap.put("paramMap", artworkInfoImgList);
		}
		
		
		//작품 정보 저장
		artworkInfo.setId(id);
		int cnt = dao.insertArtworkInfo(artworkInfo);
		//이미지 저장
		cnt += dao.insertArtworkInfoImg(paramMap);
		
		//가격 테이블에 insert
		cnt += dao.insertArtworkAmt(id);
		
		
		
		if(cnt > 2) {
			
			for(int i = 0; i < multipartFile.size() ; ++i ) {
				File dest = new File(filePath + "/" + fileNameList.get(i));
				multipartFile.get(i).transferTo(dest);
			}
			
			result = true;
		}
		
		return result;
	}
	
	//전체 리스트
	@Override
	public List<ArtworkInfoVO> getArtworkInfoList() {
		return dao.selectArtworkInfoList();
	}
	
	//디테일 정보
	@Override
	public Map<String, Object> getArtworkInfo(String artworkInfoId) {
		Map<String, Object> map = new HashMap<>();
		
		//정보 가져오기
		map.put("artworkInfo", dao.selectArtworkInfo(artworkInfoId));
		
		//사진 가져오기
		return map;
	}
	
	//매각투표 
	@Transactional
	@Override
	public String startVote(VoteVO vote) {
		
		String result = "fail";
		//매각 투표 중으로 상태 변경
		int cnt = dao.updateArtworkInfoStateVote(vote.getArtworkInfoId());
		//투표 정보 insert
		cnt += dao.insertVoteInfo(vote);
		
		//member info 가져오기(해당 작품을 산 사람)
		List<MemberVO> memberList = dao.selectVoteMemberInfo(vote.getArtworkInfoId());
		
		vote.setType("1");
		if(cnt == 2) {
			memberList.forEach(member -> {
				String email = member.getEmail();
				String phone = member.getPhone();
				//AuthUtil.authEmail(vote, email);
				//AuthUtil.authPhone(vote, phone);
			});
			result = "success";
		}
		
		
		return result;
	}
	
	//투표 정보 가져오기
	@Override
	public VoteVO getVoteInfo(String artworkInfoId) {
		return dao.selectVoteInfo(artworkInfoId);
	}
	
	//투표중(3) -> 투표종료(4) : 스케줄러
	@Override
	public int modifyStateVote() {
		String today = LocalDate.now().toString();
		return dao.updateStateVote(today);
	}
	
	//디테일 페이지 업무
	@Override
	public boolean startGoodsDetailTast(VoteVO vote) {
		boolean result = false;
		switch (vote.getState()) {
		case "4": //투표 종료 -> 매각 기각 또는 매각 진행 
			if((vote.getTotalNo() - vote.getAgreeNo()) <= vote.getAgreeNo()) { //매각진행
				//상태 변경(매각 중으로)
				vote.setState("5");
				int cnt = dao.updateArtworkState(vote);
				
				//매각처, 매각 금액 update
				cnt += dao.updateSellInfo(vote);
				
				//문자 보내기
				//member info 가져오기(해당 작품을 산 사람)
				vote.setType("2");
				List<MemberVO> memberList = dao.selectVoteMemberInfo(vote.getArtworkInfoId());
				memberList.forEach(member -> {
					String email = member.getEmail();
					String phone = member.getPhone();
					//AuthUtil.authEmail(vote, email);
					AuthUtil.authPhone(vote, phone);
				});
				if(cnt == 2) {
					result = true;
				}
			}else { //매각 기각
				
			}
			break;
		case "5": //수익분배 진행 
			break;
		
		case "6" : //수익분배 완료(매각완료)
			break;
		
		}
		
		return result;
	}
}
