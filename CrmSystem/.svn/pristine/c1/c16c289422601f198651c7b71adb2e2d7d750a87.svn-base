<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%--   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
</head>

<body>
	<div
		style="width: 800px; height: 300px; padding-top: 50px; position: relative; left: 200px;">
		<div id="title"
			style="padding-left: 20px; padding-top: 15px; position: relative; left: -180px; top: -40px;">系统设置>>个人信息</div>
		<div
			style="padding-left: 30px; background-color: #ccccff; font-size: 15px; padding-top: 5px">
			<!-- <a href="javascript:onclick=place()" class="easyui-linkbutton"
				iconCls="icon-arrow-rotate-clockwise" id="soui">返回</a> -->
		</div>
		<div
			style="padding-left: 30px; font-size: 15px; padding-top: 5px; background-color: lightyellow;">
			<strong>基本信息</strong>
		</div>
		<div id="user_message" style="padding-left: 60px; height: 115px;">
			<div style="padding-right: 250px; width: 300px; font-size: 18px;">
				<p>员工姓名：${staff.staffName}</p>
				<p>所在部门：${staff.departmentName}</p>
				<p>系统角色：${staff.staffRemark}</p>
				<p>
					登录id：<input type="text" readonly="true" id="loginInput"
						style="height: 16px; width: 90px;" value="${staff.staffLoginName}" />
					<!-- <a href="javascript:onclick=updateLoginId()" id="button1" class="easyui-linkbutton">修改</a> -->
					<input type="button" id="loginButton" value="修改"
						onclick="updateLoginId()"> <input type="hidden"
						id="loginButton2" value="保存" onclick="updateLoginId2()">
				</p>
			</div>
			<div
				style="padding-left: 100px; position: relative; left: 250px; top: -170px; width: 300px; font-size: 18px;">
				<p>员工编号：${staff.staffCoding}</p>
				<p>当前状态：${staff.staffStateName}</p>
				<p>创建时间：${staff.staffCreateTiem}</p>
				<p>
					联系电话：<input type="text" readonly="true" id="telInput"
						style="height: 16px; width: 110px;" value="${staff.stanftephone}" />
					<!-- <a href="javascript:onclick=" class="easyui-linkbutton" >修改</a> -->
					<input type="button" id="iphoneButton" value="修改"
						onclick="updateIphone()"> <input type="hidden"
						id="iphoneButton2" value="保存" onclick="updateIphone2()">
				</p>
			</div>
		</div>
		<input type="button" id="xiugai" value="修改密码"
			onclick="updatePassword()"
			style="position: relative; top: 80px; left: 310px;">
	</div>
	<div id="passwordDiv"
		style="padding-left: 60px; height: 115px; position: relative; top: -240px; left: 200px; display: none">
		<span id="span" style="color: red; display: none; font-size: 16px;">密码错误!</span>
		<span id="span2" style="color: blue; display: none; font-size: 16px;">密码正确!</span>
		<span id="span3" style="color: blue; display: none; font-size: 16px;">两次密码不一致!</span>
		<div style="padding-right: 250px; width: 300px; font-size: 18px;">
			<p>登陆ID：</p>
			<p>
				原始密码：<input type="password" id="yuanMima">
			</p>
			<p>
				新密码：<input type="password" id="xinMima">
			</p>
			<p>
				确认密码:<input type="password" id="xinMima2">
			</p>
		</div>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="提交"
			onclick="tijiao()">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
			type="button" value="返回" onclick="fanhui()">
	</div>
	<script type="text/javascript" src="../js/personagerOne.js"></script>
</body>

</html>