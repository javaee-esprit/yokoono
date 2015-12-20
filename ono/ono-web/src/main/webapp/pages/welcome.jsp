<?xml version="1.0" encoding="UTF-8" ?>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ono index</title>
</head>
<body>
<h2>Application index</h2>
<table>
	<tr>
		<td>
			<a href=<%= request.getContextPath()+"/todo"%>>todos</a>
		</td>
	</tr>
	<tr>
		<td>
			<a href="#">other</a>
		</td>
	</tr>
</table>	
</body>
</html>