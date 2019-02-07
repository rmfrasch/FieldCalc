<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<p>${thisFieldSize.getLength()}
		Length in feet <br /> ${thisFieldSize.getWidth()} Width in feet <br />
		${thisFieldSize.getSquareFeet()} Square feet <br />
		${thisFieldSize.getAcres()} Acres <br />

	</p>
	<a href="index.jsp">enter more field dimensions</a>