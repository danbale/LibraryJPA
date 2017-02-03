 myLib.controller('bookOrderAppController', function ($scope,bookOrderService){
		  $scope.bookOrderList = {};
		  $scope.bookOrder = {};
		  $scope.getBookOrders=function(){
			  bookOrderService.bookOList()
			  .then(
					  function(d) {
						  $scope.bookOrderList = angular.copy(d);
						  console.log( $scope.bookOrderList)
					  },
					  function(errResponse){
						  console.error('Error while fetching Users');
					  }
			  );
		  } 
		  
		 $scope.createBookOrder=function(){
			 bookOrderService.createBookOrders($scope.bookOrder)
			 alert("hola")
		 }
		  
	  });
 
myLib.factory('bookOrderService',function($http,$q){
		var service={
				bookOList:bookOList,
				bookOrderEdit:bookOrderEdit,
				createBookOrders:createBookOrders
		};
		
		var URL='http://localhost:8080/library/BookOrder'
			
			function bookOList(){
				var deferred = $q.defer();
		        $http.get(URL+'/BookOrderList')
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
		
		
		
			function bookOrderEdit(){
				
			}
			
			function createBookOrders(bookOrder){
				var deferred = $q.defer();
		        $http.post(URL+'/addBookOrder', bookOrder)
		            .then(
		            function (response) {
		                deferred.resolve(response.data);
		            },
		            function(errResponse){
		                console.error('Error while fetching Books');
		                deferred.reject(errResponse);
		            }
		        );
		        return deferred.promise;
			}
		
		return service;
 });