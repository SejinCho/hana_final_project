<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>예치금 이체</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/myCss.css">
	
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

	
	<script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.min.js"></script>
</head>
<body>
	<div class="transferDeposit_container">
		<div class="transferDeposit_title">
			<p>예치금 입금</p>
		</div>
		<div class="container">
			<h4>출금정보</h4>
			<form action="<%=request.getContextPath()%>/openBanking/transferPro" method="post" onsubmit="return transferFormCheck()">	
				<table class="table">
					<tbody>
						<tr>
							<th class="text-center">은행</th>
							<td>
								<select id="select_bank_name" name="send_bank_code">
									<option value="all">전체</option>
									<option value="J">JBMorgan</option>
									<option value="D">DONJO</option>
									<option value="Y">YGBank</option>
								</select>
							</td>
						</tr>
						<tr>
							<th class="text-center">조회계좌번호</th>
							<td>
								<select id="select_account_number" name="send_account_number">
									
								</select>
							</td>
						</tr>
						
						<tr>
							<th class="text-center" >계좌잔액</th>
							<td id="info_balance" ></td>
						</tr>
						<tr>
							<th class="text-center" >계좌비밀번호</th>
							<td><input type="password"  id="account_password" class="input-text-box" required>
							<span class="account_password_check" id="account_password_check"></span></td>
						</tr>
						
					</tbody>
				</table>
			<br><br>
			<!-- 선택된 계좌의 상세 정보 -->
			<h4>입금정보</h4>
				<table class="table">
					<tbody>
						<tr>
							<th class="text-center">입금은행</th>
							<td>회사 계좌 은행</td>
						</tr>
						<tr>
							<th class="text-center" >입금 계좌번호</th>
							<td>회사 계좌번호</td>
						</tr>
						<tr>
							<th class="text-center">이체금액</th>
							<td><input type="text" name="tran_amt" class="input-text-box" required></td>
						</tr>
						<tr>
							<th class="text-center" >받는 통장 메모</th>
							<td><input type="text" class="input-text-box" name ="receive_content"></td>
						</tr>
						<tr>
							<th class="text-center" >내 통장 메모</th>
							<td><input type="text" class="input-text-box" name ="my_content"></td>
						</tr>
						
					</tbody>
				</table>
				
				<hr>
				<div class="transferDeposit_submit_btn">
					<input type="submit" value="이체하기" >
				</div>
			</form>
			
		</div>
	</div>
</body>
</html>