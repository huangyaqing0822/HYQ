<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工增加</title>

</head>
<body>
	<form id="registerForm" method="post">
			<fieldset>
				<legend >系统管理>>员工管理>>增加员工信息</legend>
				<table align="center">
					<tr>
						<td align="right">员工姓名：</td>
						<td><input type = "text" data-options="required:'true'" class="easyui-textbox" id="qyh_staffName2" name="qyh_staffName2" /></td>
					</tr>
					<tr>
						<td align="right">性别：</td>
						<td>男：<input type="radio" name="staffSex" value="男" checked="checked"> 女：<input type="radio" name="staffSex" value="女"></td>
					</tr>
					<tr>
						<td align="right">状态：</td>
						<td>启用：<input type="radio" name="staffState" value="1" checked="checked"> 禁用：<input type="radio" name="staffState" value="0"></td>
					</tr>
					<tr>
						<td align="right">所属部门：</td>
						<td><input id="bumen" editable = "false" name = "bumen" type = "text" data-options="required:'true'"/></td>
					</tr>
					
					<tr>
						<td align="right">备注：</td>
						<td>
						<div style ="margin：30px 0;"> </div>
						<input id="staffRemark" class ="easyui-textbox" data-options ="multiline:true" 
						value ="">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-save" onclick = "staffadd.save()">保存</a>
							<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-no" onclick = "staffadd.refresh()">返回</a>
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
		<script type="text/javascript">
			$(function() {
				$('#bumen').combobox({
				    url:'../departmentAction/jsonDepartment',    
				    valueField:'departmentId',    
				    textField:'departmentFallName'
				});
				staffadd={
					save : function save() {
						$('#registerForm').form('submit',{
							url:'../staffAction/staffAdd',
							onSubmit: function(param){ 
								var sex = $('[name=staffSex]').val();
								param.staffName = $('#qyh_staffName2').val();
								param.staffState = $('[name=staffState]').val();
								param.staffRemark = $('#staffRemark').val();
								param.departmentId = $('#bumen').val();
								if($(this).form('validate')){
									return true;
								}else{
									alert('请确认填写完整后提交');
									return false;
								}
						    },    
						    success:function(data){  
						    	if(data=="true"){
						    		alert('增加成功');
						    		$('#qyh_tab1').datagrid("reload");
						    		$('#tabs').tabs('close','员工增加');
						    	}else{
						    		alert('增加失败未知错误');
						    	}		    	
						    	
						    }   
						})
					},
					refresh : function refresh() {
						$('#tabs').tabs('close','员工增加');
					}
				}
			})
		</script>
</body>
</html>