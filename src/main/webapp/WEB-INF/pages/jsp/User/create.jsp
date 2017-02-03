
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div data-ng-controller="userAppController">
	<div class="panel panel-default">
		<div class="panel-heading">
			<ol class="breadcrumb">
				<li><a href="<c:url value="/home"/>">Home</a></li>
				<li class="active">User List</li>
			</ol>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" name="myForm">
				<div class="form-group">
					<label for="user_username" class="col-lg-1 control-label"></label>
					<div class="col-lg-10">
						<input type="text" class="form-control"
							data-ng-model=user.username placeholder="Username" required>
					</div>
				</div>
				<div class="form-group">
					<label for="user_password" class="col-lg-1 control-label"></label>
					<div class="col-lg-10">
						<input type="password" class="form-control"
							data-ng-model=user.password placeholder="Password" required>
					</div>
				</div>
				<div class="form-group">
					<label for="user_email" class="col-lg-1 control-label"></label>
					<div class="col-lg-10">
						<input type="Email" class="form-control" data-ng-model=user.email
							placeholder="Email" required>
					</div>
				</div>
				<div class="form-group">
					<label for="user_name" class="col-lg-1 control-label"></label>
					<div class="col-lg-10">
						<input type="text" class="form-control" data-ng-model=user.name
							placeholder="Name" required>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-6 col-sm-offset-3">
						<input type="submit" data-ng-disabled="myForm.$invalid"
							name="register-submit" id="register-submit"
							data-ng-click="createUser()" tabindex="4"
							class="form-control btn btn-register" value="Register Now">
					</div>
				</div>
				</form>
		</div>

	</div>
</div>
