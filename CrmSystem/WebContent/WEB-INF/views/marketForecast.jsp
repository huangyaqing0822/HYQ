<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 销售预测 </title>
</head>
<body>
   
 <style type="text/css">
 	.dialog-button{ text-align:center;}
 		 
 </style>

    <table id="qhy_markerFore">

	</table>
	
	<div id="dd_maarket_q" style="padding: 5px; height: auto;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "forecast()" >预测</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.market_look()" >查看</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "manager_tool.reload()" >刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "manager_tool.redo()" >取消选择</a>
	</div>
	
	<!-- editable="false" -->
	<div id="tb_qhy_date" style="padding: 10px 0 8px 15px; color: green">
	           时间：<input type="text" name="marketForDate_likeby" style="height: 25px;"  class="easyui-datebox"/> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="manager_tool.searchFore()">查询</a>
	</div>
	
	
	<form id="fore_qhy_look" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售预测  》》查看详细
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<tr>
				<td>预测结果标题：</td>
				<td><input type="text" name="forecastResultTitle_look" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>目标预测时间：</td>
				<td>
				<input type="text" name="forecastMonth_look"  
				 style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>指定预测部门：</td>
				<td><input type="text" name="forecastDepartment_look" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
			    <td>预测结果</td>
				<td><textarea name="forecastText" style="width:350px;height:150px"></textarea></td>
			</tr>
			
		</table>
	</form>
	
	<script type="text/javascript">
	
	function forecast(){
		 $("#tabs").tabs('add',{
		   title:'预测',
		   iconCls:'',
		   closable:true,
		   href:'forecastUpload',
	   })
	}
	
$(function(){
	$('#qhy_markerFore').datagrid({
		title:'销售管理    》 》 销售预测 》》 预测',
		url:'../pageByLikeForecast',
	    pagination : true,
		rownumbers : true,
		pageList : [ 2, 4, 6 ],
		pageSize : 2,
		pageNumber : 1, 
		fit : true,
		toolbar:'#dd_maarket_q,#tb_qhy_date',
		columns:[[{
			field:'forecastId',
			title:'选中框',
			checkbox : true,
		},{
			field:'forecastResultTitle',
			title:'预测标题',
			width : 150,
		},{
			field:'forecastMonth',
			title:'预测时间',
			width : 150,
		},{
			//field:'marketState',
			field:'forecastTypeValue',
			title:'类型',
			width : 150,
		},{
			field:'forecastCreateTime',
			title:'生成时间',
			width : 150,
		},{
			field:'forecastUpdateSname',
			title:'操作人',
			width : 150,
		}]]
	})
	
	$("#fore_qhy_market").dialog({
		title:'销售预测',
		iconCls:'icon-add',
		height:400,
		width:640,
		closed:'true',
		modal:true,
	    buttons:[{
			iconCls:'icon-redo',
			text:'取消',
			handler:function(){
				$('#fore_qhy_market').dialog('close').form('reset')
			}
		}] 
	});
	
	$("#fore_qhy_look").dialog({
		title:'查看详细',
		iconCls:'icon-add',
		height:450,
		url:'../',
		width:740,
		closed:'true',
		modal:true,
	    buttons:[{
			iconCls:'icon-redo',
			text:'取消',
			handler:function(){
				$('#fore_qhy_look').dialog('close').form('reset')
			}
		}] 
	});
	

});
	
	
	manager_tool = {
		//点击预测
		forecast:function(){
			$('#fore_qhy_market').dialog('open');
			//获取类型
			$('#forecastType').combobox({
			    valueField : 'dataId',
				textField : 'dataValue',
				url:'../queryCodeData',
			});
			//获取部门
			$('#forecastDepartment').combobox({
				url : 'http://localhost:8080/CrmSystem/departmentAction/jsonDepartment',
				valueField : 'departmentId',
				textField : 'departmentFallName',
			});
		},
		//点击查看
		market_look:function(){
			//$("#fore_qhy_look").dialog('open')
			var rows = $('#qhy_markerFore').datagrid('getSelections');
			if(rows.length == 0){
				$.messager.alert('警告操作！','请选中一条数据进行查看','warning');
			}else if(rows.length > 1){
				$.messager.alert('警告操作！','只能选中一条记录进行查看','warning');
			}else if(rows.length == 1){
				//console.log(rows)
			    alert(rows[0].forecastId)
				$.ajax({
					url:'../getMarketForById',
					type:'post',
					data:{
						forecastId:rows[0].forecastId
					},
					success:function(result){
						console.log(result)
						if(result){
							$('#fore_qhy_look').form('load',{
								forecastResultTitle_look:result[0].forecastResultTitle,
								forecastMonth_look:result[0].forecastMonth,
								forecastDepartment_look:result[0].departmentName,
								forecastText:result[0].forecastText,
							}).dialog('open')
						}
					}
				})
			}
		},
		//查询
		searchFore:function(){
			alert($('input[name="marketForDate_likeby"]').val());
			$('#qhy_markerFore').datagrid('load',{
				date:$('input[name="marketForDate_likeby"]').val(),
			})
		}
	}
	
	</script>
	
</body>
</html>