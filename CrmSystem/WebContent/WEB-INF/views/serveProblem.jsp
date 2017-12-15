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
		服务管理>>常见问题管理<br> 服务名称： <input type="text" class="textbox"
			style="width: 110px" id="managerName"> 类型： <input id="cpType"
			class="easyui-combobox" name="cpType"
			style="width: 100px; height: 20px"
			data-options="panelHeight:'100px',valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" />
		</select> <a href="#" class="easyui-linkbutton" iconCls="icon-search"
			onclick="likeSelect();">查询</a>

		<hr/>

		<div>
			<span>服务信息列表 </span> <span style="margin-left: 850px"> <a
				href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
				onclick="add();">添加</a> <a href="#" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="update();">修改</a> <a
				href="#" class="easyui-linkbutton" iconCls="icon-remove"
				plain="true" onclick="onClickCell();">删除</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-search" plain="true"
				onclick="select();">查看</a>
			</span>
		</div>

		<table id="manager6"></table>

		<div id="addProblem" style="display: none">
			服务管理>>常见问题管理>>增加常见问题
			<div style="margin: 50px 150px">
				<form id="addProblemPost" method="post">
					<table>
						<tr>
							<td><label for="name">问题标题:</label></td>
							<td><input class="easyui-validatebox" type="text"
								style="width: 200px; height: 20px" name="cpTitle"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="email">问题类型:</label></td>
							<td><input id="cc" class="easyui-combobox" name="cpType"
								style="width: 100px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" /></td>
						</tr>

						<tr>
							<td><label for="name">答复要点:</label></td>
							<td><input name="cpAnswer" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="cpRemark" class="easyui-textbox"
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
		<div id="updateProblem" style="display: none">
			<div style="margin: 50px 150px">
				<form id="updateProblemPost" method="post">
					<table>
						<tr style="display: none">
							<td><label for="name">id:</label></td>
							<td><input class="easyui-validatebox" type="text"
								style="width: 200px; height: 20px" name="cpId"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="name">问题标题:</label></td>
							<td><input class="easyui-validatebox" type="text"
								style="width: 200px; height: 20px" name="cpTitle"
								data-options="required:true,readonly:true" /></td>
						</tr>
						<tr>
							<td><label for="email">问题类型:</label></td>
							<td><input id="cc" class="easyui-combobox" name="cpType"
								style="width: 100px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'dataId',textField:'dataValue',limitToList:'true',url:'../DataDictionaryAction/queryData?dataCode=serve_type'" /></td>
						</tr>

						<tr>
							<td><label for="name">答复要点:</label></td>
							<td><input name="cpAnswer" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="cpRemark" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 200px; height: 100px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:updatePost()"
								class="easyui-linkbutton"">修改</a><a
								href="javascript:closeUpdate()" class="easyui-linkbutton"">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>

		<div id="lookProblem" style="display: none">
			<div style="margin: 20px 50px">
				<table style="line-height: 30px; font-size: 18px; width: 510px">

					<tr>
						<td colspan="2">问题标题：<span name="cpTitle"></span></td>
					</tr>
					<tr>
						<td>问题类型：<span name="cpType"></span></td>
						<td>创建人：<span name="cpCreateName"></td>
					</tr>

					<tr>
						<td colspan="2">答复要点：</td>

					</tr>
					<tr>
						<td colspan="2"><span name="cpAnswer"></span></td>

					</tr>
					<tr>
						<td colspan="2">备注信息：</span></td>
					</tr>
					<tr>
						<td colspan="2"><span name="cpRemark"></span></td>
					</tr>
					<tr>
						<td></td>
						<td><a href="javascript:closeLook()"
							class="easyui-linkbutton"">返回</a></td>

					</tr>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/serveProblem.js"></script>
</body>
</html>