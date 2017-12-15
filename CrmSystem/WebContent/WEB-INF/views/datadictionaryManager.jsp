<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据字典</title>

<style type="text/css">
.dialog-button {
	text-align: center;
}

.textbox {
	height: 22px;
	padding: 0 2px;
}
</style>
</head>
<body>
	<table id="tab_dataDictionary_Lhx">

	</table>
	<div id="div_dataDictionary">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="datadictionTime.add()">添加</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="datadictionTime.updat()">修改</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="datadictionTime.del()">删除</a> 
	</div>
	<div id="divDataDictionary">
		名称查询：<input type="text" class="easyui-textbox" id="ddddd"
			name="ddddd" /> <a href="#" class="easyui-linkbutton"
			iconCls="icon-search" id="seachaa" onclick="datadictionTime.seachaaS()">查询</a>
	</div>
	<form id="tab_dataDictionary_Lhx_endit"
		style="margin: 0; padding: 5px 0 0 24px; color: #333;">
		系统管理>>数据字典>> 修改数据字典
		<table>
			<tr>
				<td></td>
				<td><input type="hidden" id="idTui" disabled="false" name="idTui"
					class="textbox" style="height: 23px;"></td>
			</tr>
			<tr>
				<td>字典编码:</td>
				<td><input type="text" id="dataCodeUpdat" name="dataCodeUpdat" class="textbox"
					style="height: 23px;"></td>
			</tr>
				<tr>
				<td>字典名称:</td>
				<td><input type="text" id="dataNameUpdat" name="dataNameUpdat"  class="textbox"
					style="height: 23px;"></td>
			</tr>
			</tr>
				<tr>
				<td>参考值:</td>
				<td><input type="text" id="dataValueUpdat" name="dataValueUpdat" class="textbox"
					style="height: 23px;"></td>
			</tr>
			<tr>
				<td>备注信息:</td>
				<td><textarea id="dataRemarkUpdat" editable="false"
						data-options="valLidType:'integer',required:'true'"
						name="dataRemarkUpdat" class="textbox" rows="7" /></td>
			</tr>
		</table>
	</form>
	<form id="DataDictionary_lhx_adds"
		style="margin: 0; padding: 5px 0 0 24px; color: #333;">
		系统管理>>组织结构 >> 增加数据字典
		<table>
			<tr>
				<td>字典编码:</td>
				<td><input type="text" id="dataCodeS" name="dataCodeS" class="textbox" style="height: 23px;" /></td>
			</tr>
			<tr>
				<td>字典名称:</td>
				<td><input type="text" id="dataNameS" name="dataNameS" class="textbox" style="height: 23px;" /></td>
			</tr>
			<tr>
				<td>参数值:</td>
				<td><input type="text" id="dataValueS" name="dataValueS" class="textbox" style="height: 23px;" /></td>
			</tr>
			<tr>
				<td>备注信息:</td>
				<td><textarea id="dataRemarkS" editable="false"
						data-options="valLidType:'integer',required:'true'"
						name="dataRemarkS" class="textbox" rows="7" /></td>
			</tr>
		</table>
	</form>


	<script type="text/javascript">
		$(function() {
			$.extend($.fn.validatebox.defaults.rules, {
				integer : {// 验证整数  
					validator : function(value) {
						return /^[+]?[1-9]+\d*$/i.test(value);
					},
					message : '请输入整数'
				},
				CHS : { //验证只能输入中文
					validator : function(value) {
						return /^[\u0391-\uFFE5]+$/.test(value);
					},
					message : '只能输入汉字'
				},
			 	english : {// 验证英语  
	                validator : function(value) {  
	                    return /^[A-Za-z]+$/i.test(value);  
	                },  
	                message : '请输入英文'  
	            },  
			});

			$('input[name="dataNameS"]').validatebox({
				required : true,
				CHS : { //验证只能输入中文
					validator : function(value) {
						return /^[\u0391-\uFFE5]+$/.test(value);
					},
					message : '只能输入汉字'
				},
			});
			$('input[name="roleCoding"]').validatebox({
				required : true,
				integer : {// 验证整数  
					validator : function(value) {
						return /^[+]?[1-9]+\d*$/i.test(value);
					},
					message : '请输入整数'
				},
			});
			$('input[name="dataCodeUpdat"]').validatebox({
				required : true,
				integer : {// 验证整数  
					validator : function(value) {
						return /^[+]?[1-9]+\d*$/i.test(value);
					},
					message : '请输入整数'
				},
			});
			$('input[name="dataRemarkS"]').validatebox({
				required : true,
				integer : {// 验证整数  
					validator : function(value) {
						return /^[+]?[1-9]+\d*$/i.test(value);
					},
					message : '请输入整数'
				},
			});
			/* $("#dataNameUpdat").datebox({

			}) */

			$('#tab_dataDictionary_Lhx').datagrid({
				url : 'http://localhost:8080/CrmSystem/DataDictionaryAction/selectDataictionary',
				title : "数据字典",
				toolbar : '#div_dataDictionary,#divDataDictionary',
				fitColumns : true,//使列自动展开/收缩到合适的DataGrid宽度。
				striped : true,//是否显示斑马线效果。
				rownumbers : true,//如果为true，则显示一个行号列。
				border : false,//是否有边框
				pagination : true,//如果为true，则在DataGrid控件底部显示分页工具栏。
				pageSize : 15,//在设置分页属性的时候初始化页面大小
				pageList : [ 15, 30, 45 ],//在设置分页属性的时候 初始化页面大小选择列表。
				pageNumber : 1,//在设置分页属性的时候初始化页码。
				height : 600,//高度
				columns : [ [ {
					field : 'dataId',
					title : '数据字典Id',
					width : 100,
					checkbox : true,
				}, {
					field : 'dataName',
					title : '名称',
					width : 100,
				//checkbox : true,
				}, {
					field : 'dataCode',
					title : '代码',
					width : 100
				//宽度
				}, {
					field : 'dataValue',
					title : '数据值',
					width : 100,
					
				}, {
					field : 'dataUpdateTime',
					title : '最后修改时间',
					width : 100,
					/* sortable : true *//* 可以用来排序 */
				},{
					field :'staffName',
					title :'操作人',
					width : 100,
				} ] ],
			});
			//增加
			$("#DataDictionary_lhx_adds").dialog(
				{
					width : 350,
					height : 300,
					title : "增加数据字典",
					modal : true,
					closed : true,
					buttons : [
						{
							text : "提交",
							iconCls : "icon-add",
							handler : function() {
								if ($("#DataDictionary_lhx_adds").form("validate")) {
									$.ajax({
												url : "http://localhost:8080/CrmSystem/DataDictionaryAction/insertDataictionary",
												type : "post",
												data : {
													dataCode:$("#dataCodeS").val(),
													dataName:$("#dataNameS").val(),
													dataValue:$("#dataValueS").val(),
													dataRemark:$("#dataRemarkS").val(),
												},
												success : function(data) {
													$.messager.progress("close");
													if (data == "true") {
														$.messager.show({
																	title : '提示',
																	msg : '角色增加成功',
																	timeout : 5000,
																	showType : 'slide'
																});
														$("#DataDictionary_lhx_adds").dialog("close").form("reset");
														$("#tab_dataDictionary_Lhx").datagrid("reload");
													} else {
														$.messager.alert("添加失败","未知名的错误","warning");
													};
												},
											})
								}
							}
						},
						{
							text : "取消",
							iconCls : "icon-redo",
							handler : function() {
								$("#DataDictionary_lhx_adds").dialog("close").form("reset");
							},
						} ]
				})
			//修改
			$("#tab_dataDictionary_Lhx_endit").dialog(
							{
								width : 350,
								height : 300,
								title : "修改数据字典",
								modal : true,
								closed : true,
								buttons : [
										{
											text : "提交",
											iconCls : "icon-add",
											handler : function() {
												if ($("#tab_dataDictionary_Lhx_endit").form("validate")) {
													$.ajax({
														url : "http://localhost:8080/CrmSystem/DataDictionaryAction/updatDataictonarys",
														type : "post",
														data : {
															dataId : $("#idTui").val(),
															dataName :$("#dataNameUpdat").val(),
															dataValue:$("#dataValueUpdat").val(),
															dataCode:$("#dataCodeUpdat").val(),
															dataRemark:$("#dataRemarkUpdat").val()
														},
													/* 	beforeSend : function() {
															$.messager.progress({
																		text : "正在修改中。。。。",
																	});
														},  */
														success : function(data,response,status) {
															/* $.message.progress("close"); */
															if (data == "true") {
																$.messager.show({
																			title : '提示',
																			msg : '修改成功',
																			timeout : 5000,
																			showType : 'slide'
																		});
																$("#tab_dataDictionary_Lhx_endit").dialog("close").form("reset");
																$("#tab_dataDictionary_Lhx").datagrid("reload");
															} else {
																$.messager.alert("修改失败","未知名的错误","warning");
															};
														},
													})
										}
											}
										},
										{
											text : "取消",
											iconCls : "icon-redo",
											handler : function() {
												$("#tab_dataDictionary_Lhx_endit").dialog("close").form("reset");
											},
										} ]
							})

			datadictionTime = {
				del : function() {
					var rows = $("#tab_dataDictionary_Lhx").datagrid("getSelections");
					if (rows.length > 0) {
						$.messager.confirm("确认要删除?","你真的要删除吗？",
										function(flag) {
											if (flag) {
													$.ajax({
															url : "http://localhost:8080/CrmSystem/DataDictionaryAction/deleteDataictionary",
															type : "post",
															data : {
																dataId:rows[0].dataId,
															},
															success : function(result) {
																if (result == "true") {
																	$.messager.show({
																		title : "刪除成功"
																			});
																	$("#tab_dataDictionary_Lhx").datagrid("reload");
																}
															}
														})
											}
										});
					} else {
						$.messager.alert("警告", "至少要选择一条记录删除", "warning");
					}
				},
				//修改
				updat : function() {
					var rows = $("#tab_dataDictionary_Lhx").datagrid("getSelections");
					if (rows.length > 1) {
						$.messager.alert("警告操作", "编辑记录只能选定一条数据", "warning");
					} else if (rows.length == 1) {
						$.ajax({
							url : "http://localhost:8080/CrmSystem/DataDictionaryAction/selectDepartment",
							data : {
								dataId : rows[0].dataId,
							},
							type : "post",
							success : function(result) {
								if (result) {
									$("#tab_dataDictionary_Lhx_endit").form("load", {
										idTui : result[0].dataId,//
										dataCodeUpdat : result[0].dataCode,//
										dataNameUpdat : result[0].dataName,//
										dataValueUpdat:result[0].dataValue,
										dataRemarkUpdat:result[0].dataRemark
									}).dialog("open");
								}
							},
						})
					} else if (rows.length == 0) {
						$.messager.alert("警告操作", "编辑记录至少要选定一条数据", "warning");
					}
					;
				},
				add : function() {
					$("#DataDictionary_lhx_adds").dialog("open");
					$('input[name="dataCodeS"]').focus();
				},
				raod : function() {
					$('#tab_dataDictionary_Lhx').datagrid('reload');
				},
				sedd : function() {
					$('#tab_dataDictionary_Lhx').datagrid('unselectAll');
				},
				seachaaS:function(){
					$('#tab_dataDictionary_Lhx').datagrid('load',{
						
						dataName:$("#ddddd").val()
					})
				}
			}

		
		});

		
	</script>

</body>
</html>