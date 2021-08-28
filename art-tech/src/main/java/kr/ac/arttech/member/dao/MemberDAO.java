package kr.ac.arttech.member.dao;

import java.util.List;
import java.util.Map;

import kr.ac.arttech.member.vo.MemberVO;
import kr.ac.arttech.member.vo.MyHistoryVO;

public interface MemberDAO {
	public int checkUserId(String userId); //아이디 있는지 확인(count)
	public int insertMember(MemberVO member); //회원가입
	
	public MemberVO selectMemberInfo(String id); //member 정보 가져오기
	public String selectMemberId(String userId); //member id(pk) 가져오기
	
	public int checkUserIdPassword(MemberVO member); //아이디 비밀번호 확인 (count)
	public String selectEasyPassword(String id); //간편 비번 가져오기
	
	public List<MyHistoryVO> selectMyHistoryListAll(String memberId) ; //myHistory 전체
	public int updateWalletInfo(Map<String, String> wallet); //wallet update(지갑 생성 클릭)
}
