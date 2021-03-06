<!doctype html>
<html lang="en" ng-app="restAngular">
<head>
	<meta charset="utf-8">
	<title>Students</title>
	<link href="js/bootstrap-3.2.0-dist/css/bootstrap.css" rel="stylesheet" type="text/css" />

	<!-- Downloaded Scripts -->	
	<script src="js/angular.min.js"></script>
	<script src="js/angular-route.min.js"></script>
	<script src="js/angular-resource.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	
	<!-- Created Scripts -->
	<script src="js/app.js"></script>
	<script src="js/controllers.js"></script>
	<script src="js/services.js"></script>
</head>
<body>
	<div align="center">
		<div style="width: 300px;">
			<div ng-view></div>
		</div>
	</div>
</body>
</html>