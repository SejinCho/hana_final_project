package kr.ac.arttech.member.service;

import java.util.List;

import kr.ac.arttech.member.vo.MemberVO;
import kr.ac.arttech.member.vo.MyHistoryVO;

public interface MemberService {
	public int checkUserId(String userId); //아이디 있는지 확인 (count)
	public boolean addMember(MemberVO member) ; //회원가입
	
	public MemberVO getMemberInfo(String id); //회원정보 가져오기
	public String getMemberId(String userId); //member id(pk) 가져오기
	
	public int checkSignin(MemberVO member); //아이디 비밀번호 chekc(count)
	
	public List<MyHistoryVO> getMyHistoryListAll(String memberId); //my history all
	public String createWalletInfo(String id); //지갑 생성하기

}
