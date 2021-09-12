package kr.ac.arttech.util;

import java.util.ArrayList;
import java.util.List;

import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;

public class CollaborativeFilteringUtil {
	
	public static List<String> getRecommendArtwork(String memberId) {
		List<String> result = null;
		
		try {
			RConnection conn = new RConnection();
			conn.eval("source('C:/art-tech/rscript/collaborative-filtering-run.R')"); //스크립트 실행
			
			//리스트 받아오기 (try - catch문 사용)
			conn.eval("who <- as.numeric(which(pivot_data$MEMBER_ID=='"+ memberId +"'))");
			RList list = conn.eval("as(predict(rec_UBCF, matrix_data[who, ], type = 'topNList', n = 3), 'list')").asList();
			String[] ids = list.at(0).asStrings();
			result = new ArrayList<>();
			for(String id : ids) {
				result.add(id);
				System.out.println("id : " + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
