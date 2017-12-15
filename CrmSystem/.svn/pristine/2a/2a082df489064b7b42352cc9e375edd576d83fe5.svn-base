<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.form.js"></script>
</head>
<body>

<!-- 在哪里哦，我没仔细看  我放jar包了 你们导js怎么导的 -->
   <form id="add_qhy_compete" enctype="multipart/form-data" action="../addCompete" method="post"
    style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 竞争管理 》》  添加竞争分析记录
	            
	    ${message }
		<table id="xh_table" style="padding-left: 70px;padding-top: 50px">
			<tr>
				<td>分析结果标题：</td>
				<td>
				<input type="text" name="competTitle" style="height:25px;padding:0 2px;width:240px;" /> 
				*</td>
			</tr>
			<tr>
				<td>分析时间：</td>
				<td><input type="text" class="easyui-datebox" editable="false" name="competCreateTime" checked="checked" style="height:25px;padding:0 2px;width:250px;">
			</tr>
			<tr>
				<td>分析类型：</td>
				<td><input type="text" name="typeValue" id="typeValue" editable="false" 
				style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>状态：</td>
				<td><input type="text" name="competState" disabled="false" id="competState"
				 value="未归档" style="height:25px;padding:0 2px;width:245px;">*</td>
			</tr>
			<tr>
			    <td>导入数据</td>
				<td><input type="file" name="file" value="导入"/><span style="font-size:6px;color:#c6c1bb">选择要上传的文件类型必须为.text文件</span></td>
			</tr> 
			<tr>
			    <td> </td>
				<td> </td>
			</tr>
			<tr>
			    <td></td>
				<td><input type="button" id="addCom" value="提交"/></td>
			</tr>
		</table>
	</form>
	
	<script type="text/javascript">
	
	    $(function(){
	    	 //获取分析类型
			 $('#typeValue').combobox({
			    valueField : 'dataId',
				textField : 'dataValue',
				url:'../queryTypeCompete',
		 	});
			//获取状态
			 /* $('#competStateValue').combobox({
			    valueField : 'dataId',
				textField : 'dataValue',
				url:'../queryStateCompete',
		 	}); */
		 	$("#addCom").click(function(){
		 		 $("#add_qhy_compete").ajaxSubmit(function(result){
		    		    //alert(result+"111111111")
				 		if(result == "true"){
				 			 $.messager.confirm('提示操作','竞争分析记录新增成功','warning');
				 			 $("#tabs").tabs('close','竞争分析记录增加');
				 			 /* var sss = $('#tabs').tabs('getSelected')
				 			 sss.panel('refesh','salesPlaning'); */
				 		}
				 	})
		 	})
		 	
	    })   
	  
	    
	</script>

</body>
</html>