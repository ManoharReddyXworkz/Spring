<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Criminal Data Here</title>
</head>
<body>

Confirmation Message:${Mesg}
<form action="criminal" method="post">
<pre>
Criminal Name:<input type="text" name="criminalName"/><br>
Age:<select name="criminalAge">
		<option>select</option>
		<c:forEach begin ="12" end="100" var="index">
		<option value="${index}">${index}</option>
		</c:forEach>
	</select><br>
Country:<select name="country">
<option>Pak</option>
<option>China</option>
<option>USA</option>
<option>England</option>
<option>Europe</option>
<option>India</option>
</select><br>
CrimeType:<select name="criminalType">
<option>Murderd</option>
<option>DrugSupplier</option>
<option>DrugMafia</option>
<option>Naxalite</option>
<option>SerialKiller</option>
<option>Kidnapper</option>
<option>RowdyShetter</option>
</select><br>                                               
NoOfCases:<select name="noOfCases">
		<option>select</option>
		<c:forEach begin ="1" end="100" var="index">
		<option value="${index}">${index}</option>
		</c:forEach>
	</select><br>
Alive:<input type="radio" name="alive" value="yes"/>Yes &nbsp&nbsp   <input type="radio" name="alive" value="no"/>No<br>
Gender:<input type="radio" name="gender" value="female"/>Female &nbsp&nbsp   <input type="radio" name="gender" value="male"/>Male &nbsp&nbsp  <input type="radio" name="gender" value="others"/>Others<br>		
International:<input type="radio" name="international" value="yes"/>Yes &nbsp&nbsp   <input type="radio" name="international" value="no"/>No<br>
Married:<input type="radio" name="married" value="yes"/>Yes &nbsp&nbsp   <input type="radio" name="married" value="no"/>No<br>
JailTerm:<select name="jailTerm">
<option>0</option>
<option>2</option>
<option>5</option>
<option>10</option>
<option>11</option>
<option>14</option>
<option>25</option>
</select><br>
WifeName:<input type="text" name="wifeName"/><br>
RightHandName:<input type="text" name="rightHandName"/><br>
LeftHandName:<input type="text" name="leftHandName"/><br>
PrisonName:<input type="text" name="prisonName"/><br>
NetWorth:<input type="text" name="netWorth"/><br>
<br>
<input type="submit" value="Send"/>
</pre>
</form>
<a href="criminal">Criminal Details</a>
</body>
</html>