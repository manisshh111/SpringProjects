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
	<h1>Enter Todo details:-</h2>
	
	<form method="post">
     Description: <input type="text" name="description"/>
    <input type="submit" class="btn btn-success"/>
     </form>
	
	
	
	</div>
<script scr="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script scr="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>

