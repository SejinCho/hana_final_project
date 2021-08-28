package kr.ac.artTechManager.dao;

import java.util.List;

import kr.ac.artTechManager.vo.MemberVO;



public interface MemberDAO {
	public List<MemberVO> selectMemberInfoList(); //전체 멤버 정보 list
}
