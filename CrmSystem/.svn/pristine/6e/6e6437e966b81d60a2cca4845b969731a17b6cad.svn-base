<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 10px;10px">
		服务管理>>服务创建<br> 服务名称： <input type="text" class="textbox"
			name="likeName" style="width: 110px"> 类型： <input
			name="likeType" class="easyui-combobox"
			style="width: 100px; height: 20px"
			data-options="panelHeight:'100px',valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" />
		状态： <input name="likeState" class="easyui-combobox"
			style="width: 100px; height: 20px"
			data-options="panelHeight:'150px',valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_state'" /><a
			href="#" class="easyui-linkbutton" iconCls="icon-search"
			onclick="likeSelect();">查询</a>

		<hr width="1230px;">

		<div>
			<span>服务信息列表 </span> <span style="margin-left: 850px"> <a
				href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
				onclick="add();">添加</a> <a href="#" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="update();">修改</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-remove"
				plain="true" onclick="onClickCell();">删除</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-ok" plain="true"
				onclick="submit();">提交</a> <a href="#" class="easyui-linkbutton"
				iconCls="icon-search" plain="true" onclick="select();">查看</a>
			</span>
		</div>

		<table id="manager"></table>

		<div id="add" style="display: none">
			<div style="margin: 50px 150px">
				<form id="addPost" method="post">
					<table>
						<tr>
							<td><label for="name">服务名称:</label></td>
							<td><input class="easyui-validatebox" type="text"
								style="width: 200px; height: 20px" name="serveName"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="email">服务类型:</label></td>
							<td><input id="cc" class="easyui-combobox" name="serveType"
								style="width: 100px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" /></td>
						</tr>
						<tr>
							<td><label for="email">服务客户:</label></td>
							<td><input id="cc" class="easyui-combobox"
								name="serveClientId" style="width: 100px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'clientId',textField:'clientName',url:'../clientManagementAction/queryClient'" /></td>
						</tr>
						<tr>
							<td><label for="name">联系电话:</label></td>
							<td><input name="servePhone" class="easyui-validatebox"
								type="text" style="width: 200px; height: 20px" name="servePhone"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="name">服务内容:</label></td>
							<td><input name="serveContent" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="serveRemark" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:addSubmit()"
								class="easyui-linkbutton"">提交</a><a href="javascript:close()"
								class="easyui-linkbutton"">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="update" style="display: none">
			<div style="margin: 50px 150px">
				<form id="updatePost" method="post">
					<table>
						<tr style="display: none">
							<td><label for="name">id:</label></td>
							<td><input class="easyui-validatebox" type="text"
								style="width: 200px; height: 20px" name="serveId"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="name">服务名称:</label></td>
							<td><input class="easyui-textbox" type="text"
								style="width: 200px; height: 20px" name="serveName"
								data-options="required:true,readonly:true" /></td>
						</tr>
						<tr>
							<td><label for="email">服务类型:</label></td>
							<td><input id="cc" class="easyui-combobox" name="dataType"
								style="width: 100px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" /></td>
						</tr>
						<tr>
							<td><label for="email">服务客户:</label></td>
							<td><input id="cc" class="easyui-textbox"
								name="serveClientId" style="width: 100px; height: 20px"
								data-options="required:true,readonly:true" /></td>
						</tr>
						<tr>
							<td><label for="name">联系电话:</label></td>
							<td><input name="servePhone" class="easyui-validatebox"
								type="text" style="width: 200px; height: 20px" name="servePhone"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="name">服务内容:</label></td>
							<td><input name="serveContent" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="serveRemark" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:updatePost()"
								class="easyui-linkbutton"">提交</a><a
								href="javascript:closeUpdate()" class="easyui-linkbutton"">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>


		<div id="look" style="display: none">
			<div style="margin: 50px 150px">
				<form id="selectPost" method="post">
					<table>
						<tr>
							<td><label for="name">服务名称:</label></td>
							<td><input type="text" style="width: 200px; height: 20px"
								name="serveName" readonly="readonly" /></td>
						</tr>
						<tr>
							<td><label for="email">服务类型:</label></td>
							<td><input id="cc" name="dataType"
								style="width: 100px; height: 20px" readonly="readonly" /></td>
						</tr>
						<tr>
							<td><label for="email">服务客户:</label></td>
							<td><input id="cc" name="serveClientId"
								style="width: 100px; height: 20px" readonly="readonly" /></td>
						</tr>
						<tr>
							<td><label for="name">联系电话:</label></td>
							<td><input name="servePhone" type="text"
								style="width: 200px; height: 20px" name="servePhone"
								readonly="readonly" /></td>
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
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/serveCreate.js"></script>
</body>
</html>