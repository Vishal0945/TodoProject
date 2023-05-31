<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${page }"></c:out></title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js">
	</script>
</head>

<body>
	<div class="container mt-3">
		<h1 class="text-center">Welcome to Ducat...</h1>
		<c:if test="${not empty msg }">
			<div class="alert alert-success">
				<b><c:out value="${msg }"></c:out></b>
			</div>
		</c:if>
		<div class="row mt-5">
			<h3
				class="list-group-item text-center list-group-item-action-primary active">Menu</h3>
			<a href='<c:url value='/add'></c:url>'
				class="list-group-item-primary  list-group-item-action text-center">Add</a>
			<a href='<c:url value='/home'></c:url>'
				class="list-group-item-warning  list-group-item-action text-center">View</a>
		</div>
	</div>
	<br>
	<hr>
	<div class="container mt-3">
		<div class="row mt-4">

			<c:if test="${page=='home' }">
				<h1 class="text-center">All View</h1>
				<c:forEach items="${todos }" var="allData">
					<div class="card">
						<div class="card-body">
							<h3>
								<c:out value="${allData.todotitle }"></c:out>
							</h3>
							<p>
								<c:out value="${allData.todocontent }"></c:out>
							</p>
						</div>
					</div>
				</c:forEach>
			</c:if>

			<c:if test="${page=='add' }">
				<h1 class="text-center">All Add</h1>
			<form:form action="saveToDo" method="post" modelAttribute="todo">
					<div class="form-group">
						<form:input path="todotitle" cssClass="form-control"
							placeholder="Title" />

					</div>
					<br>
					<br>
					<div class="form-group">
						<form:textarea style="height:300px" path="todocontent"
							cssClass="form-control" placeholder="Enter content" />

					</div>
					<br>
					<br>
					<div class="container text-center">
						<button class="btn btn-outline-success">Added</button>
					</div>
				</form:form> 

			</c:if>
		</div>
	</div>
</body>
</html>