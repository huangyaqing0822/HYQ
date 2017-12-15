<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.form.js"></script>
</head>
<body>

   <form id="fore_qhy_market" action="../forecastPost" method="post" enctype="multipart/form-data" 
   style = "padding-left: 100px;padding-top: 20px" commandName="marketForecast">
	            销售管理 》》 销售预测  》》 预测
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
		${message }
			<tr>
				<td>预测结果标题：</td>
				<td><input type="text" name="forecastResultTitle" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>目标预测时间：</td>
				<td>
				<input type="text" name="forecastMonth" id="forecastMonth" class="easyui-datebox"
				 style="height:25px;padding:0 2px;width:250px;" editable="false"/> 
				*</td>
			</tr>
			<tr>
				<td>指定预测部门:</td>
				<td><input id="departmentId" name="departmentId" style="height:25px;padding:0 2px;width:120px;"
					editable="false" data-options="required:'true'" type="text"
					class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td>预测类型:</td>
				<td><input id="forecastType" name="forecastType" style="height:25px;padding:0 2px;width:120px;"
					editable="false" data-options="required:'true'" type="text" 
					class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td>部门规模：</td>
				<td><input type="text" name="fc_departmentBig" style="height:25px;padding:0 2px;width:120px;">人</td>
			</tr>
			<tr>
				<td>部门数量：</td>
				<td><input type="text" name="fc_departmentCount" style="height:25px;padding:0 2px;width:120px;">人</td>
			</tr>
			<tr>
			    <td>导入数据</td>
				<td><input type="file" name="file" value="导入"/><span style="font-size:6px;color:#c6c1bb">选择要上传的文件类型必须为.text文件</span></td>
			</tr>
			<tr>
			    <td></td>
				<td><input type="button" value="提交" id="addForeact"/></td>
			</tr>
			
		</table>
	</form>
	
	<script type="text/javascript">
	 
	   $(function(){
		    //获取类型
			$('#forecastType').combobox({
			    valueField : 'dataId',
				textField : 'dataValue',
				url:'../queryCodeData',
			});
			//获取部门
			$('#departmentId').combobox({
				url : 'http://localhost:8080/CrmSystem/departmentAction/jsonDepartment',
				valueField : 'departmentId',
				textField : 'departmentFallName',
			});
			
			$("#addForeact").click(function(){
		 		 $("#fore_qhy_market").ajaxSubmit(function(result){
		    		   // alert(result)
				 		if(result == "true"){
				 			 $.messager.confirm('提示操作','预测记录新增成功','warning');
				 			 $("#tabs").tabs('close','预测');
				 			/*  var sss = $('#tabs').tabs('getSelected')
				 			 sss.panel('refesh','salesPlaning'); */
				 		}
				 	})
		 	})
		 	
	   })
	   
	</script>

</body>
</html>