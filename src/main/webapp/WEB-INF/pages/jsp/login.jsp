<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
	final String contextPath = request.getContextPath();
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
</head>
<body style="font-family: sans-serif;" data-ng-app="homeApp" >

    <!-- Fixed navbar -->
<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
											<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<form class="well" name='f' action='/library/j_spring_security_check' method = "POST">
									<div class="form-group">
										<input type="text" name="j_username" id="username" tabindex="1" class="form-control" placeholder="Username" required>
									</div>
									<div class="form-group">
										<input type="password" name="j_password" id="password" tabindex="2" class="form-control" placeholder="Password" required>
									</div>
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" data-ng-disabled="f.$invalid" tabindex="4" class="form-control btn btn-login">
											</div>
											
										</div>
							</form>
									</div>
							</div>
						</div>
					</div>
				</div>
			</div>
    

</body>
</html>