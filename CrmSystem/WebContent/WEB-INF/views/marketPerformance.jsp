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
		
    <table id="qhy_performance">

	</table>
	
	<div id="dd_performance" style="padding: 5px; height: auto;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick = "manager_tool.add()">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick = "manager_tool.edit()">修改</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick = "manager_tool.remove()">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.look()" >查看</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.reload()" >刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.redo()" >取消选择</a>
	</div>
	
	 
	<div id="tb_performance" style="padding: 10px 0 8px 15px; color: green">
	          姓名：<input type="text" name="name"/> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.searchPm()">查询</a>
	</div>
	
	<form id="add_qhy_marketPm" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售绩效 》》  添加绩效
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<!-- <tr>
				<td>绩效编码：</td>
				<td><input type="text" name="marketPmCoding" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr> -->
			<tr>
				<td>员工姓名：</td>
				<td>
				<input type="text" name="staffName" id="staffName" editable="false" 
				data-options="required:'true'" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<!-- <tr>
				<td>所属部门：</td>
				<td><input type="text" name="departId" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr> -->
			<tr>
				<td>绩效等级：</td>
				<td>
				<input type="button" value="－" style="width:30px;" onclick = "manager_tool.jian()">
				<input type="text" name="marketPmLv" id="marketPmLv" value="1" style="width:25px;">
				<input type="button" value="+" style="width:30px;" onclick="manager_tool.jia()"></td>
			</tr>
			<tr>
			    <td>备注信息：</td>
				<td><textarea id="marketPmRemark" style="width:300px;height:150px"></textarea></td>
			</tr>
		</table>
	</form>
	
	<form id="edit_qhy_marketPm" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售绩效 》》  修改绩效
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
		     <tr>
				<td><!-- id: --></td>
				<td><input type="hidden" name="marketPmId_edit" id="marketPmId_edit"  /></td>
			</tr>
			<tr>
				<td>绩效编码：</td>
				<td><input type="text" name="marketPmCoding_edit" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>员工姓名：</td>
				<td>
				<input type="text" name="staffName_edit" disabled="false"
				data-options="required:'true'" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>所属部门：</td>
				<td><input type="text" name="departName_edit" id="departName" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>绩效等级：</td>
				<td>
				<input type="button" value="－" style="width:30px;" onclick = "manager_tool.jian_edit()">
				<input type="text" name="marketPmLv_edit" id="marketPmLv_edit" value="1" style="width:25px;">
				<input type="button" value="+" style="width:30px;" onclick="manager_tool.jia_edit()"></td>
			</tr>
			<tr>
			    <td>备注信息：</td>
				<td><textarea name="marketPmRemark_edit" id="marketPmRemark_edit" style="width:300px;height:150px"></textarea></td>
			</tr>
		</table>
	</form>
	 
	 
	
