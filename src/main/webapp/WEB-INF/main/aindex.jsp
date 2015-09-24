<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <%@ include file="/public/head.jspf"%>
</head>
<frameset border="5" rows="150,*">
  <frame src="top.jsp"/>
  <frameset border="5" cols="150,*">
    <frame src="left.jsp"/>
    <frame src="right.jsp"/>
  </frameset>
</frameset>
</html>