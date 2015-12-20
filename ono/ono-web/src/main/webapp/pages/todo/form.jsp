<?xml version="1.0" encoding="UTF-8" ?>

<form action="/ono-web/todo/save" method="post">
		<table>
			<tr>
				<td>id</td>
				<td>
					<input disabled type="text" value="${todo.id}" />
					<input type="hidden" value="${todo.id}" name="id" />
				</td>
				
			</tr>
			<tr>
				<td>text</td>
				<td>
					<input type="text" value="${todo.text}" name="text" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Save" />
				</td>
			</tr>
		</table>
	</form>
