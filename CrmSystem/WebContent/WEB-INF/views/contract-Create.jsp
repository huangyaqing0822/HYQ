<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同创建</title>
</head>
<body>
	<div style="margin: 10px;10px">
		合同管理>>合同创建<br> 合同名称： <input type="text" class="textbox"
			id="hetonname" name="contractName" style="width: 110px">
		合同类型： <input id="httyp" class="easyui-combobox" name="dept"
			data-options="url:'http://localhost:8080/CrmSystem/contract/contractType',valueField: 'id',
		textField: 'value'" />
		</select>合同状态： <input id="htstate" class="easyui-combobox" name="dept"
			data-options="url:'http://localhost:8080/CrmSystem/contract/contractStatr',valueField: 'id',
		textField: 'value'" />
		</select> <a href="javascript:search()" class="easyui-linkbutton"
			iconCls="icon-search">查询</a>
		<hr width="1230px;">
		<div>
			<span>合同信息列表 </span> <span style="margin-left: 850px"> <c:if
					test="${!empty lv }">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add"
						plain="true" onclick="contractAdd()">添加</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-edit"
						plain="true" onclick="contractUpdate();">修改</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove"
						plain="true" onclick="deletecontes();">删除</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
						plain="true" onclick="submites();">提交</a>
				</c:if> <a href="#" class="easyui-linkbutton" iconCls="icon-search"
				plain="true" onclick="select();">查看</a>
			</span>
		</div>
		<table id="contractcc"></table>
		<div id="contractAdd" style="display: none" class="wins">
			<div style="margin: 50px 250px">
				<form id="addPost" method="post">
					<table style="width: 600px; height: 800px">
						<tr>
							<td><label for="name">合同名称:</label></td>
							<td><input class="easyui-validatebox" type="text"
								style="width: 200px; height: 20px" name="name"
								data-options="required:true" /></td>
						</tr>
						<tr>
							<td><label for="email">合同类型:</label></td>
							<td><input id="cccs" style="width: 100px; height: 20px"
								class="easyui-combobox" name="type"
								data-options="panelHeight:'100px',url:'http://localhost:8080/CrmSystem/contract/contractType',valueField: 'id',
		textField: 'value'" /></td>
							<td><label for="email">合同金额:</label></td>
							<td><input type="text" name="price" class="easyui-numberbox"
								style="width: 100px; height: 20px" value="0"
								data-options="min:0,precision:2"></input></td>

						</tr>
						<tr>
							<td><label for="email">甲方:</label></td>
							<td><input id="cc" class="easyui-textbox" name="jia"
								style="width: 200px; height: 20px"
								data-options="panelHeight:'100px',required:true," /></td>
							<td><label for="email">乙方:</label></td>
							<td><input id="cc" class="easyui-textbox" name="yi"
								style="width: 200px; height: 20px" /></td>
						</tr>
						<tr>
							<td><label for="email">企业经营许可证号：</label></td>
							<td><input id="cc" class="easyui-textbox" name="jiaqz"
								style="width: 200px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'clientId',textField:'clientName',url:'../clientManagementAction/queryClient'" /></td>
							<td><label for="email">企业经营许可证号：</label></td>
							<td><input id="cc" class="easyui-textbox" name="yiqz"
								style="width: 200px; height: 20px"
								data-options="panelHeight:'100px',required:true,valueField:'clientId',textField:'clientName',url:'../clientManagementAction/queryClient'" /></td>
						</tr>
						<tr>
							<td><label for="name">合同内容:</label></td>
							<td><input name="context" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 400px; height: 150px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="remark" class="easyui-textbox"
								data-options="multiline:true"
								style="width: 400px; height: 150px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:addSubmit()"
								class="easyui-linkbutton">提交</a><a href="javascript:close()"
								class="easyui-linkbutton">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="contractUpdate" style="display: none" class="wins">
			<div style="margin: 50px 250px">
				<form id="updatePost" method="post">
					<table style="width: 600px; height: 800px">
						<tr>
							<td><label for="name">合同名称:</label></td>
							<td><input type="text" style="width: 200px; height: 20px"
								name="name" />
								<input type="hidden" name="id"> </td>
						</tr>
						<tr>
							<td><label for="email">合同类型:</label></td>
							<td><input id="cccs" style="width: 100px; height: 20px"
								class="easyui-combobox" name="type"
								data-options="panelHeight:'100px',url:'http://localhost:8080/CrmSystem/contract/contractType',valueField: 'id',
		textField: 'value'" /></td>
							<td><label for="email">合同金额:</label></td>
							<td><input id="pric" type="text" name="price"
								class="easyui-numberbox" style="width: 100px; height: 20px"
								value="0" data-options="min:0,precision:2"></input></td>

						</tr>
						<tr>
							<td><label for="email">甲方:</label></td>
							<td><input id="jiacc" name="jia"
								style="width: 200px; height: 20px" /></td>
							<td><label for="email">乙方:</label></td>
							<td><input id="yicc" name="yi"
								style="width: 200px; height: 20px" /></td>
						</tr>
						<tr>
							<td><label for="email">企业经营许可证号：</label></td>
							<td><input id="cc" name="jiaqz"
								style="width: 200px; height: 20px" /></td>
							<td><label for="email">企业经营许可证号：</label></td>
							<td><input id="cc" name="yiqz"
								style="width: 200px; height: 20px" /></td>
						</tr>
						<tr>
							<td><label for="name">合同内容:</label></td>
							<td><input id="contextcontext" name="context"
								style="width: 400px; height: 150px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input id="makec" name="remark" 
								style="width: 400px; height: 150px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:updatePost()"
								class="easyui-linkbutton">提交</a><a href="javascript:close()"
								class="easyui-linkbutton">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<style type="text/css">
