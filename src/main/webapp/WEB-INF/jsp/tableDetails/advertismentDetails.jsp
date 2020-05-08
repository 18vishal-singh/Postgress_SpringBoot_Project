<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Advertisement Details</title>
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
		<h2 align="left">Advertisement Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>Advertisement Id</th>
				<th>Publisher Id</th>
				<th>Advertisement Type</th>
				<th>Region Id</th>
				<th>Length</th>
			</tr>
			<c:forEach var="o" items="${listAdvertisements}">
				<tr>
					<td>${o.adv_id}</td>
					<td>${o.ap_id}</td>
					<td>${o.adv_type}</td>
					<td>${o.reg_id}</td>
					<td>${o.ad_length}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>