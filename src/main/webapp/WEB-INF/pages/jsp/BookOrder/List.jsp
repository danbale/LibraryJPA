
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div data-ng-controller="bookOrderAppController" data-ng-init="getBookOrders()">
	<div class="panel panel-default">
		<div class="panel-heading">
			<ol class="breadcrumb">
				<li><a href="<c:url value="/home"/>">Home</a></li>
				<li class="active">Book Order List</li>
			</ol>
		</div>
		<div class="panel-body">
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Order</th>
						<th>Book Name</th>
						<th>User Name</th>
					</tr>
				</thead>
				<tr data-ng-repeat="bookOrder in bookOrderList">
					<td ><a data-ng-bind="bookOrder.id" data-ng-click="saveCartId(cart.id.id)" data-ng-href="<c:url value="/BookOrder/edit"/>"></a></td>
					<td data-ng-bind="bookOrder.name"></td>
					<td data-ng-bind="bookOrder.book.name"></td>
					<td data-ng-bind="bookOrder.order.user.name"></td>
				</tr>
				<tbody>
				</tbody>
			</table>
		</div>
	</div>
</div>
