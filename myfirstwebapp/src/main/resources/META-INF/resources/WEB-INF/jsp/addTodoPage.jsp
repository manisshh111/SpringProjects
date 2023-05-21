<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
<title>List Todos Page page</title>
</head>
<body>
<div class="container">
	<h1>Welcome Mr. ${name}</h1>
	<hr>
	<h1>Enter Todo details:-</h2>
	
	<form:form method="post" modelAttribute="todo">
     Description: <form:input type="text" path="description" required="required"/>
     <form:input type="hidden" path="id"/>
     <form:input type="hidden" path="done"/>

    <input type="submit" class="btn btn-success"/>
     </form:form>
	
	
	
	</div>
<script scr="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script scr="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>

