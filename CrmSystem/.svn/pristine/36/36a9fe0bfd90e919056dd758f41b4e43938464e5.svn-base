<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 10px;10px">
		服务管理>>服务分配<br> 服务名称：<input type="text" class="textbox"
			name="likeName2" style="width: 110px"> 类型： <input
			name="likeType2" class="easyui-combobox"
			style="width: 100px; height: 20px"
			data-options="panelHeight:'100px',valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" />
		状态： <input name="likeState2" class="easyui-combobox"
			style="width: 100px; height: 20px"
			data-options="panelHeight:'150px',valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_state'" /><a
			href="#" class="easyui-linkbutton" iconCls="icon-search"
			onclick="likeSelect2();">查询</a>

		<hr width="1230px;">

		<div>
			<span>服务信息列表 </span> <span style="margin-left: 850px"> <a href="#"
				class="easyui-linkbutton" iconCls="icon-ok" plain="true"
				onclick="distribute();">分配</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-search" plain="true"
				onclick="select();">查看</a>
			</span>
		</div>

		<table id="manager2"></table>
		
		<div id="look" style="display: none">
			<div style="margin: 50px 150px">
				<form id="selectPost" method="post">
					<table>
						<tr>
							<td><label for="name">服务名称:</label></td>
							<td><input type="text" style="width: 200px; height: 20px" name="serveName" readonly="readonly"/></td>
						</tr>
						<tr>
							<td><label for="email">服务类型:</label></td>
							<td><input id="cc" name="dataType"
								style="width: 100px; height: 20px" readonly="readonly"/></td>
						</tr>
						<tr>
							<td><label for="email">服务客户:</label></td>
							<td><input id="cc"
								name="serveClientId" style="width: 100px; height: 20px" readonly="readonly" /></td>
						</tr>
						<tr>
							<td><label for="name">联系电话:</label></td>
							<td><input name="servePhone"
								type="text" style="width: 200px; height: 20px" name="servePhone" readonly="readonly" /></td>
						</tr>
						<tr>
							<td><label for="name">服务内容:</label></td>
							<td><input name="serveContent" class="easyui-textbox"
								data-options="multiline:true,readonly:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="serveRemark" class="easyui-textbox"
								data-options="multiline:true,readonly:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:selectClose()"
								class="easyui-linkbutton"">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		
		<div id="distribute" style="display: none">
			<div style="margin: 20px 50px">
					<table style="line-height: 30px;font-size: 18px;width: 510px">
						<tr style="display: none">
							<td colspan="2">id：<span name="serveId"></span></td>
						</tr>
						<tr>
							<td colspan="2">服务名称：<span name="serveName"></span></td>
						</tr>
						<tr>
							<td>服务类型：<span name="dataType"></span></td>
							<td>服务状态：<span name="dataValue"></td>
						</tr>
						<tr>
							<td>创建人：<span name="serveManageName"></span></td>
							<td>创建时间：<span name="serveCreateTime"></span></span></td>
						</tr>
						<tr>
							<td colspan="2">待处理人：<span name="serveStayhandle"/></td>
						</tr>
						<tr>
							<td colspan="2">服务内容：<span name="serveContent"></span></td>
						
						</tr>
						<tr>
							<td colspan="2"><hr/></td>
						
						</tr>
						
						<tr>
							<td colspan="2">分配给：
							<input class="easyui-combobox" name="serveStayhandle"
								style="width: 100px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'staffId',textField:'staffName',limitToList:'true',url:'../ServerAction/queryStaff'"/></span></td>
						</tr>
						
						<tr>
							<td></td>
							<td><a href="javascript:submit()"
								class="easyui-linkbutton"">分配</a><a href="javascript:close()"
								class="easyui-linkbutton"">返回</a></td>
						</tr>
					</table>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/distribution.js"></script>
</body>
</html>