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

  <!-- 循环查询回来的所有类别商品-->
   <c:forEach var="list" items="${applicationScope.alllist}">
	<table>
	   <!--类别标题-->
	   <tr><td colspan="4">${list[0].category.type}</td></tr>
		<tr>
		 <!--循环类别list中的商品-->
		<td>
			<table width="25%" border="0" cellspacing="0" cellpadding="0"> 
				<tr>
				 <c:forEach var="product" items="${list}">
				<td>
					<table width="25%" border="0" cellspacing="0" cellpadding="0"> 
						 <tr>
						 <td> <img src="${shop}/image/${product.pic}"/></td>
						 </tr>
						 <tr><td>
							 商品名称：${product.name}
							</td></tr>
							<tr><td>
							 商品名称：${product.price}
							</td></tr>
							<tr>
							 <td>
							 ${pageContext.request.contextPath}
							 </td>
							</tr>
							
					 </table>
				</td>
				</c:forEach>
				</tr>
				
			</table>
		
		</td>	
		 <!--循环类别list中的商品-->
		</tr>
	</table>
	 </c:forEach>
<!-- 循环查询回来的所有类别商品-->
</body>
</html>