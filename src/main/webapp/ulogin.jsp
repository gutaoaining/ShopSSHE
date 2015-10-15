<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<%@include file="public/head.jspf"%>
	<link rel="stylesheet" href="${shop}/bootstrap/css/bootstrap.min.css" />
	<style type="text/css">
		#dd div{
			padding: 5px;
		}
        .header_search {cursor: pointer; float: right; height: 23px;
    margin: 30px 0; padding: 3px; width: 230px;}
	</style>
<body>
	<div class="wrapper">
		<div class="header">
			<div class="header_container">
				<!--头部开始-->
				<div class="top_bar clear">
					<!--头部小导航-->
					<div class="welcom fl">欢迎光临LEISUPET SHOP!</div>
					<ul class="top_links fr">
						<li class="highlight"><a href="#">首页</a></li>
						<li><a href="#">我的账户</a></li>
						<li><a href="#">购物车</a></li>
						<li><a href="#">注册</a></li>
						<li><a href="#">登录</a></li>
					</ul>
					<!--头部小导航结束-->
					<!-- logo -->
					<h1 class="logo clear fl">
						<a href="index.html"> <img src="images/logo.png" /> </a>
					</h1>
					
					<!-- 小购物车结束 -->
					<!-- 搜索框 -->
					<div class="header_search">
						<div class="input-group">
						  <input type="text" class="form-control" placeholder="请输入要搜索的商品" aria-describedby="basic-addon2">
						  <button type="button" class="btn btn-success btn-md">
						  <span class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 头部结束 -->
		<div class="section_container">
		<div id="dd" class="action_buttonbar" style="text-align:center;">
		<form class="form-horizontal col-md-offset-4">

		<div class="form-group">
		<div class="col-md-6">
		<div class="input-group input-group-lg">
		<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
		<input type="text" class="form-control" name="username" id="username" placeholder="用户名">
		</div>
		</div>
		</div>

		<div class="form-group">
		<div class="col-md-6">
		<div class="input-group input-group-lg">
		<span class="input-group-addon">
		<span class="glyphicon glyphicon-lock"></span>
		</span>
		<input type="password" class="form-control" name="password" id="password" placeholder="密码">
		</div>
		</div>
		</div>
		
		   
		</form>	
		<div>	
			<button type="button" class="btn btn-success btn-lg">&nbsp;&nbsp;登录&nbsp;&nbsp;</button>
			<button type="button" class="btn btn-warning btn-lg">&nbsp;&nbsp;注册&nbsp;&nbsp;</button>
        </div>	 
		</div>
			<!-- 导航栏结束 -->
			<div class="footer_container">
				<div class="footer">
					<ul class="footer_links">
						<li><span>收藏本店</span>
							<ul>
								<li><a href="#">服装</a></li>
								<li><a href="#">鞋子</a></li>
								<li><a href="#">包包</a></li>
								<li><a href="#">装饰品</a></li>
								<li><a href="#">channel</a></li>
								<li><a href="#">prada</a></li>
								<li><a href="#">LV</a></li>
							</ul></li>
						<li class="seperator"><span>出售的品牌</span>
							<ul>
								<li><a href="#">Elle</a></li>
								<li><a href="#">Reallxe</a></li>
								<li><a href="#">Fabric</a></li>
								<li><a href="#">Mayflower</a></li>
								<li><a href="#">Levis Strauss</a></li>
								<li><a href="#">Anzonica</a></li>
								<li><a href="#">Reallxe</a></li>
								<li><a href="#">Fabric</a></li>
							</ul></li>
						<li><span>客户服务</span>
							<ul>
								<li><a href="#">帮助</a></li>
								<li><a href="#">速递</a></li>
								<li><a href="#">退换货</a></li>
								<li><a href="#">付款方式</a></li>
								<li><a href="#">订单跟踪</a></li>
								<li><a href="#">礼物包选项</a></li>
								<li><a href="#">国际服务</a></li>
								<li><a href="#">退运险</a></li>
							</ul></li>
						<li><span>个人账户</span>
							<ul>
								<li><a href="#">个人账户信息</a></li>
								<li><a href="#">用户密码</a></li>
								<li><a href="#">订单历史</a></li>
								<li><a href="#">付款方式</a></li>
								<li><a href="#">我的收货地址</a></li>
								<li><a href="#">我的通知</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
			</div>
			</div>
			<script type="text/javascript" src="${shop}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
