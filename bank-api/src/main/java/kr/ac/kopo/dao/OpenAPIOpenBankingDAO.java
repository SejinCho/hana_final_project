package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.vo.AccountInfoVO;

public interface OpenAPIOpenBankingDAO {
	public List<AccountInfoVO> getMyAccountInfoList(); //계좌 리스트 가져오기
	
	//잔돈 가져오기
	//거래내역 가져오기
	//계좌 실명 조회
}
