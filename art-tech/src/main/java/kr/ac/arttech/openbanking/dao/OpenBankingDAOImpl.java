package kr.ac.arttech.openbanking.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.ac.arttech.member.vo.MemberVO;
import kr.ac.arttech.openbanking.vo.AccountInfoVO;
import kr.ac.arttech.openbanking.vo.AutoTranAccountVO;
import kr.ac.arttech.openbanking.vo.ManageAccountInfoVO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class OpenBankingDAOImpl implements OpenBankingDAO{
	
	private final SqlSession sqlSession;
	
	//오픈뱅킹 동의했는지 확인
	@Override
	public String checkServiceAgree(String memberId) {
		return sqlSession.selectOne("kr.ac.arttech.openbanking.checkOpenBankingAgree",memberId );
	}
	
	//오픈뱅킹 동의(Y로 바꾸고, 토큰 추가)
	@Override
	public int updateServiceAgreeState(MemberVO member) {
		return sqlSession.update("kr.ac.arttech.openbanking.updateServiceAgreeState", member);
	}
	
	//오픈뱅킹 토큰 생성을 위한 정보 가져오기 
	@Override
	public MemberVO selectMemberNameJumin(String memberId) {
		return sqlSession.selectOne("kr.ac.arttech.openbanking.selectMemberNameJumin", memberId);
	}
	
	//토큰 가져오기
	@Override
	public String selectToken(String memberId) {
		return sqlSession.selectOne("kr.ac.arttech.openbanking.selectToken",memberId);
	}
	
	//자동예치금 설정한 계좌(유저 1명에 대해서)
	@Override
	public List<AutoTranAccountVO> selectAutoAccountList(String memberId) {
		return sqlSession.selectList("kr.ac.arttech.openbanking.selectAutoAccountList",memberId);
	}
	//설정안한 계좌 리스트
	@Override
	public List<AccountInfoVO> selectNonAutoAccountList(Map<String, String> map) {
		return sqlSession.selectList("kr.ac.arttech.openbanking.selectNonAutoAccountList", map);
	}
	
	@Override
	public String selectJuminNo(String memberId) {
		return sqlSession.selectOne("kr.ac.arttech.openbanking.selectJuminNo", memberId);
	}
	
	//자동이체 설정
	@Override
	public int insertAutoAccountInfo(Map<String, Object> paramMap) {
		return sqlSession.insert("kr.ac.arttech.openbanking.insertAutoAccountInfo", paramMap);
	}
	
	//자동이체 설정 취소
	@Override
	public int deleteAutoAccountInfo(Map<String, Object> paramMap) {
		return sqlSession.delete("kr.ac.arttech.openbanking.deleteAutoAccountInfo", paramMap);
	}
	
	//자동이체 시퀀스 가져오기
	@Override
	public int selectSeqNo() {
		return sqlSession.selectOne("kr.ac.arttech.openbanking.selectSeqNo");
	}
	
	//자동이체할 계좌 list 가져오기(전체유저)
	@Override
	public List<AutoTranAccountVO> selectAutoTranAccountInfoList() {
		return sqlSession.selectList("kr.ac.arttech.openbanking.selectAutoTranAccountInfoList");
	}
	
	//회사 계좌 정보
	@Override
	public ManageAccountInfoVO selectManageAccountInfo() {
		return sqlSession.selectOne("kr.ac.arttech.openbanking.selectManageAccountInfo");
	}
}