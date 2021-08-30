<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css">
<script type="text/javascript">
	$(document).ready(function(){
		console.log("agree : " + ${agree});
		console.log("disagree : " + ${disagree})
		
		pieChartDraw();
	})
	
	let pieChartData = {
			labels : ['동의', '반대'],
			datasets : [{
				data : [${agree}, ${disagree}],
				backgroundColor : ['rgb(54, 162, 235)', 'rgb(255, 99, 132)']
			}]
	}
	
	let pieChartDraw = function() {
		let ctx = document.getElementById('pieChartCanvas').getContext('2d');
		
		window.pieChart = new Chart(ctx, {
			type : 'pie',
			data : pieChartData,
			options : {
				responsive: false
			}
		})
	}
	
</script>
</head>
<body>
	<iframe src="https://docs.google.com/spreadsheets/d/e/2PACX-1vQQLZcGIh29HR8gKiZJuNgrbKC7pVOmJ6CPQiwQuXiQ0d_TE7xV43elhSqxdY9iOEedkj3Jd7swOM7S/pubhtml?gid=126105215&amp;single=true&amp;widget=true&amp;headers=false"></iframe>
	<div id="#textArea"></div>
	<div class="chart-div">
        <canvas id="pieChartCanvas" width="300px" height="300px"></canvas>
    </div>
</body>
</html>