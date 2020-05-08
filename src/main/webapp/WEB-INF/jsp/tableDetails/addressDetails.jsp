<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Address Details</title>
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
		<h2 align="left">Address Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>Address Id</th>
				<th>Region Id</th>
				<th>House No</th>
				<th>ZipCode</th>
			</tr>
			<c:forEach var="o" items="${listAddresses}">
				<tr>
					<td>${o.add_id}</td>
					<td>${o.reg_id}</td>
					<td>${o.house_no}</td>
					<td>${o.pincode}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>