<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="zero" method="post">
email<input type="text" placeholder="email" name="StudentEmail" value="StudentEmail">
password<input type="text" placeholder="password" name="StudentPassword" value="StudentPassword">
<h1>Master signup</h1>
email<input type="text" placeholder="email" name="MasterEmail" value="MasterEmail">
password<input type="text" placeholder="password" name="MasterPassword" value="MasterPassword">
<input type="submit" value="register">
</form>
<p Class="text-success">${message}</p>
<p Class="text-danger">${error}</p>
</body>
</html>