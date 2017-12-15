<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工修改</title>

</head>
<body>
	<form id="registerForm" method="post">
			<fieldset>
				<legend >系统管理>>员工管理>>修改员工信息</legend>
				<table align="center">
					<tr>
						<td align="right">员工编码：</td>
						<td><input type = "text" id = "dnone" value="${staffs.staffId}" style="display: none"><input type = "text" value="${staffs.staffCoding}" readonly="readonly" class="easyui-textbox" id="qyh_staffNum1" name="qyh_staffNum1" /></td>
					</tr>
					<tr>
						<td align="right">员工姓名：</td>
						<td><input type = "text" value="${staffs.staffName}" readonly="readonly"  class="easyui-textbox" id="qyh_staffName3" name="qyh_staffName3" /></td>
					</tr>
					<tr>
						<td align="right">性别：</td>
						<td>
						
						
						
							
								男：<input type="radio" name="staffSex1" value="男" 
								<c:if test="${staffs.staffSex=='男'}">
									checked="checked"
								</c:if>
								> 
								女：<input type="radio" name="staffSex1" value="女"
								<c:if test="${staffs.staffSex!='男'}">
									checked="checked"
								</c:if>
								>
							
							<%-- <c:otherwise>
								男：<input type="radio" name="staffSex1" value="男" > 
								女：<input type="radio" name="staffSex1" value="女">
							</c:otherwise> --%>
						
						</td>
					</tr>
					<tr>
						<td align="right">状态：</td>
						<td>
						
								启用：<input type="radio"  name="staffState1" value="1" 
								<c:if test="${staffs.staffState==1}">
									checked="checked"
								</c:if>
								>
								 禁用：<input type="radio" name="staffState1" value="0"
								 <c:if test="${staffs.staffState!=1}">
									checked="checked"
								</c:if>
								>
						
						 </td>
					</tr>
					<tr>
						<td align="right">所属部门：</td>
						<td><input id="bumen1" editable = "false" name = "bumen1" type = "text" data-options="required:'true'"/></td>
					</tr>
					<tr>
						<td align="right">备注：</td>
						<td>
						<div style ="margin：30px 0;"> </div>
						<input  id="staffRemark1" class ="easyui-textbox" data-options ="multiline:true" 
						value ="${staffs.staffRemark}">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-save" onclick = "staffadd.save1()">保存</a>
							<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-no" onclick = "staffadd.refresh1()">返回</a>
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
		<script type="text/javascript">
			$(function() {
				var street_id = "${staffs.departmentId}";
				var staffId_id = "${staffs.staffId}";
				$('#bumen1').combobox({
				    url:'../departmentAction/jsonDepartment',    
				    valueField:'departmentId',    
				    textField:'departmentFallName'
				});
				$('#bumen1').combobox('select',street_id);
				staffadd={
						save1 : function save() {
							$('#registerForm').form('submit',{
								url:'../staffAction/staffUpdate',
								onSubmit: function(param){ 
									param.staffId = staffId_id;

									param.staffSex = $('[name=staffSex1]').val();
									param.staffState = $('[name=staffState1]').val();
									param.staffRemark = $('#staffRemark1').val();
									param.departmentId = $('#bumen1').val();
									if($(this).form('validate')){
										return true;
									}else{
										alert('请确认填写完整后提交');
										return false;
									}
							    },    
							    success:function(data){  
							    	if(data=="true"){
							    		alert('员工修改成功');
							    		$('#tabs').tabs('close','员工修改');
							    		$('#qyh_tab1').datagrid("reload");
							    	}else{
							    		alert('修改失败未知错误');
							    	}		    	
							    	
							    }   
							})
						},
						refresh1 : function refresh() {
							$('#tabs').tabs('close','员工修改');
						}
				}
			})
		</script>
</body>
</html>