<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
	<h1>Field Size Calculator; Four-row, 20 foot plots</h1>
	<form action="getFieldSize" method="post">
		<button type="button" onclick="location.href='popForm.jsp'">Calculate seed population</button>
		
		Enter the length and width of your field<br><br>Length <input type="text"
			name="length" size="10"> Width <input type="text" name="width"
			size="10"><br><br><input type="submit" value="Calculate field size" />
	</form>
</body>
</html>