<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SpringMVC</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/js/redirect.js" var="jScript" />
<script src="${jScript}"></script>

<spring:url value="/resources/css/welcome.css" var="wCss" />
<link href="${wCss}">

</head>
<body>${message}
	<input type="hidden" id="onChangeText" value='${text}'>
	<div id="cur-time">${time.clock}</div>
	<button class="live">Change</button>
	<button onclick="addObject()">New Field</button>
	<form action="showMeResults" method="post">
		<ul id="form">
			<li id="confirm"><input type="submit" value="Submit"></li>
		</ul>
	</form>
</body>
</html>