package kr.ac.kopo.controller;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		//반환용 리스트
		List<List<String>> ret = new ArrayList<List<String>>();
		BufferedReader br = null;
		int agree = 0;
		int disagree = 0;
		try {
			String path = "C:\\art-tech\\votefile\\" + "artwork43.csv";
			br = Files.newBufferedReader(Paths.get(path));
			//Charset.forName("UTF-8");
            String line = "";
            
            while((line = br.readLine()) != null){
                //CSV 1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String test = line.split(",")[2];
                System.out.println("test : " + test);
                if(line.split(",")[2].equals("동의")) {
                	++ agree;
                }else if(line.split(",")[2].equals("반대")) {
                	++ disagree;
                }
                String array[] = line.split(",");
                //배열에서 리스트 반환
                tmpList = Arrays.asList(array);
                System.out.println(tmpList);
                ret.add(tmpList);
            }
            System.out.println("파일 : " + ret);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		mav.setViewName("test");
		mav.addObject("agree", agree);
		mav.addObject("disagree", disagree);
		
		return mav;
	}
}
