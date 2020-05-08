<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>VOD</title>
</head>
<body>
	<div class="class1">
		<div class="class2">
			<div class="class3">
				<form method="post" action="http://localhost:8080/redirectOUP">
					<span class="class5"> Who are you : </span> <span class="class5">
					</span>
					<div>
						<label class="container">User <input type="radio"
							checked="checked" name="user" value="user"> <span
							class="checkmark"></span>
						</label>
					</div>
					<div>
						<label class="container">Owner <input type="radio"
							name="user" value="owner"> <span class="checkmark"></span>
						</label>
					</div>
					<div>
						<label class="container">Publisher <input type="radio"
							name="user" value="publisher"> <span class="checkmark"></span>
						</label>
					</div>
					<div class="class9">
						<div class="class10">
							<div class="class11"></div>
							<button class="class12" type="submit">Enter</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

<style>

/* The container */
.container {
	display: block;
	position: relative;
	padding-left: 35px;
	margin-bottom: 12px;
	cursor: pointer;
	font-size: 22px;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

/* Hide the browser's default radio button */
.container input {
	position: absolute;
	opacity: 0;
	cursor: pointer;
}

/* Create a custom radio button */
.checkmark {
	position: absolute;
	top: 0;
	left: 0;
	height: 25px;
	width: 25px;
	background-color: #eee;
	border-radius: 50%;
}

/* On mouse-over, add a grey background color */
.container:hover input ~ .checkmark {
	background-color: #ccc;
}

/* When the radio button is checked, add a blue background */
.container input:checked ~ .checkmark {
	background-color: #2196F3;
}

/* Create the indicator (the dot/circle - hidden when not checked) */
.checkmark:after {
	content: "";
	position: absolute;
	display: none;
}

/* Show the indicator (dot/circle) when checked */
.container input:checked ~ .checkmark:after {
	display: block;
}

/* Style the indicator (dot/circle) */
.container .checkmark:after {
	top: 9px;
	left: 9px;
	width: 8px;
	height: 8px;
	border-radius: 50%;
	background: white;
}

.class1 {
	width: 100%;
	margin: 0 auto;
}

.class2 {
	width: 100%;
	min-height: 100vh;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
	align-items: center;
	padding: 15px;
	background: #f2f2f2;
}

.class3 {
	width: 390px;
	background: #fff;
	border-radius: 10px;
	overflow: hidden;
	padding: 77px 55px 33px 55px;
	box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
	-moz-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
	-webkit-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
	-o-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
	-ms-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
}

.class5 {
	display: block;
	font-family: Poppins-Bold;
	font-size: 25px;
	color: #333333;
	line-height: 1.2;
	text-align: center;
	padding: 0 0 25px 0;
}

.class9 {
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
	padding-top: 13px;
}

.class10 {
	width: 100%;
	display: block;
	position: relative;
	z-index: 1;
	border-radius: 25px;
	overflow: hidden;
	margin: 0 auto;
}

.class11 {
	position: absolute;
	z-index: -1;
	width: 300%;
	height: 100%;
	background: #a64bf4;
	background: -webkit-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
	background: -o-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
	background: -moz-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
	background: linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
	top: 0;
	left: -100%;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s;
}

.class12 {
	font-family: Poppins-Medium;
	font-size: 15px;
	color: #fff;
	line-height: 1.2;
	text-transform: uppercase;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 0 20px;
	width: 100%;
	height: 50px;
	background-color: #330033;
}
</style>
</html>