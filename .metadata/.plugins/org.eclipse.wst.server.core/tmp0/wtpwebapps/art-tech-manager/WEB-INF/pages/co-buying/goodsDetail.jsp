<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.0/jquery.js"></script>
	
	<link href="${pageContext.request.contextPath}/static/css/myCss.css" rel="stylesheet">
	
	<link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.9/css/select2.min.css" rel="stylesheet" />
	<script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.9/js/select2.min.js"></script>
  	<script type="text/javascript">
  		function vote() {
  			//문자로 투표 링크 보내기, 이메일로 비밀번호 보내기
  			let startDate = $('#startDate').val()
  			let endDate = $('#endDate').val()
  			$.ajax({
  				type : "POST",
  				url : "${pageContext.request.contextPath}/manage/vote",
  				data : {
  					"artworkInfoId" : '${artworkInfo.id}',
  					"startDate" : $('#startDate').val(),
  					"endDate" : $('#endDate').val(),
  					"url" : $('#url').val(),
  					"writerName" : '${artworkInfo.writerName }',
  					"title" : '${artworkInfo.title }'
  				},
  				async: false,
  				success : function(result) {
  					if(result == 'success') {
						$('#change').empty()
						$('#change').append('<th>투표결과</th>')
						$('#change').append('<td>투표 중입니다.</td>')
  					}
  				},
  				error: function (request, status, error){
  					var msg = "ERROR : " + request.status + "<br>"
  					msg += + "내용 : " + request.responseText + "<br>" + error;
  					console.log(msg);
  					
  				}
  			})
  		}
  	</script>
	
</head>
<body>
	<div class="contents-wrap2">
		<section class="container py-5">
			<div class="row projects gx-lg-5">
				<div class="writerRegister_container">
					<div class="main_title">
						<p>작품 정보</p>
					</div>
					<form action="">
						<table id="writerDetailTable">
							<tr>
								<th>작품명</th>
								<td>${artworkInfo.title }</td>
							</tr>
							<tr>
								<th>작품 사진</th>
								<td><img src="/artworkImg/${artworkInfo.artworkImg }"></td>
							</tr>
							<tr>
								<th>작가명</th>
								<td>${artworkInfo.writerName }</td>
							</tr>
							<tr>
								<th>진행현황</th>
								<td>${artworkInfo.stateName }</td>
							</tr>
							<tr>
								<th>재료</th>
								<td>${artworkInfo.material}</td>
							</tr>
							<tr>
								<th>사이즈</th>
								<td>${artworkInfo.sizeWidth } x ${artworkInfo.sizeHeight }</td>
							</tr>
							<tr>
								<th>제작연도</th>
								<td>${artworkInfo.productionYear }</td>
							</tr>
							<tr>
								<th>작품설명</th>
								<td>${artworkInfo.artworkContent }</td>
							</tr>
							<tr>
								<th>모집 기간</th>
								<td>${artworkInfo.recruitStartDate } ${artworkInfo.recruitEndDate } ~ 
								${artworkInfo.recruitStartTime } ${ artworkInfo.recruitEndTime}</td>
							</tr>
							<tr>
								<th>공동구매 목표 조각 개수</th>
								<td>${artworkInfo.targetPiece }</td>
							</tr>
							<tr>
								<th>공동구매 달성 조각 개수</th>
								<td>${artworkInfo.achiePiece }</td>
							</tr>
							<tr>
								<th>작품 추정가</th>
								<td>${artworkInfo.estimatedPriceMin } ~ ${artworkInfo.estimatedPriceMax }</td>
							</tr>
							<c:choose>
								<c:when test="${artworkInfo.state == 0 || artworkInfo.state == 1 }"></c:when>
								<c:when test="${artworkInfo.state == 2 }">
									<tr>
										<th>투표 기간</th>
										<td><input id="startDate" type="date"> ~ <input id="endDate" type="date"></td>
									</tr>
									<tr id="change">
										<th>설문조사 링크</th>
										<td><input type="text" id="url" placeholder="설문조사 링크를 입력해주세요."><button onclick="vote()">투표하기</button></td>
									</tr>
								</c:when>
								<c:otherwise>
									<tr>
										<th>투표 기간</th>
										<td><input id="startDate" type="date" value="${voteInfo.startDate }"> ~ <input id="endDate" type="date" value="${voteInfo.endDate }"></td>
									</tr>
									<c:choose>
										<c:when test="${artworkInfo.state == 3 }"> <!-- 투표 중 -->
											<tr>
												<th>투표결과</th>
												<td>투표 중입니다.</td>
											</tr>
										</c:when>
										<c:otherwise>
											<tr>
												<th>투표결과</th>
												<td><button>투표결과 확인하기</button> </td>
											</tr>
										</c:otherwise>
									</c:choose>
									
								</c:otherwise>
							</c:choose>
							
						</table>
						<div class="div_center">
							<button type="button" onclick="location.href='${pageContext.request.contextPath}/manage/goods'">목록</button>
						</div>
					</form>
				</div>
			</div>
		</section>
		<script type="text/javascript">
			//작가 select box 검색 가능하게 하기
			$('#ee').select2();		
		</script>
	</div>
</body>
</html>