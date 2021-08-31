<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

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

    
</head>
<body>
	<!-- bradcam_area  -->
    <div class="bradcam_area bradcam_bg_1">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>공동구매</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ bradcam_area  -->
    <!-- service_area  -->
    <div class="service_area">
    	
        <div class="container">
        	<div class="total_items_container">
    			<p>Total ${fn:length(artworkInfoList)} items </p>
    		</div>
            <div class="row">
            	<c:forEach items="${artworkInfoList }" var="artworkInfo" >
	            	<!-- 하나  -->
	                <div class="col-md-6 col-lg-4">
	                    <div class="single_service">
	                        <div class="thumb ">
	                            <img class="goodsImg" src="/artworkImg/${artworkInfo.artworkImg }" alt="">
	                        </div>
	                        <div class="service_info">
	                        	<c:choose>
	                        		<c:when test="${artworkInfo.state == 0 }">
	                        			<p>모집 예정</p>
	                        		</c:when>
	                        		<c:when test="${artworkInfo.state == 1 }">
	                        			<p>모집 중</p>
	                        		</c:when>
	                        		<c:when test="${artworkInfo.state == 2 || artworkInfo.state == 3 || artworkInfo.state == 4 }">
	                        			<p>모집 완료</p>
	                        		</c:when>
	                        		<c:when test="${artworkInfo.state == 5 }">
	                        			<p>매각 중</p>
	                        		</c:when>
	                        		<c:otherwise>
	                        			<p>수익 분배</p>
	                        		</c:otherwise>
	                        	</c:choose>
	                            <h3><a href="${pageContext.request.contextPath}/co-buying/goodsDetail/${artworkInfo.id}">${artworkInfo.title }</a></h3>
	                            <p>${artworkInfo.writerName }</p>
	                            
	                            <div class="progress">
								  <div class="progress-bar" role="progressbar" style="width: ${artworkInfo.achiePiece}%; background-color: #008485" aria-valuenow="${artworkInfo.achiePiece}" aria-valuemin="0" aria-valuemax="${artworkInfo.targetPiece }"></div>
								</div>
	                            <p> ${artworkInfo.achiePiece } / ${artworkInfo.targetPiece } 조각 </p>
	                       	</div>
	                    </div>
	                </div>
	                <!-- 하나 끝  -->
                </c:forEach>
                
                
				
                
                
            </div>
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
    <!--/ service_area  -->
</body>
</html>