<script type="text/javascript">
	
	$(function(){
		//获取员工姓名
		$('#staffName').combobox({
		    valueField : 'staffId',
			textField : 'staffName',
			url:'../queryStaffName',
		});
		
		$('#qhy_performance').datagrid({
			title:'销售管理    》 》 销售绩效',
			url:'../pageByLikeMarketPm',
		    pagination : true,
			rownumbers : true,
			pageList : [ 20, 40, 60 ],
			pageSize : 20,
			pageNumber : 1, 
			fit : true,
			toolbar:'#dd_performance,#tb_performance',
			columns:[[{
				field:'marketPmId',
				title:'选中框',
				checkbox : true,
			},{
				field:'marketPmSName',
				title:'姓名',
				width : 100,
			},{
				field:'departName',
				title:'部门',
				width : 100,
			},{
				field:'marketPmLv',
				title:'绩效等级',
				width : 100,
			},{
				field:'marketPmUpdateTime',
				title:'最后操作时间',
				width : 150,
			},{
				field:'marketPmOperatorName',
				title:'操作人',
				width : 100,
			}]]
		})
		$("#add_qhy_marketPm").dialog({
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
					if($("#add_qhy_marketPm").form('validate')){
						$.ajax({
							url:"../addMarketPmPost",
							type:"post",
							data:{
								staffId:$('#staffName').val(),
								marketPmLv:$("#marketPmLv").val(),
								marketPmRemark:$('#marketPmRemark').val(),
							},
						    success:function(result){
						    	//alert(result)
						    	if(result == "true"){
						    		 //alert("绩效新增成功");
						    		 $.messager.confirm('提示操作','绩效新增成功','warning');
					    		     $('#add_qhy_marketPm').dialog('close').form('reset');
								     $('#qhy_performance').datagrid('reload');
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
					$('#add_qhy_marketPm').dialog('close').form('reset')
				}
			}] 
		});
		//提交修改
		 $("#edit_qhy_marketPm").dialog({
			title:'销售计划修改',
			iconCls:'icon-add',
			height:450,
			width:800,
			closed:'true',
			modal:true,
			buttons:[{
				text:"保存",
				iconCls:'icon-save',
				handler:function(){
					 if($("#edit_qhy_marketPm").form('validate')){
						var rows = $('#qhy_performance').datagrid('getSelections');
						alert(rows[0].marketPmId);
						$.ajax({
							type:'post',
							url:"../updatPost_marketPm",
					        data:{
					        	marketPmId:rows[0].marketPmId,
					        	marketPmLv:$("#marketPmLv_edit").val(),
					        	marketPmRemark:$("#marketPmRemark_edit").val(),
					        },
						    success:function(result){
						    	alert(11)
						    	console.log(result)
						    	if(result == "true"){
						    		$.messager.confirm('提示操作','修改成功','warning');
						    		$('#edit_qhy_marketPm').dialog('close');
									$('#qhy_performance').datagrid('reload');
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
					$('#edit_qhy_marketPm').dialog('close').form('reset') 
				}
			}]
		})
	 
	});
	
	//工具 
	manager_tool = {
	    //绩效减
		jian:function(){
			var num = $("#marketPmLv").val();
			$('#marketPmLv').val(parseInt(num)-1);
		},
		//绩效加
		jia:function(){
			var num = $("#marketPmLv").val();
			$('#marketPmLv').val(parseInt(num)+1);
		},
		 //绩效减
		jian_edit:function(){
			var num = $("#marketPmLv_edit").val();
			$('#marketPmLv_edit').val(parseInt(num)-1);
		},
		//绩效加
		jia_edit:function(){
			var num = $("#marketPmLv_edit").val();
			$('#marketPmLv_edit').val(parseInt(num)+1);
		},
		//按条件查询
		searchPm:function(){
			//alert($('input[name="name"]').val())
			$('#qhy_performance').datagrid('load',{
				name:$('input[name="name"]').val(),
			})
		},
		//增加
		add:function(){
			$('#add_qhy_marketPm').dialog('open');
		},
		//刷新
		reload:function(){
			$('#qhy_performance').datagrid('load');
		},
		//取消选中
		redo:function(){
			$('#qhy_performance').datagrid('unselectAll');
		},
		//查看
		look:function(){
			var rows = $('#qhy_performance').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行查看','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行查看','warning');
			}else if(rows.length == 1){
				//console.log(rows[0].marketPmId)
			   //alert(rows[0].marketPmId)
			    $.ajax({
					url:'../getMarketPmById',
					type:'post',
					data:{
						marketPmId:rows[0].marketPmId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#edit_qhy_marketPm').form('load',{
								marketPmCoding_edit:result[0].marketPmCoding,
								staffName_edit:result[0].marketPmSName,
								departName_edit:result[0].departName,
								marketPmLv_edit:result[0].marketPmLv,
								marketPmRemark_edit:result[0].marketPmRemark,  
								
							}).dialog('open')
						}
					}
				}) 
			}
			
		},
		
		//编辑
		edit:function(){
			var rows = $('#qhy_performance').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','编辑记录至少要选择一条','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','编辑记录只能选择一条','warning');
			}else if(rows.length == 1){
				$.ajax({
					url:'../getMarketPmById',
					type:'post',
					data:{
						marketPmId:rows[0].marketPmId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#edit_qhy_marketPm').form('load',{
								marketPmCoding_edit:result[0].marketPmCoding,
								staffName_edit:result[0].marketPmSName,
								departName_edit:result[0].departName,
								marketPmLv_edit:result[0].marketPmLv,
								marketPmRemark_edit:result[0].marketPmRemark,  
								
							}).dialog('open')
						}
					}
				}) 
			}
		},
		//删除
		remove:function(){
			var rows = $('#qhy_performance').datagrid('getSelections');
			if(rows.length==1){
				$.messager.confirm('确定操作','确定删除所选吗',function(falg){
					if(falg){
						//console.log(rows)
						$.ajax({
							type:'post',
							url:'../delPostMarketPm',
							data:{
								marketPmId:rows[0].marketPmId
							},
							success:function(result){
								alert(result)
							    if(result == "true"){   
									alert("删除成功");
									$('#qhy_performance').datagrid('reload');
								}else{
									//alert('删除失败')
									$.messager.confirm('提示操作','删除失败','warning');
								}
							}
						})
					}
				})
			}else if(rows.length >1){
				$.messager.alert("警告","一次只能选择一条记录进行删除","warning");
			}else{
				$.messager.alert("警告","至少要选择一条记录删除","warning");
			}
		}
			
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