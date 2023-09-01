<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str1 = "고양이";
Date now = new Date();
request.setAttribute("now", now);



%>
<c:out value="<%=str1%>" default= "야옹이"/><br>

<c:forEach var="num" begin="0" end="5">
<b>고양이</b>
</c:forEach>
<%
	String animals[] = {"개","고양이","토끼"};
	for(String x : animals){		
%>
<%=x%>

<%
	
	}
%>
<c:set var="arr" value="<%=animals %>"></c:set>
<c:forEach var="i" items="${arr}" begin="0" end="2">
${i}
</c:forEach>
<c:forEach var="i" items="${arr}">
${i}
</c:forEach>
현재 시간: <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>

</body>
</html>