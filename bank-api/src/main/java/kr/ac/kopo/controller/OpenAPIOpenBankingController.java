package kr.ac.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.service.OpenAPIOpenBankingService;
import kr.ac.kopo.vo.AccountInfoVO;

@Controller
@RequestMapping("/openapi/open-banking")
public class OpenAPIOpenBankingController {
	
	@Autowired
	OpenAPIOpenBankingService service ;
	
	@RequestMapping("/myAccountInfo.do")
	@ResponseBody
	public List<AccountInfoVO> getMyAccountInfo() {
		List<AccountInfoVO> list = service.getMyAccountInfoList();
		return list;
	}
}
