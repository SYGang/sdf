<%@page import="com.peisia.spring.mi.vo.GuestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <% 
	GuestVO read = (GuestVO)request.getAttribute("read");
	long bno = read.getBno();
	String btext = read.getBtext();
%> --%>

<%-- 글읽기
글번호:<%=bno %>
글내용:<%=btext %>
 --%>
 <%--el 적용버전 자동으로 값을 찾아서 가져옴 --%>
 글본문
 <hr>
 글 번호${read.bno}
 <hr>
 글내용: ${read.btext}
 <a href="/guest/del?bno=${read.bno}">글 삭제</a> 
 <a href="/guest/modify?bno=${read.bno}">글 수정</a> 
 <a href="/guest/getList">글 리스트</a> 
 </body>
</html>