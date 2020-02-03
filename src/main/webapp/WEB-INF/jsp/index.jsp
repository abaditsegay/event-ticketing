<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
		<a href="#" class="pull-left"><img src="images/logo2.jpg"></a>
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Event Ticketing</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#concerts">Concerts</a></li>
					<li><a href="#sports">Sports</a></li>
					<li><a href="#theaters">Theater</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h2>${message}</h2>
		</div>

	</div>
	<!-- /.container -->

	<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
