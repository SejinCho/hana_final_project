package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.vo.AccountInfoVO;

public interface OpenAPIOpenBankingService {
	public List<AccountInfoVO> getMyAccountInfoList();
}
