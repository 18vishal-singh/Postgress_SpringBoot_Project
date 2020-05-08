<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Account Details</title>
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
		<h2 align="left">Account Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>Account Id</th>
				<th>Create Date</th>
				<th>Login Name</th>
				<th>Login Password</th>
			</tr>
			<c:forEach var="o" items="${listAccounts}">
				<tr>
					<td>${o.acc_id}</td>
					<td>${o.date}</td>
					<td>${o.login_name}</td>
					<td>${o.login_pass}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>