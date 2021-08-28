package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.OpenAPIOpenBankingDAO;
import kr.ac.kopo.vo.AccountInfoVO;

@Service
public class OpenAPIOpenBankingServiceImpl implements OpenAPIOpenBankingService{
	
	@Autowired
	OpenAPIOpenBankingDAO dao ;
	
	@Override
	public List<AccountInfoVO> getMyAccountInfoList() {
		return dao.getMyAccountInfoList();
	}
}
