<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>销售计划</title>
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
		
    <table id="qhy_markerTable">

	</table>
	
	<div id="dd_qhy" style="padding: 5px; height: auto;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick = "manager_tool.add()">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick = "manager_tool.edit()">修改</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick = "manager_tool.remove()">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.commit()" >提交</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.look()" >查看</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.reload()" >刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.redo()" >取消选择</a>
	</div>
	
	<!-- editable="false" -->
	<div id="tb_qhy" style="padding: 10px 0 8px 15px; color: green">
	           月份：<input type="text" name="marketDate_likeby" style="height: 25px;"  
	           class="easyui-datebox"/> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.search()">查询</a>
	</div>
	
	<form id="add_qhy_market" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售计划 》》  添加销售计划
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<tr>
				<td>计划人姓名：</td>
				<td><input type="text" name="marketName" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>计划时间：</td>
				<td>
				<input type="text" name="marketDate" id="marketDate" class="easyui-datebox"
				 style="height:25px;padding:0 2px;width:250px;" />
				 <span style="font-size:6px;color:#c6c1bb">请按xxxx-xx-xx的时间格式输入</span>
				</td>
			</tr>
			<tr>
				<td>计划状态：</td>
				<td><input type="text" name="marketState" value="已创建" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>计划内容：</td>
				<td><textarea name="marketContent" id="marketContent" style="width:300px;height:150px"></textarea></td>
			</tr>
			<!-- <tr>
			    <td></td>
				<td colspan="2"><input type="submit" value="提交"></td>
			</tr> -->
			
		</table>
	</form>
	
	
	<form id="edit_qhy_market" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售计划 》》  修改销售计划
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
		    <tr>
				<td><!-- 计划id: --></td>
				<td><input type="hidden" name="marketId_edit" id="marketId_edit"  /></td>
			</tr>
			<tr>
				<td>计划编码：</td>
				<td><input type="text" name="marketCoding_edit" id="marketCoding_edit" 
				 style="height:25px;padding:0 2px;width:250px;" disabled="false">*</td>
			</tr>
			<tr>
				<td>计划人姓名：</td>
				<td><input type="text" name="marketName_edit" id="marketName_edit"
				style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>计划月份：</td>
				<td>
				<input type="text" name="marketDate_edit" id="marketDate_edit" class="easyui-datebox"
				 style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>计划状态：</td>
				<td><input type="text" name="marketState_edit" id="marketState_edit" value="已创建" disabled="false" 
				style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>计划内容：</td>
				<td><textarea name="marketContent_edit" id="marketContent_edit" 
				style="width:300px;height:150px"></textarea></td>
			</tr>
		</table>
	</form>
	<!-- 
	<form id="look_qhy_market" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售计划 》》  修改销售计划
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
		    <tr>
				<td>计划id:</td>
				<td><input type="hidden" name="marketId_edit" id="marketId_edit"  /></td>
			</tr>
			<tr>
				<td>计划编码：</td>
				<td><input type="text" name="marketCoding_edit" id="marketCoding_edit"
				 style="height:25px;padding:0 2px;width:250px;" disabled="false">*</td>
			</tr>
			<tr>
				<td>计划人姓名：</td>
				<td><input type="text" name="marketName_edit" id="marketName_edit"
				style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>计划月份：</td>
				<td>
				<input type="text" name="marketDate_edit" id="marketDate_edit" class="easyui-datebox"
				 style="height:25px;padding:0 2px;width:250px;"/> 
				*</td>
			</tr>
			<tr>
				<td>计划状态：</td>
				<td><input type="text" name="marketState_edit" id="marketState_edit" value="已创建" disabled="false" 
				style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>计划内容：</td>
				<td><textarea name="marketContent_edit" id="marketContent_edit" 
				style="width:300px;height:150px"></textarea></td>
			</tr>
		</table>
	</form>
	 -->
