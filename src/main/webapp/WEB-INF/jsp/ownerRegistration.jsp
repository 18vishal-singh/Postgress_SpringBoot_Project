<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Owner Registration Form</title>
</head>
<body>
	<div class="class1">
		<div class="class2">
			<div class="class3">
				<form class="class4" method="post"
					action="http://localhost:8080/oRegister">
					<span class="class5 p-b-26"> Create Owner VideoSpace account
					</span> <span class="class5 p-b-48"> </span>

					<div class="class6">
						<input class="class7" type="text" name="oName" id="oName">
						<span class="class8" data-placeholder="Name"></span>
					</div>

					<div class="class6">
						<input class="class7" type="text" name="oEmail" id="oEmail">
						<span class="class8" data-placeholder="Email"></span>
					</div>
					<div class="class6">
						<input class="class7" type="text" name="houseNo" id="houseNo">
						<span class="class8" data-placeholder="HouseNo"></span>
					</div>
					<div class="class6">
						<input class="class7" type="text" name="pincode" id="pincode">
						<span class="class8" data-placeholder="Zipcode"></span>
					</div>
					<div class="class6">
						<input class="class7" type="text" name="city" id="city"> <span
							class="class8" data-placeholder="City"></span>
					</div>
					<div class="class6">
						<input class="class7" type="text" name="state" id="state">
						<span class="class8" data-placeholder="state"></span>
					</div>
					<div class="class6">
						<input class="class7" type="text" name="country" id="country">
						<span class="class8" data-placeholder="Country"></span>
					</div>
					<div class="class6">
						<input class="class7" type="text" name="loginName" id="loginName">
						<span class="class8" data-placeholder="Username"></span>
					</div>

					<div class="class6">
						<span class="btn-show-pass"> <!-- <i class="zmdi zmdi-eye"></i> -->
						</span> <input class="class7" type="password" name="loginPass"
							id="loginPass"> <span class="class8"
							data-placeholder="Password"></span>
					</div>

					<div class="class9">
						<div class="class10">
							<div class="class11"></div>
							<button class="class12">SignUp</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

<style>
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

.class4 {
	width: 100%;
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

.class5 i {
	font-size: 60px;
}

.class6 {
	width: 100%;
	position: relative;
	border-bottom: 2px solid #adadad;
	margin-bottom: 37px;
}

.class7 {
	font-family: Poppins-Regular;
	font-size: 15px;
	color: #555555;
	line-height: 1.2;
	display: block;
	width: 100%;
	height: 45px;
	background: transparent;
	padding: 0 5px;
}

.class7B {
	font-family: Poppins-Regular;
	font-size: 15px;
	color: #555555;
	line-height: 1.2;
	display: block;
	width: 100%;
	height: 45px;
	background: transparent;
	padding: 0 5px;
}

.class8 {
	position: absolute;
	display: block;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	pointer-events: none;
}

.class8::before {
	content: "";
	display: block;
	position: absolute;
	bottom: -2px;
	left: 0;
	width: 0;
	height: 2px;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s;
	background: #6a7dfe;
	background: -webkit-linear-gradient(left, #21d4fd, #b721ff);
	background: -o-linear-gradient(left, #21d4fd, #b721ff);
	background: -moz-linear-gradient(left, #21d4fd, #b721ff);
	background: linear-gradient(left, #21d4fd, #b721ff);
}

.class8::after {
	font-family: Poppins-Regular;
	font-size: 15px;
	color: #999999;
	line-height: 1.2;
	content: attr(data-placeholder);
	display: block;
	width: 100%;
	position: absolute;
	top: 16px;
	left: 0px;
	padding-left: 5px;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s;
}

.class7:focus+.class8::after {
	top: -15px;
}

.class7:focus+.class8::before {
	width: 100%;
}

.has-val.class7+.class8::after {
	top: -15px;
}

.has-val.class7+.class8::before {
	width: 100%;
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

.class10:hover .class11 {
	left: 0;
}

.text-center {
	text-align: center !important;
	padding-top: 20px;
}

.txt1 {
	font-family: Poppins-Regular;
	font-size: 17px;
	color: #666666;
	line-height: 1.5;
}

.txt2 {
	font-family: Poppins-Regular;
	font-size: 17px;
	color: #333333;
	line-height: 1.5;
}
</style>
</html>