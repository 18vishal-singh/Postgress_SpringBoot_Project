<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>VideoSpace - Home</title>
<link rel="stylesheet" type="text/css" href="css/results.css">
</head>
<body>
	<div class="header">
		<form>
			<h1>Your search returned these results</h1>
			<h1>Which one would you like to watch?</h1>
			<ul id="myUL" style="width: 500px; height: 200px; overflow: auto">
				<c:forEach var="o" items="${listVOD}">
				<li><a href="#">${o.title}</a></li>
				</c:forEach>
			</ul>
		</form>

	</div>

</body>
<style>



body {
	margin: 0;
	padding: 0;
	overflow-y : auto;
}

.header {
	height: 100vh;
	background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
		url(image2.jpg);
	background-size: cover;
	background-position: center;
	display: flex;
	justify-content: center;
	align-items: center;
	font-family: sans-serif;
}

h1 {
	color: #fff;
	margin-bottom: 5px;
	font-size: 25px;
	letter-spacing: 2px;
	text-align: center;
}

#myUL {
	list-style-type: none;
	padding: 0;
	margin: 0;
}

#myUL li a {
	border: 1px solid #ddd;
	margin-top: -1px;
	background-color: #f6f6f6;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	color: black;
	display: block;
}
#myUL
 
li
 
a
:hover
:not
 
(
.header
 
)
{
background-color
:
 
#eee
;


}
</style>
</html>
