<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>销售绩效</title>
</head>
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!--easyui核心文件-->
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!--对应的语言包-->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<!--皮肤文件-->
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
<!--图标文件-->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />


<body>
<style type="text/css">
 	.dialog-button{ text-align:center;}
 		 
</style>
		
    <table id="qhy_hap">

	</table>
	
	<div id="dd_hap" style="padding: 5px; height: auto;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick = "manager_tool.add()">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick = "manager_tool.edit()">修改</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.lookHap()" >查看</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.allot()" >分配</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.reload()" >刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.redo()" >取消选择</a>
	</div>
	
	 
	<div id="tb_hap" style="padding: 10px 0 8px 15px; color: green">
	            录入人 姓名：<input type="text" name="name_hap" id="name_hap"/> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.searchPm()">查询</a>
	</div>
	
	<form id="add_qhy_hap" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 机会管理 》》  添加机会
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<!-- <tr>
				<td>绩效编码：</td>
				<td><input type="text" name="marketPmCoding" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr> -->
			<tr>
				<td>机会名称：</td>
				<td>
				<input type="text" name="hapName" id="hapName" style="height:25px;padding:0 2px;width:220px;" /> 
				*</td>
			</tr>
			<tr>
				<td>机会类型:</td>
				<td><input id="hapType" name="hapType" style="height:25px;padding:0 2px;width:250px;"
					editable="false" data-options="required:'true'" type="text" 
					class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td>机会内容：</td>
				<td><textarea id="hap_conten" name="hap_conten" style="width:300px;height:70px"></textarea></td>
			</tr>
			<tr>
			    <td>备注信息：</td>
				<td><textarea id="hap_remark" name="hap_remark" style="width:300px;height:70px"></textarea></td>
			</tr>
		</table>
	</form>
	
	<form id="edit_qhy_hap" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 机会管理 》》 修改机会
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
		   <tr>
				<td><!-- hapId: --></td>
				<td><input type="hidden" name="hapId" style="height:25px;padding:0 2px;width:250px;"></td>
			</tr>
			<tr>
				<td>机会编码：</td>
				<td><input type="text" name="hap_code_edit" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>机会名称：</td>
				<td>
				<input type="text" name="hapName_edit" id="hapName_edit" editable="false" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>机会类型:</td>
				<td><input id="hapType" name="hapType_edit" style="height:25px;padding:0 2px;width:120px;"
					editable="false" data-options="required:'true'" type="text"  disabled="false"
					class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td>机会内容：</td>
				<td><textarea id="hap_conten_edit" name="hap_conten_edit" style="width:330px;height:80px"></textarea></td>
			</tr>
			<tr>
			    <td>备注信息：</td>
				<td><textarea id="hap_remark_edit" name="hap_remark_edit" style="width:330px;height:80px"></textarea></td>
			</tr>
		</table>
	</form>
	
	<form id="edit_qhy_allot" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 机会管理 》》机会分配
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
		   <tr>
				<td><!-- hapId: --></td>
				<td><input type="hidden" name="hapId_allot" style="height:25px;padding:0 2px;width:250px;"></td>
			</tr>
			<tr>
				<td>机会名称：</td>
				<td>
				<input type="text" name="hapName_allot" id="hapName_allot"  disabled="false" style="height:25px;padding:0 2px;width:250px;"/> 
				*</td>
			</tr>
			<tr>
				<td>机会类型:</td>
				<td><input id="hapType" name="hapType_allot" style="height:25px;padding:0 2px;width:250px;"
					editable="false" data-options="required:'true'" type="text"  disabled="false"
					class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td>录入人：</td>
				<td><input type="text" name="hapSName_allot" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>录入时间：</td>
				<td><input type="text" name="hapCreateTime_allot" disabled="false" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>最后一次操作时间：</td>
				<td><input type="text" name="hapUpdateTime_allot" disabled="false" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>最后操作人：</td>
				<td><input id="hapUpdateSName_allot" disabled="false" name="hapUpdateSName_allot" style="height:25px;padding:0 2px;width:250px;"/>*</td>
			</tr>
			<tr>
			    <td>机会内容：</td>
				<td><textarea id="hap_conten_allot" name="hap_conten_allot" disabled="false" style="width:330px;height:50px"></textarea></td>
			</tr>
			<tr>
			    <td>备注信息：</td>
				<td><textarea id="hap_remark_allot" name="hap_remark_allot" disabled="false" style="width:330px;height:50px"></textarea></td>
			</tr>
			<tr>
				<td>分配给:</td>
				<td><input type="text" name="staffName_allot" id="staffName_allot" editable="false"
				data-options="required:'true'" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
		</table>
	</form>
