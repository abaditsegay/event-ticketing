<!-- <div class="row">
	<div class="col-md-2">
		<select id="city">
			<option value="all" selected>All Cities</option>
			<option value="alamata">Alamata</option>
			<option value="adigrat">Adigrat</option>
			<option value="maichew">Maichew</option>
		</select>
	</div>
	<div class="col-md-3">
		<div class='input-group date' id='datetimepicker1'>
			<input type='text' /> <span class="input-group-addon"> 
			<span class="glyphicon glyphicon-calendar"></span>
			</span>
		</div>
	</div>
	<div class="col-md-3">
		<select id="event">
			<option value="all" selected>All events</option>
			<option value="sports">Sports</option>
			<option value="concerts">Concerts</option>
			<option value="theatres">Theater</option>
		</select>
	</div>
	<div class="col-md-2">
		<input id="textsearch" placeholder="Search by text">
	</div>
	<div class="col-md-2">
		<button class="btn-outline-info">Search</button>
	</div>
</div> -->

<!-- <div class="row">
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="col-md-2">
			<select id="city">
				<option value="all" selected>All Cities</option>
				<option value="alamata">Alamata</option>
				<option value="adigrat">Adigrat</option>
				<option value="maichew">Maichew</option>
			</select>
		</div>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="col-md-2">
			<select id="city">
				<option value="all" selected>All Cities</option>
				<option value="alamata">Alamata</option>
				<option value="adigrat">Adigrat</option>
				<option value="maichew">Maichew</option>
			</select>
		</div>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="col-md-2">
			<select id="city">
				<option value="all" selected>All Cities</option>
				<option value="alamata">Alamata</option>
				<option value="adigrat">Adigrat</option>
				<option value="maichew">Maichew</option>
			</select>
		</div>
	</div>
</div> -->

<%-- <div class="row">
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="row">
			<div class="event-header">Upcoming Concerts</div>
		</div>
		<c:forEach var="i" begin="1" end="4">
			<%@ include file="event.jsp"%>
		</c:forEach>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="row">
			<div class="event-header">Upcoming Sports</div>
		</div>
		<c:forEach var="i" begin="1" end="4">
			<%@ include file="event.jsp"%>
		</c:forEach>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="row">
			<div class="event-header">Upcoming Theaters</div>
		</div>
		<c:forEach var="i" begin="1" end="4">
			<%@ include file="event.jsp"%>
		</c:forEach>
	</div>
</div> --%>

<div class="col-xs-6 col-sm-3 placeholder">
	<div class="row">
		<h4>Upcoming Sports</h4>
	</div>
	<c:forEach var="i" begin="1" end="4">
		<img src="images/gana-ethio.jpg" class="img-responsive event-image"
			alt="">
<!-- 		<h4>Sport</h4> -->
		<div class="event-detail">
			<span class="text-muted">Location: Mekelle Stadium</span> <span
				class="text-muted" style="display: block;">May 25 at 8PM</span> <a
				href="#" role="button"><span style="display: block;">Get
					Ticket</span></a>
		</div>
	</c:forEach>
</div>
<div class="col-xs-6 col-sm-3 placeholder">
	<div class="row">
		<h4>Upcoming Concerts</h4>
	</div>
	<c:forEach var="i" begin="1" end="4">
		<img src="images/gana-ethio.jpg" class="img-responsive event-image"
			alt="">
<!-- 		<h4>Concert</h4> -->
		<div class="event-detail">
			<span class="text-muted">Location: Mekelle Stadium</span> <span
				class="text-muted" style="display: block;">May 25 at 8PM</span> <a
				href="#" role="button"><span style="display: block;">Get
					Ticket</span></a>
		</div>
	</c:forEach>
</div>
<div class="col-xs-6 col-sm-3 placeholder">
	<div class="row">
		<h4>Upcoming Theaters</h4>
	</div>
	<c:forEach var="i" begin="1" end="4">
		<img src="images/gana-ethio.jpg" class="img-responsive event-image"
			alt="">
<!-- 		<h4>Theater</h4> -->
		<div class="event-detail">
			<span class="text-muted">Location: Mekelle Stadium</span> <span
				class="text-muted" style="display: block;">May 25 at 8PM</span> <a
				href="#" role="button"><span style="display: block;">Get
					Ticket</span></a>
		</div>
	</c:forEach>
</div>



<script type="text/javascript">
	$(function() {
		$('#datetimepicker1').datetimepicker();
	});
</script>

