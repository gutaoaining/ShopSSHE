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
<a href="${shop}/usershop/send_main_aindex.action">直接到后台ui</a>
<a href="${shop}/usershop/send_main_index.action">直接到后台fremeset</a>
 <a href="${shop}/usershop/accountaction!query.action?id=1&&name=gutao">查询所有的Account账户</a><br>
 <c:forEach var="account" items="${requestlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
 </c:forEach>
 <hr>
  <c:forEach var="account" items="${sessionlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
 </c:forEach>
 <hr>
  <c:forEach var="account" items="${applicationlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
 </c:forEach>
</body>
</html>