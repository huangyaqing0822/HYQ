<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工控制类</title>

</head>
<body>
	<table id = "qyh_tab1"></table>
	<div id="search">
		员工姓名：<input type="text" class="textbox" name="qyh_staffName1" style="width:130px;height:21px"/><a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-search" onclick = "staffManger_qyh.search()">查询</a>
		<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-add" onclick = "staffManger_qyh.add()">添加</a>
		<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-edit" onclick = "staffManger_qyh.update()">修改</a>
		<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-remove" onclick = "staffManger_qyh.del()">删除</a>
		<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-edit" onclick = "staffManger_qyh.searchStaff()">查看</a>
		<a href = "#" style="width: 90px;" class = "easyui-linkbutton" iconCls = "icon-back" onclick = "staffManger_qyh.accredit()">授权</a>
	</div>
	<script type="text/javascript">
		$(function() {
			$('#qyh_tab1').datagrid({
				url:"../staffAction/staffmanager",		
				toolbar:'#search',//引入
				title:'员工管理',
				striped:true,
				rownumbers:true,
				fit:true,
				columns:[[    
				   {field:'staffId',title:'销售',width:40,
					   formatter: function(value, rowData, rowIndex){
			                return '<input type="radio" name="selectRadio" id="selectRadio"' + rowIndex + '    value="'+rowData.staffId+'" />';
			           }
				   },
			       {field:'staffName',title:'员工姓名',width:80},
			       {field:'staffSex',title:'性别',width:80},
			       {field:'staffStateName',title:'状态',width:80},
			       {field:'departmentName',title:'所属部门',width:100},
			       {field:'roleName',title:'所属角色',width:90},
			       {field:'staffLastUpdateTime',title:'最后一次修改时间',width:150},
			       {field:'staffUpdateName',title:'操作人',width:150}
			    ]],
			    pagination:true,
			    pageSize : 8,
			    pageList : [ 8, 16, 32 ],
			    pageNumber : 1,
			    pagePosition : 'bottom',
			    checkOnSelect:false,
			    singleSelect:true,
			    onLoadSuccess: function(data){
		            if (data.rows.length > 0) {
		                for (var i = 0; i < data.rows.length; i++) {
		                    if (data.rows[i].operate == "false") {
		                        $("input[type='radio']")[i].disabled = true;
		                    }
		                }
		            }
		        },
		        onClickRow: function(rowIndex, rowData){
		            var radio = $("input[type='radio']")[rowIndex].disabled;
		            if (radio!= true) {
		                $("input[type='radio']")[rowIndex].checked = true;
		            }
		            else {
		                $("input[type='radio']")[rowIndex].checked = false;
		            }
		        }
			})
			
		})
		staffManger_qyh={
			search:function(){
				$('#qyh_tab1').datagrid('load',{
					staffName:$('[name="qyh_staffName1"]').val()
				});
			},
			add:function(){
				
				if ($('#tabs').tabs('exists',"员工增加")) {
					$('#tabs').tabs('close','员工增加');
					$('#tabs').tabs('add', {
						title : "员工增加",
						iconCls : "",
						closable : true,
						href : "staffadd"
					})
				} else {
					 $('#tabs').tabs('add', {
							title : "员工增加",
							iconCls : "",
							closable : true,
							href : "staffadd"
					})
				}
				
			},
			update:function(){
				/* var staffId= $('[name=selectRadio]').val();
				console.log(staffId); */
				var getSelec = $('#qyh_tab1').datagrid('getSelected');
				console.log(getSelec);
				if(getSelec!=null){
					if ($('#tabs').tabs('exists',"员工修改")) {
						$('#tabs').tabs('close','员工修改');
						$('#tabs').tabs('add', {
							title : "员工修改",
							iconCls : "",
							closable : true,
							href : "../staffAction/sendStaffUpdate?staffId="+getSelec.staffId
						})
					} else {
						$('#tabs').tabs('add', {
							title : "员工修改",
							iconCls : "",
							closable : true,
							href : "../staffAction/sendStaffUpdate?staffId="+getSelec.staffId
						})
					}
				}else{
					alert('请选择一行后修改');
				}
				
			},
			searchStaff:function(){
				var getSelec = $('#qyh_tab1').datagrid('getSelected');
				if(getSelec!=null){
					if ($('#tabs').tabs('exists',"查看详细信息")) {
						$('#tabs').tabs('close','查看详细信息');
						$('#tabs').tabs('add', {
							title : "查看详细信息",
							iconCls : "",
							closable : true,
							href : "../staffAction/selectStaff?staffId="+getSelec.staffId
						})
					} else {
						$('#tabs').tabs('add', {
							title : "查看详细信息",
							iconCls : "",
							closable : true,
							href : "../staffAction/selectStaff?staffId="+getSelec.staffId
						})
					}
				}else{
					alert('请选择一行后查看');
				}
			},
			del:function(){
				var getSelec = $('#qyh_tab1').datagrid('getSelected');
				if(getSelec!=null){
					if(confirm("警告！危险操作，你确认要删除吗？")){
						$.ajax({
							async:false,
							url:'../staffAction/staffDel?staffId='+getSelec.staffId
						})
						$('#qyh_tab1').datagrid("reload");
					}
				}else{
					alert('请选择一行后删除');
				}
			},
			accredit:function(){
				var getSelec = $('#qyh_tab1').datagrid('getSelected');
				if(getSelec!=null){
					if ($('#tabs').tabs('exists',"员工授权")) {
						$('#tabs').tabs('close','员工授权');
						$('#tabs').tabs('add', {
							title : "员工授权",
							iconCls : "",
							closable : true,
							href : "../staffAction/sendStaffAccredit?staffId="+getSelec.staffId
						})
					} else {
						$('#tabs').tabs('add', {
							title : "员工授权",
							iconCls : "",
							closable : true,
							href : "../staffAction/sendStaffAccredit?staffId="+getSelec.staffId
						})
					}
				}else{
					alert('请选择一行后操作');
				}
			}
		}
	</script>
</body>
</html>






