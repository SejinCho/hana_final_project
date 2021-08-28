package kr.ac.arttech.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.arttech.member.service.MemberService;
import kr.ac.arttech.member.vo.MemberVO;
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
}
