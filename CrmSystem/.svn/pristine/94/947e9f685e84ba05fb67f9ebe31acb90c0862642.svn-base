<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>竞争管理</title>
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
		
    <table id="qhy_compete">

	</table>
	
	<div id="dd_compete" style="padding: 5px; height: auto;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick = "manager_tool.addCom()">添加</a>
		<!-- <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick = "manager_tool.edit()">修改</a>  -->
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick = "manager_tool.guidan()">归档</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.look()" >查看</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.reload()" >刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.redo()" >取消选择</a>
	</div>
	
	 
	<div id="tb_compete" style="padding: 10px 0 8px 15px; color: green">
	            时间：<input type="text" name="date_com" class="easyui-datebox"/> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.searchPm()">查询</a>
	</div>
	
	<form id="look_qhy_compete" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 竞争管理 》》  查看
		<table id="xh_table" style="padding-left: 70px;padding-top: 50px">
			<tr>
				<td>分析结果标题：</td>
				<td>
				<input type="text" name="competTitle" style="height:25px;padding:0 2px;width:240px;" /> 
				*</td>
			</tr>
			<tr>
				<td>分析时间：</td>
				<td><input type="text" class="easyui-datebox" name="competCreateTime" checked="checked" style="height:25px;padding:0 2px;width:250px;">
			</tr>
			<tr>
				<td>分析类型：</td>
				<td><input type="text" name="competTypeValue" id="competTypeValue" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>状态：</td>
				<td><input type="text" name="competStateValue" id="competStateValue" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
			    <td>分析结果</td>
				<td><textarea name="competResult" style="height:100px;padding:0 2px;width:400px;"></textarea></td>
			</tr>
			 
		</table>
	</form>
	
 
	
