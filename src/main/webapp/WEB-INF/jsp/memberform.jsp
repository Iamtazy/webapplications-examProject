<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New member</title>
</head>
<body>
<form:form action="/insertMember" method="post" modelAttribute="member">
Member ID: <input type="number" name="memberID" readonly value="${member.memberID}"/>  (Automatically generated!)<br>
Name: <form:input type="text" path="name"/><form:errors path='name'/><br>
Gender: <form:input type="text" path="gender"/><form:errors path='gender'/><br>
Instrument: <form:input type="text" path="instrument"/><form:errors path='instrument'/><br>
Birthdate: <form:input type="date" path="birthDate"/><form:errors path='birthDate'/><br>
Country of birth: <form:input type="text" path="countryOfBirth"/><form:errors path='countryOfBirth'/><br>
Band ID: <form:input type="number" path="band"/><form:errors path='band'/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>