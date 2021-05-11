<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing JSTL Standard Tags</title>
</head>
<body>
	<h2>This is my JSP file</h2>
	<button type="button" id="1">Boton 1</button>
	<button type="button" id="2">Boton 2</button>
	<button type="button" id="3">Boton 3</button>
	<script>
		function hideButton(selector, booleano) {
			document.getElementById(selector).hidden = booleano;
		}
	</script>
	<script>hideButton("<c:out value='${numButton}'></c:out>","<c:out value='${booleano}'></c:out>")</script>
</body>
</html>