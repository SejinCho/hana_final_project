<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/myCss.css">
</head>
<body>
	<div class="contents-wrap">
		<!-- Start Banner Hero -->
	    <div id="work_banner" class="banner-wrapper bg-light w-100 py-5">
	        <div class="banner-vertical-center-work container text-light d-flex justify-content-center align-items-center py-5 p-0">
	            <div class="banner-content col-lg-8 col-12 m-lg-auto text-center">
	                <h1 class="banner-heading h2 display-3 pb-5 semi-bold-600 typo-space-line-center">Our Goods</h1>
	                <h3 class="h4 pb-2 regular-400">Elit, sed do eiusmod tempor incididunt</h3>
	                <p class="banner-body pb-2 light-300">
	                    Vector illustration <a class="text-white" href="http://freepik.com/" target="_blank">Freepik</a>.
	                    Lorem ipsum dolor sit amet, consectetur adipiscing elit,
	                    sed do eiusmod tempor incididunt ut labore et dolore magna
	                    aliqua. Quis ipsum suspendisse ultrices gravida. Risus
	                    commodo viverra maecenas accumsan lacus.
	                </p>
	                <button type="button" class="btn rounded-pill btn-secondary text-light px-4 light-300" onclick="location.href='${pageContext.request.contextPath}/manage/goodsRegister'" >작품 등록</button>
	            </div>
	        </div>
	    </div>
	    <!-- End Banner Hero -->
	
	    <!-- Start Our Work -->
	    <section class="container py-5">
	        <div class="row justify-content-center my-5">
	            <div class="filter-btns shadow-md rounded-pill text-center col-auto">
	                <a class="filter-btn btn rounded-pill btn-outline-primary border-0 m-md-2 px-md-4 active" data-filter=".project" href="#">All</a>
	                <a class="filter-btn btn rounded-pill btn-outline-primary border-0 m-md-2 px-md-4" data-filter=".business" href="#">Business</a>
	                <a class="filter-btn btn rounded-pill btn-outline-primary border-0 m-md-2 px-md-4" data-filter=".marketing" href="#">Marketing</a>
	                <a class="filter-btn btn rounded-pill btn-outline-primary border-0 m-md-2 px-md-4" data-filter=".social" href="#">Social Media</a>
	                <a class="filter-btn btn rounded-pill btn-outline-primary border-0 m-md-2 px-md-4" data-filter=".graphic" href="#">Graphic</a>
	            </div>
	        </div>
			
			
	        <div class="row projects gx-lg-5">
	        	<c:forEach items="${artworkInfoList }" var="artworkInfo">
		            <a href="${pageContext.request.contextPath}/manage/goodsDetail/${artworkInfo.id}" class="col-sm-6 col-lg-4 text-decoration-none project marketing social business">
		                <div class="service-work overflow-hidden card mb-5 mx-5 m-sm-0">
		                    <img class="card-img-top goodsImg" src="/artworkImg/${artworkInfo.artworkImg }" alt="...">
		                    <div class="card-body">
		                        <h5 class="card-title light-300 text-dark">${artworkInfo.title }</h5>
		                        <p class="card-text light-300 text-dark">
		                            ${artworkInfo.writerName }
		                        </p>
		                        <span class="text-decoration-none text-primary light-300">
		                              ${artworkInfo.stateName } <i class='bx bxs-hand-right ms-1'></i>
		                          </span>
		                    </div>
		                </div>
		            </a>
				</c:forEach>	           
	           
	        </div>
	        
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
	    </section>
	    <!-- End Our Work -->
	
	    
	</div>
    <!-- Bootstrap -->
    <!-- Lightbox -->
    <script src="${pageContext.request.contextPath}/static/js/fslightbox.js"></script>
    <script>
        fsLightboxInstances['gallery'].props.loadOnlyCurrentSource = true;
    </script>
 
</body>
</html>