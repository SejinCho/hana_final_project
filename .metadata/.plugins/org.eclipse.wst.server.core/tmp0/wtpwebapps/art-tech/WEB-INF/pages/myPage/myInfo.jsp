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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/myModal.css">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/img/favicon.png">
    <!-- Place favicon.ico in the root directory -->
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.min.js"></script>
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script type="text/javascript">
    
    function addWallet() {
    	$.ajax({
			type: "POST",
			url : "${pageContext.request.contextPath}/member/wallet",
			success : function(result) {
		        $('.mypage-publickey-div').empty();
		        $('.mypage-publickey-div').append('<p class="kakao_p mypage-publicKey">' + result + '</p>')
		        
		        
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
	<!-- container -->
	<div class="container">
		<div class="myPage_main_title">
			<p>회원정보</p>
		</div>
		<form action="">
			<div class="myPage_container">
				<div class="myInfoDetail">
					<p id="name">${member.name }</p>
					<p id="email">whtpwls777@naver.com</p>
					<p><span>010-2523-5521</span><span class="phoneChange_span"><button type="button" class="phoneNumChange_btn">변경</button></span></p>
					<div class="addr_container">
						<p class="dddr_title">주소</p>
						<p>우편번호</p>
						<p><span><input class="post_input" type="text" id="sample4_postcode" readonly value="${member.zipcode }"></span><span class="find_address_span"><a onclick="sample4_execDaumPostcode()">주소 변경</a></span></p>
						<p>도로명 주소</p>
						<p><input type="text" id="sample4_roadAddress" value="${member.addr1Load }" readonly></p>
						<p>지번 주소</p>
						<p><input type="text" id="sample4_jibunAddress" value="${member.addr1Jibun }" readonly></p>
						<p><span id="guide" style="color:#999;display:none"></span></p>
						<p>상세 주소</p>
						<p><input type="text" id="sample4_detailAddress" value="${member.addr2}"></p>
					</div>
				</div>
				
				<div class="sns_container">
					<p class="my_sns_title">지갑</p>
					<c:choose>
						<c:when test="${not empty member.publicKey }">
							<div>
								<p class="kakao_p mypage-publicKey">${member.publicKey }</p>
							</div>
						</c:when>
						<c:when test="${empty member.publicKey }">
							<div class="mypage-publickey-div">
								<p class="kakao_p" ><a onclick="addWallet()">생성하기</a></p>
							</div>
						</c:when>
					</c:choose>
					
				</div>
				
				<div class="sns_container">
					<p class="my_sns_title">SNS 계정연동</p>
					<p class="kakao_p"><a href="#">카카오 계정 연동하기</a></p>
				</div>
				
				<div class="input_container">
					<span><input type="submit" value="수정"></span> 
				</div>
			</div>
		</form>
	</div>
	<!-- container end -->
	
	<!-- 모달 -->
	<div class="myInfo_phoneChange_modal">
		<div class="myInfo_modal_body" >  
			<div class="title">
				<p class="main">핸드폰 번호 인증</p>
				<hr>
			</div>
			<div class="content">
				<div class="content_block">
					<p><span><input type="tel" placeholder="핸드폰 번호를 입력하세요."></span><span><a>인증하기</a></span></p>
				</div>
				
			</div>
			<hr>
			<div class="select">
				<div class="div_left">
					<p onclick="location.href='#'">변경</p>
				</div>
				<div class="div_right">
					<p class="phoneChange_modal_cancel">취소</p>
				</div>
				
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//핸드폰 번호 모달
		const phone_modal = document.querySelector('.myInfo_phoneChange_modal');
		const phone_btnOpenPopup = document.querySelector('.phoneNumChange_btn');
		const phone_btnModalCancel = document.querySelector('.phoneChange_modal_cancel');
		
		
		phone_btnOpenPopup.addEventListener('click', () => {
			$('html, body').addClass('hidden');
			phone_modal.style.display = 'block'; 
		});
		
		phone_btnModalCancel.addEventListener('click', () => {
			$('html, body').removeClass('hidden');
			phone_modal.style.display = 'none'; 
		});
		
		
		
		//주소 api
		function sample4_execDaumPostcode() {
	        new daum.Postcode({
	            oncomplete: function(data) {
	                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
	
	                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
	                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
	                var roadAddr = data.roadAddress; // 도로명 주소 변수
	                var extraRoadAddr = ''; // 참고 항목 변수
	
	                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
	                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
	                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
	                    extraRoadAddr += data.bname;
	                }
	                // 건물명이 있고, 공동주택일 경우 추가한다.
	                if(data.buildingName !== '' && data.apartment === 'Y'){
	                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
	                }
	                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
	                if(extraRoadAddr !== ''){
	                    extraRoadAddr = ' (' + extraRoadAddr + ')';
	                }
	
	                // 우편번호와 주소 정보를 해당 필드에 넣는다.
	                document.getElementById('sample4_postcode').value = data.zonecode;
	                document.getElementById("sample4_roadAddress").value = roadAddr;
	                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
	                
	
	                var guideTextBox = document.getElementById("guide");
	                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
	                if(data.autoRoadAddress) {
	                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
	                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
	                    guideTextBox.style.display = 'block';
	
	                } else if(data.autoJibunAddress) {
	                    var expJibunAddr = data.autoJibunAddress;
	                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
	                    guideTextBox.style.display = 'block';
	                } else {
	                    guideTextBox.innerHTML = '';
	                    guideTextBox.style.display = 'none';
	                }
	            }
	        }).open();
	    }
	</script>
	<!-- 모달 끝 -->	
</body>
</html>