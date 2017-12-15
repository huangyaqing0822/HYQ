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
<style type="text/css">
.cssspict {
	background: transparent url(<%=path%>/img/u27.png) no-repeat;
	background-position: -0px -30px;
	border: solid 1px red;
}

.ja {
	width: 30px;
	height: 20px;
}

.jian {
	
}
</style>
</head>
<body>
	<div style="margin: 10px;10px">
		<div class="cssspict ja">11</div>
		订单管理>>带下订单<br> 类型： <select id="cc" class="easyui-combobox"
			name="dept" style="width: 100px;">
			<option value="name">客户姓名</option>
			<option value="phone">联系电话</option>
		</select><input type="text" class="textbox" name="usernamse"
			style="width: 210px; height: 25px"> <a href="#"
			class="easyui-linkbutton" iconCls="icon-search"
			onclick="actionscsp.query()">查询</a>
		<hr width="1230px;">
		<div>
			<span>信息列表 </span> <span style="margin-left: 850px"> <a
				href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
				onclick="add();">添加</a>
				<a href="#"
				class="easyui-linkbutton" iconCls="icon-reload" plain="true"
				onclick="manager_tool.reload();">刷新</a>
			</span>
		</div>
		<table style="width: 100%; height: 100%" id="dentdcs">
		</table>
		<div id="ddssspc" style="display: none">
			<div style="margin: 50px 150px">
				<form id="ff" method="post">
					<table style="height: 300px; width: 500px;">
						<tr>
							<td><label for="name">客户姓名:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
							<td><label for="email">客户性别:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
						</tr>
						<tr>
							<td><label for="email">客户类型:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
							<td><label for="name">客户状态:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
						</tr>
						<tr>
							<td><label for="name">联系电话:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
							<td><label for="name">服务代表:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
						</tr>
						<tr>
							<td><label for="name">已消费次数:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
							<td><label for="name">消费总额:</label></td>
							<td><span class="infostts" style="color: blue"></span></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:addPost()" class="easyui-linkbutton">下一步</a><a
								href="javascript:close()" class="easyui-linkbutton">返回</a></td>
						</tr>
					</table>
					<table id="built-inec"></table>
				</form>
			</div>
		</div>
		<div id="xianxi" style="display: none">
			<div style="margin: 50px 150px">
				<table id="batttt" style="height: 300px; width: 500px;">
					<tr>
						<td><label for="name">收货人姓名:</label></td>
						<td><span id="shouhuo" style="color: blue"></span></td>
						<td><input type="hidden" id="clentid"></td>
					</tr>
					<tr>
						<td><label for="email">支付及配送方式</label></td>
						<td><label for="email">货到付款，公司送货上门</label></td>
					</tr>
					<!-- 1111 -->
					<tr id="append">
						<td><label for="name">商品编号:</label></td>
						<td><label for="name">商品名称:</label></td>
						<td><label for="name">型号</label></td>
						<td><label for="name">单价（万元）</label></td>
						<td><label for="name">数量</label></td>
						<td><label for="name">库存</label></td>
					</tr>
				</table>
				<table style="height: 300px; width: 500px;">
					<tr>
						<td><label for="name">发票信息:</label></td>
						<td><span id="infos"></span></td>
					</tr>
					<tr>
						<td><a href="javascript:submitdd()" class="easyui-linkbutton">提交订单</a></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/downIndent.js"></script>
</body>
</html>