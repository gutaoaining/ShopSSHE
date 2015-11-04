<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>e购商城</title>
<%@ include file="/public/head.jspf"%>
<!--#set var='compatible' value=''-->
<meta http-equiv="X-UA-Compatible" content="IE=11; IE=10; IE=9; IE=8; IE=7; IE=EDGE">
<!--[if lt IE 9]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/html5shiv_62ac5721.js');</script>
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/DD_belatedPNG_849d7004.js');</script>
<script>DD_belatedPNG.fix('.pngfix');</script>
<![endif]-->
<link href="loginfiles/a.css" rel="stylesheet" type="text/css">
<script src="loginfiles/a.js"></script>
<link href="loginfiles/default_f7b28aa3.css" type="text/css" rel="stylesheet">

<link href="loginfiles/header_c8045ce8.css" rel="stylesheet" type="text/css">

<link href="loginfiles/footer_47d2c33b.css" rel="stylesheet" type="text/css">

<style type="text/css">
.lt-plugins-simplevaliderrortips {position:absolute;font-size:12px;background:#fff7e9;border:1px solid #ffd999;border-radius:5px;padding:4px 10px;color:#e75c00;line-height:20px;box-shadow:1px 1px 1px rgba(0,0,0,.1);z-index:997;}
.lt-plugins-simplevaliderrortips  .error-content{white-space:nowrap;}
.lt-plugins-simplevaliderrortips em,.lt-plugins-simplevaliderrortips i{position:absolute;bottom:-20px;left:20px;overflow:hidden;width:0;height:0;z-index:999;border-width:10px;border-style:solid;border-color:transparent transparent transparent transparent;_border-color:tomato tomato tomato tomato;border-top-color:#fff7e9;_filter:chroma(color=tomato);}
.lt-plugins-simplevaliderrortips em{bottom:-21px;z-index:998;border-top-color:#ffd999;}
</style>
<style>
#NTGUID__1{  position: relative;}
#NTGUID__1 .spliter{  display: inline-block;  margin: 0 3px;  height: 16px;  border-left: 1px dotted #7b7c7d;  vertical-align: middle;}
#NTGUID__1 .link-menu-list a.link-text-menu{  display: inline-block;  vertical-align: top;  height: 50px;  line-height: 50px;  color: #999 !important;  position: relative;}
#NTGUID__1 .link-menu-list a.link-text-menu:hover{  color: #fff !important;}
#NTGUID__1 .link-menu-list a.link-drop-menu{  color: #999 !important;}
#NTGUID__1 .drop-menu-group{  position: relative;  display: inline-block;  vertical-align: top;  _vertical-align:middle;}
#NTGUID__1 .drop-menu-group .drop-tips{  position: absolute;  top: 50px;  right: 0;  display: none;}
#NTGUID__1 .drop-menu-group-active a.link-drop-menu{  color: #fff !important;}
#NTGUID__1 .drop-menu-group-active .drop-tips{  display: block;}</style>
</head>
<body id="user-regh">
<div class="" style="display: none; position: absolute;">
<div class="aui_outer">
<table class="aui_border">
<tbody>
<tr><td class="aui_nw"></td>
<td class="aui_n"></td>
<td class="aui_ne"></td>
</tr>
<tr>
<td class="aui_w"></td>
<td class="aui_c">
<div class="aui_inner">
<table class="aui_dialog">
<tbody>
<tr>
<td colspan="2" class="aui_header">
<div class="aui_titleBar"><div style="cursor: move;" class="aui_title"></div>
<a class="aui_close" href="javascript:;">×</a>
</div>
</td>
</tr>
<tr>
<td style="display: none;" class="aui_icon"><div style="background: transparent none repeat scroll 0% 0%;" class="aui_iconBg"></div></td><td style="width: auto; height: auto;" class="aui_main"><div style="padding: 20px 25px;" class="aui_content">
</div>
</td>
</tr>
<tr>
<td colspan="2" class="aui_footer"><div style="display: none;" class="aui_buttons"></div></td></tr></tbody></table></div></td><td class="aui_e"></td></tr><tr><td class="aui_sw"></td><td class="aui_s"></td><td style="cursor: se-resize;" class="aui_se">
</td>
</tr>
</tbody>
</table>
</div>
</div>
<header id="header-p-beta2">
  <div class="header">
    <div class="wrap">
      <div class="logo">
        <a href="http://www.liepin.com/" target="_blank"><img alt="猎聘网logo" class="pngfix" src="loginfiles/logo_7012c4a4.png" height="40" width="110"><em><i class="icons16 icons16-home-white" title="首页"></i></em></a>
      </div>
      <div class="quick-menu"><div class="quick-menu-unlogined">

      <div id="NTGUID__1">
  <div class="link-menu-list">
    
          <a class="link-text-menu" href="${shop}/index.jsp" target="_blank">e购首页</a>
          <a class="link-text-menu" href="http://www.liepin.com/user/lpt/" target="_blank">我是企业HR</a>
          <a class="link-text-menu" href="http://clt.liepin.com/" target="_blank">e购公司</a>
      
    <span class="spliter"></span>
    <span class="drop-menu-group">
      <a class="link-drop-menu" title="手机e购网" target="_blank" href="http://sns.liepin.com/tongdao-app/index.html?mscid=c_a1_050#sfrom=click-pc_homepage-front_navigation-mobile_new">
      <i data-icon="icons16-mobile-gray" data-icon-hover="icons16-mobile-white" class="icons16 icons16-mobile-gray"></i>手机e购</a>
     
    </span>
  </div>
</div>
</div></div>
    </div>
  </div>
</header>
<script src="loginfiles/header_9ed2e48d.js"></script>
<div class="container">
	<div class="wrap">
    	<div class="user-login-reg ui-tab-panel">
      		<div class="ui-tab-control">
        		<ul class="clearfix">
          			<li class="active" data-name="hregist">e购网注册</li>
          			<li data-name="hlogin">e购网登录</li>
        		</ul>
      		</div>
      		<div class="ui-tab-container">
        		<div class="ui-tab-toggle hide">
          		<form action="${shop}/usershop/useraction!Login.action" method="post" class="login-form" autocomplete="off">
          		<!--  
          		<input name="user_kind" value="2" type="hidden">
            		-->
           		<div>
           		<!--  validate-title="登录邮箱" validate-rules="['required','email']"
           		      validate-rules="[['required','请输入$']]"
           		  -->
             			<input name="login" class="text input-xlarge" placeholder="请输入登录邮箱" type="text">
           		</div>
	            <div>
	              	<input name="pass" class="text input-xlarge" validate-title="密码" validate-rules="['required']" value="" placeholder="请输入登录密码" type="password">
	            </div>
		            <!--  
            		<div>
              			<input name="" data-name="rand" class="text input-xlarge validate-code" data-selector="validate-code" validate-title="验证码"  placeholder="请输入验证码" type="text">
              			<img src="loginfiles/a.jpg" title="验证码,看不清楚?请点击刷新验证码" class="validcode" height="25" width="60">
              			<a class="refresh-code" href="javascript:;">换一张</a>
            		</div>
            		-->
           		<div class="optional">
             			<div class="clearfix">
               			<a class="link-findpwd" href="#" target="_blank">找回密码</a>
             			</div>
           		</div>
           		<div class="actions">
             			<input class="btn btn-warning" value="立即登录" type="submit">
           		</div>
          		</form>
        		</div>
        		
        		<div class="ui-tab-toggle">
          		<form lt-plugins-valid="0.6806296750298872" action="/user/ajaxregh" method="post" class="reg-form" autocomplete="off">
           		<!--  
           		<input name="inviteHId" value="" type="hidden">
           		<input name="user_kind" value="2" type="hidden">-->
           		<div>
             			<input name="h_name" class="text input-xlarge" data-selector="username" validate-title="真实姓名" validate-rules="['required',['cn','$必须由汉字组成'],['length',{'max':5,'min':2},'$长度必须介于 2 位和 5 位之间']]" placeholder="请填写中文真实姓名" type="text">
           		</div>
	            <div>
	              	<input name="user_login" class="text input-xlarge" data-selector="email" validate-title="登录邮箱" validate-rules="['required','email']" placeholder="请填写有效邮箱，用以登录网站" type="text">
	            </div>
	            <div>
	              	<input name="user_pwd" class="text input-xlarge" data-selector="password" validate-title="密码" validate-rules="[['required','请输入$'],['pattern',/^[0-9a-zA-Z]+$/,'$只能用字母和数字'],['length',{'min':4,'max':16},'$1长度不能$2$3']]" placeholder="密码(4-16位字母、数字，无空格)" type="password">
	            </div>
	            <div>
	              	<input name="h_tel" class="text input-xlarge" data-selector="mobile" validate-title="手机号码" validate-rules="['required','mobile']" placeholder="请填写手机号码" type="text">
	            </div>
	            <div class="control-group optional">
	              	<div>
	                	<label validate-title="《e购网用户服务协议》" validate-rules="[['required',{'min': 1},'请选择接受$才可注册']]" validate-group="checkbox"><input class="checkbox" name="chk_agreement" value="on" checked="checked" type="checkbox"> 接受用户协议</label>
	              	</div>
	            </div>
	            <div class="actions">
	              	<input class="btn btn-warning" name="btn" value="立即注册" type="submit">
	            </div>
          		</form>
        		</div>
     		</div>
		</div>
	</div>
</div>
<div class="wrap">
	<ul class="column clearfix">
    	<li>
      	<dl>
	        <dt><i class="icon-reg-h icon-dlld"></i></dt>
	        <dd>
	      		<div class="title"><strong>e购论道</strong></div>
	          	<div class="sub-title">e购名家谈行业发展</div>
	          	<div class="desc">这里聚集着全国最优秀的商家，这里有着最好的商品。</div>
	          	<div class="btn-box"><a class="btn btn-primary" href="http://h.liepin.com/dlld/" target="_blank">查看详情</a></div>
	        </dd>
      	</dl>
    	</li>
    	<li>
      		<dl>
        		<dt><i class="icon-reg-h icon-tdwd"></i></dt>
        		<dd>
		     		<div class="title"><strong>同道问答</strong></div>
		          	<div class="sub-title">资深顾问在线交流</div>
		          	<div class="desc">e购交流平台，无数话题成为行业热点。</div>
		          	<div class="btn-box"><a class="btn btn-primary" href="http://article.liepin.com/" target="_blank">参与交流</a></div>
        		</dd>
      		</dl>
    	</li>
    	<li class="nobd">
      		<dl>
        		<dt><i class="icon-reg-h icon-clt"></i></dt>
        		<dd>
          			<div class="title"><strong>诚猎通</strong></div>
		          	<div class="sub-title">e购公司效率工具</div>
		          	<div class="desc">e购公司高效的曝光途径，管理下属 顾问的高效工具。 </div>
		          	<div class="btn-box"><a class="btn btn-primary" href="http://clt.liepin.com/" target="_blank">马上开通</a></div>
        		</dd>
      		</dl>
    	</li>
	</ul>
</div>
<!--#set var='compatible' value=''-->
<footer id="footer-p-beta2">
  <hr>
  <div class="wrap">
    <div class="copyright">
      <div class="copy-side">
        服务热线 (免长话费)<br><strong>370-8888-789</strong><br><small>工作日 9:00-18:00</small>
      </div>
      <div class="copy-main">
        <div class="item">
          <dl>
            <dt>简介</dt>
            <dd><a href="#" target="_blank" rel="nofollow">e购简介</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow">产品服务</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow">创新优势</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow">友情链接</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow">联系我们</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>帮助</dt>
            <dd><a href="http://www.liepin.com/help/" target="_blank" rel="nofollow">经理人帮助</a></dd>
            <dd><a href="http://www.liepin.com/help/itemlist/2/0" target="_blank" rel="nofollow">用户注册</a></dd>
            <dd><a href="http://www.liepin.com/help/itemlist/3/0" target="_blank" rel="nofollow">关于您的简历</a></dd>
            <dd><a href="http://www.liepin.com/help/itemlist/4/0" target="_blank" rel="nofollow">关于猎头</a></dd>
            <dd><a href="http://www.liepin.com/help/itemlist/5/0" target="_blank" rel="nofollow">关于职位</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>共赢</dt>
            <dd><a href="http://www.liepin.com/cooperation.shtml" target="_blank" rel="nofollow">网站合作</a></dd>
            <dd><a href="http://www.liepin.com/user/agreement.shtml" target="_blank" rel="nofollow">用户协议</a></dd>
            <dd><a href="http://www.liepin.com/sitemap.shtml" target="_blank" rel="nofollow">网站地图</a></dd>
            <dd><a href="http://www.liepin.com/user/feedback/" target="_blank" rel="nofollow">意见反馈</a></dd>
            <dd><a href="http://www.liepin.com/inshr/index.shtml" target="_blank" rel="nofollow">加入猎聘网</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>导航</dt>
            <dd><a href="http://www.liepin.com/sitemap.shtml" target="_blank" rel="nofollow">地图首页</a></dd>
            <dd><a href="http://www.liepin.com/sitemap/chengshi.shtml" target="_blank" rel="nofollow">城市分类</a></dd>
            <dd><a href="http://www.liepin.com/sitemap/hangye.shtml" target="_blank" rel="nofollow">行业分类</a></dd>
            <dd><a href="http://www.liepin.com/sitemap/zhineng.shtml" target="_blank" rel="nofollow">职能分类</a></dd>
            <dd><a href="http://www.liepin.com/sitemap/zhuceqiye.shtml" target="_blank" rel="nofollow">企业名录</a></dd>
          </dl>
        </div>
        <div class="item item-weibo">
          <a href="http://weibo.com/lietouwang" target="_blank" rel="nofollow"><i class="weibo"></i></a>
          <p>猎聘微博</p>
          <a class="btn-sina" href="http://weibo.com/lietouwang" target="_blank" rel="nofollow"></a>
        </div>
        <div class="item item-apps">
          <i class="mishu"></i>
          <p>猎聘同道APP</p>
        </div>
      </div>
    </div>
  </div>
  <div class="copy-footer">
    <p>京ICP备09083200号 京ICP证070419号 人才服务许可证:RC0710280 京公网安备:11010502026763</p>
    <p>Copyright©2000-2015 liepin.com All Rights Reserved</p>
  </div>
</footer>


<script src="loginfiles/user.js"></script>
<script src="loginfiles/stat_f37a07ef.js"></script>


<div style="display: none; position: fixed; left: 0px; top: 0px; width: 100%; height: 100%; cursor: move; opacity: 0; background: rgb(255, 255, 255) none repeat scroll 0% 0%;"></div></body></html>
