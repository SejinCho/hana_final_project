package kr.ac.artTechManager.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoteVO {
	private String id;
	private String artworkInfoId;
	private String agreeNo; //매각 찬성 수 
	private String totalNo; //전체 수
	private String regDate;
	private String startDate;
	private String endDate;
	
	private String url;
	private String writerName;
	private String title;
	private String type; //1. 투표  / 2. 투표 결과 / 3. 매각대금 분배안내 / 4. 분배완료
}
