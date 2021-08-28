package kr.ac.arttech;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		HttpSession session = request.getSession();
		
		//회원가입 성공 또는 실패 확인
		String resultJoin = (String) session.getAttribute("resultJoin");
		if(resultJoin != null || resultJoin == "") {
			session.removeAttribute("resultJoin");
			mav.addObject("resultJoin", resultJoin); //회원가입 성공 시 success가 index로 감
		}
		
		mav.setViewName("index");
		return mav;
	}
}
