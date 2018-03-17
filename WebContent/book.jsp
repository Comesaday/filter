<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>输入图书信息</title>
	</head>
	<body>
		<form action="servlet/ServletTest" method="get">
			<table>
				<tr>
					<td>书    名：</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>作    者：</td>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<td>价    格：</td>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<td>出版单位：</td>
					<td><input type="text" name="apart"></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
					<td><input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</body>
</html>