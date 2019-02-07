<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
	<h1>Seed Population Per Acre]; Four-row, 20 foot plots</h1>
	<form action="getSeedPop" method="post">
		<button type="button" onclick="location.href='index.jsp'">Back to field dimensions</button>
		
		Enter the seeds per 20-foot row<br><br>Seed Number <input type="text"
			name="pop" size="10"> <input type="submit" value="Calculate Population" />
	</form>
</body>