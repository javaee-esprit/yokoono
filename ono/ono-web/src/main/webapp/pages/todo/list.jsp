<?xml version="1.0" encoding="UTF-8" ?>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>todos list</title>
</head>
<body>
<h2>All todos</h2>
	<table>
		<thead>
			<tr>
				<th>#</th>
				<th>text</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="t">
				<tr>
					<td>${t.id}</td>
					<td>${t.text}</td>
					<td>
						<form action="/ono-web/todo/update" method="post">
							<input type="hidden" value="${t.id}" name="id" />
							<input type="hidden" value="${t.text}" name="text" />
							<input type="submit" value="Update"/>
						</form>
					</td>
					<td>
						<form action="/ono-web/todo/delete" method="post">
							<input type="hidden" value="${t.id}" name="id" />
							 <input type="submit" value="Delete" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form action="/ono-web/todo/create" method="get">
		 <input type="submit" value="new todo" />
	</form>
</body>
</html>