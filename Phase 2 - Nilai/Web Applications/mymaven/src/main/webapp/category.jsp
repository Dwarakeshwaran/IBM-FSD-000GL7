<%@page import="com.mavenwebapp.myapp.entity.HeroList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name = request.getParameter("name");
String hero = request.getParameter("hero");
String power = request.getParameter("power");

session.setAttribute("I", new HeroList(name,hero,Integer.parseInt(power)));

%>
	<form action="controller.do" method="post">

		Points<input type="text" name="points"><br />
		<input type="submit">
	</form>
</body>
</html>