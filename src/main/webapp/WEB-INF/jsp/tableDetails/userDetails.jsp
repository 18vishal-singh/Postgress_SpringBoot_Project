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
		<h2 align="left">User Details</h2>
		<table id="t01" class="table table-default">
			<tr>
				<th>user Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Email</th>
				<th>Account Id</th>
				<th>Region Id</th>
			</tr>
			<c:forEach var="u" items="${listUsers}">
				<tr>
					<td>${u.u_id}</td>
					<td>${u.u_name}</td>
					<td>${u.u_age}</td>
					<td>${u.u_email}</td>
					<td>${u.acc_id}</td>
					<td>${u.reg_id}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>