<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="getFood.do" method="post">
<pre>
FoodName:<input type="text" name="foodName"/><br>
Price:<input type="text" name="price"/><br>
HotelName:
<select name="hotelName">
<option> Empire</option>
<option> Megna</option>
<option> Nandana</option>
</select>
<br>
Type:
<select name="type">
<option> Veg</option>
<option>NonVeg</option>
</select>
<br>
Location:
<select name="location">
<option> Marathalli</option>
<option> Krpuram</option>
<option> Btm</option>
</select>
<br>
Ordered:
<select name="order">
<option> Zomato</option>
<option> Swiggy</option>
<option>Ubereats </option>
</select>
<br>
Quantity:
<select name="quantity">
<option> 500gm</option>
<option> 1kg</option>
<option> 2kg</option>
</select>
<br>
<input type ="submit" value="ok">
</pre>
</form>
</body>
</html>