<script type="text/javascript">
	
	$(function(){
		$('#qhy_compete').datagrid({
			title:'竞争分析信息表',
			url:'../pageByLikeCompete',
		    pagination : true,
			rownumbers : true,
			pageList : [ 5, 10, 15 ],
			pageSize : 5,
			pageNumber : 1, 
			fit : true,
			toolbar:'#dd_compete,#tb_compete',
			columns:[[{
				field:'competId',
				title:'选中框',
				checkbox : true,
			},{
				field:'competTitle',
				title:'竞争分析结果标题',
				width : 250,
			},{
				field:'competTypeValue',
				title:'类型',
				width : 150,
			},{
				field:'competStateValue',
				title:'状态',
				width : 100,
			},{
				field:'competCreateTime',
				title:'生成时间',
				width : 200,
			},{
				field:'competSName',
				title:'操作人',
				width : 150,
			}]]
		})
		$("#add_qhy_marketLinkman").dialog({
			title:'销售绩效新增',
			iconCls:'icon-add',
			height:450,
			width:700,
			closed:'true',
			modal:true,
		    buttons:[{
				text:"保存",
				iconCls:'icon-save',
				handler:function(){
					if($("#add_qhy_marketLinkmanPm").form('validate')){
						$.ajax({
							url:"../addLinkmanPost",
							type:"post",
							data:{
								linkName:$("input[name='linkName']").val(),
								linkSex:$("input[name='linkSex']").val(),
								linkBirthdayDate:$("input[name='linkBirthdayDate']").val(),
								linkPhone:$("input[name='linkPhone']").val(),
								linkWorkphone:$("input[name='linkWorkphone']").val(),
								linkEmail:$("input[name='linkEmail']").val(),
								linkHomephone:$("input[name='linkHomephone']").val(),
								linkAddress:$("input[name='linkAddress']").val(),
								linkRemark:$("textarea[name='linkRemark']").val(),
							},
						    success:function(result){
						    	if(result == "true"){
						    		 $.messager.confirm('提示操作','联系人新增成功','warning');
					    		     $('#add_qhy_marketLinkmanPm').dialog('close').form('reset');
								     $('#qhy_compete').datagrid('reload');
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
					$('#add_qhy_marketLinkman').dialog('close').form('reset')
				}
			}] 
		});
		//提交修改
		 $("#look_qhy_compete").dialog({
			title:'竞争管理',
			iconCls:'icon-add',
			height:450,
			width:800,
			closed:'true',
			modal:true,
			/* buttons:[{
				text:"保存",
				iconCls:'icon-save',
				handler:function(){
					 if($("#look_qhy_compete").form('validate')){
						var rows = $('#qhy_compete').datagrid('getSelections');
						alert(rows[0].linkId);
						$.ajax({
							type:'post',
							url:"../updateLinkmanPost",
					        data:{
					        	linkId:rows[0].linkId,
								linkConding:$("input[name='linkId_edit']").val(),
								linkName:$("input[name='linkName_edit']").val(),
								linkSex:$("input[name='linkSex_edit']").val(),
								linkBirthdayDate:$("input[name='linkBirthdayDate_edit']").val(),
								linkPhone:$("input[name='linkPhone_edit']").val(),
					        },
						    success:function(result){
						    	//alert(result)
						    	//console.log(result)
						    	if(result == "true"){
						    		$.messager.confirm('提示操作','修改成功','warning');
						    		$('#look_qhy_compete').dialog('close');
									$('#qhy_compete').datagrid('reload');
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
					$('#look_qhy_compete').dialog('close').form('reset') 
				}
			}] */
		})
	 
	});
	
	//工具 
	manager_tool = {
		//按条件查询
		searchPm:function(){
			alert($('input[name="date_com"]').val())
			$('#qhy_compete').datagrid('load',{
				date:$('input[name="date_com"]').val(),
			})
		},
		//归档
		guidan:function(){
			var rows = $('#qhy_compete').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行归档','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','一次只能选中一条记录进行归档','warning');
			}else if(rows.length == 1){
				//console.log(rows[0].linkId)
			   //alert(rows[0].competId)
			    $.ajax({
					url:'../updateState',
					type:'post',
					data:{
						competId:rows[0].competId
					},
					success:function(result){
						//alert(result)
						if(result == "true"){
							$.messager.confirm('提示操作','归档成功','warning');
						}else{
							$.messager.confirm('提示操作','已归档，或你没有权限归档这条记录','warning');
						}
					}
				}) 
			}
		},
		//增加
		addCom:function(){
			 $("#tabs").tabs('add',{
				   title:'竞争分析记录增加',
				   iconCls:'',
				   closable:true,
				   href:'addCompete',
			   })
		},
		//刷新
		reload:function(){
			$('#qhy_compete').datagrid('load');
		},
		//取消选中
		redo:function(){
			$('#qhy_compete').datagrid('unselectAll');
		},
		//查看
		look:function(){
			var rows = $('#qhy_compete').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行查看','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行查看','warning');
			}else if(rows.length == 1){
				//console.log(rows[0].linkId)
			   alert(rows[0].competId)
			    $.ajax({
					url:'../getByCompeteId',
					type:'post',
					data:{
						competId:rows[0].competId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#look_qhy_compete').form('load',{
								competId:rows[0].competId,
								competTitle:rows[0].competTitle,
								competCreateTime:result[0].competCreateTime,
								competTypeValue:result[0].competTypeValue,
								competStateValue:result[0].competStateValue,
								competResult:result[0].competResult,
							}).dialog('open')
						}
					}
				}) 
			}
			
		},
		
		//编辑
		edit:function(){
			var rows = $('#qhy_compete').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','编辑记录至少要选择一条','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','编辑记录只能选择一条','warning');
			}else if(rows.length == 1){
				$.ajax({
					url:'../getById_linkman',
					type:'post',
					data:{
						linkId:rows[0].linkId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#edit_qhy_marketLinkman').form('load',{
								linkId:rows[0].linkId,
								linkConding_edit:result[0].linkConding,
								linkName_edit:result[0].linkName,
								linkSex_edit:result[0].linkSex,
							}).dialog('open')
						}
					}
				}) 
			}
		},
	}
	
	//增加时-----------------------------------------------------------------
	 $('input[name="marketName"]').validatebox({
		  required:true,
		  missingMessage:'请输入计划人姓名',
	 });
	$('input[name="marketDate"]').validatebox({
		  required:true,
		  missingMessage:'请输入计划月份',
	 });
	$("#marketContent").validatebox({
		  required:true,
		  missingMessage:'请输入计划内容',
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