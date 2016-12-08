<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0021)http://yun.baidu.com/ -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>登录</title>
  <jsp:include page="../init.jsp"></jsp:include>
  <link href="./Login/login_all.css" rel="stylesheet" type="text/css">
<style>
.logo{display:block;height:36px;width:113px;float:left;margin-left:10px;background-position:0 0;margin-top:5px;display:inline;outline:0}
.module-header .navs{padding:0 0 3px 25px;height:45px;float:left;width:400px;padding-bottom:0!important}
.module-header .info a,.module-header .info a:visited,
.module-header .info a:active{color:#d8d8d8}
.module-header .navs a:hover,.module-header 
.navs a:active{text-decoration:none;background-color:#0f0f0f;color:#d8d8d8}
.module-header .navs .def-nav,.module-header .navs .pulldown-nav,.module-header .navs .separate{
display:block;
float:left;
height:48px;
font:18px "Microsoft YaHei","Microsoft JhengHei","黑体";
color:#d8d8d8;
text-align:center;
width:90px;
line-height:48px}
.module-header .navs .separate{margin:0;height:48px;width:2px;background:#2a2b2d}
</style>
<script type="text/javascript" src="Login/login.js"></script>
<script type="text/javascript">
   var sign=false;
   function checkName(){
	   var username=document.getElementById("username");
	   if(username.value!=null&&username.value!=""){
		   sign=true;
		   return sign;
	   }else{
		   var msg=document.getElementById("msg");
		   msg.innerHTML="<font color='red'>用户名不能为空！</font>";
		   return sign;
	   }
   }
   function checkPassword(){
	   var password=document.getElementById("password");
	   if(password.value!=null&&password.value!=""){
		   sign=true;
		   return sign;
	   }else{
		   var msg=document.getElementById("msg");
		   msg.innerHTML="<font color='red'>密码不能为空！</font>";
		   return sign;
	   }
   }
   function checkForm(){
	    if(sign){
	    	return true;
	    }else{
	    	return false;
	    }
	}
</script>
</head>
<body class="disk-lyt-lrg">

<div class="disk-lyt-doc" id="doc_main">
<div node-type="module-header-wrapper" style="height:49px;background-color:#252525"><div node-type="module click-ele" data-key="BAR" class="module-header hd-main clearfix" style="width: auto;">  
    <!-- logo -->
    <a data-key="LOGO" class="f-icon logo" hidefocus="true" title="百度云" target="_blank" href="#"></a>  
    <!-- nav -->
    <div class="navs" xmlns="http://www.w3.org/1999/xhtml">
        <a node-type="click-ele pos-ele" data-key="HOME" class="def-nav current" hidefocus="hideFocus" href="../index.jsp">主页</a>
        
        <span class="separate"></span>
        <a  data-key="NAVS_SHARE" class="def-nav def-nav-share" hidefocus="hideFocus" href="Login.jsp">分享</a>
        <a  data-key="NAVS_APPS" class="def-nav" hidefocus="hideFocus" href="Login.jsp">应用</a>
    </div>
    <!-- info --> 
</div>
</div>
<div class="disk-lyt-bd rlv clearfix" id="sysBody">
<div class="disk-lyt-bx disk-lyt-bg-shad" id="sysShadWrapper">
<div class="disk-lyt-bg-hd rlv">
<img  alt="" style="display: none;" tabindex="0" width="100%" src="./Login/bg_shad_top_1.jpg">
<img  alt="" style="display: block;" tabindex="1" width="100%" src="./Login/bg_shad_top_2.jpg">
</div>
<div class="disk-lyt-bg-bd rlv">
<img style="display: block;" tabindex="1" width="100%" src="./Login/bg_shad_bottom_2.jpg">
</div>
</div>
<div class="disk-lyt-sec-i">

<div class="disk-lyt-bx-sign rlv" id="sysSignBox" style="margin-top: 81.5px; margin-bottom: 81.5px; margin-right: -120px;">


<div class="disk-lyt-bx disk-lyt-bx-tabs">
<em class="bd-logo"></em>
登录帐号
</div>

<div class="disk-lyt-bx disk-lyt-hd rlv">
<div class="disk-lyt-bx disk-lyt-bx-frm tang-pass-login" id="sysLoginForm">

<form id="loginform" autocomplete="off" onsubmit="return checkForm();">
<span id="msg">${error}</span>
<table id="logintable">
<tr>
<td style="width:15px;">
<img class="imgtext" src="Login/yun_login_logo.png"></td>
<td> 

<input  type="text" name="username" id="username" class="pass-text-input pass-text-input-userName" autocomplete="off" placeholder="手机/邮箱/用户名" onblur="checkName();">
</td>
</tr>
<tr>
<td style="width:15px;">
<img class="imgtext" src="Login/sprite_1.png">
</td>
<td>

<input type="password" name="password" id="password" class="pass-text-input pass-text-input-password" autocomplete="off" placeholder="密码" onblur="checkPassword();">
</td>
</tr>
</table>


<br/>
<center>
<input name="loginAnniu" type="image" src="Login/login.png" onclick="test();"/>
</center>

<p  class="pass-form-item pass-form-item-memberPass">
<input  type="checkbox" name="memberPass" class="pass-checkbox-input pass-checkbox-memberPass" checked="checked">
<label for="TANGRAM__PSP_4__memberPass" id="TANGRAM__PSP_4__memberPassLabel" class="">下次自动登录</label>
</p>
<p  class="pass-form-item pass-form-item-submit">
<a class="pass-fgtpwd" href="#" target="_blank">忘记密码？</a>
</p>
</form>
<a href="Register.jsp">
<center>
<input name="registerAnniu" type="image" src="Login/register.png" style="width:425px"/>
</center>
</a>
</div>
</div>


</div>
</div>
</div>
</div>
<br/>
<div class="disk-lyt-bx disk-lyt-bx-supplementary">
<div class="disk-lyt-sec-i">
<footer class="footer">
<p>
©2015 gutao <a href="#" target="_blank">ssh</a> |
<a href="#" target="_blank">服务协议</a> | 
<a href="#" target="_blank">权利声明</a> | 
<a href="#" target="_blank">版本更新</a> | 
<a href="#" target="_blank">帮助中心</a> | 
<a href="#" target="_blank">问题反馈</a>
</p>
</footer>
</div>
</div>
</body>                   
            

 

</html>