
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div data-ng-controller="bookAppController">
	<div class="panel panel-default">
		<div class="panel-heading">
			<ol class="breadcrumb">
				<li><a href="<c:url value="/home"/>">Home</a></li>
				<li class="active">Book List</li>
			</ol>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" name="myForm">
				<div class="form-group">
					<label for="book_name" class="col-lg-1 control-label">Name</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" data-ng-model=book.name
							placeholder="Name" required>
					</div>
				</div>
				<div class="form-group">
					<label for="book_author" class="col-lg-1 control-label">Author</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" data-ng-model=book.author
							placeholder="Author" required>
					</div>
				</div>
				<div class="form-group">
					<label for="book_editor" class="col-lg-1 control-label">Editorial</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" data-ng-model=book.editorial
							placeholder="Editorial" required>
					</div>
				</div>
				<div class="form-group">
					<label for="book_lng" class="col-lg-1 control-label">Language</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" data-ng-model=book.language
							placeholder="Language" required>
					</div>
				</div>

				<div class="form-group">
					<label for="book_year" class="col-lg-1 control-label">Year</label>
					<div class="col-lg-10">
						<input type="number" class="form-control" data-ng-model=book.year
							placeholder="Year" required>
					</div>
				</div>
				<label class="mr-lg-2" for="inlineFormCustomSelect">Genre</label> <select
					class="custom-select lg-2 mr-lg-2 mb-sm-0"
					id="inlineFormCustomSelect">
					<option value="YES">Fantasy</option>
					<option value="NO">Comedy</option>
					
					
				</select> <label class="mr-lg-2" for="inlineFormCustomSelect">Status</label>
				<select class="custom-select lg-2 mr-lg-2 mb-sm-0"
					data-ng-model=book.status required>
					<option value="true">Available</option>
					<option value="false">Not Available</option>
				</select>

 				<button type="button"  data-ng-disabled="myForm.$invalid" class="btn btn-default" data-ng-click ="createBook()" >Submit</button>
{{book}}

			</form>
		</div>
	</div>
</div>
