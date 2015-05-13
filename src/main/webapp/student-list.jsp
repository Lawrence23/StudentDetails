<input placeholder="search student" class="form-control" ng-model="query">
<div align="left">
	<div class="list-group">
		<a href="#/student/{{student.studentid}}" class="list-group-item" ng-repeat="student in students | filter:query">
			<div class="col-md-3 col-sm-3">
				
			</div> {{student.name}}
		</a>
	</div>
</div>