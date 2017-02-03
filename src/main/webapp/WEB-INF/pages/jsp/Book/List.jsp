
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div data-ng-controller="bookAppController" data-ng-init="getBooks()">
	<div class="panel panel-default">
		<div class="panel-heading">
			<ol class="breadcrumb">
				<li><a href="<c:url value="/home"/>">Home</a></li>
				<li class="active">Book List</li>
			</ol>
		</div>
		<div class="panel-body">
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Author</th>
						<th>Editorial</th>
						<th>Language</th>
						<th>Available</th>
						<th>Year</th>
					</tr>
				</thead>
				<tr data-ng-repeat="book in bookList">
					<td ><a data-ng-bind="book.id" data-ng-click="saveCartId(cart.id.id)" data-ng-href="<c:url value="/Cart/editView"/>"></a></td>
					<td data-ng-bind="book.name"></td>
					<td data-ng-bind="book.author"></td>
					<td data-ng-bind="book.editorial"></td>
					<td data-ng-bind="book.language "></td>
					<td data-ng-show="book.status">YES</td>
					<td data-ng-show="!book.status">NO</td>
					<td data-ng-bind="book.year"></td>
				</tr>
				<tbody>
				</tbody>
			</table>
		</div>
	</div>
</div>
