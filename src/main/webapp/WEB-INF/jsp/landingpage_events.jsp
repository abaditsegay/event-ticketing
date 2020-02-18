<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 placeholder">
	<div class="row">
		<h4>Upcoming Sports</h4>
	</div>
	<c:forEach var="i" begin="1" end="4">
		<img src="images/gana-ethio.jpg" class="img-responsive event-image"
			alt="">
		<h4>Sport</h4>
		<div class="event-detail">
			<span class="text-muted">Location: Mekelle Stadium</span> <span
				class="text-muted" style="display: block;">May 25 at 8PM</span> <a
				href="#" role="button"><span style="display: block;">Get
					Ticket</span></a>
		</div>
	</c:forEach>
</div>
<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 placeholder">
	<div class="row">
		<h4>Upcoming Concerts</h4>
	</div>
	<c:forEach var="i" begin="1" end="4">
		<img src="images/wazema-concert.jpg" class="img-responsive event-image"
			alt="">
		<h4>Concert</h4>
		<div class="event-detail">
			<span class="text-muted">Location: Mekelle Stadium</span> <span
				class="text-muted" style="display: block;">May 25 at 8PM</span> <a
				href="#" role="button"><span style="display: block;">Get
					Ticket</span></a>
		</div>
	</c:forEach>
</div>
<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 placeholder">
	<div class="row">
		<h4>Upcoming Theaters</h4>
	</div>
	<c:forEach var="i" begin="1" end="4">
		<img src="images/theater.jpg" class="img-responsive event-image"
			alt="">
		<h4>Theater</h4>
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