<script type="text/javascript">

	
	$(function(){
		$('#qhy_markerTable').datagrid({
			title:'销售管理    》 》 销售计划',
			//url:'../query',
			url:'../pageByLike',
		    pagination : true,
			rownumbers : true,
			pageList : [ 2, 4, 6 ],
			pageSize : 2,
			pageNumber : 1, 
			fit : true,
			toolbar:'#dd_qhy,#tb_qhy',
			columns:[[{
				field:'marketId',
				title:'选中框',
				checkbox : true,
			},{
				field:'marketName',
				title:'姓名',
				width : 100,
			},{
				field:'marketDate',
				title:'月份',
				width : 100,
			},{
				//field:'marketState',
				field:'marketStateValue',
				title:'状态',
				width : 100,
			},{
				field:'marketUpdateDate',
				title:'最后操作时间',
				width : 150,
			},{
				field:'marketOperatorName',
				title:'操作人',
				width : 100,
			},{
				//field:'marketWaithandleId',
				field:'marketWaithandleName',
				title:'待处理人',
				width : 150,
			}]]
		})
		$("#add_qhy_market").dialog({
			title:'销售计划新增',
			iconCls:'icon-add',
			height:450,
			width:700,
			closed:'true',
			modal:true,
		    buttons:[{
				text:"保存",
				iconCls:'icon-save',
				handler:function(){
					if($("#add_qhy_market").form('validate')){
						$.ajax({
							url:"../addMarketPost",
							type:"post",
							data:{
								marketName:$('input[name="marketName"]').val(),
								marketDate:$('#marketDate').val(),
								marketContent:$('#marketContent').val(),
							},
						    success:function(result){
						    	//alert(result)
						    	if(result == "true"){
						    		 alert("计划新增成功");
					    		     $('#add_qhy_market').dialog('close').form('reset');
								     $('#qhy_markerTable').datagrid('reload');
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
					$('#add_qhy_market').dialog('close').form('reset')
				}
			}] 
		});
		//提交修改
		$("#edit_qhy_market").dialog({
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
					if($("#edit_qhy_market").form('validate')){
						var rows = $('#qhy_markerTable').datagrid('getSelections');
						alert($("input[name='marketId_edit']:checked").val())
						alert(rows[0].marketId)
						$.ajax({
							type:'post',
							url:"../updatPost_market",
					        data:{
					        	marketId:rows[0].marketId,
					        	//marketId:$("#marketId_edit").val(),
					        	marketCoding:$("#marketCoding_edit").val(),
								marketName:$("#marketName_edit").val(),
								marketDate:$("#marketDate_edit").val(),
								marketState_edit:$("#marketState_edit").val(),
								marketContent:$("#marketContent_edit").val(),
					        },
						    success:function(result){
						    	alert(11)
						    	console.log(result)
						    	if(result == "true"){
						    		$.messager.confirm('提示操作','修改成功','warning');
						    		$('#edit_qhy_market').dialog('close');
									$('#qhy_markerTable').datagrid('reload');
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
					$('#edit_qhy_market').dialog('close').form('reset')
				}
			}]
		})
	});
	
	//工具
	manager_tool = {
		//按条件查询
		search:function(){
			alert($('input[name="marketDate_likeby"]').val())
			$('#qhy_markerTable').datagrid('load',{
				date:$('input[name="marketDate_likeby"]').val(),
			})
		},
		//增加
		add:function(){
			$('#add_qhy_market').dialog('open');
			$('input[name="marketName"]').focus();
		},
		//刷新
		reload:function(){
			$('#qhy_markerTable').datagrid('load');
		},
		//取消选中
		redo:function(){
			$('#qhy_markerTable').datagrid('unselectAll');
		},
		//提交
		commit:function(){
			var rows = $('#qhy_markerTable').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行提交','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行提交','warning');
			}else if(rows.length == 1){
				if(rows[0].marketStateValue=="已创建"){
					$.ajax({
						url : "../updateMarketStates",
						type : "post",
						data : {
							marketId:rows[0].marketId,
						},
						success : function(result) {
							if (result == "true") {
								alert("提交成功！");
								$('#qhy_markerTable').datagrid('reload');
							} else {
								alert("提交失败！");
							}
						}

					})
				}else{
					alert("此服务已提交过了")
				}
			}
		},
		//查看
		look:function(){
			var rows = $('#qhy_markerTable').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行查看','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行查看','warning');
			}else if(rows.length == 1){
				$.ajax({
					url:'../getMarketById',
					type:'post',
					data:{
						marketId:rows[0].marketId
					},
					success:function(result){
						alert(1)
						console.log(result)
						if(result){
							$('#edit_qhy_market').form('load',{
								marketId_edit:result[0].marketId,
								marketCoding_edit:result[0].marketCoding,
								marketName_edit:result[0].marketName,
								marketDate_edit:result[0].marketDate,
								marketState_edit:result[0].marketState,
								marketContent_edit:result[0].marketContent
								
							}).dialog('open')
						}
					}
				})
			}
			
		},
		
		//编辑
		edit:function(){
			var rows = $('#qhy_markerTable').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','编辑记录至少要选择一条','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','编辑记录只能选择一条','warning');
			}else if(rows.length == 1){
				//alert(rows[0].marketId);
				//rows[0].marketId
				$.ajax({
					url:'../getMarketById',
					type:'post',
					data:{
						marketId:rows[0].marketId
					},
					success:function(result){
						//console.log(result);
						//alert(result[0].marketId);
						if(result){
							$('#edit_qhy_market').form('load',{
								marketId_edit:result[0].marketId,
								marketCoding_edit:result[0].marketCoding,
								marketName_edit:result[0].marketName,
								marketDate_edit:result[0].marketDate,
								marketState_edit:result[0].marketState,
								marketContent_edit:result[0].marketContent
								
							}).dialog('open')
						}
					}
				})
			}
		},
		//删除
		remove:function(){
			var rows = $('#qhy_markerTable').datagrid('getSelections');
			if(rows.length==1){
				$.messager.confirm('确定操作','确定删除所选吗',function(falg){
					if(falg){
						//alert(rows)
						//console.log(rows)
						/* var ids = [] ;
						for(var i = 0 ; i < rows.length ; i++){
							ids.push(rows[i].marketId);
						};  */
						$.ajax({
							type:'post',
							url:'../delPostMarket',
							data:{
								//ids:ids.join(',')
								marketId:rows[0].marketId
							},
							success:function(result){
								alert(result)
							    if(result == "true"){   
									alert("删除成功");
									$('#qhy_markerTable').datagrid('reload');
								}else{
									//alert('删除失败')
									$.messager.confirm('提示操作','删除失败,你没有权限删除或者已提交的计划不能进行删除','warning');
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