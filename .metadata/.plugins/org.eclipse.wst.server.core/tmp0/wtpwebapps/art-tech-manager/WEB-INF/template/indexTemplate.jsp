<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>manager</title>
</head>
<body>
	<!-- header-start -->
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
    <!-- header-end -->

    <tiles:insertAttribute name="content"></tiles:insertAttribute>

    <!-- footer start -->
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>
    <!--/ footer end  -->
</body>
</html>