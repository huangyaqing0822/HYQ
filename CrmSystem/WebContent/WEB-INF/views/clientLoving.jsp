<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户关怀页面</title>
</head>
<body>
	<div style="margin: 10px;10px">
		<h4 style="text-indent: 25px;">客户管理>>客户关怀管理</h4> 
		<span style="margin-left: 300px">	
		       客户姓名：
		    <input name="lovelikeName" id="dd"  type= "text" class= "text" required ="required"> </input>   
	 		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.search();">查询</a>
 		</span>
 	
 	<hr width="1230px;">

		<div id="manager_tool">
			<span style="margin-left: 30px">客户关怀信息列表 </span>
			<span style="margin-left: 700px">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
				onclick="tiXing()">设置提醒</a> 
				
			<a href="#"	class="easyui-linkbutton" iconCls="icon-reload" plain="true"
				onclick="xiangQing()">关怀详情</a>
			</span>
		</div>
		
		<table id="love"></table>
	
		
	</div>
 	
	<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/clientLoving.js"></script>
</body>
</html>