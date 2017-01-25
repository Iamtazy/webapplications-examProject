<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Albums</title>
</head>
<body>
<h2><a href="albumForm">Add a new album</a></h2><br>
<table border=1 width=100%>
	<tr><th>Album ID</th><th>Title</th><th>Number of sales</th><th>Year of release</th><th>Functions</th></tr>
<c:forEach var="album" items="${albums}">
		<tr><td>${album.albumID}</td><td>${album.title}</td><td>${album.numberOfSales}</td><td>${album.yearOfRelease}</td>
		<td><a href="albumForm?id=${album.albumID}">Modify</a>, <a href="albumRemove?id=${album.albumID}">Delete</a></tr>
</c:forEach>
</table>
<p>${error}</p>
<h4><a href="index">Back</a></h4><br>
</body>
</html>