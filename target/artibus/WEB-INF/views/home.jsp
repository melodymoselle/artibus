<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Artibus</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">	<%--<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>--%>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>

<div class="wrapper">

	<!-- CONTENT --------------------------------------------------------------------------------->
	<!-- Login Section -->
	<section id="" class="">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="tabs b-lrb-none">

						<ul>
							<li><a href="#login">Login</a></li>
							<li><a href="#register">Register</a></li>
						</ul>
						<div class="ui-tab-content">
							<div id="login" class="plr-0">
								<h4>Customer Login</h4>
								<p>error message</p>
								<form action="/login" method="post">
									<div class="form-field-wrapper">
										<label for="login-email">Username</label>
										<input type="text" required="" placeholder="Enter your Username" name="username" id="login-email" class="input-sm form-full" aria-required="true">
									</div>
									<div class="form-field-wrapper">
										<label for="login-pass">Password</label>
										<input type="password" required="" placeholder="Enter your Password" name="password" id="login-pass" class="input-sm form-full" aria-required="true">
									</div>
									<button name="submit" id="Button1" type="submit" class="btn btn-md btn-black">Sign In</button>
								</form>
							</div>
							<div id="register" class="plr-0">
								<h4>Create Account</h4>
								<p></p>
								<form action="/register" method="post">
									<div class="form-field-wrapper">
										<label for="login-email">Choose Username</label>
										<input type="text" required="" placeholder="Enter your Username" name="username" id="signup-username" class="input-sm form-full" aria-required="true">
									</div>
									<div class="form-field-wrapper">
										<label for="signup-pass">Choose Password</label>
										<input type="password" required="" placeholder="Enter Password" name="password" id="signup-pass" class="input-sm form-full" aria-required="true">
									</div>
									<button name="submit" id="form-submit" type="submit" class="btn btn-md btn-black">Signup Now</button>
								</form>
							</div>
						</div>


					</div>
				</div>

			</div>
		</div>
	</section>
	<!-- End Login Section -->

</div>

</body>
</html>