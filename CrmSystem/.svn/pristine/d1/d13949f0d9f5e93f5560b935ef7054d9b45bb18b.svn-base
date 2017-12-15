<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/icon.css" />
<script type="text/javascript"
	src="<%=path%>/scripts/index.js"></script>
<script type="text/javascript" 
    src="<%=path%>/js/jquery.form.js"></script>
	
<style type="text/css">
.logo {
	width: 280px;
	height: 50px;
	line-height: 50px;
	text-align: center;
	font-size: 20px;
	font-weight: bold;
	float: left;
}

.logout {
	float: right;
	padding: 30px 15px 0 0;
}

a {
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}
</style>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',split:true" style="height: 60px;">
		<div class="logo">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;XXXX客户关系管理系统</div>
		<div class="logout" style="font-size: 14px">
			欢迎,<span style="color: green">${staff.staffName}</span> &nbsp;&nbsp;部门:<span style="color: green">${staff.departmentName}</span> &nbsp;&nbsp;角色:<span style="color: green">${staff.roleName}</span><a href="../staffAction/logout">[退出]</a>
		</div>
	</div>
	<div data-options="region:'south',split:true,noheader:true"
		style="height: 40px; line-height: 30px; text-align: center">
	</div>
	<div
		data-options="region:'west',title:'导航',split:true,iconCls:'icon-world'"
		style="width: 180px;">
		<ul id="nav">
			
		</ul>
	</div>
	<div data-options="region:'center'" style="overflow: hidden;">
		<div id="tabs">
			<div title="欢迎页面" style="padding: 0 10px; display: block;">
				<div style="margin: 250px 350px">
					<h1>欢迎使用XXXX客户关系管理系统</h1>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="../js/highstock.js"></script>
	<script type="text/javascript" src="../js/highcharts-3d.js"></script>
<script type="text/javascript"
	src="<%=path%>/scripts/index.js"></script>
	
</body>
</html>