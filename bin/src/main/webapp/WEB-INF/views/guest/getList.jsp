<%@page import="com.peisia.spring.mi.vo.GuestVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/resources/common.css">
<meta charset="UTF-8">
<title>방명록 </title>
</head>
<body>
<h1>방명록</h1>
<h2>글목록</h2>
<%-- 
<table>
<tr>
<td>글번호</td>
<td>글내용</td>

</tr>


<c:forEach var="guest" items="${list}">
<tr>
    <td>${guest.bno}</td>
	<td><a href ="/spring/guest/read?bno=${guest.bno}">${guest.btext}</a></td>
</tr>
</c:forEach>

</table>
--%>

<%-- <c:forEach var="guest" items="${list}">
    <c:set var="bno" value="${guest.bno}" />
    <c:set var="btext" value="${guest.btext}" />
    ${bno}
    ${btext}
<!--     <hr> -->
</c:forEach> --%>
<hr>
총 글 수: ${count}
<hr>

<hr>
<table>
	<tr>
		<td>번호</td>
		<td>내용</td>
<c:set var="arr" value="${list}"/>
<c:forEach var="i" items="${arr}">
<tr>
	<td>${i.bno}</td>
	<td>{$i.btext}</td>
</tr>
</c:forEach>


</table>
<a href = "/guest/write">새글쓰기</a>
</body>
</html>