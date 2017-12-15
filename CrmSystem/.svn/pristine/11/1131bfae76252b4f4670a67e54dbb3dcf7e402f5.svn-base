<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工授权</title>
</head>
<body>
		<fieldset>
			<legend >系统管理>>员工管理>>授权</legend>
			<table align="center">
				<tr>
					<td align="right">员工姓名：</td>
					<td>${staffsAc.staffName}</td>
					<td align="right">所属部门：</td>
					<td>${staffsAc.departmentName}</td>
				</tr>
				<tr>
					<td align="right">最后一次修改时间：</td>
					<td>
						${staffsAc.staffLastUpdateTime}
					</td>
					<td align="right">创建时间：</td>
					<td>
						${staffsAc.staffCreateTiem}
					</td>
				</tr>
				<tr >
					<td align="right" colspan="2">最后一次操作人：${staffsAc.staffUpdateName}</td>
				</tr>
			</table>
			<table id="tab_qyh_role">
			</table>
			<div id="div_idqyh">
				<a href = "#" style="width: 90px;" class = "easyui-linkbutton"
				 iconCls = "icon-no" onclick = "staffAccredit.refresh()">返回</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true"
					onclick="staffAccredit.sacd()" id="accredit">授权</a>
			</div>
		</fieldset>
		
		<script type="text/javascript">
			$(function() {
				var staffId1 = "${staffsAc.staffId}";
				var saf = "${staffsAc.departmentId}";
				$('#tab_qyh_role').datagrid({
					url : 'http://localhost:8080/CrmSystem/roleAction/getListRole1?departmentId='+saf,
					title : "角色管理",
					toolbar : '#div_idqyh',
					pagination : true,//如果为true，则在DataGrid控件底部显示分页工具栏。
					pageSize : 10,//在设置分页属性的时候初始化页面大小
					pageList : [ 10, 20, 40 ],//在设置分页属性的时候 初始化页面大小选择列表。
					pageNumber : 1,//在设置分页属性的时候初始化页码。
					
					height : 500,//高度
					
					columns : [ [ {
						field : 'roleId',
						title : '角色ID',
						width : 100,
						checkbox : true,
					},
					{
						field : 'departmentId',
						hidden:true,
						width : 100,
						checkbox : true,
					}, {
						field : 'roleName',
						title : '角色名称',
						width : 200,
					//checkbox : true,
					}, {
						field : 'departmentName',
						title : '所属部门',
						width : 100
					//宽度
					}, {
						field : 'roleUdatTime',
						title : '最后修改时间',
						width : 200,
						sortable : true
					}, {
						field : 'staffName',
						title : '操作人',
						width : 200
					}, {
						field : 'roleRemark',
						title : '备注说明',
						width : 200,
						sortable : true
					} ] ],
				});
				
				staffAccredit = {
					sacd:function(){
						var strArray = [];
						var jsData = $('#tab_qyh_role').datagrid('getSelections');
						if(jsData.length>0){
							if(confirm("谨慎操作！ 已选择"+jsData.length+"种..是否继续操作")){
								for (var i = 0; i < jsData.length; i++) {
									strArray.push(jsData[i].roleId)
								}
								$.ajax({
									url:'../staffAction/accredit',
									data:{
										staffId:staffId1,
										strArray:strArray.join(","),
									},
									success:function(){
										alert("授权成功！");
										$('#qyh_tab1').datagrid("reload");
										$('#tabs').tabs('close','员工授权');
									}
								})
							}
						}else{
							alert("该操作最低需要选择一项");
						}
						
						
					},
					refresh:function(){
						$('#tabs').tabs('close','员工授权');
					}
				}
			})
		</script>
</body>
</html>