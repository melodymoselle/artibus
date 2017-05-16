<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../views/fragments/head.jsp"/>
<body>

<div class="container">
	<div class="row">
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#login">Login</a></li>
			<li><a data-toggle="tab" href="#register">Register</a></li>
		</ul>

		<div class="tab-content">
			<div id="login" class="tab-pane fade in active">
				<h3>HOME</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
			</div>
			<div id="register" class="tab-pane fade">
				<h3>Menu 1</h3>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
	</div>
</div>

</body>
</html>