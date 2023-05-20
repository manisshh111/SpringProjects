<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
<title>List Todos Page page</title>
</head>
<body>
<div class="container">
	<h1>Welcome Mr. ${name}</h1>
	<hr>
	<h1>Your Todos are:-</h2>

	<table class="table">

		<thead>
			<tr>
				<th>id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
			<tr>
			<td>${todo.id}</td>
			<td>${todo.description}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.done}</td>
			</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<a href="add-todo" class="btn btn-success"> Add ToDo</a>
	
	</div>
<script scr="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script scr="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>

