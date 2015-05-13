<!doctype html>
<html lang="en" ng-app="restAngular">
<head>
	<meta charset="utf-8">
	<title>Students</title>
	<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" />
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	<!-- Downloaded Scripts -->	
	<script src="resources/js/angular.min.js"></script>
	<script src="resources/js/angular-route.min.js"></script>
	<script src="resources/js/angular-resource.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	
	<!-- Created Scripts -->
	<script src="resources/js/app.js"></script>
	<script src="resources/js/controllers.js"></script>
	<script src="resources/js/services.js"></script>
</head>
<body>
	<div align="center">
		<div style="width: 300px;">
			<div ng-view></div>
		</div>
	</div>
</body>
</html>