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
		
    <table id="qhy_linkman">

	</table>
	
	<div id="dd_lik" style="padding: 5px; height: auto;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick = "manager_tool.add()">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick = "manager_tool.edit()">修改</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick = "manager_tool.remove()">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.look()" >查看</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.reload()" >刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.redo()" >取消选择</a>
	</div>
	
	 
	<div id="tb_linkman" style="padding: 10px 0 8px 15px; color: green">
	          姓名：<input type="text" name="name"/> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.searchPm()">查询</a>
	</div>
	
	<form id="add_qhy_marketLinkman" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售绩效 》》  添加联系人
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<!-- <tr>
				<td>绩效编码：</td>
				<td><input type="text" name="marketPmCoding" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr> -->
			<tr>
				<td>姓名：</td>
				<td>
				<input type="text" name="linkName" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>性别：</td>
				<td> 男：<input type="radio" value ="男" name="linkSex" checked="checked">
 				               女：<input type="radio" value ="女" name="linkSex"></td>
			</tr>
			<tr>
				<td>生日：</td>
				<td><input type="text" name="linkBirthdayDate" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>手机：</td>
				<td><input type="text" name="linkPhone" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>办公电话：</td>
				<td><input type="text" name="linkWorkphone" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><input type="text" name="linkEmail" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>家庭电话：</td>
				<td><input type="text" name="linkHomephone" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>联系地址：</td>
				<td><input type="text" name="linkAddress" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><textarea name="linkRemark" style="height:25px;padding:0 2px;width:250px;"></textarea></td>
			</tr>
		</table>
	</form>
	
	<form id="edit_qhy_marketLinkman" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售绩效 》》  修改联系人
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<tr>
				<td>联系人编码：</td>
				<td><input type="text" disabled="false" name="linkConding_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td>
				<input type="text" name="linkName_edit" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>性别：</td>
				<td> 男：<input type="radio" value ="男" name="linkSex_edit" checked="checked">
 				               女：<input type="radio" value ="女" name="linkSex_edit"></td>
			</tr>
			<tr>
				<td>生日：</td>
				<td><input type="text" name="linkBirthdayDate_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>手机：</td>
				<td><input type="text" name="linkPhone_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>办公电话：</td>
				<td><input type="text" name="linkWorkphone_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><input type="text" name="linkEmail_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>家庭电话：</td>
				<td><input type="text" name="linkHomephone_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>联系地址：</td>
				<td><input type="text" name="linkAddress_edit" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><textarea name="linkRemark_edit" style="height:25px;padding:0 2px;width:250px;"></textarea></td>
			</tr>
		</table>
	</form>
	
	
<script type="text/javascript">
	
	$(function(){
		$('#qhy_linkman').datagrid({
			title:'销售管理    》 》 销售绩效',
			url:'../pageByLikeLinkman',
		    pagination : true,
			rownumbers : true,
			pageList : [ 5, 10, 15 ],
			pageSize : 5,
			pageNumber : 1, 
			fit : true,
			toolbar:'#dd_lik,#tb_linkman',
			columns:[[{
				field:'linkId',
				title:'选中框',
				checkbox : true,
			},{
				field:'linkName',
				title:'联系人姓名',
				width : 100,
			},{
				field:'linkSex',
				title:'性别',
				width : 100,
			},{
				field:'linkPhone',
				title:'联系电话',
				width : 100,
			},{
				field:'linkAddress',
				title:'住址',
				width : 150,
			},{
				field:'linkRemark',
				title:'备注',
				width : 100,
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
								     $('#qhy_linkman').datagrid('reload');
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
		 $("#edit_qhy_marketLinkman").dialog({
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
					 if($("#edit_qhy_marketLinkman").form('validate')){
						var rows = $('#qhy_linkman').datagrid('getSelections');
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
								linkWorkphone:$("input[name='linkWorkphone_edit']").val(),
								linkEmail:$("input[name='linkEmail_edit']").val(),
								linkHomephone:$("input[name='linkHomephone_edit']").val(),
								linkAddress:$("input[name='linkAddress_edit']").val(),
								linkRemark:$("textarea[name='llinkRemark_edit']").val(),
					        },
						    success:function(result){
						    	//alert(result)
						    	//console.log(result)
						    	if(result == "true"){
						    		$.messager.confirm('提示操作','修改成功','warning');
						    		$('#edit_qhy_marketLinkman').dialog('close');
									$('#qhy_linkman').datagrid('reload');
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
					$('#edit_qhy_marketLinkman').dialog('close').form('reset') 
				}
			}]
		})
	 
	});
	
	//工具 
	manager_tool = {
		//按条件查询
		searchPm:function(){
			//alert($('input[name="name"]').val())
			$('#qhy_linkman').datagrid('load',{
				name:$('input[name="name"]').val(),
			})
		},
		//增加
		add:function(){
			$('#add_qhy_marketLinkman').dialog('open');
		},
		//刷新
		reload:function(){
			$('#qhy_linkman').datagrid('load');
		},
		//取消选中
		redo:function(){
			$('#qhy_linkman').datagrid('unselectAll');
		},
		//查看
		look:function(){
			var rows = $('#qhy_linkman').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请要选中一条数据进行查看','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行查看','warning');
			}else if(rows.length == 1){
				//console.log(rows[0].linkId)
			   //alert(rows[0].linkId)
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
								linkBirthdayDate_edit:result[0].linkBirthdayDate,
								linkPhone_edit:result[0].linkPhone,
								linkWorkphone_edit:result[0].linkWorkphone,
								linkEmail_edit:result[0].linkEmail,
								linkHomephone_edit:result[0].linkHomephone,
								linkAddress_edit:result[0].linkAddress,
								linkRemark_edit:result[0].linkRemark,
							}).dialog('open')
						}
					}
				}) 
			}
			
		},
		
		//编辑
		edit:function(){
			var rows = $('#qhy_linkman').datagrid('getSelections');
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
								linkBirthdayDate_edit:result[0].linkBirthdayDate,
								linkPhone_edit:result[0].linkPhone,
								linkWorkphone_edit:result[0].linkWorkphone,
								linkEmail_edit:result[0].linkEmail,
								linkHomephone_edit:result[0].linkHomephone,
								linkAddress_edit:result[0].linkAddress,
								linkRemark_edit:result[0].linkRemark,
							}).dialog('open')
						}
					}
				}) 
			}
		},
		//删除
		remove:function(){
			var rows = $('#qhy_linkman').datagrid('getSelections');
			if(rows.length==1){
				$.messager.confirm('确定操作','确定删除所选吗',function(falg){
					if(falg){
						//console.log(rows)
						$.ajax({
							type:'post',
							url:'../delLinkmanPost',
							data:{
								linkId:rows[0].linkId,
							},
							success:function(result){
							    if(result == "true"){   
									alert("删除成功");
									$('#qhy_linkman').datagrid('reload');
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