<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="contents-wrap1">
		<section class="container py-5">
			<div class="row projects gx-lg-5">
				<div class="writerList_container div_center">
					<div class="main_title">
						<p>작가 목록</p>
					</div>
					<table class="table">
						<tr>
							<th>번호</th>
							<th>이름</th>
							<th>등록날짜</th>
						</tr>
						<c:forEach items="${writerInfoList}" var="writerInfo" varStatus="status">
							<tr>
								<td>${status.count }</td>
								<td><a href="${pageContext.request.contextPath}/manage/writerDetail?id=${writerInfo.id}">${writerInfo.writerName }</a></td>
								<td>${writerInfo.regDate }</td>
							</tr>
						</c:forEach>
						
						
					</table>
					<button type="button" onclick="location.href='${pageContext.request.contextPath}/manage/writerRegister'">등록</button> <br><br><br><br>
					<div class="row">
			            <div class="btn-toolbar justify-content-center pb-4" role="toolbar" aria-label="Toolbar with button groups">
			                <div class="btn-group me-2" role="group" aria-label="First group">
			                    <button type="button" class="btn btn-secondary text-white">Previous</button>
			                </div>
			                <div class="btn-group me-2" role="group" aria-label="Second group">
			                    <button type="button" class="btn btn-light">1</button>
			                </div>
			                <div class="btn-group me-2" role="group" aria-label="Second group">
			                    <button type="button" class="btn btn-secondary text-white">2</button>
			                </div>
			                <div class="btn-group" role="group" aria-label="Third group">
			                    <button type="button" class="btn btn-secondary text-white">Next</button>
			                </div>
			            </div>
			        </div>
				</div>
			</div>
			
		</section>
	</div>
	
	
</body>
</html>