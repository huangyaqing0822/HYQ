<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告管理</title>

<script type="text/javascript">

</script>
<style type="text/css">
			.dialog-button{
				text-align: center;
			}
			.textbox{
				height: 22px;
				padding: 0 2px;
			}
		</style>
</head>
<body>
    <table id="tab_notice">
   
    </table>
    <div id="div_noticeIdd">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick = "index_notice.add()">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick = "index_notice.updat()">修改</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick = "index_notice.del()">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick = "index_notice.raod()" id = "savedd">刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick = "index_notice.sedd()" id = "redoee">取消选择</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick = "index_notice.queryss()" id = "querys">查看</a>
    </div>
    <div id="divnocticeManager" >
		标题查询：<input type="text" class="easyui-textbox"  id="noticds" name="noticds"  />
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" id="noticeSeach">查询</a>
 	</div>
 	<form id="notice_lhx_endit" style="margin: 0; padding: 5px 0 0 24px; color: #333;">
 		<table>
 			<tr><td></td>
 				<td><input type="hidden" id="noticeId" disabled="false" name="noticeId" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告编码:</td>
 				<td><input type="text" id="noticeConding_updat" disabled="false" name="noticeConding_updat" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告标题:</td>
 				<td><input type="text" id="noticeTitle_updat" name="noticeTitle_updat" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告类型:</td>
 				<td><input id="noticeGenreId_updat"   name = "noticeGenreId_updat" style="width: 170px;" editable = "false" data-options="required:'true'" type = "text" class="easyui-textbox"  /></td>
 			</tr>
 			<tr>
 				<td>发布人:</td>
 				<td><input type="text" id="staffName_updat" disabled="false" name="staffName_updat" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告内容:</td>
 				<td><textarea id="noticeContent_updat" editable="false"
						data-options="validType:'integer',required:'true'"
						name="noticeContent_updat" class="textbox" rows="7" /></td>
 			</tr>
 		</table>
 	</form>
 	
 	<form id="notice_lhx_adds" style="margin: 0; padding: 5px 0 0 24px; color: #333;">
 		<table>
 			<tr>
 				<td>公告标题:</td>
 				<td><input type="text" id="noticeTitle_add" name="noticeTitle_add" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告类型:</td>
 				<td><input id="genre_add"   name = "genre_add" style="width: 170px;" editable = "false" data-options="required:'true'" type = "text" class="easyui-textbox"  /></td>
 			</tr>
 			
 			<tr>
				<td>公告内容:</td>
				<td><textarea id="noticeContent" editable="false"
						data-options="validType:'integer',required:'true'"
						name="noticeContent" class="textbox" rows="7" /></td>
			</tr>
 		</table>
 	</form>	
 	
 	 <form id="notice_lhx_query" style="margin: 0; padding: 5px 0 0 24px; color: #333;">
 		<table>
 			<tr>
 				<td></td>
 				<td><input type="hidden" id="noticeIds" disabled="false" name="noticeId_query" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告编码:</td>
 				<td><input type="text" id="noticeConding_query" disabled="false" name="noticeConding_query" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>公告标题:</td>
 				<td><input type="text" id="noticeTitle_query" disabled="false" name="noticeTitle_query" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
 				<td>发布人:</td>
 				<td><input type="text" id="staffName_query" disabled="false" name="staffName_query" data-options = "validType:'CHS',required:'true'" class = "textbox" style="height: 23px;"></td>
 			</tr>
 			<tr>
				<td>公告内容:</td>
				<td><textarea id="noticeContent_query" editable="false" disabled="false"
						data-options="validType:'integer',required:'true'"
						name="noticeContent_query" class="textbox" rows="7" /></td>
			</tr>
 		</table>
 	</form>
    
    <script type="text/javascript">
      $(function(){
    	  $.extend($.fn.validatebox.defaults.rules, {
  			 integer : {// 验证整数  
                  validator : function(value) {  
                      return /^[+]?[1-9]+\d*$/i.test(value);  
                  },  
                  message : '请输入整数'  
              }, 
              CHS:{  //验证只能输入中文
			        validator: function (value) {  
			            return /^[\u0391-\uFFE5]+$/.test(value);  
			        },  
			        message: '只能输入汉字'  
			    },	
			   english : {// 验证英语  
	                message : '请输入英文'  
	            },  
  		});
    	  $('input[name="noticeTitle_add"]').validatebox({
				required:true,
				 CHS:{  //验证只能输入中文
				        validator: function (value) {  
				            return /^[\u0391-\uFFE5]+$/.test(value);  
				        },  
				        message: '只能输入汉字'  
				    },	
			});
    	  $('input[name="noticeConding_updat"]').validatebox({
				required:true,
				 CHS:{  //验证只能输入中文
				        validator: function (value) {  
				            return /^[\u0391-\uFFE5]+$/.test(value);  
				        },  
				        message: '只能输入汉字'  
				    },	
			});
    	  $('input[name="noticeTitle_updat"]').validatebox({
				required:true,
				 CHS:{  //验证只能输入中文
				        validator: function (value) {  
				            return /^[\u0391-\uFFE5]+$/.test(value);  
				        },  
				        message: '只能输入汉字'  
				    },	
			});
    	  
    	  $('input[name="updat_tuiyaoJG"]').validatebox({
				required:true,
				 integer : {// 验证整数  
		                validator : function(value) {  
		                    return /^[+]?[1-9]+\d*$/i.test(value);  
		                },  
		                message : '请输入整数'  
		            },  
			});
   
    	
    
         $('#tab_notice').datagrid({
                    url:'http://localhost:8080/CrmSystem/noticeAction/getlistNotise',
					title:"公告管理",
					toolbar:'#div_noticeIdd,#divnocticeManager',
					fitColumns : true,//使列自动展开/收缩到合适的DataGrid宽度。
					striped : true,//是否显示斑马线效果。
					rownumbers:true,//如果为true，则显示一个行号列。
					border : false,//是否有边框
					pagination : true,//如果为true，则在DataGrid控件底部显示分页工具栏。
  					pageSize : 3,//在设置分页属性的时候初始化页面大小
  					pageList : [ 3, 6, 9 ],//在设置分页属性的时候 初始化页面大小选择列表。
  					pageNumber : 1,//在设置分页属性的时候初始化页码。
  					sortName:"tuihuoDate",
					sortOrder:"ASC",
  					height:600,//高度
					columns:[[
					  {
						field:'noticeId',
						title:'公告ID',
						width:100,
						checkbox : true,
					   },
					   {
						field:'noticeTitle',
						title:'标题',
						width:100,
						//checkbox : true,
					   }, 
						{
							field:'noticeReleaseDate',
							title:'发布时间',
							width:100//宽度
						},{
							field:'staffName',
							title:'发布人',
							width:100,
							/* sortable:true *//* 排序 */
						},{
							field:'noticeContent',
							title:'内容',
							width:100
						}
					]],
          });
         //增加
         $("#notice_lhx_adds").dialog({
        	width:300,
			height:250,
			title:"增加公告信息",
			modal:true,
			closed:true,
			buttons:[{
				text:"提交",
				iconCls:"icon-add",
				handler:function(){
					if($("#notice_lhx_adds").form("validate")){
						$.ajax({
							url:"http://localhost:8080/CrmSystem/noticeAction/insertNotices",
							type:"post",
							data:{
								noticeTitle:$("#noticeTitle_add").val(),
								noticeGenreId:$("#genre_add").val(),
								noticeContent:$("#noticeContent").val(),
							},
							beforeSend:function(){
								$.messager.progress({
									text:"正在新增中。。。。",
								});
							},
							success:function(data,response,status){
								$.messager.progress("close");
								 if (data=="true"){
									 $.messager.show({
											title:'提示',
											msg:'公告信息增加成功',
											timeout:5000,
											showType:'slide'
										});
									 $("#notice_lhx_adds").dialog("close").form("reset");
									$("#tab_notice").datagrid("reload");
								}else{
									$.messager.alert("添加失败","未知名的错误","warning");
								};
								
							},
						})
					}
				}
			},{
				text:"取消",
				iconCls:"icon-redo",
				handler:function(){
					$("#notice_lhx_adds").dialog("close").form("reset");
				},
			}]
         })
         //修改
         $("#notice_lhx_endit").dialog({
        	width:300,
			height:250,
			title:"修改公告信息",
			modal:true,
			closed:true,
			buttons:[{
				text:"提交",
				iconCls:"icon-add",
				handler:function(){
					if($("#notice_lhx_endit").form("validate")){
						$.ajax({
							url:"http://localhost:8080/CrmSystem/noticeAction/updatNotices",
							type:"post",
							data:{
								noticeId:$("#noticeId").val(),
								noticeGenreId:$("#noticeGenreId_updat").val(),
								noticeTitle:$("#noticeTitle_updat").val(),
								noticeContent:$("#noticeContent_updat").val(),
							},
							
							beforeSend:function(){
								$.messager.progress({
									text:"正在修改中。。。。",
								});
							},
							success:function(data,response,status){
								$.messager.progress("close");
								 if (data=="true"){
									 $.messager.show({
											title:'提示',
											msg:'修改成功',
											timeout:5000,
											showType:'slide'
										});
									 $("#notice_lhx_endit").dialog("close").form("reset");
										$("#tab_notice").datagrid("reload");
								}else{
									$.messager.alert("修改失败","未知名的错误","warning");
								};
								
							},
						})
					}
				}
			},{
				text:"取消",
				iconCls:"icon-redo",
				handler:function(){
					$("#notice_lhx_endit").dialog("close").form("reset");
				},
			}]
         })
        /*  查看 */
        $("#notice_lhx_query").dialog({
        	width:300,
			height:250,
			title:"查看公告信息",
			 modal:true,
			closed:true, 
			
        })
         
         index_notice={
        	del:function(){
        		var rows =$("#tab_notice").datagrid("getSelections");
        		if (rows.length>0){
        			$.messager.confirm("确认要删除?","你真的要删除吗？",function(flag){
        				if (flag){
        					$.ajax({
        						url:"http://localhost:8080/CrmSystem/noticeAction/deleteNotis",
        						type:"post",
        					 	data:{
        					 		noticeId:rows[0].noticeId,
        						},
        						success:function(result){
										if (result=="true"){
											$.messager.show({
												title:"刪除成功"
											});
											$("#tab_notice").datagrid("reload");
										}
									}
        					})
        				}
        			});
        		}else{
        			$.messager.alert("警告","至少要选择一条记录删除","warning");
        		}
        	},
        	//修改
        	updat:function(){
        		var rows =$("#tab_notice").datagrid("getSelections");
        		if (rows.length>1){
        			$.messager.alert("警告操作","编辑记录只能选定一条数据","warning");
        		}else if (rows.length==1){
        			
        			$.ajax({
        				url:"http://localhost:8080/CrmSystem/noticeAction/getListOne",
        				data:{
        					noticeId:rows[0].noticeId,
        				},
        				type:"post",
        				success:function(result){
							if (result){
								$("#notice_lhx_endit").form("load",{
									noticeId:result[0].noticeId,//公告ID
									noticeConding_updat:result[0].noticeConding,//公告编码
									noticeTitle_updat:result[0].noticeTitle,//公告标题
									noticeGenreId_updat:result[0].noticeGenreId,//
									staffName_updat:result[0].staffName,//
									noticeContent_updat:result[0].noticeContent,
								}).dialog("open");
							}
						},
        			})
        		}else if (rows.length==0){
        			$.messager.alert("警告操作","编辑记录至少要选定一条数据","warning");
        		};
        	},
        	add:function(){
        		 $("#notice_lhx_adds").dialog("open");
				$('input[name="noticeTitle_add"]').focus(); 
        	},
        	raod:function(){
        		$('#tab_notice').datagrid('reload');
        	},
        	sedd:function(){
        		$('#tab_notice').datagrid('unselectAll');
        	},
        	queryss:function(){
        		var rows =$("#tab_notice").datagrid("getSelections");
        		if (rows.length>1){
        			$.messager.alert("警告操作","编辑记录只能选定一条数据","warning");
        		}else if (rows.length==1){
        			
        			$.ajax({
        				url:"http://localhost:8080/CrmSystem/noticeAction/getListOne",
        				data:{
        					noticeId:rows[0].noticeId,
        				},
        				type:"post",
        				success:function(result){
							if (result){
								$("#notice_lhx_query").form("load",{
									noticeIds:result[0].noticeId,//公告ID
									noticeConding_query:result[0].noticeConding,//公告编码
									noticeTitle_query:result[0].noticeTitle,//公告标题
									noticeGenreId_query:result[0].noticeGenreId,//
									staffName_query:result[0].staffName,//
									noticeContent_query:result[0].noticeContent,
								}).dialog("open");
							}
						},
        			})
        		}else if (rows.length==0){
        			$.messager.alert("警告操作","编辑记录至少要选定一条数据","warning");
        		};
        	},
         }
        $('#noticeGenreId_updat').combobox({  
 		    url:'../DataDictionaryAction/queryData?dataCode=notice_type',
 			valueField:'dataId',
	  		textField:'dataValue',
	  		limitToList:'true',
	  		panelHeight:'100px'
 		}); 
        $('#genre_add').combobox({  
  		    url:'../DataDictionaryAction/queryData?dataCode=notice_type',
	  		valueField:'dataId',
	  		textField:'dataValue',
	  		limitToList:'true',
	  		panelHeight:'100px'
  		});
        $('#genre_query').combobox({  
  		    url:'../DataDictionaryAction/queryData?dataCode=notice_type',
	  		valueField:'dataId',
	  		textField:'dataValue',
	  		limitToList:'true',
	  		panelHeight:'100px'
  		});
          
        
      });
      
 	  $("#noticeSeach").click(function(){
 		 $("#tab_notice").datagrid("load",{
 			noticeTitle:$("#noticds").val(),
		});   
 }) 
    </script>
</body>
</html>