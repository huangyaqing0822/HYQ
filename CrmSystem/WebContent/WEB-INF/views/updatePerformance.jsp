<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>绩效修改</title>
</head>
<body>
     <form id="add_qhy_market" style = "padding-left: 100px;padding-top: 20px">
	            销售管理 》》 销售绩效 》》  修改绩效
		<table id="xh_table" style="padding-left: 70px;padding-top: 10px">
			<tr>
				<td>绩效编码：</td>
				<td><input type="text" name="marketName" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>员工姓名：</td>
				<td>
				<input type="text" name="marketDate" id="marketDate" style="height:25px;padding:0 2px;width:250px;" /> 
				*</td>
			</tr>
			<tr>
				<td>所属部门：</td>
				<td><input type="text" name="marketState" value="已创建" disabled="false" style="height:25px;padding:0 2px;width:250px;">*</td>
			</tr>
			<tr>
				<td>绩效等级：</td>
				<td><textarea name="marketContent" id="marketContent" style="width:300px;height:150px"></textarea></td>
			</tr>
			<tr>
			    <td>备注信息：</td>
				<td colspan="2"><input type="submit" value="提交"></td>
			</tr>
			<tr>
			    <td><input type="submit" value="保存"></td>
				<td><input type="button" value="返回"></td>
			</tr>
			
		</table>
	</form>
	
    
</body>
</html>