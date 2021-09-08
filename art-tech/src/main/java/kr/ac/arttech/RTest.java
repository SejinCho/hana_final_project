package kr.ac.arttech;

import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;

public class RTest {
	public static void main(String[] args) throws Exception {
		RConnection conn = new RConnection();
		
		conn.eval("source('C:/art-tech/rscript/collaborative-filtering.R')"); //스크립트 실행
		
		String id = "member2";
		//리스트 받아오기 (try - catch문 사용)
		conn.eval("who <- as.numeric(which(pivot_data$MEMBER_ID=='"+ id+"'))");
		RList list = conn.eval("as(predict(rec_UBCF, matrix_data[who, ], type = 'topNList', n = 3), 'list')").asList();
		String[] ids = list.at(0).asStrings();
		for(String i : ids) {
			System.out.println(i);
		}
		
		
		/*
		RList list = conn.eval("list_data").asList();
		String[] ids = list.at(0).asStrings();
		for(String i : ids) {
			System.out.println(i);
		}
		*/
	}
}