#esc {
	position: absolute;
	left: 445px;
	top: 222px;
	z-index: 100;
}
</style>
		<!-- <div id="esc" style="display:none;width: 200px;height: 100px;background: #eee;font-size: 17px;font:border;color:red;;text-align: center;line-height: 100px">
			按Esc可关闭!
		</div> -->
		<div id="contractLook" style="display: none" class="wins">
			<div style="margin: 50px 250px">
				<form id="ces" method="post">
					<table style="width: 600px; height: 800px">
						<tr>
							<td><label for="name">合同名称:</label></td>
							<td><input type="text" style="width: 200px; height: 20px"
								name="name" /></td>
						</tr>
						<tr>
							<td><label for="email">合同类型:</label></td>
							<td><input id="cccs" style="width: 100px; height: 20px"
								name="type" /></td>
							<div id="esc"
								style="display: none; width: 200px; height: 100px; background: #eee; font-size: 17px; font: border; color: red;; text-align: center; line-height: 100px">
								按Esc可关闭!</div>
							<td><label for="email">合同金额:</label></td>
							<td><input type="text" name="price"
								style="width: 100px; height: 20px" value="0"></input></td>
						</tr>
						<tr>
							<td><label for="email">甲方:</label></td>
							<td><input id="cc" name="jia"
								style="width: 200px; height: 20px" /></td>
							<td><label for="email">乙方:</label></td>
							<td><input id="cc" name="yi"
								style="width: 200px; height: 20px" /></td>
						</tr>
						<tr>
							<td><label for="email">企业经营许可证号：</label></td>
							<td><input id="cc" name="jiaqz"
								style="width: 200px; height: 20px" /></td>
							<td><label for="email">企业经营许可证号：</label></td>
							<td><input id="cc" name="yiqz"
								style="width: 200px; height: 20px" /></td>
						</tr>
						<tr>
							<td><label for="name">合同内容:</label></td>
							<td><input name="context"
								style="width: 400px; height: 150px"></td>
						</tr>
						<tr>
							<td><label for="name">备注信息:</label></td>
							<td><input name="remark" style="width: 400px; height: 150px"></td>
						</tr>
						<tr>
							<td></td>
							<td><a href="javascript:close()" class="easyui-linkbutton">返回</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/scripts/contract-create.js"></script>
</body>
</html>