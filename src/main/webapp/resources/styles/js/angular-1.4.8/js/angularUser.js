 myLib.controller('userAppController', function ($scope,userService){
		  $scope.userList = {};
		  $scope.user = {};
		  $scope.getUsers=function(){
			  userService.userList()
			  .then(
					  function(d) {
						  $scope.userList = angular.copy(d);
					  },
					  function(errResponse){
						  console.error('Error while fetching Users');
					  }
			  );
		  }  
		  
		  $scope.createUser = function() {
			  userService.userAdd($scope.user)
		  }
		  
		  
	  });
 
myLib.factory('userService',function($http,$q,$window){
		var service={
				userList:userList,
				userEdit:userEdit,
				userAdd:userAdd
		};
		
		var URL='http://localhost:8080/library/User'
			
			function userList(){
				var deferred = $q.defer();
		        $http.get(URL+'/UserList')
		            .then(
		            function (response) {
		                deferred.resolve(response.data);
		            },
		            function(errResponse){
		                console.error('Error while fetching Users');
		                deferred.reject(errResponse);
		            }
		        );
		        return deferred.promise;
			}
		
		
		
			function userEdit(){
			}
			
			
			function userAdd(user){
				var deferred = $q.defer();
				$http.post(URL + '/addUser',user)
				.then(
						function(response){
							deferred.resolve(response.data);
							window.location = URL+'/create';
							alert('User Created Successfully');
						},
						function(errResponse){
							console.error('Error while fetching Users');
							deferred.reject(errResponse);
							window.location = URL+'/create';
							alert('Error Creating User');
						}
					);
				return deferred.promise;
			}
		
		return service;
 });