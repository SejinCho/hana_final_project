<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Focus - Bootstrap Admin Dashboard </title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/static/img/artcoin/favicon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/vendor/owl-carousel/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/vendor/owl-carousel/css/owl.theme.default.min.css">
    <link href="${pageContext.request.contextPath}/static/vendor/jqvmap/css/jqvmap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/artcoin/style.css" rel="stylesheet">



</head>

<body>

    <!--*******************
        Preloader start
    ********************-->
    <div id="preloader">
        <div class="sk-three-bounce">
            <div class="sk-child sk-bounce1"></div>
            <div class="sk-child sk-bounce2"></div>
            <div class="sk-child sk-bounce3"></div>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->


    <!--**********************************
        Main wrapper start
    ***********************************-->
    <div id="main-wrapper">

        <!--**********************************
            Nav header start
        ***********************************-->
        <div class="nav-header">
            <a href="index.html" class="brand-logo">
                <img class="logo-abbr" src="${pageContext.request.contextPath}/static/img/artcoin/logo.png" alt="">
                <img class="logo-compact" src="${pageContext.request.contextPath}/static/img/artcoin/logo-text.png" alt="">
                <img class="brand-title" src="${pageContext.request.contextPath}/static/img/artcoin/logo-text.png" alt="">
            </a>

            <div class="nav-control">
                <div class="hamburger">
                    <span class="line"></span><span class="line"></span><span class="line"></span>
                </div>
            </div>
        </div>
        <!--**********************************
            Nav header end
        ***********************************-->

        <!--**********************************
            Header start
        ***********************************-->
        <div class="header">
            <div class="header-content">
                <nav class="navbar navbar-expand">
                    <div class="collapse navbar-collapse justify-content-between">
                        <div class="header-left">
                            <div class="search_bar dropdown">
                                <span class="search_icon p-3 c-pointer" data-toggle="dropdown">
                                    <i class="mdi mdi-magnify"></i>
                                </span>
                                <div class="dropdown-menu p-0 m-0">
                                    <form>
                                    	
                                       	<input class="form-control" type="search" placeholder="Search by Address / Txn Hash / Block" aria-label="Search">
                                        
                                    </form>
                                </div>
                            </div>
                        </div>

                        <ul class="navbar-nav header-right">
                            <li class="nav-item dropdown notification_dropdown">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown">
                                    <i class="mdi mdi-bell"></i>
                                    <div class="pulse-css"></div>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <ul class="list-unstyled">
                                        <li class="media dropdown-item">
                                            <span class="success"><i class="ti-user"></i></span>
                                            <div class="media-body">
                                                <a href="#">
                                                    <p><strong>Martin</strong> has added a <strong>customer</strong> Successfully
                                                    </p>
                                                </a>
                                            </div>
                                            <span class="notify-time">3:20 am</span>
                                        </li>
                                        <li class="media dropdown-item">
                                            <span class="primary"><i class="ti-shopping-cart"></i></span>
                                            <div class="media-body">
                                                <a href="#">
                                                    <p><strong>Jennifer</strong> purchased Light Dashboard 2.0.</p>
                                                </a>
                                            </div>
                                            <span class="notify-time">3:20 am</span>
                                        </li>
                                        <li class="media dropdown-item">
                                            <span class="danger"><i class="ti-bookmark"></i></span>
                                            <div class="media-body">
                                                <a href="#">
                                                    <p><strong>Robin</strong> marked a <strong>ticket</strong> as unsolved.
                                                    </p>
                                                </a>
                                            </div>
                                            <span class="notify-time">3:20 am</span>
                                        </li>
                                        <li class="media dropdown-item">
                                            <span class="primary"><i class="ti-heart"></i></span>
                                            <div class="media-body">
                                                <a href="#">
                                                    <p><strong>David</strong> purchased Light Dashboard 1.0.</p>
                                                </a>
                                            </div>
                                            <span class="notify-time">3:20 am</span>
                                        </li>
                                        <li class="media dropdown-item">
                                            <span class="success"><i class="ti-image"></i></span>
                                            <div class="media-body">
                                                <a href="#">
                                                    <p><strong> James.</strong> has added a<strong>customer</strong> Successfully
                                                    </p>
                                                </a>
                                            </div>
                                            <span class="notify-time">3:20 am</span>
                                        </li>
                                    </ul>
                                    <a class="all-notification" href="#">See all notifications <i
                                            class="ti-arrow-right"></i></a>
                                </div>
                            </li>
                            <li class="nav-item dropdown header-profile">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown">
                                    <i class="mdi mdi-account"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a href="./app-profile.html" class="dropdown-item">
                                        <i class="icon-user"></i>
                                        <span class="ml-2">Profile </span>
                                    </a>
                                    <a href="./email-inbox.html" class="dropdown-item">
                                        <i class="icon-envelope-open"></i>
                                        <span class="ml-2">Inbox </span>
                                    </a>
                                    <a href="./page-login.html" class="dropdown-item">
                                        <i class="icon-key"></i>
                                        <span class="ml-2">Logout </span>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
        <!--**********************************
            Header end ti-comment-alt
        ***********************************-->

        <!--**********************************
            Sidebar start
        ***********************************-->
        <div class="quixnav">
            <div class="quixnav-scroll">
                <ul class="metismenu" id="menu">
                    <li class="nav-label first">Main</li>
                    <li><a href="widget-basic.html" aria-expanded="false"><i class="icon icon-globe-2"></i><span
                                class="nav-text">HOME</span></a></li>    
                    
                    <li class="nav-label">Blockchain</li>
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false"><i
                                class="icon icon-layout-25"></i><span class="nav-text">Table</span></a>
                        <ul aria-expanded="false">
                            <li><a href="${pageContext.request.contextPath}/artscan/viewBlocks">view Blocks</a></li>
                            <li><a href="${pageContext.request.contextPath}/artscan/viewTxns">view Txns</a></li>
                        </ul>
                    </li>

                </ul>
            </div>


        </div>
        <!--**********************************
            Sidebar end
        ***********************************-->

        <!--**********************************
            Content body start
        ***********************************-->
        <div class="content-body">
            <!-- row -->
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="stat-widget-two card-body">
                                <div class="stat-content">
                                    <div class="stat-text">Block Height</div>
                                    <div class="stat-digit"> <i class="fa fa-usd"></i>8500</div>
                                </div>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-success w-85" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="stat-widget-two card-body">
                                <div class="stat-content">
                                    <div class="stat-text">TRANSACTIONS</div>
                                    <div class="stat-digit"> <i class="fa fa-usd"></i>7800</div>
                                </div>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-primary w-75" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="stat-widget-two card-body">
                                <div class="stat-content">
                                    <div class="stat-text">Task Completed</div>
                                    <div class="stat-digit"> <i class="fa fa-usd"></i> 500</div>
                                </div>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-warning w-50" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="stat-widget-two card-body">
                                <div class="stat-content">
                                    <div class="stat-text">Task Completed</div>
                                    <div class="stat-digit"> <i class="fa fa-usd"></i>650</div>
                                </div>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-danger w-65" role="progressbar" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                        </div>
                        <!-- /# card -->
                    </div>
                    <!-- /# column -->
                </div>
                <div class="row" >
                
                <!-- 블록 리스트 -->
                    <div class="col-lg-6">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title">Latest Blocks</h4>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                
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
                            </div>
                        </div>
                    </div>
                    <!-- 블록 리스트 끝 -->
                    
                    <!-- 트랜잭션 리스트  -->
                    <div class="col-lg-6">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title">Latest Transactions</h4>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
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
                            </div>
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
        <!--**********************************
            Content body end
        ***********************************-->


        <!--**********************************
            Footer start
        ***********************************-->
        <div class="footer">
            <div class="copyright">
                <p>Copyright © Designed &amp; Developed by <a href="#" target="_blank">Quixkit</a> 2019</p>
                <p>Distributed by <a href="https://themewagon.com/" target="_blank">Themewagon</a></p> 
            </div>
        </div>
        <!--**********************************
            Footer end
        ***********************************-->

        <!--**********************************
           Support ticket button start
        ***********************************-->

        <!--**********************************
           Support ticket button end
        ***********************************-->


    </div>
    <!--**********************************
        Main wrapper end
    ***********************************-->

    <!--**********************************
        Scripts
    ***********************************-->
    <!-- Required vendors -->
    <script src="${pageContext.request.contextPath}/static/css/vendor/global/global.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/artcoin/quixnav-init.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/artcoin/custom.min.js"></script>


    <!-- Vectormap -->
    <script src="${pageContext.request.contextPath}/static/css/vendor/raphael/raphael.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/css/vendor/morris/morris.min.js"></script>


    <script src="${pageContext.request.contextPath}/static/css/vendor/circle-progress/circle-progress.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/css/vendor/chart.js/Chart.bundle.min.js"></script>

    <script src="${pageContext.request.contextPath}/static/css/vendor/gaugeJS/dist/gauge.min.js"></script>

    <!--  flot-chart js -->
    <script src="${pageContext.request.contextPath}/static/css/vendor/flot/jquery.flot.js"></script>
    <script src="${pageContext.request.contextPath}/static/css/vendor/flot/jquery.flot.resize.js"></script>

    <!-- Owl Carousel -->
    <script src="${pageContext.request.contextPath}/static/css/vendor/owl-carousel/js/owl.carousel.min.js"></script>

    <!-- Counter Up -->
    <script src="${pageContext.request.contextPath}/static/css/vendor/jqvmap/js/jquery.vmap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/css/vendor/jqvmap/js/jquery.vmap.usa.js"></script>
    <script src="${pageContext.request.contextPath}/static/css/vendor/jquery.counterup/jquery.counterup.min.js"></script>


    <script src="${pageContext.request.contextPath}/static/js/artcoin/dashboard/dashboard-1.js"></script>

</body>

</html>