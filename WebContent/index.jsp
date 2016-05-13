<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring test</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$(".linking").click(function(){
		redirectMe(this);
	});
});

function redirectMe(el){
	window.location.replace($(el).attr("data"));
}
</script>
</head>
<body>	
	<h2><a href="welcome">Click me</a></h2>
	<div class="linking" data="welcome">Click me for jQuery redirect</div>
</body>
</html>