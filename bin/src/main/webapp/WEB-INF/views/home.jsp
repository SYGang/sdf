<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>						
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<a href="/guest/getList">방명록가기</a>

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<a href = "/guest/getList">방명록</a>
<a href = "/guest/testapi">testapi</a>


</body>
</html>
