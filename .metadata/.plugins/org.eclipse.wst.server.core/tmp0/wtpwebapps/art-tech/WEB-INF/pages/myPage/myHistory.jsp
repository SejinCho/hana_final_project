<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Transportion</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/myCss.css">
    

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/img/favicon.png">
    <!-- Place favicon.ico in the root directory -->
	
	<script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
    	$(document).ready(function(){
    		$('.myHistory_menu_select').click(function(){
    			alert($(this).text())
				$(this).addClass('myHistory_menu_active');
				$('.myHistory_menu_select').not(this).removeClass('myHistory_menu_active')
				
				if($(this).text() =='매각작품') {
					$('#myHistory_disposal_contain').removeClass('myHistory_disposal_contain_hidden')
					$('#myHistory_all_table_container').addClass('myHistory_disposal_contain_hidden')
				}else {
					$('#myHistory_disposal_contain').addClass('myHistory_disposal_contain_hidden')
					$('#myHistory_all_table_container').removeClass('myHistory_disposal_contain_hidden')
				}
				
    		})
    	})
    </script>
</head>
<body>
	<div class="myHistory_main_title_container">
		<p>거래내역</p>
	</div>
	<div class="container myDeposit_inout_container">
		<div class="myHistory_menu_select_container">
			<span class="myHistory_menu_select myHistory_menu_active">전체</span>
			<span class="myHistory_menu_select">모집중</span>
			<span class="myHistory_menu_select">모집완료</span>
			<span class="myHistory_menu_select">매각작품</span>
		</div>
		
		<!-- 매각작품에서만 보여줘야 하는 것 -->
		<div id="myHistory_disposal_contain" class="myHistory_disposal_contain_hidden">
			<div class="row">
		    	<div class="col-xl-6">
		    		<div class="total_cobuying_summary">
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">매각 수익률</span>
		    				<span class="content_middle">34%</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">매각 작품 수</span>
		    				<span class="content_middle">4건</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">총 구입 금액</span>
		    				<span class="content_middle">1224134원</span>
		    			</div>
		    			
		    		</div>
		    	</div>
		    	
		    	<div class="col-xl-6">
		    		<div class="total_cobuying_summary">
		    			<div class="total_cobuying_summary_one2">
		    				<span class="title">총 매각 금액</span>
		    				<span class="content_middle1">55.16%</span>
		    			</div>
		    			<div class="total_cobuying_summary_one2">
		    				<span class="title">총 플랫폼 이용료</span>
		    				<span class="content_long">123421원</span>
		    			</div>
		    			<div class="total_cobuying_summary_one2">
		    				<span class="title">총 부가세</span>
		    				<span class="content">334일</span>
		    			</div>
		    			<div class="total_cobuying_summary_one2">
		    				<span class="title">총 양도세</span>
		    				<span class="content">334일</span>
		    			</div>
		    			<div class="total_cobuying_summary_one2">
		    				<span class="title">총 실 지급액</span>
		    				<span class="content_middle1">334일</span>
		    			</div>
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<table class="table table-hover myDeposit_inout_table" id="deposit_table">
				<thead id="myHistory_thead">
				<tr>
					<th>작품명</th>
					<th>작가명</th>
					<th>보유조각 수</th>
					<th>구입금액</th>
					<th>매각금액</th>
					<th>양도세</th>
					<th>플랫폼 이용료</th>
					<th>부가세</th>
					<th>실 지급액</th>
					<th>매각 수익률</th>
					
				</tr>
				</thead>
				<tbody id="myHistory_tbody">
				
						<tr> 
							<td>작품명</td>
							<td>작가명</td>
							<td>보유조각 수</td>
							<td>구입금액</td>
							<td>매각금액</td>
							<td>양도세</td>
							<td>플랫폼 이용료</td>
							<td>부가세</td>
							<td>실 지급액</td>
							<td>매각 수익률</td>
						</tr>
						<tr> 
							<td>작품명</td>
							<td>작가명</td>
							<td>보유조각 수</td>
							<td>구입금액</td>
							<td>매각금액</td>
							<td>양도세</td>
							<td>플랫폼 이용료</td>
							<td>부가세</td>
							<td>실 지급액</td>
							<td>매각 수익률</td>
						</tr>
					
				</tbody>
			</table>
			<div class="myDeposit_paging_container">
				<ul	class="pagination">
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">7</a></li>
					<li><a href="#">8</a></li>
					<li><a href="#">9</a></li>
					<li><a href="#">10</a></li>
				</ul>
			</div>
		</div>
		<!-- 매각작품에서만 보여줘야 하는 것 끝 -->
		
		<div id="myHistory_all_table_container">
			<table class="table table-hover myDeposit_inout_table">
				<thead id="myHistory_thead">
				<tr>
					<th>구매일시</th>
					<th>작품명</th>
					<th>작가명</th>
					<th>조각</th>
					<th>상태</th>
					<th>금액</th>
					<th>취소</th>
					
				</tr>
				</thead>
				<tbody id="myHistory_tbody">
					<c:forEach items="${myHistoryListAll }" var="myHistory">
						<tr> 
							<td>${myHistory.regDate }</td>
							<td>${myHistory.title }</td>
							<td>${myHistory.writerName }</td>
							<td>${myHistory.pieceNo }</td>
							<c:choose>
								<c:when test="${myHistory.type == 1 }">
									<td>구매</td>
								</c:when>
								<c:when test="${myHistory.type == 2 }">
									<td>판매</td>
								</c:when>
							</c:choose>
							<td>${myHistory.pieceNo * myHistory.pieceAmt }</td>
							<c:choose>
								<c:when test="${myHistory.state == 1 }">
									<td>취소가능</td>
								</c:when>
								<c:otherwise>
									<td>취소불가</td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
					
				</tbody>
			</table>
			<hr>
			<div class="myDeposit_paging_container">
				<ul	class="pagination">
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">7</a></li>
					<li><a href="#">8</a></li>
					<li><a href="#">9</a></li>
					<li><a href="#">10</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>