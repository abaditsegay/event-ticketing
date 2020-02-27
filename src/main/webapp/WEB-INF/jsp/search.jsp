
<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
	<select id="city">
		<option value="all" selected>All Cities</option>
		<option value="alamata">Alamata</option>
		<option value="adigrat">Adigrat</option>
		<option value="maichew">Maichew</option>
	</select>
</div>
<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
	<div class='input-group date' id='datetimepicker1'>
		<input type='text' /> <span class="input-group-addon"> <span
			class="glyphicon glyphicon-calendar"></span>
		</span>
	</div>
</div>
<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
	<select id="event">
		<option value="all" selected>All events</option>
		<option value="sports">Sports</option>
		<option value="concerts">Concerts</option>
		<option value="theatres">Theater</option>
	</select>
</div>
<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
	<input id="textsearch" placeholder="Search by text">
</div>
<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
	<button class="btn-outline-info">Search</button>
</div>


<script type="text/javascript">
	$(function() {
		$('#datetimepicker1').datetimepicker();
	});
</script>