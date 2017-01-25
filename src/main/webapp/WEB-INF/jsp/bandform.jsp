<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New band</title>
</head>
<body>
<form:form action="/insertBand" method="post" modelAttribute="band">
Band ID: <input type="number" name="bandID" readonly value="${band.bandID}"/>  (Automatically generated!)<br>
Name: <form:input type="text" path="name"/><form:errors path='name'/><br>
Genre: <form:input type="text" path="genre"/><form:errors path='genre'/><br>
Country of origin: <form:input type="text" path="countryOfOrigin"/><form:errors path='countryOfOrigin'/><br>
Albums: <form:checkboxes items="${albums}" path="albums" itemLabel="title" itemValue="albumID" delimiter="    "/><br>
Members: <form:checkboxes items="${members}" path="members" itemLabel="name" itemValue="memberID" delimiter="    "/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>