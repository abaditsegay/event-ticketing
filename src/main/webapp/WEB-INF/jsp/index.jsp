<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Natna Ticketing</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="js/jquery-3.4.1.min.js"></script>
<link href="css/bootstrap-3.3.7.min.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet" />
<script src="js/bootstrap-3.3.7.min.js"></script>
<script type="text/javascript" src="js/moment.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-datetimepicker.min.css">
<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js"></script>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">NATNA Event Tickets</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-left">
					<li><a href="#">Sports</a></li>
					<li><a href="#">Concerts</a></li>
					<li><a href="#">Theaters</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Profile</a></li>
					<li><a href="#">Sign in / Sign out</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search...">
					<select id="city" class="form-control">
						<option value="all" selected>All Cities</option>
						<option value="alamata">Alamata</option>
						<option value="adigrat">Adigrat</option>
						<option value="maichew">Maichew</option>
					</select> <select id="event" class="form-control">
						<option value="all" selected>All events</option>
						<option value="sports">Sports</option>
						<option value="concerts">Concerts</option>
						<option value="theatres">Theater</option>
					</select>
					<div class='input-group date form-control' id='datetimepicker1'>
						<input type='text' /> <span class="input-group-addon"> <span
							class="glyphicon glyphicon-calendar"></span>
						</span>
					</div>
					<button class="btn-outline-info form-control">Search</button>
				</form>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="#">My Tickets</a></li>
					<li><a href="#">My Listings</a></li>
					<li class="nav-divider"></li>
					<li><a href="#">Setting</a></li>
					<li><a href="#">Payment Options</a></li>
					<li class="nav-divider"></li>
					<li><a href="#">Associates Approval</a></li>
					<li><a href="#">Event Owner Approval</a></li>
					<li><a href="#">Event Approval</a></li>
				</ul>
			</div>

			<div class="col-sm-12 main">
				<div class="row">
					<h2 class="page-header">Upcoming Events Overview</h2>
					<div class="row placeholders">
						<%@ include file="landingpage_events.jsp"%>
					</div>
					<%@ include file="footer.jsp"%>
				</div>
			</div>
		</div>
	</div>
</body>
</html>