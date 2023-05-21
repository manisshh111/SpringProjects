<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class="container">

	<h1>Welcome Mr. ${name}</h1>
	<hr>
	<p>Welcome to My ToDo App</p>
	<p>Your name is : ${name}</p>
	<p>Your password is : ${password}</p>

	<div>
		<a href="list-todos">Manage</a> your Todos
	</div>
</div>

<%@ include file="common/footer.jspf"%>

