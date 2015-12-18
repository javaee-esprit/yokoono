<?xml version="1.0" encoding="UTF-8" ?>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>todos index</title>
</head>
<body>

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
						<form action="update" method="post">
							<input type="hidden" value="${t}" name="todo" /> <input
								type="submit" value="Select"/>
						</form>
					</td>
					<td>
						<form action="/ono-web/todo/delete" method="post">
							<input type="hidden" value="${t.id}" name="id" /> <input
								type="submit" value="Delete" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>