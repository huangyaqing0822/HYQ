<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同管理</title>

</head>
<body>
	<form id="registerForm" method="post">
			<fieldset>
				<legend >合同管理>>合同管理</legend>
				<table align="center">
					<tr>
						<td align="left">合同名称：</td>
						<td> ${vct.parm1} </td>
						<td align="left">合同类型：</td>
						<td> ${vct.parm2} </td>
					</tr>
					<tr>
						<td align="left">合同金额：</td>
						<td> ${vct.parm9} </td>
						<td align="left">合同状态：</td>
						<td> ${vct.parm3} </td>
					</tr>
					<tr>
						<td align="left">客户方：</td>
						<td> ${vct.parm11} </td>
						<td align="left">经营许可证：</td>
						<td> ${vct.parm12} </td>
					</tr>
					<tr>
						<td align="left">创建人：</td>
						<td> ${vct.parm6} </td>
						<td align="left">创建时间：</td>
						<td> ${vct.parm4} </td>
					</tr>
					<tr>
						<td align="left" colspan="2">待处理人：</td>
						<td colspan="2">${vct.parm8}</td>
					</tr>
					<tr>
						<td align="left" colspan="2">合同内容：</td>
						<td colspan="2">${vct.parm12}</td>
					</tr>
					<tr>
						<td align="left" colspan="2"><hr/></td>
						<td colspan="2"><hr/></td>
					</tr>
					<tr>
						<td align="left" colspan="2">执行操作：</td>
						<td colspan="2">
						 <input id="conType" class="easyui-combobox" 
			data-options="url:'http://localhost:8080/CrmSystem/contract/contractStatr',valueField: 'id',
		textField: 'value'" />
						</td>
					</tr>
					
					<tr>
						<td align="left" colspan="2">操作原因：</td>
						<td colspan="2">
							<div style ="margin：30px 0;"> </div>
							<input  id="conContext" class ="easyui-textbox" data-options ="multiline:true" 
							>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<a href = "#" style="width: 90px;" 
							class = "easyui-linkbutton" 
							iconCls = "icon-no" onclick = "contract.refresh()">返回</a>
							<a href = "#" style="width: 90px;" 
							class = "easyui-linkbutton" 
							iconCls = "icon-save" onclick = "contract.save()">保存</a>
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
		<script type="text/javascript">
			$(function() {
				
				contract = {
					refresh:function refresh(){
						$("#tabs").tabs("close","合同具体操作");
					},
					save:function save(){
						var parm14= "${vct.parm14}";
						var conContext = $('#conContext').val();
						var conType = $("#conType").val();
						console.log(parm14);
						console.log(conContext);
						console.log(conType);
						
						$.ajax({
							url:'../contract/contractSave',
							data:{
								parm14 : parm14,
								conContext : conContext,
								conType : conType
							},
							success:function(data){
								alert("变更成功"+data);
								$('#contractqyh').datagrid("reload");
								$("#tabs").tabs("close","合同具体操作");
							}
						})
						
					}
				}
				
			})
		</script>
</body>
</html>