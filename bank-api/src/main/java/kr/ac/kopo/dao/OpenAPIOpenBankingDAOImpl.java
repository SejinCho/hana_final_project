package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.vo.AccountInfoVO;

@Repository
public class OpenAPIOpenBankingDAOImpl implements OpenAPIOpenBankingDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<AccountInfoVO> getMyAccountInfoList() {
		return sqlSession.selectList("kr.ac.kopo.openApi.openBanking.getMyAccountInfoList");
	}
}
