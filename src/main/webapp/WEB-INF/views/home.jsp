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

커밋

<a href = "/guest/testapi">testapi</a>
<a href = "/test/dog">cat링크</a>
<a href = "/test/updateVisitantCount">updateVisitantCount</a>
<a href = "/test/delTest">delTest</a>
<a href = "/test/insertDoodle">insertDoodle링크</a>
<a href = "/guest/getList">방명록</a>
<hr>

<a href = "/test/x">@RequestParam - 테스트 - 케이스 - 에러 </a><hr>
<a href = "/test/x?n=1">@RequestParam - 테스트 - 케이스 - 성공 </a>
<a href = "/test/y">@RequestParam - 테스트 - 케이스 - 얘도 에러 안남 </a><hr>
<a href = "/test/y?n=1">@RequestParam - 테스트 - 케이스 - 성공 </a><hr>
<a href = "/test/jstl">jstl</a>
<hr>

</body>
</html>
