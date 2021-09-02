<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.min.js"></script>
    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/img/favicon.png">
    <!-- Place favicon.ico in the root directory -->
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('.select_menu').click(function(){
				alert($(this).text())
				$(this).addClass('myGallery_menu_select_menu_active');
				$('.select_menu').not(this).removeClass('myGallery_menu_select_menu_active')
				
			})
			
			//모달 
			$('#certificateP').click(function(){
				$('.myGallery-modal').css('display','block')
    			$('body').css("overflow", "hidden");
			})
			
			//모달 다시 숨기기
    		$('.myGallery-modal-cancel').click(function(){
    			$('.myGallery-modal').css('display','none')
    			$('body').css("overflow", "scroll");
    		})
		})//document
		
	
	</script>
    
</head>
<body>
	<div class="myGallery_contain">
		<div class="container">
			<div class="main_title">
				<p>마이갤러리</p>
			</div>
			
			<!-- 메뉴 -->
			<div class="myGallery_menu_top">
				<div class="row">
					<div class="myGallery_menu">
						<div class="myGallery_menu_one">
							<p class="select_menu myGallery_menu_select_menu_active" id="select_menu">전체</p>
						</div>
						<div class="myGallery_menu_one">
							<p class="select_menu" id="select_menu" value="ing">모집중</p>
						</div>
						<div class="myGallery_menu_one">
							<p class="select_menu" id="select_menu">모집완료</p>
						</div>
						<div class="myGallery_menu_one">
							<p class="select_menu" id="select_menu">매각완료</p>
						</div>
					</div>
					
				</div>
			</div>
			<!-- 메뉴 끝 -->
			
			<!-- 마이갤러리 -->
			<div class="row">
			
				<!-- 하나 -->
				<div class="col-xl-6 ">
					<div class="myGallery_main_container">
						<div class="div_left_img">
							<img alt="" src="${pageContext.request.contextPath}/static/img/blog/blog_2.png">
						</div>
						<div class="div_center_artworkInfo">
							<p class="title">SARA Dancing 1</p>
							<p class="writer">줄리안 오피 fulian opie</p>
							<p class="piece">보유조각 : 1</p>
						</div>
						<div class="div_right_certificate">
							<div class="certificate">
								<p id="certificateP">온라인 권리증</p>
							</div>
						</div>
					</div>
				</div>
				<!-- 하나 끝 -->
				<!-- 하나 -->
				<div class="col-xl-6 ">
					<div class="myGallery_main_container">
						<div class="div_left_img">
							<img alt="" src="${pageContext.request.contextPath}/static/img/blog/blog_2.png">
						</div>
						<div class="div_center_artworkInfo">
							<p class="title">SARA Dancing 1</p>
							<p class="writer">줄리안 오피 fulian opie</p>
							<p class="piece">보유조각 : 1</p>
						</div>
						<div class="div_right_certificate">
							<div class="certificate">
								<p>온라인 권리증</p>
							</div>
						</div>
					</div>
				</div>
				<!-- 하나 끝 -->
				<!-- 하나 -->
				<div class="col-xl-6 ">
					<div class="myGallery_main_container">
						<div class="div_left_img">
							<img alt="" src="${pageContext.request.contextPath}/static/img/blog/blog_2.png">
						</div>
						<div class="div_center_artworkInfo">
							<p class="title">SARA Dancing 1</p>
							<p class="writer">줄리안 오피 fulian opie</p>
							<p class="piece">보유조각 : 1</p>
						</div>
						<div class="div_right_certificate">
							<div class="certificate">
								<p>온라인 권리증</p>
							</div>
						</div>
					</div>
				</div>
				<!-- 하나 끝 -->
				
			</div>
			
			<div class="myDeposit_paging_container myGallery_paging">
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
			<!-- 모달 -->
			<div class="myGallery-modal">
				<div class="myGallery-body" >  
					
					<div class="content">
						<p class="certificateImg"><img alt="" src="${pageContext.request.contextPath}/static/img/23.PNG"> </p>
						<p id="index_content_p">작품명적는공간입니다.</p>
						<p>작가명적는공간입니다.</p>
						<p>구입일적는공간입니다.</p>
						<p>현재보유 : 3개</p>
					</div>
					<hr>
					<div class="select">
						<p class="myGallery-modal-cancel">확인</p>
					</div>
				</div>
			</div>	
			<!-- 모달 끝 -->
		</div>
	</div>
</body>
</html>