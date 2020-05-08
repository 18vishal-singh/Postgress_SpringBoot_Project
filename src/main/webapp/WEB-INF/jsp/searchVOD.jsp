	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>VideoSpace - Home</title>
</head>
<body>
	<div class="header">
		<form  method="post" action="http://localhost:8080/userSearchRedirect">
			<h1>Hi, What titles do you wanna watch?</h1>
			<div class="formBox">
				<input type="text" class="searchField"
					placeholder="Search for your movie/TV series" name="inputText" value="inputText">
				<button type="submit" class="searchButton" name="button">
					Search</button>

			</div>

		</form>

	</div>

</body>
<style>
body {
	margin: 0;
	padding: 0;
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
	margin-bottom: 70px;
	font-size: 45px;
	letter-spacing: 2px;
	text-align: center;
}

.searchField {
	height: 30px;
	width: 700px;
	padding: 10px;
	border: none;
	border-radius: 25px;
	outline: none;
	justify-content: center;
}

.searchButton {
	height: 50px;
	width: 150px;
	background: #ffeb3b;
	border: none;
	color: #000;
	border-radius: 25px;
}
</style>
</html>
