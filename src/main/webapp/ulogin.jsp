<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<form action="${shop}/usershop/useraction!Login.action" method="post">
	<input type="hidden" name="action" value="login"/>
<table border="1" align="center">
	<tr>
		<td>username:</td>
		<td><input type="text" size="10" name="login"/></td>
	</tr>
	<tr>
		<td>password:</td>
		<td><input type="password" size="10" name="pass"/></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="login"/><input type="reset" value="reset"/></td>
	</tr>
</table>
</form>
</body>
</html>