package kr.ac.arttech.member.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyHistoryVO {
	private String id; //구매정보
	private String artworkInfoId; //작품 정보 id
	private String title;
	
	private String regDate ; //구매 날짜
	private int pieceNo; //조각 개수
	private String type ; //1.공동구매 2. 판매
	private String pieceAmt; //구매 가격
	
	private String state; //상태(0. 모집 예정 1.모집중, 2.모집완료, 3.매각투표, 4.투표종료, 5.매각중, 6.수익분배 7.매각완료)
	private String stateName;
	private String writerName;
}
