<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Java code inside html is jsp -->

<%
String title=(String) request.getAttribute("mytitle");
out.print("Title is: "+title+"<br>");
out.print("Author is: "+request.getAttribute("author")+"<br>");
out.print("Category is: "+request.getAttribute("category")+"<br>");

Integer id=(Integer) request.getAttribute("bookId");
out.print("BookId is: "+id+"<br>");

Double mprice=(Double)request.getAttribute("price");
out.print("Price is: "+mprice+"<br>");
%>

</body>
</html>