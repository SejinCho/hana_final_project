package kr.ac.artTechManager.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.ac.artTechManager.vo.ArtworkInfoVO;
import kr.ac.artTechManager.vo.MemberVO;
import kr.ac.artTechManager.vo.VoteVO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ArtworkDAOImpl implements ArtworkDAO {
	private final SqlSession sqlSession;
	
	//공동구매 등록
	@Override
	public int insertArtworkInfo(ArtworkInfoVO artworkInfo) {
		return sqlSession.insert("kr.ac.kopo.manage.artworkInfo.insertArtworkInfo", artworkInfo);
	}
	
	//공동구매 작품 이미지 저장
	@Override
	public int insertArtworkInfoImg(Map<String, Object> map) {
		return sqlSession.insert("kr.ac.kopo.manage.artworkInfo.insertArtworkInfoImg", map);
	}
	
	//공동구매 작품 리스트
	@Override
	public List<ArtworkInfoVO> selectArtworkInfoList() {
		return sqlSession.selectList("kr.ac.kopo.manage.artworkInfo.selectArtworkInfoList");
	}
	
	//공동구매 이미지 시퀀스값 가져오기
	public int selectArtworkInfoImgId() {
		return sqlSession.selectOne("kr.ac.kopo.manage.artworkInfo.selectArtworkInfoImgId");
	}
	
	//공동구매 작품 시퀀스값 가져오기
	@Override
	public int selectArtworkInfoId() {
		return sqlSession.selectOne("kr.ac.kopo.manage.artworkInfo.selectArtworkInfoId");
	}
	
	//goodsDetail
	@Override
	public ArtworkInfoVO selectArtworkInfo(String artworkInfoId) {
		return sqlSession.selectOne("kr.ac.kopo.manage.artworkInfo.selectArtworkInfo", artworkInfoId);
	}
	
	//가격정보 테이블에 insert
	@Override
	public int insertArtworkAmt(String id) {
		return sqlSession.insert("kr.ac.kopo.manage.artworkInfo.insertArtworkAmt", id);
	}
	
	//투표해야할 유저 list
	@Override
	public List<MemberVO> selectVoteMemberInfo(String artwortInfoId) {
		return sqlSession.selectList("kr.ac.kopo.manage.artworkInfo.selectVoteMemberInfo", artwortInfoId);
	}
	
	//투표중으로 상태 update
	@Override
	public int updateArtworkInfoStateVote(String artwortInfoId) {
		return sqlSession.update("kr.ac.kopo.manage.artworkInfo.updateArtworkInfoStateVote", artwortInfoId);
	}
	//투표시작하면 table에 insert
	@Override
	public int insertVoteInfo(VoteVO vote) {
		return sqlSession.insert("kr.ac.kopo.manage.artworkInfo.insertVoteInfo", vote);
	}
	
	//투표 정보 가져오기
	@Override
	public VoteVO selectVoteInfo(String artworkInfoId) {
		return sqlSession.selectOne("kr.ac.kopo.manage.artworkInfo.selectVoteInfo", artworkInfoId);
	}
	
	//투표중(3) -> 투표종료(4)
	@Override
	public int updateStateVote(String today) {
		return sqlSession.update("kr.ac.kopo.manage.artworkInfo.updateStateVote", today);
	}
	
	
	
}
