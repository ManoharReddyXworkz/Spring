<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="shirt" method="post">
 <pre>
 
brand:<input type="text" name="brand"/><br>
 size:<select name="size">
 <option>s</option>
  <option>m</option>
   <option>L</option>
    <option>xl</option>
     <option>xxl</option>
 </select>
 <br>
 price:<input type="text" name="price"/><br>
 discount:<select name="discount">
 <option>10%</option>
 <option>20%</option>
 <option>30%</option>
 <option>40%</option>
 <option>50%</option>
 </select>
  <br>
 quantity:<select name="quantity">
 <option>100</option>
 <option>200</option>
 <option>300</option>
 <option>400</option>
 <option>500</option>
 <option>1000</option>
 </select>
 <br>
  gender:<select name=" gender">
  <option>male</option>
  <option>female</option>
  </select>
   <br>
  color:<select name="color">
  <option>black</option>
   <option>white</option>
    <option>green</option>
     <option>yellow</option>
  </select>
  <br>
 </pre>
 
 
 
 </form>

</body>
</html>