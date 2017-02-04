<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
	final String contextPath = request.getContextPath();
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Library Application</title>
	<meta charset="UTF-8">
</head>
<body style="font-family: sans-serif;" data-ng-app="homeApp" >

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button"href="/library/home" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/library/home" alt="Dispute Bills">Softtek Winter Academy</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class=""><a href="/library/home">Home</a></li>
            <li class=""><a href="/library/login">Login</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Menu <span class="caret"></span></a>
              <ul class="dropdown-menu">
              	<li class="dropdown-header">Books</li>
                <li><a href="/library/Book/List">List</a></li>
                <li><a href="/library/Book/create">Add</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Orders</li>
                <li><a href="/library/BookOrder/List">Order List</a></li>
                   <li role="separator" class="divider"></li>
                <li class="dropdown-header">Users</li>
                <li><a href="/library/User/List">List</a></li>
                <li><a href="/library/User/create">Add</a></li>
                
                
              </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    

</body>
</html>