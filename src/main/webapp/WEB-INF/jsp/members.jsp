<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Members</title>
</head>
<body>
<h2><a href="memberForm">Add a new member</a></h2><br>
<table border=1 width=100%>
	<tr><th>Member ID</th><th>Name</th><th>Gender</th><th>Instrument</th><th>Birthdate</th><th>Country of birth</th><th>Band of member</th><th>Functions</th></tr>
<c:forEach var="member" items="${members}">
		<tr><td>${member.memberID}</td><td>${member.name}</td><td>${member.gender}</td><td>${member.instrument}</td><td>${member.birthDate}</td><td>${member.countryOfBirth}</td>
		<td>${member.band}</td><td><a href="memberForm?id=${member.memberID}">Modify</a>, <a href="memberRemove?id=${member.memberID}">Delete</a></tr>
</c:forEach>
</table>
<h4><a href="index">Back</a></h4><br>
</body>
</html>