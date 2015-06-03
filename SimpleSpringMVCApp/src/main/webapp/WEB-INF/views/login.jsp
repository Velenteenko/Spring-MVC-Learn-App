<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<link href='<c:url value="${webappRoot }/resources/css/style.css"/>'
	rel="stylesheet">

<title>Login Form</title>
</head>
<section class="container">
	<div class="login">
		<h1>Login to Web App</h1>

		<form:form method="post" commandName="user" action="check-user">
			<p>
				<form:label path="name">Name:</form:label>
				<form:input path="name" placeholder="Input your name!" />
			</p>
			<p>
				<form:label path="password">Password:</form:label>
				<form:input path="password" type="password"
					placeholder="Input Your password!" />
			</p>
			<p class="remember_me">
<!-- 								<label> <input type="checkbox" name="remember_me" -->
<!-- 									id="remember_me"> Admin -->
<!-- 								</label> -->
				<label><form:checkbox path="admin"/> Admin tool</label> 
			</p>
			<p class="submit">
				<form:button type="submit">Login</form:button>
			</p>
		</form:form>
	</div>

	<div class="login-help">
		<p>
			Forgot your password? <a href="#">Click here to reset it</a>.
		</p>
	</div>
</section>

<!-- <div class="footer"> -->
<section class="about">
	<!-- 	<p class="about-links"></p> -->
	<p class="about-author">
		&copy; 2012&ndash;2015 <br> <a
			href="https://github.com/Velenteenko" target="_parent">Velenteenko
			GitHub</a>
	</p>
</section>
<!-- </div> -->

</body>
</html>
