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
	                                <th>Transactions</th>
	                                <th>Timestamp</th>
	                                <th>Pieces</th>
	                            </tr>
	                        </thead>
	                        <tbody>
	                            <tr>
	                                <td>
	                                    <div class="round-img">
	                                        <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/blockimg.PNG" alt=""></a>
	                                    </div>
	                                </td>
	                                <td>13033805</td>
	                                <td><span>artwork1</span></td>
	                                <td><span>12</span></td>
	                                <td><span>13</span></td>
	                            </tr>
	                            <tr>
	                                <td>
	                                    <div class="round-img">
	                                        <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/blockimg.PNG" alt=""></a>
	                                    </div>
	                                </td>
	                                <td>13033804</td>
	                                <td><span>artwork1</span></td>
	                                <td><span>12</span></td>
	                                <td><span>13</span></td>
	                            </tr>
	                            <tr>
	                                <td>
	                                    <div class="round-img">
	                                        <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/blockimg.PNG" alt=""></a>
	                                    </div>
	                                </td>
	                                <td>13033803</td>
	                                <td><span>artwork3</span></td>
	                                <td><span>12</span></td>
	                                <td><span>13</span></td>
	                            </tr>
	
	                            <tr>
	                                <td>
	                                    <div class="round-img">
	                                        <a href=""><img width="35" src="${pageContext.request.contextPath}/static/img/artcoin/blockimg.PNG" alt=""></a>
	                                    </div>
	                                </td>
	                                <td>13033802</td>
	                                <td><span>artwork5</span></td>
	                                <td><span>12</span></td>
	                                <td><span>13</span></td>
	                            </tr>
	                           
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
	                        <tbody>
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
