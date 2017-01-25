<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bands</title>
</head>
<body>
<h2><a href="bandForm">Add a new band</a></h2><br>
<table border=1 width=100%>
	<tr><th>Band ID</th><th>Name</th><th>Genre</th><th>Country of origin</th><th>Members of band</th><th>Albums of band</th><th>Functions</th></tr>
<c:forEach var="band" items="${bands}">
		<tr><td>${band.bandID}</td><td>${band.genre}</td><td>${band.countryOfOrigin}</td><td>${band.members}</td><td>${band.albums}</td>
		<td><a href="bandForm?id=${band.bandID}">Modify</a>, <a href="bandRemove?id=${band.bandID}">Delete</a></tr>
</c:forEach>
</table>
<h4><a href="mainPage">Back</a></h4><br>
</body>
</html>