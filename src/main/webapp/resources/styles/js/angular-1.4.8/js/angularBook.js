 myLib.controller('bookAppController', function ($scope,bookService){
		  $scope.bookList = {};
		  $scope.book = {};
		  $scope.getBooks=function(){
			  bookService.bookList()
			  .then(
					  function(response) {
						  $scope.bookList = angular.copy(response);
						  console.log( $scope.bookList)
					  },
					  function(errResponse){
						  console.error('Error while fetching Users');
					  }
			  );
		  } 
		  
		 $scope.createBook=function(){
			 bookService.bookAdd($scope.book)
		 }
		  
	  });
 
myLib.factory('bookService',function($http,$q,$window){
		var service={
				bookList:bookList,
				bookEdit:bookEdit,
				bookAdd:bookAdd
		};
		
		var URL='http://localhost:8080/library/Book'
			
			function bookList(){
				var deferred = $q.defer();
		        $http.get(URL+'/BookList')
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
		
		
		
			function bookEdit(){
			}
			
			function bookAdd(book){
				var deferred = $q.defer();
		        $http.post(URL+'/addBook', book)
		            .then(
		            function (response) {
		                deferred.resolve(response.data);
		                window.location = URL+'/create';
		                alert('Book Created Successfully')
		            },
		            function(errResponse){
		                console.error('Error while fetching Books');
		                deferred.reject(errResponse);
						window.location = URL+'/create';
						alert('Error Creating User');
		            }
		        );
		        return deferred.promise;
			}
		
		return service;
 });