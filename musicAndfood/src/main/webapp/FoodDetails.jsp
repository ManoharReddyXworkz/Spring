<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>Menu of food</h1>
<body>
<table border=1>
<thead>
<tr>
<th>foodName</th>
<th> price</th>
<th> hotelName</th>
<th> location</th>
<th> order</th>
<th> quantity</th>
</tr>
</thead>
<tbody>
<c:forEach items="${List}" var="food">
<tr>
<td>${food.foodName}</td>
<td>${food. price}</td>
<td>${food.hotelName}</td>
<td>${food.location}</td>
<td>${food.order}</td>
<td>${food.quantity}</td>
</c:forEach>
</tbody>
</table>
</body>
</html>