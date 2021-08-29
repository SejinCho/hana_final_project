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
                        <h3>매각 진행현황</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- 요약정보 시작 -->
    <div class="disposal_summary_container">
    	<div class="container">
    		<div class="container_main_title">
    			<span>아트하나의 공동구매 작품매각 진행현황을 한 눈에 확인하실 수 있습니다.</span>
    		</div>
	    	<div class="row">
		    	<div class="col-xl-6">
		    		<div class="total_cobuying_summary">
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">총 공동구매 작품 수</span>
		    				<span class="content">84작품</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">총 공동구매 구매금액</span>
		    				<span class="content">3,607,520,000 KRW</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">총 매각 작품 수</span>
		    				<span class="content_middle">15작품</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">총 매각예정 작품 수</span>
		    				<span class="content">2작품</span>
		    			</div>
		    		</div>
		    	</div>
		    	
		    	<div class="col-xl-6">
		    		<div class="total_cobuying_summary">
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">평균 수익률</span>
		    				<span class="content_short">55.16%</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">평균 기간환산 수익률(연)</span>
		    				<span class="content_long">60.27%</span>
		    			</div>
		    			<div class="total_cobuying_summary_one">
		    				<span class="title">평균 보유기간</span>
		    				<span class="content_middle">334일</span>
		    			</div>
		    		</div>
		    	</div>
	    	</div>
    	</div>
    </div>
    <!-- 요약정보 끝 -->
    
    <!-- 진행현황 리스트 시작 -->
    <div class="container">
    	<div class="myDeposit_inout_container">
    		<div>
	    		<span>
		    		<select>
		    			<option>전체</option>
		    			<option>매각투표</option>
		    			<option>매각종료</option>
		    			<option>매각중</option>
		    			<option>수익분배</option>
		    		</select>
	    		</span>
	    		<span class="ownership_keyword">
	    			<input type="text" placeholder="작가 및 작품명을 입력하세요.">
	    		</span>
    		</div>
    	</div>
    	
    	<div class="disposal_container">
    	
    		<div class="div_left">
				<div class="disposal_artwork_img">
					<img alt="" src="${pageContext.request.contextPath}/static/img/23.PNG">
					<p class="title">$ (Quadrant)</p>
					<p class="writer">앤디 워홀 Andy Warhol</p>
				</div>
				
				<div class="recruit_info">
					<div>
						<span class="title">모집완료일</span>
						<span class="content">2021-12-12</span>
					</div>
					<div>
						<span class="title">모집금액</span>
						<span class="content_middle">312,340,000KRW</span>
					</div>
					<div>
						<span class="title">매각금액</span>
						<span class="content_middle">360,000,000</span>
					</div>
					<div>
						<span class="title">매각일</span>
						<span class="content_short">2021-12-12</span>
					</div>
					<div>
						<span class="title">매각처</span>
						<span class="content_short">개인소유자</span>
					</div>
				</div>
				<div class="disposal_state">
					<p class="state_title">진행현황</p>
					<p class="state_detail">수익분배</p>
				</div>	    		
    		</div>
    		<div class="div_right">
				<div class="disposal_revenue">
					<p class="title">수익률</p>
					<p class="content">15.25%</p>
				</div>
				<div class="disposal_revenue">
					<p class="title">보유기간</p>
					<p class="content">483일</p>
				</div>
				<div class="disposal_revenue">
					<p class="title">기간환산 수익률(연)</p>
					<p class="content">11.25%</p>
				</div>
    		</div>
    		<div class="ownership_container_margin" ></div>
    		
    		
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
    <!-- 진행현황 리스트 끝 -->
    
</body>
</html>