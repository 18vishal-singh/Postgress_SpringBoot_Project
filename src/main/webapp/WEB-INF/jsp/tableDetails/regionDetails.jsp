<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Region Details</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
}

table#t01 {
	width: 100%;
	background-color: #f1f1c1;
}

table#t02 {
	width: 100%;
	background-color: #F5DAD4;
}
</style>
</head>
<body>
	<div align="right">
		<h2 align="left">Region Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>Region Id</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
			</tr>
			<c:forEach var="r" items="${listRegions}">
				<tr>
					<td>${r.reg_id}</td>
					<td>${r.city}</td>
					<td>${r.state}</td>
					<td>${r.country}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>