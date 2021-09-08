package kr.ac.arttech;

import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;

public class RTest {
	public static void main(String[] args) throws Exception {
		RConnection conn = new RConnection();
		System.out.println("하나");
		conn.eval("source('C:/art-tech/rscript/collaborative-filtering.R')");
		System.out.println("둘");
		String id = conn.eval("a").asString();
		System.out.println("id : " + id);
		
		//리스트 받아오기
		RList list = conn.eval("list_data").asList();
		String[] ids = list.at(0).asStrings();
		for(String i : ids) {
			System.out.println(i);
		}
	}
}
