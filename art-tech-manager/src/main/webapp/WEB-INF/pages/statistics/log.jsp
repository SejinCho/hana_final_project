<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/myModal.css">
<script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		
		//작품 당 click 그래프
		$.ajax({
			type : 'GET',
			url : '${pageContext.request.contextPath}/manage/goodsClickGraph',
			success : function(result) {
				console.log(result)
				let col = []
				let row = []
		        for(let i = 0; i < 4; ++i) {
		        	let data = result.keyList[i]
		        	col.push(result.title[i])
		        	row.push(result.data[data])
		        }
				console.log(col)
				console.log(row)
				var ctx = document.getElementById('goodsClickGraph').getContext('2d'); 
				var chart = new Chart(ctx, 
					{ 
						type: 'bar', // 
						data: { 
							labels: col, 
							datasets: [{ 
								label: '색상', 
								backgroundColor: [ 
									'rgba(255, 99, 132, 1)',
									'rgba(54, 162, 235, 1)',
									'rgba(255, 206, 86, 1)',
									'rgba(75, 192, 192, 1)'
											], 
								borderColor: 'rgb(255, 99, 132)', 
								data: row 
							}] 
						},  //data
						options : {
							maintainAspectRatio: false,
							//responsive: false,
							legend : {
								display : false
							},
							scales: {
								yAxes: [{
									ticks : {
										min : 0,
										stepSize : 1,
										fontSize : 10,
									}
								}]
							}
						}
					}
				);

			},
			error: function (request, status, error){
				var msg = "ERROR : " + request.status + "<br>"
				msg += + "내용 : " + request.responseText + "<br>" + error;
				console.log(msg);
				
			}
		}) //ajax end
		
	})

</script>
</head>
<body>
	<div class="contents-wrap1">
	    
		<section class="container py-5">
			<div class="row projects gx-lg-5">
				<div class="statistics-container">
					<div class="main_title div_center">
						<p>로그 데이터</p>
					</div>
					
					<!-- 첫 번째 작품 별 클릭 수 -->
					<div class="left">
						<div>
							<p>작품 별 클릭 수</p>
						</div>
						<canvas id="goodsClickGraph"></canvas>
					</div>
					
					<!-- 두 번째 로그인 시간 -->
        			<div class="right">
        				<div>
							<p>로그인 시간</p>
						</div>
        			</div>

				</div>
			</div>
			
		</section>
		
		
	</div>
	
	
</body>
</html>