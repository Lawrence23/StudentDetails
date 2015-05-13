var restAngular = angular.module('restAngular',['ngRoute','raControllers','raServices']);
 
restAngular.config(['$routeProvider', function($routeProvider) {
	$routeProvider.
		when('/students', {
			templateUrl: 'student-list.jsp',
			controller: 'StudentsListController'
		}).
 
        when('/student/:studentid', {
        	templateUrl: 'student-details.jsp',
        	controller: 'StudentDetailsController'
        }).
        
        otherwise({
        	redirectTo: '/students'
        });
 }]);