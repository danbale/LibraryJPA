
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<div data-ng-controller = "userAppController" data-ng-init="getUsers()">
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
						<th>Username</th>
						<th>Name</th>
					</tr>
				</thead>
				<tbody>
					<tr data-ng-repeat="user in userList">
					<td data-ng-bind = "user.id"></td>
					<td data-ng-bind="user.username" ></td>
					<td data-ng-bind="user.name"></td>
					</tr>
				</tbody>
	</table>
				<div id="custom-search-form" class="form-search form-horizontal pull-left">
                <div class="input-append span12">
                    <input  data-ng-model="searchU" type="text" class="search-query" placeholder="Search">
                    <button data-ng-click="searchUsers()" class="btn"><i class="icon-search"></i></button>
                </div>

            </div>
            </div>
	</div>
</div>