<script type="text/javascript">
	
	$(function(){
		//获取员工姓名：下属
		$('#staffName_allot').combobox({
		    valueField : 'staffId',
			textField : 'staffName',
			url:'../queryStaffName',
		});
		
		//获取机会类型
		$('#hapType').combobox({
			valueField : 'dataId',
			textField : 'dataValue',
			url:'../queryHapType',
		});
		
		$('#qhy_hap').datagrid({
			title:'销售管理    》 》 销售绩效',
			url:'../pageByLikeMarketHap',
		    pagination : true,
			rownumbers : true,
			pageList : [ 20, 40, 60 ],
			pageSize : 20,
			pageNumber : 1, 
			fit : true,
			toolbar:'#dd_hap,#tb_hap',
			columns:[[{
				field:'hapId',
				title:'选中框',
				checkbox : true,
			},{
				field:'hapName',
				title:'机会名称',
				width : 100,
			},{
				field:'hapTypeValue',
				title:'机会类型',
				width : 100,
			},{
				field:'hapCreateTime',
				title:'录入时间',
				width : 200,
			},{
				field:'hapSid',
				title:'录入人',
				width : 150,
			}]]
		})
		$("#add_qhy_hap").dialog({
			title:'销售机会新增',
			iconCls:'icon-add',
			height:450,
			width:700,
			closed:'true',
			modal:true,
		    buttons:[{
				text:"保存",
				iconCls:'icon-save',
				handler:function(){
					if($("#add_qhy_hap").form('validate')){
						$.ajax({
							url:"../addHapPost",
							type:"post",
							data:{
								hapType:$('#hapType').val(),
								hapName:$("#hapName").val(),
								hap_conten:$("#hap_conten").val(),
								hap_remark:$('#hap_remark').val(),
							},
						    success:function(result){
						    	alert(result)
						    	if(result == "true"){
						    		 //alert("绩效新增成功");
						    		 $.messager.confirm('提示操作','机会新增成功','warning');
					    		     $('#add_qhy_hap').dialog('close').form('reset');
								     $('#qhy_hap').datagrid('reload');
						    	}
						    }
						})
					}else{
						alert("请填充完整信息")
					}
				}
			},{
				iconCls:'icon-redo',
				text:'取消',
				handler:function(){
					$('#add_qhy_hap').dialog('close').form('reset')
				}
			}] 
		});
		//提交修改
		 $("#edit_qhy_hap").dialog({
			title:'销售计划修改',
			iconCls:'icon-add',
			height:550,
			width:800,
			closed:'true',
			modal:true,
			buttons:[{
				text:"保存",
				iconCls:'icon-save',
				handler:function(){
					 if($("#edit_qhy_hap").form('validate')){
						var rows = $('#qhy_hap').datagrid('getSelections');
						//alert(rows[0].hapId);
						//alert($("#hapName_edit").val())
						//alert($("textarea[name='hap_conten_edit']").val())
						//alert($("textarea[name='hap_remark_edit']").val())
						$.ajax({
							type:"post",
							url:"../updateHapPost",
					        data:{
					        	hapId:rows[0].hapId,
					        	hapName:$("#hapName_edit").val(),
					        	hap_conten:$("textarea[name='hap_conten_edit']").val(),
					        	hap_remark:$("textarea[name='hap_remark_edit']").val(),
					        },
						    success:function(result){
						    	//alert(result)
						    	if(result == "true"){
						    		$.messager.confirm('提示操作','修改成功','warning');
						    		$('#edit_qhy_hap').dialog('close');
									$('#qhy_hap').datagrid('reload');
						    	}else{
									$.messager.confirm('提示操作','修改失败','warning');
								}
						    }
						})
					}else{
						alert("请填充完整信息或信息修改不合格")
					} 
				}
			},{
				iconCls:'icon-redo',
				text:'取消',
				handler:function(){
					$('#edit_qhy_hap').dialog('close').form('reset') 
				}
			}] 
		});
		//分配
		 $("#edit_qhy_allot").dialog({
			title:'销售计划修改',
			iconCls:'icon-add',
			height:550,
			width:800,
			closed:'true',
			modal:true,
			buttons:[{
				text:"分配",
				iconCls:'icon-save',
				handler:function(){
					 if($("#edit_qhy_hap").form('validate')){
						var rows = $('#qhy_hap').datagrid('getSelections');
						$.ajax({
							type:"post",
							url:"../updateHapPost",
					        data:{
					        	hapId:rows[0].hapId,
					        	hapName:$("#hapName_allot").val(),
					        	hap_conten:$("textarea[name='hap_conten_allot']").val(),
					        	hap_remark:$("textarea[name='hap_remark_allot']").val(),
					        	hap_staffId:$("#staffName_allot").val(),
					        },
						    success:function(result){
						    	//alert(result)
						    	if(result == "true"){
						    		$.messager.confirm('提示操作','分配成功','warning');
						    		$('#edit_qhy_allot').dialog('close');
									$('#qhy_hap').datagrid('reload');
						    	}else{
									$.messager.confirm('提示操作',' 分配失败','warning');
								}
						    }
						})
					}else{
						alert("请填充完整信息或信息修改不合格")
					} 
				}
			},{
				iconCls:'icon-redo',
				text:'取消',
				handler:function(){
					$('#edit_qhy_allot').dialog('close').form('reset') 
				}
			}] 
		})
	});
	
	//工具 
	manager_tool = {
		//按条件查询
		searchPm:function(){
			//alert($('input[name="name_hap"]').val())
			$('#qhy_hap').datagrid('load',{
				name:$('input[name="name_hap"]').val(),
			})
		},
		//分配
		allot:function(){
			var rows = $('#qhy_hap').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行分配','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行分配','warning');
			}else if(rows.length == 1){
			    alert(rows[0].hapId)
			    $.ajax({
					url:'../getHapById',
					type:'post',
					data:{
						hapId:rows[0].hapId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#edit_qhy_allot').form('load',{
								hapId_allot:rows[0].hapId,
								hapName_allot:result[0].hapName,
								hapType_allot:result[0].hapTypeValue,
								hapSName_allot:result[0].hapSid,
								hapCreateTime_allot:result[0].hapCreateTime,
								hapUpdateTime_allot:result[0].hapUpdateTime,
								hapUpdateSName_allot:result[0].hapUpdateSName,
								hap_conten_allot:result[0].hap_conten,
								hapUpdateSName_allot:result[0].hapSid,
								hap_remark_allot:result[0].hap_remark,  
							}).dialog('open')
						}
					}
				}) 
			}
		},
		//增加
		add:function(){
			$('#add_qhy_hap').dialog('open');
		},
		//刷新
		reload:function(){
			$('#qhy_hap').datagrid('load');
		},
		//取消选中
		redo:function(){
			$('#qhy_hap').datagrid('unselectAll');
		},
		//查看
		lookHap:function(){
			var rows = $('#qhy_hap').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行查看','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行查看','warning');
			}else if(rows.length == 1){
			    alert(rows[0].hapId)
			    $.ajax({
					url:'../getHapById',
					type:'post',
					data:{
						hapId:rows[0].hapId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#edit_qhy_hap').form('load',{
								hapId:rows[0].hapId,
								hap_code_edit:result[0].hap_code,
								hapName_edit:result[0].hapName,
								hapType_edit:result[0].hapTypeValue,
								hap_conten_edit:result[0].hap_conten,
								hap_remark_edit:result[0].hap_remark,  
								
							}).dialog('open')
						}
					}
				}) 
			}
			
		},
		
		//编辑
		edit:function(){
			var rows = $('#qhy_hap').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','编辑记录至少要选择一条','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','编辑记录只能选择一条','warning');
			}else if(rows.length == 1){
				$.ajax({
					url:'../getHapById',
					type:'post',
					data:{
						hapId:rows[0].hapId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#edit_qhy_hap').form('load',{
								hapId:rows[0].hapId,
								hap_code_edit:result[0].hap_code,
								hapName_edit:result[0].hapName,
								hapType_edit:result[0].hapTypeValue,
								hap_conten_edit:result[0].hap_conten,
								hap_remark_edit:result[0].hap_remark,  
								
							}).dialog('open')
						}
					}
				}) 
			}
		},
		 
	}
	
	//增加时-----------------------------------------------------------------
	 $('input[name="hapName"]').validatebox({
		  required:true,
		  missingMessage:'请输入机会名称',
	 });
	
	//修改时-----------------------------------------------------------------
	 $('#marketName_edit').validatebox({
		  required:true,
		  missingMessage:'请输入计划人姓名',
	 });
	$('#marketDate_edit').validatebox({
		  required:true,
		  missingMessage:'请输入计划月份',
	 });
	$("#marketContent_edit").validatebox({
		  required:true,
		  missingMessage:'请输入计划内容',
	 });
	
	
	</script>
	 

</body>
</html>