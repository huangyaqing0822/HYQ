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
				<legend >系统管理>>员工管理>>查看员工信息</legend>
				<table align="center">
					<tr>
						<td align="right">员工工号：</td>
						<td>${staffsb.staffCoding}</td>
					</tr>
					<tr>
						<td align="right">员工姓名：</td>
						<td>${staffsb.staffName}</td>
					</tr>
					<tr>
						<td align="right">性别：</td>
						<td>${staffsb.staffSex}</td>
					</tr>
					<tr>
						<td align="right">状态：</td>
						<td>${staffsb.staffStateName}</td>
					</tr>
					<tr>
						<td align="right">所属部门：</td>
						<td>${staffsb.departmentName}</td>
					</tr>
					
					<tr>
						<td align="right">备注：</td>
						<td>
							${staffsb.staffRemark}
						</td>
					</tr>
					<tr>
						<td align="right">最后一次修改时间：</td>
						<td>
							${staffsb.staffLastUpdateTime}
						</td>
					</tr>
					<tr>
						<td align="right">创建时间：</td>
						<td>
							${staffsb.staffCreateTiem}
						</td>
					</tr>
					<tr>
						<td align="right">最后一次操作人：</td>
						<td>
							${staffsb.staffUpdateName}
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-no" onclick = "staffadd.refresh()">返回</a>
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
		<script type="text/javascript">
			$(function() {
				staffadd={
					refresh : function refresh() {
						$('#tabs').tabs('close','查看详细信息');
					}
				}
			})
		</script>
</body>
</html>