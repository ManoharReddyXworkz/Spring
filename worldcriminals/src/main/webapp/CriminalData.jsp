<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Criminal Details Are Below</title>
</head>
<body>
<h1>Criminal Data  Displayed Here</h1>
<br>
${RecordCount}
<br>
<table border="1">
<thead>
<tr>
<th>Criminal Name</th>
<th>Criminal Age</th>
<th>Criminal Country</th>
<th>Criminal Type</th>
<th>NumberOfCases</th>
<th>Criminal Status</th>
<th>Criminal Gender</th>
<th>Criminal Level</th>
<th>Married Status</th>
<th>NoOfYearsInJail</th>
<th>WifeName</th>
<th>RightHandName</th>
<th>LeftHandName</th>
<th>PrisonName</th>
<th>NetWorth</th>
</tr>
</thead>
<tbody>
<c:forEach var = "danger" items="${CriminalDetails}">
<tr>
<td>${danger.criminalName}</td>
<td>${danger.criminalAge}</td>
<td>${danger.country}</td>
<td>${danger.criminalType}</td>
<td>${danger.noOfCases}</td>
<td>${danger.alive}</td>
<td>${danger.gender}</td>
<td>${danger.international}</td>
<td>${danger.married}</td>
<td>${danger.jailTerm}</td>
<td>${danger.wifeName}</td>
<td>${danger.rightHandName}</td>
<td>${danger.leftHandName}</td>
<td>${danger.prisonName}</td>
<td>${danger.netWorth}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>