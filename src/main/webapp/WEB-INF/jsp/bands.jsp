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
<c:forEach var="band" items="${bands}">
	<p>${band}<br></p>
</c:forEach>
asdasd
</body>
</html>