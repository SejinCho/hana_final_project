package kr.ac.arttech.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.arttech.member.service.MemberService;
import kr.ac.arttech.member.vo.MemberVO;
import kr.ac.arttech.member.vo.MyGalleryVO;
import kr.ac.arttech.member.vo.MyHistoryVO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberAPIController {
	private final MemberService service;
	
	//id check
	@PostMapping("/idCheck")
	public int checkUserId(String userId) {
		return service.checkUserId(userId);
	}
	
	//지갑 생성
	@PostMapping("/wallet")
	public String wallet(HttpSession session) {
		String id = (String)session.getAttribute("memberId");
		return service.createWalletInfo(id);
	}
	
	//mypage/myHistory option으로 가져오기
	@GetMapping("/myHistoryOption")
	public List<MyHistoryVO> myHistoryOption(String option, HttpSession session) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("memberId", (String) session.getAttribute("memberId"));
		map.put("option", option);
		
		return service.getMyHistoryListOption(map);
	}
	
	@GetMapping("/myGalleryOption")
	public List<MyGalleryVO> myGalleryOption(String option, HttpSession session) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("memberId", (String) session.getAttribute("memberId"));
		map.put("option", option);
		
		return service.getMyGalleryList(map);
	}
	
}
