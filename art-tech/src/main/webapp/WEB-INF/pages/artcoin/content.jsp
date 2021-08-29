<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en"> 
<head>
    <title>CoderDocs - Bootstrap 5 Documentation Template For Software Projects</title>
    
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Bootstrap Documentation Template For Software Developers">
    <meta name="author" content="Xiaoying Riley at 3rd Wave Media">    
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/artcoin/myCss.css">
    <link rel="shortcut icon" href="favicon.ico"> 
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
    	$(document).ready(function(){
    		
    		//block data 가져오기 
    		$.ajax({
    			type: "GET",
    			url : "http://localhost:18080/blocks",
    			dataType : 'json',
    			success : function(result) {
    				console.log('block' + result)
    				
    				
    				//block data
    				for(let i = 0; i < (result.data.totalBlockSize <= 10 ? result.data.totalBlockSize : 10) ; ++i) {
    					let block = result.data.blocks[result.data.totalBlockSize - i - 1]
    					
    					//block data
    					let blockRowData = `
					    				<tr>
						                    <td>
						                        <div class="round-img">
						                            <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/blockimg.PNG" alt=""></a>
						                        </div>
						                    </td>
						                    <td>` + block.blockHeight + `</td>
			                                <td><span>` + block.hash + `</span></td>
			                                <td><span>` + block.transactions.blockHeight + `</span></td>
						                </tr>
					               		` 
    					
    					$('#blockListTbody').append(blockRowData)
					               		
    				} //block for문
    				
    				
    				
    		        
    			},
    			error: function (request, status, error){
    				var msg = "ERROR : " + request.status + "<br>"
    				msg += + "내용 : " + request.responseText + "<br>" + error;
    				console.log(msg);
    				
    			}
    		}) //block ajax
    		
    		//tx data 가져오기
    		$.ajax({
    			type: "GET",
    			url : "http://localhost:18080/transactions",
    			dataType : 'json',
    			success : function(result) {
    				console.log('tran' + result)
    				console.log(result)
    				
    				//tran data
    				for(let i = 0; i < (result.data.length <= 10 ? result.data.length : 10) ; ++i) {
    					let tx = result.data[result.data.length - i - 1]
    					console.log(tx)
    					let txRowData = `
	    					<tr>
		                        <td>
		                            <div class="round-img">
		                                <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/tranimg.PNG" alt=""></a>
		                            </div>
		                        </td>
		                        <td><span> ` + tx.transactionId + ` </span></td>
		                        <td><span>` + tx.reciepient + `</span></td>
		                        <td><span>` + tx.sender + `</span></td>
		                        <td><span></span></td>
		                    </tr>
    					`
					    $('#tranListTbody').prepend(txRowData)           		
    				} //tran for문
    				
    		        
    			},
    			error: function (request, status, error){
    				var msg = "ERROR : " + request.status + "<br>"
    				msg += + "내용 : " + request.responseText + "<br>" + error;
    				console.log(msg);
    				
    			}
    		}) //tran ajax
    		
    		
    		
    		
    	}) //document
	    
    
    </script>
</head> 

<body>    
 
   <div class="page-content">
	    <div class="container">
		    <div class="docs-overview py-5">
			    <div class="row justify-content-center">
			    	 <!-- 블록 리스트 -->
				    <div class="col-xl-6">
				    <div >
				    	<span class="table-main-title">Latest Blocks</span> 
				    </div>
				    <div class="align-right">
				    	<span class="view-all"><a class="a-style" href="${pageContext.request.contextPath}/artscan/blocks">view all blocks</a></span>
				    </div>
				    	<table class="table mb-0">
	                        <thead>
	                            <tr>
	                                <th>#</th>
	                                <th>Block Height</th>
	                                <th>hash</th>
	                                <th>block size</th>
	                            </tr>
	                        </thead>
	                        <tbody id="blockListTbody">
	                        	<!-- 
	                            <tr>
	                                <td>
	                                    <div class="round-img">
	                                        <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/blockimg.PNG" alt=""></a>
	                                    </div>
	                                </td>
	                                <td>13033805</td>
	                                <td><span>artwork1</span></td>
	                                <td><span>13</span></td>
	                            </tr>
	                             -->
	                           
	                        </tbody>
	                    </table>
				    </div>
				    <!-- 블록 리스트 끝 -->
				    
				    <!-- 트랜잭션 리스트 -->
				    <div class="col-xl-6">
			    	<div >
				    	<span class="table-main-title">Latest Transactions</span> 
				    </div>
				    <div class="align-right">
				    	<span class="view-all"><a class="a-style" href="${pageContext.request.contextPath}/artscan/txns">view all Transactions</a></span>
				    </div>
				    	<table class="table mb-0">
	                        <thead>
	                            <tr>
	                                <th>#</th>
	                                <th>Hash</th>
	                                <th>From</th>
	                                <th>To</th>
	                                <th>Block</th>
	                            </tr>
	                        </thead>
	                        <tbody id="tranListTbody">
	                        <!-- 
	                            <tr>
	                                <td>
	                                    <div class="round-img">
	                                        <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/tranimg.PNG" alt=""></a>
	                                    </div>
	                                </td>
	                                <td><span><c:out value="${fn:substring('0x8d0046134fce7657d0fb0f020312df4aaaa5ad871d4f464a32071679e8fadb38', 0, 7)}"></c:out>...</span></td>
	                                <td><span><c:out value="${fn:substring('0xd06e2a2726f9c9bc7641cf225c68f86baf4a53cc', 0, 7)}"></c:out>...</span></td>
	                                <td><span><c:out value="${fn:substring('0xd06e2a2726f9c9bc7641cf225c68f86baf4a53cc', 0, 7)}"></c:out>...</span></td>
	                                <td><span>13033805</span></td>
	                            </tr>
	                            
                           -->  
	                        </tbody>
	                    </table>
				    </div>
				    
			    </div><!--//row-->
		    </div><!--//container-->
		</div><!--//container-->
    </div><!--//page-content-->

    <section class="cta-section text-center py-5 theme-bg-dark position-relative">
	    <div class="theme-bg-shapes-right"></div>
	    <div class="theme-bg-shapes-left"></div>
	    <div class="container">
		    <h3 class="mb-2 text-white mb-3">Launch Your Software Project Like A Pro</h3>
		    <div class="section-intro text-white mb-3 single-col-max mx-auto">Want to launch your software project and start getting traction from your target users? Check out our premium <a class="text-white" href="https://themes.3rdwavemedia.com/bootstrap-templates/startup/coderpro-bootstrap-5-startup-template-for-software-projects/">Bootstrap 5 startup template CoderPro</a>! It has everything you need to promote your product.</div>
		    <div class="pt-3 text-center">
			    <a class="btn btn-light" href="https://themes.3rdwavemedia.com/bootstrap-templates/startup/coderpro-bootstrap-5-startup-template-for-software-projects/">Get CoderPro<i class="fas fa-arrow-alt-circle-right ml-2"></i></a>
		    </div>
	    </div>
    </section><!--//cta-section-->

</body>
</html> 
