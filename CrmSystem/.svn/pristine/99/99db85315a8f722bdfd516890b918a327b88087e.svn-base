<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>带下订单</title>
<%
	String path = request.getContextPath();
%>
</head>
<body>
	<div style="margin: 10px;10px">
		<div class="cssspict ja">11</div>
		订单管理>>订单查询<br> 类型： <select id="ccppxc" class="easyui-combobox"
			name="sp" style="width: 100px;">
			<option value="spname">商品名称</option>
			<option value="spnumber">商品编号</option>
			<option value="ddnumber">订单号</option>
			<option value="shrc">收货人</option>
			<input type="text" class="textbox" name="usernamse"
			style="width: 210px; height: 25px">
		</select> 时间：<select id="timepar" class="easyui-combobox" name="datti"
			style="width: 100px;">
			<option value="bx">不限</option>
			<option value="before3">近三个月</option>
			<option value="nowN">今年内</option>
			<option value="before">今年前</option>
		</select> 状态：<input id="typ" class="easyui-combobox" name="dept"
			data-options="valueField:'id',textField:'text',url:'http://localhost:8080/CrmSystem/indent/Identtype',valueField: 'value',
		textField: 'value'" />
		<a href="#" class="easyui-linkbutton" iconCls="icon-search"
			onclick="javascript:queryseO()">查询</a>
		<hr width="1230px;">
		<div>
			<span>操作列表 </span> <span style="margin-left: 850px"> <a
				href="javascript:slenderIndent()" class="easyui-linkbutton" iconCls="icon-add" plain="true">查询详细信息</a>
				<a href="javascript:therefresh()" class="easyui-linkbutton" iconCls="icon-reload"
				plain="true">刷新</a>
			</span>
		</div>
		<table style="width: 100%; height: 100%" id="notitle">
		</table>
		<div id="ddsss1" style="display: none">
			<div style="margin: 50px 150px">
				<table style="height: 300px; width: 500px;">
					<tr>
						<td><label for="name">客户姓名:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
						<td><label for="email">客户性别:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">客户类型:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
						<td><label for="name">客户状态:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="name">联系电话:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
						<td><label for="name">服务代表:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="name">已消费次数:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
						<td><label for="name">消费总额:</label></td>
						<td><span class="infost" style="color: blue"></span></td>
					</tr>
					<tr>
						<td></td>
						<td><a href="javascript:addPost()" class="easyui-linkbutton"">下一步</a><a
							href="javascript:close()" class="easyui-linkbutton"">返回</a></td>
					</tr>
				</table>
				<table id="built-in"></table>
			</div>
		</div>
		<div id="slender" style="display: none">
			<div style="margin: 50px 150px">
				<table id="batttt" style="height: 300px; width: 400px;">
					<tr>
						<td><label for="clientName">收货人姓名:</label></td>
						<td><span class="infossss" id="shouhuo" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">订单创建时间</label></td>
						<td><span  class="infossss" id="datetime" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">支付及配送方式</label></td>
						<td><span  class="infossss" id="model" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">付款类型</label></td>
						<td><span class="infossss" id="type" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">订单类型</label></td>
						<td><span class="infossss" id="types" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">运费</label></td>
						<td><span class="infossss" id="yunfei" style="color: blue"></span></td>
					</tr>
					<tr>
						<td><label for="email">总计</label></td>
						<td><span class="infossss" id="countprice" style="color: blue"></span></td>
						<td></td>
					</tr>
				</table>
				<span id="shouhuo" style="color: red">订单发票：</span>
				<textarea style="font-size: 14px;color: red" id="invoice" rows="10" cols="100" readonly="readonly">
					
				</textarea>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/queryIndent.js"></script>
</body>
</html>