<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Prime Minister Details</h1>

 <form action="pm" method="post">
 Prime Minister Name :<input type="text" id="name" name= "PrimeMinisterName"><br><br>
  Prime Minister country:
  <label for="country" >Choose a Country:</label>
  
  <select name="country" id="coun">
  <option value="India">India</option>
    <option value="Us">US</option>
      <option value="Spain">Spain</option>
        <option value="Uk">UK</option>
  </select>
  <br><br>
  
  Marriage:<input type="radio" id="marriage" name="status" value="Married">married
            <input type="radio" id="marriage" name="status" value="UnMarried">Unmarried<br><br>
  
  Party<select name="PartyName">
  <option value="BJP">BJP</option>
    <option value="TDP">TDP</option>
      <option value="JDS">JDs</option>
        <option value="others">others</option>
         </select><br><br>
         Age:<input type="text" id="Age" name="PMAge" ><br><br>
         
         Gender:<input type="radio" id="gender" name="PM" value="Male">male
            <input type="radio" id="gender" name="PM" value="Female">female<br><br>
            
            Period:<input type="text" id="Period" name="PMperiod" ><br><br>
            
            Times Represented:<select id="Times" name="TimesRepresented">
  <option value="1">1</option>
    <option value="2">2</option>
      <option value="3">3</option>
        <option value="4">4</option>
         </select><br><br>
         
  <input type="submit" value="send"/>
 </form>

</body>
</html>