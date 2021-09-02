<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link rel="shortcut icon" href="favicon.ico"> 
    
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700&display=swap" rel="stylesheet">
    <!-- FontAwesome JS-->
    <!-- Theme CSS -->  
    <link id="theme-style" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/artcoin/theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/myCss.css">

</head> 

<body>    
    <header class="header fixed-top">	 
	       
        <div class="branding docs-branding">
            <div class="container-fluid position-relative py-2">
                <div class="docs-logo-wrapper">
	                <div class="site-logo"><a class="navbar-brand" href="${pageContext.request.contextPath}/artscan/"><img class="logo-icon me-2 artscanlogo" src="${pageContext.request.contextPath}/static/img/artscanlogo.PNG" alt="logo"></a></div>    
                </div><!--//docs-logo-wrapper-->
	            <div class="docs-top-utilities d-flex justify-content-end align-items-center">
	
					<ul class=" list-inline mx-md-3 mx-lg-5 mb-0 d-none d-lg-flex">
						<li class="list-inline-item nav-item"><a class="a-style" href="${pageContext.request.contextPath}/artscan/">Home</a></li>
			            <li class="list-inline-item nav-item"><a class="a-style" href="${pageContext.request.contextPath}/artscan/blocks">view Blocks</a></li>
		                <li class="list-inline-item nav-item"><a class="a-style" href="${pageContext.request.contextPath}/artscan/txns">view Txns</a></li>
		            </ul><!--//social-list-->
	            </div><!--//docs-top-utilities-->
            </div><!--//container-->
        </div><!--//branding-->
    </header><!--//header-->
    
    
    <div class="page-header theme-bg-dark py-5 text-center position-relative">
	    <div class="theme-bg-shapes-right"></div>
	    <div class="theme-bg-shapes-left"></div>
	    <div class="container">
		    <h1 class="page-heading single-col-max mx-auto">HANA ART Blockchain Explorer</h1>
		    <div class="page-intro single-col-max mx-auto">HANA ART Blockchain Explorer</div>
		    <div class="main-search-box pt-3 d-block mx-auto">
                 <form class="search-form w-100">
		            <input type="text" placeholder="Search by Address / Txn Hash / Block"  name="search" class="form-control search-input">
		            <button type="submit" class="btn search-btn" value="Search"><i class="fas fa-search"></i></button>
		        </form>
             </div>
	    </div>
    </div><!--//page-header-->

</body>
</html> 