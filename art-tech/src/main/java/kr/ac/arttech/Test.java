package kr.ac.arttech;

import kr.ac.arttech.util.SecurityUtil;

public class Test {
	public static void main(String[] args) {
		String a = "111111";
		
		//new SecurityUtil();
		//String b = SecurityUtil.encryptSHA256(a);
		//System.out.println(b);
		
		
		//암호화 해보기 test
		String content = "조세진:92022:요기";
		try {
			String aa = new SecurityUtil().encryptAES256(content);
			System.out.println("aa : "  + aa);
			String bb = new SecurityUtil().decryptAES256(aa);
			System.out.println("bb : " + bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
