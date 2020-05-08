<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>VOD Details</title>
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
		<h2 align="left">VOD Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>Video Id</th>
				<th>Length</th>
				<th>Title</th>
				<th>Rating</th>
				<th>Description</th>
				<th>Upload Date</th>
				<th>Video Type</th>
				<th>Video Key</th>
			</tr>
			<c:forEach var="o" items="${listVOD}">
				<tr>
					<td>${o.vid_id}</td>
					<td>${o.vid_length}</td>
					<td>${o.title}</td>
					<td>${o.rating}</td>
					<td>${o.description}</td>
					<td>${o.upload_date}</td>
					<td>${o.vid_type}</td>
					<td>${o.vid_key}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>