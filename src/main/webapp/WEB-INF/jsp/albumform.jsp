<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New album</title>
</head>
<body>
<form:form action="/insertAlbum" method="post" modelAttribute="album">
Album ID: <input type="number" name="albumID" readonly value="${album.albumID}"/>  (Automatically generated!)<br>
Title: <form:input type="text" path="title"/><form:errors path='title'/><br>
Number of sales: <form:input type="number" path="numberOfSales"/><form:errors path='numberOfSales'/><br>
Year of release: <form:input type="number" path="yearOfRelease"/><form:errors path='yearOfRelease'/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>