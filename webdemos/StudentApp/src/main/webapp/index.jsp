<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registerservlet">
Enter Name <input type="text" name="username"><br>
Enter StudentId<input type="text" name="studentId"><br>
Enter City<input type="text" name="city"><br>

choose Language<select name="language">
<option value="select">---select---
<option value="Java">java</option>
<option value="Jsp">jsp</option>
<option value="Spring">spring</option>
<option value="Hibernate">hibernate</option>
</select><br>
Enter Hobby
<input type="checkbox" value="music" name="hobby">Music
<input type="checkbox" value="dance" name="hobby">Dance
<input type="checkbox" value="sports" name="hobby">Sports
<input type="checkbox" value="reading" name="hobby">Reading<br>
<input type="submit" value="Add"><br>

</form>
</body>
</html>