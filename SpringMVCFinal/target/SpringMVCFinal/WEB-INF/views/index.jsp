<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h1>this is my view</h1>
<h2>Hello friends</h2>

<!-- Do the scripted tag like this-->

<%

String name=(String) request.getAttribute("name");

%>

<h1>Name is <%=name%></h1>
</body>
</html>
