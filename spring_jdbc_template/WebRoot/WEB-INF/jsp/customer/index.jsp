<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script>
var ctx='${ctx}';
</script>
<!DOCTYPE>
<html>
<head>
<title>基于精准产业扶贫的微信电商平台</title>
<link type="text/css" rel="stylesheet" href="${ctx }/resource/index/one/css/style.css" />
<script type="text/javascript" src="${ctx }/resource/index/one/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${ctx }/resource/index/one/js/menu.js"></script>
</head>

<body>
<div class="top"></div>
<div id="header">
	<div class="logo">基于精准产业扶贫的微信电商平台</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">${customerBean.username }</a></li>
			<%--
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li> --%>
			<li><a href="${ctx }/customerLogin/out.html">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
	<ul id="nav_dot">
			<li>
	          <h4 class="M1"><span></span>个人中心</h4>
	          <div class="list-item none">
	            <a href='${ctx}/customer/mine.html' target="page">修改个人信息</a>
	            <a href='${ctx}/customer/password.html' target="page">修改密码</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>客户管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/customer/frame.html' target="page">客户列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>订单管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/order/frame.html' target="page">订单列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>产品管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/product/frame.html' target="page">产品列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>购物车管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/shopcar/frame.html' target="page">购物车列表</a>
	          </div>
	        </li>
			<li>
	          <h4 class="M1"><span></span>普通员工管理</h4>
	          <div class="list-item none">
	            <a href='${ctx}/admin/user/frame.html' target="page">普通员工列表</a>
	          </div>
	        </li>
 	 </ul>
		</div>
		<div class="m-right">
			<div class="main">
				<iframe src="${ctx }/customer/main.html" width="100%" height="100%" frameborder="0" scrolling="yes" name="page"></iframe>
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><p>基于精准产业扶贫的微信电商平台</p></div>
<script>navList(12);</script>
</body>
</html>

