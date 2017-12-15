<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户资源管理</title>

</head>
<body>
	<h4 style="text-indent: 25px;">客户管理>>客户资源管理</h4>
	<span style="margin-left: 300px"> 客户姓名:<input type="text"
		class="text" name="resourcelikeName" style="width: 110px"> 分配状态：<input
		name="likeState" class="easyui-combobox"
		style="width: 100px; height: 20px"
		data-options="panelHeight:'100px',valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=client_assignstate'" />
		<a href="#" class="easyui-linkbutton" iconCls="icon-search"
		onclick="manager_tool.search();">查询</a>
	</span>

	<hr width="1230px;">

	<div id="manager_tool">
		<span style="margin-left: 30px">角色信息列表 </span> <span
			style="margin-left: 700px"> <a href="#"
			class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="manager_tool.add();">添加</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="manager_tool.edits();">修改</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="manager_tool.remove()">删除</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-reload" plain="true"
			onclick="manager_tool.look()">查看</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-reload" plain="true"
			onclick="manager_tool.assign()">分配</a>
		</span>
	</div>


	<form id="manager_add">
		<br>
		<p style="margin-left: 60px">
			客户编码：<input type="text" name="clientCoding" class="textbox"
				style="width: 100px; margin-right: 50px">&nbsp;&nbsp; 客户姓名：<input
				type="text" name="clientName" class="textbox" style="width: 100px;">
		</p>

		<p style="margin-left: 85px;">
			性别：<input type="radio" name="clientSex" value="男" checked="checked"
				class="textbox" />男 <input type="radio" name="clientSex" value="女"
				class="textbox" />女
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			生日：<input type="text" name="clientBirthday" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 85px">
			类型：<input id="clientType" name="clientType" class="textbox"
				style="width: 100px; margin-right: 170px">&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			状态：<input id="clientState" name="clientState" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 85px">
			手机：<input type="text" name="clientPhone" class="textbox"
				style="width: 100px; margin-right: 50px">&nbsp;&nbsp; 办公电话：<input
				type="text" name="clientWorkphone" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 60px">
			电子邮箱：<input type="text" name="clientEmail" class="textbox"
				style="width: 100px; margin-right: 50px">&nbsp;&nbsp; 家庭电话：<input
				type="text" name="clientHomephone" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 60px">
			联系地址：<input type="text" name="clientAddress" class="textbox"
				style="width: 350px; height: 60px;">
		</p>
		<p style="margin-left: 60px">
			备注信息：<input type="text" name="clientRemark" class="textbox"
				style="width: 350px; height: 60px;">
		</p>
	</form>



	<form id="manager_edit">
		<br>
		<p>
			<input type="hidden" name="clientId_edit" id="clientId_edit" />
		</p>
		<p style="margin-left: 60px">
			客户编码：<input type="text" name="clientCoding_edit" class="textbox"
				style="width: 100px; margin-right: 50px">&nbsp;&nbsp; 客户姓名：<input
				type="text" name="clientName_edit" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 85px;">
			性别：<input type="radio" name="clientSex_edit" value="男"
				checked="checked" class="textbox" />男 <input type="radio"
				name="clientSex_edit" value="女" class="textbox" />女
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			生日：<input type="text" name="clientBirthday_edit" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 85px">
			类型：<input id="clientType_edit" name="clientType_edit" class="textbox"
				style="width: 100px; margin-right: 170px">&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			状态：<input id="clientState_edit" name="clientState_edit"
				class="textbox" style="width: 100px;">
		</p>

		<p style="margin-left: 85px">
			手机：<input type="text" name="clientPhone_edit" class="textbox"
				style="width: 100px; margin-right: 50px">&nbsp;&nbsp; 办公电话：<input
				type="text" name="clientWorkphone_edit" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 60px">
			电子邮箱：<input type="text" name="clientEmail_edit" class="textbox"
				style="width: 100px; margin-right: 50px">&nbsp;&nbsp; 家庭电话：<input
				type="text" name="clientHomephone_edit" class="textbox"
				style="width: 100px;">
		</p>

		<p style="margin-left: 60px">
			联系地址：<input type="text" name="clientAddress_edit" class="textbox"
				style="width: 350px; height: 60px;">
		</p>
		<p style="margin-left: 60px">
			备注信息：<input type="text" name="clientRemark_edit" class="textbox"
				style="width: 350px; height: 60px;">
		</p>
	</form>

	<div id="queryResource" style="display: none">
		<div style="margin: 20px 50px">
			<table style="line-height: 30px; font-size: 18px; width: 510px">
				<tr style="display: none">
					<td colspan="2">id：<span name="clientId"></span></td>
				</tr>
				<tr>
					<td>客户编码：<span name="clientCoding"></span></td>
					<td>客户姓名：<span name="clientName"></span></td>

				</tr>
				<tr>
					<td>性别：<span name="clientSex"></span></td>
					<td>生日：<span name="clientBirthday"></span></span></td>
				</tr>
				<tr>
					<td>类型：<span name="clientType" /></td>
					<td>状态：<span name="clientState" /></td>
				</tr>
				<tr>
					<td>手机：<span name="clientPhone" /></td>
					<td>办公电话：<span name="clientWorkphone" /></td>
				</tr>
				<tr>
					<td>电子邮箱：<span name="clientEmail" /></td>
					<td>家庭电话：<span name="clientHomephone" /></td>
				</tr>
				<tr>
					<td colspan="2"><hr /></td>
				</tr>

				<tr>
					<td colspan="2">分配给： <input class="easyui-combobox"
						name="serveStayhandle" style="width: 100px; height: 20px"
						data-options="panelHeight:'100px',required:true,valueField:'staffId',textField:'staffName',limitToList:'true',url:'../ServerAction/queryStaff'" /></span></td>
				</tr>

				<tr>
					<td colspan="2"><a href="#" onclick="manager_tool.submit();" class="easyui-linkbutton"">分配</a>
					<a href="#" onclick="manager_tool.close();" class="easyui-linkbutton"">返回</a></td>
				</tr>
			</table>
		</div>
	</div>


	<table id="resource"></table>

	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/clientResource.js"></script>
</body>
</html>