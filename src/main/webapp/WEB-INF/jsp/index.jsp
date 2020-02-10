<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/main.css" rel="stylesheet" />
</head>
<body>
	<nav class="navbar navbar-light">
		<div class="container">
			<a href="#" class="pull-left"><img src="images/logo3.jpg"
				id="logo"></a>
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NatnaTicket</a>
			</div>
			<%@ include file="header.jsp"%>
		</div>
	</nav>

	<div class="container text-center">
		<%@include file="search.jsp"%>
		<%@ include file="landingpage_events.jsp"%>
		<!-- footer -->
		<%@ include file="footer.jsp"%>
	</div>

	<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>
