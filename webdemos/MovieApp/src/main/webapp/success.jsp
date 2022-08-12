<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="movieservlet">
<% 
out.print("Welcome "+request.getAttribute("username")+"<br>");
%>
choose Language<select name="language">
<option value="select">---select---</option>
<option value="kannada">Kannada</option>
<option value="hindi">Hindi</option>
<option value="english">English</option>
<option value="telagu">Telagu</option>
</select><br>

<input type="submit" name="showmovies">
</form>
</body>
</html>




