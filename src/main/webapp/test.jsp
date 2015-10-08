<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<%@ include file="/public/head.jspf"%>

</head>
<body>

  <c:forEach var="account" items="${applicationlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
  </c:forEach>
  <!-- 循环查询回来的所有类别商品-->
	<table>
	   <!--类别标题-->
	   <tr></tr>
		<tr>
		 <!--循环类别list中的商品-->
		<td>
			<table>
				<tr><td></td></tr>
			</table>
		</td>	
		 <!--循环类别list中的商品-->
		</tr>
	</table>
<!-- 循环查询回来的所有类别商品-->
</body>
</html>