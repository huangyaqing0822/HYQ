<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户发展计划页面</title>
</head>
<body>	
 	
 	<div style="margin: 10px;10px">
		<h4 style="text-indent: 25px;">客户管理>>客户发展计划</h4> 
		<span style="margin-left: 300px">
		       月份：
		    <input name="developlikeMonth" id="dd"  type= "text" class= "easyui-datebox"> </input>   

	 		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.search();">查询</a>
 		</span>
 	
 	<hr width="1230px;">

		<div id="manager_tool">
			<span style="margin-left: 30px">客户发展计划信息列表 </span>
			<span style="margin-left: 700px">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="manager_tool.add();">添加</a> 
			<a href="#"	class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="manager_tool.edit();">修改</a> 
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="manager_tool.remove()">删除</a>
			<a href="#"	class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="manager_tool.look()">查看</a>
			</span>
		</div>
		
		<table id="develop"></table>
		
		<form id="develop_add" style = "padding-left: 70px;padding-top: 20px">
			<table id="xh_table" style="padding-left: 40px;padding-top: 10px">
				<!-- <tr>
					<td>计划编码：</td>
					<td><input type="text" name="cdPlanCoding" style="height:20px;padding:0 2px;width:200px;">*</td>
				</tr> -->
				<tr>
					<td>计划人姓名：</td>
					<td><input type="text" name="cdName" style="height:20px;padding:0 2px;width:200px;">*</td>
				</tr>
				<tr>
					<td>计划月份</td>
					<td>
					<input type="text" name="cdMonth" id="cdMonth" class="easyui-datebox" required="required"
					 style="height:20px;padding:0 2px;width:200px;"/>*</td>
				</tr>
				<tr>
					<td>计划状态：</td>
					<td><input type="text" value="已创建" disabled="false" style="height:20px;padding:0 2px;width:200px;">*</td>
				</tr>
				<tr>
					<td>计划内容：</td>
					<td><textarea name="cdPlanContent" id="cdPlanContent" style="width:280px;height:130px"></textarea></td>
				</tr>				
			</table>			
		</form>
		
		
		<form id="develop_edit" style = "padding-left: 70px;padding-top: 20px">
			<table id="xh_table" style="padding-left: 40px;padding-top: 10px">
				<tr>
					<td><input type="hidden" name="cdId_edit" id="cdId_edit"  /></td>
				</tr>
				<tr>
					<td>计划编码：</td>
					<td><input type="text" name="cdPlanCoding_edit" style="height:20px;padding:0 2px;width:200px;">*</td>
				</tr>
				<tr>
					<td>计划人姓名：</td>
					<td><input type="text" name="cdName_edit" style="height:20px;padding:0 2px;width:200px;">*</td>
				</tr>
				<tr>
					<td>计划月份</td>
					<td>
					<input type="text" name="cdMonth_edit" id="cdMonth_edit" class="easyui-datebox" required="required"
					 style="height:20px;padding:0 2px;width:200px;"/>*</td>
				</tr>
				<tr>
					<td>计划状态：</td>
					<td><input type="text" value="已创建" disabled="false" style="height:20px;padding:0 2px;width:200px;">*</td>
				</tr>
				<tr>
					<td>计划内容：</td>
					<td><textarea name="cdPlanContent_edit" id="cdPlanContent_edit" style="width:280px;height:130px"></textarea></td>
				</tr>				
			</table>			
		</form>
		
		
	</div>
 	
	<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/clientDevelop.js"></script>
</body>
</html>