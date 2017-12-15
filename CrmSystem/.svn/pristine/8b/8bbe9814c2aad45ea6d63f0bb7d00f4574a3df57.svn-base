
	$("#love").datagrid({
		url:"../clientManagementAction/queryLovingById", 
		height:500,
		fitColumns:true,
		striped:true,
		rownumbers:true,
		border:false,
		pagination:true,
		
		// 分页
		pageSize:10,
		pageList:[10,20,30,40],
		pageNumber:1,
		toolbar:"manager_tool",
		sortName:"date",
		sortOrder:"desc",
		
		columns:[[
		   {
				field:"clientId",
				title:"客户ID",
				width:100,
				checkbox:true,	 
			},
			{
				field:"clientName",
				title:"客户姓名",
				width:100,
			},
			{
				field:"clientSex",
				title:"客户性别",
				width:100,
			},
			{
				field:"clientType",
				title:"客户类型",
				width:100,					 
			},
			{
				field:"clientLv",
				title:"价值等级",
				width:100,					 
			},
			{
				field:"csZtdegree",
				title:"满意度",
				width:100,					 
			},
			{
				field:"clReputationrank",
				title:"信誉等级",
				width:100,					 
			},
			{
				field:"clLoveproject",
				title:"建议关怀方案",
				width:100,					 
			},
		]],
	});		
	
	$(function(){
		
		manager_tool = {	
				//模糊查询
				search:function(){
					$('#love').datagrid('load',{
						likeName: $("input[name='lovelikeName']").val(),
					});
				},
							
			};
	})
	
	

//设置提醒
function tiXing(){
	
	var rows = $("#love").datagrid("getSelections");
	if(rows.length == 1){
		$.messager.confirm("确定操作","您确定要选择所选的记录吗？",function(flag){
			if(flag){
				console.log(rows);				
				$.ajax({
					type:"post",
					url:"../clientManagementAction/updateLovingPost",
					data:{
						clientId:rows[0].clentId
					},
					  
					success:function(result){
						 if(result == "true"){		
	
							// 页面跳转,增加一个tab
							if ($("#tabs").tabs("exists", "设置提醒")) {
								$("#tabs").tabs("select", "设置提醒");
							} else {
								$("#tabs").tabs("add", {
									title : "设置提醒",
									closable : true,
									href : "loveRemind",  // jsp页面
								});
							}
						} 
					},
				});
				
				
			}
		});
	}else{
		$.messager.alert("提示","请选择要删除的记录","info");
	}	
};

// 关怀详情
function xiangQing(){		
	
	var rows = $("#love").datagrid("getSelections");
	if(rows.length == 1){
		$.messager.confirm("确定操作","您确定要选择所选的记录吗？",function(flag){
			if(flag){
				console.log(rows);				
				$.ajax({
					type:"post",
					url:"../clientManagementAction/updateLovingPost",
					data:{
						clientId:rows[0].clentId
					},
					  
					success:function(result){
						 if(result == "true"){		
	
							// 页面跳转,增加一个tab
								if ($("#tabs").tabs("exists", "关怀详细")) {
									$("#tabs").tabs("select", "关怀详情");
								} else {
									$("#tabs").tabs("add", {
										title : "关怀详情",
										closable : true,
										href : "loveDetails",  // jsp页面
									});
								}
						} 
					},
				});
				
				
			}
		});
	}else{
		$.messager.alert("提示","请选择要删除的记录","info");
	}
};


