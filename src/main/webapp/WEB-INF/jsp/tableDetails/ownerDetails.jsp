<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>User Details</title>
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
		<h2 align="left">Owner Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>owner Id</th>
				<th>Name</th>
				<th>Address Id</th>
				<th>Email</th>
				<th>Account Id</th>
			</tr>
			<c:forEach var="o" items="${listOwners}">
				<tr>
					<td>${o.o_id}</td>
					<td>${o.o_name}</td>
					<td>${o.add_id}</td>
					<td>${o.o_email}</td>
					<td>${o.acc_id}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>