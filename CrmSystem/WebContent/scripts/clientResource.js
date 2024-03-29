$(function() {
	$("#resource").datagrid({
		url : "../clientManagementAction/queryPostById",
		height : 520,
		fitColumns : true,
		striped : true,
		rownumbers : true,
		border : false,
		pagination : true,

		// 分页
		pageSize :10,
		pageList : [10, 20, 30, 40 ],
		pageNumber : 1,
		toolbar : "manager_tool",
		sortName : "date",
		sortOrder : "desc",

		columns : [ [ {
			field : "clientId",
			title : "自动编号",
			width : 100,
			checkbox : true,
		}, {
			field : "clientName",
			title : "客户姓名",
			width : 100,
		}, {
			field : "clientSex",
			title : "客户性别",
			width : 100,
		}, {
			field : "clientType",
			title : "客户类型",
			width : 100,
		}, {
			field : "clientState",
			title : "状态",
			width : 100,
		}, {
			field : "clientAssignstate",
			title : "分配状态",
			width : 100,
		},{
			field : "clientCreateTime",
			title : "录入时间",
			width : 100,
		}, {
			field : "clientSid",
			title : "录入人",
			width : 100,
		}, ] ],
	});

	// 添加框
	$("#manager_add")
			.dialog(
					{
						width : 600,
						height : 450,
						title : "添加客户资源",
						modal : true,
						closed : true,
						buttons : [
								{
									text : "保存",
									iconCls : "icon-add",
									handler : function() {
										if ($("#manager_add").form("validate")) {
											$
													.ajax({
														url : "../clientManagementAction/addPost",
														type : "post",
														data : {
															"clientCoding" : $(
																	"input[name='clientCoding']")
																	.val(),
															"clientName" : $(
																	"input[name='clientName']")
																	.val(),
															"clientSex" : $(
																	"input[name='clientSex']")
																	.val(),
															"clientBirthday" : $(
																	"input[name='clientBirthday']")
																	.val(),
															"clientType" : $(
																	"#clientType")
																	.val(),
															"clientState" : $(
																	"#clientState")
																	.val(),
															"clientPhone" : $(
																	"input[name='clientPhone']")
																	.val(),
															"clientWorkphone" : $(
																	"input[name='clientWorkphone']")
																	.val(),
															"clientEmail" : $(
																	"input[name='clientEmail']")
																	.val(),
															"clientHomephone" : $(
																	"input[name='clientHomephone']")
																	.val(),
															"clientAddress" : $(
																	"input[name='clientAddress']")
																	.val(),
															"clientRemark" : $(
																	"input[name='clientRemark']")
																	.val(),
														},
														beforeSend : function() {
															$.messager
																	.progress({
																		text : "正在更新中。。。",
																	});
														},
														success : function(
																result) {
															$.messager
																	.progress("close");
															$.messager
																	.show({
																		title : "提示",
																		msg : "添加客户资源成功",
																	});
															$("#manager_add")
																	.dialog(
																			"close")
																	.form(
																			"reset");
															$("#resource")
																	.datagrid(
																			"reload");
														}
													});
										}
									},
								},
								{
									text : "返回",
									iconCls : "icon-redo",
									handler : function() {
										$("#manager_add").dialog("close").form(
												"reset");
									},
								} ],
					});

	// 类型和状态的下拉框 权限
	$("#clientType").combobox({
		url : "../DataDictionaryAction/queryData?dataCode=client_type",
		valueField : 'dataId',
		textField : 'dataValue',
		limitToList : 'true',
		panelHeight : '100px'
	});
	$("#clientState").combobox({
		url : "../DataDictionaryAction/queryData?dataCode=client_state",
		valueField : 'dataId',
		textField : 'dataValue',
		limitToList : 'true',
		panelHeight : '100px'

	});

	// 修改提交
	$("#manager_edit")
			.dialog(
					{
						width : 600,
						height : 450,
						title : "修改客户资源",
						modal : true,
						closed : true,
						buttons : [
								{
									text : "提交",
									iconCls : "icon-edit",
									handler : function() {
										if ($("#manager_edit").form("validate")) {
											var rows = $('#resource').datagrid(
													'getSelections');
											$
													.ajax({
														url : "../clientManagementAction/updateSubmitPost",
														type : "post",
														data : {
															clientId : $(
																	"input[name='clientId_edit']")
																	.val(),
															clientCoding : $(
																	"input[name='clientCoding_edit']")
																	.val(),
															clientName : $(
																	"input[name='clientName_edit']")
																	.val(),
															clientSex : $(
																	"input[name='clientSex_edit']")
																	.val(),
															clientBirthday : $(
																	"input[name='clientBirthday_edit']")
																	.val(),
															clientType : $(
																	"input[name='clientType_edit']")
																	.val(),
															clientState : $(
																	"input[name='clientState_edit']")
																	.val(),
															clientPhone : $(
																	"input[name='clientPhone_edit']")
																	.val(),
															clientWorkphone : $(
																	"input[name='clientWorkphone_edit']")
																	.val(),
															clientEmail : $(
																	"input[name='clientEmail_edit']")
																	.val(),
															clientHomephone : $(
																	"input[name='clientHomephone_edit']")
																	.val(),
															clientAddress : $(
																	"input[name='clientAddress_edit']")
																	.val(),
															clientRemark : $(
																	"input[name='clientRemark_edit']")
																	.val(),

														},
														success : function(result) {
															console.log(result)
															if (result == "clientResource") {
																$.messager
																		.confirm(
																				'提示操作',
																				'修改成功',
																				'warning');
																$(
																		'#manager_edit')
																		.dialog(
																				'close');
																$('#resource')
																		.datagrid(
																				'reload'); // 到首页刷新
															} else {
																$.messager
																		.confirm(
																				'提示操作',
																				'修改失败',
																				'warning');
															}
														}
													});
										} else {
											alert("请填写完整信息")
										}
									},
								},
								{
									text : "取消",
									iconCls : "icon-redo",
									handler : function() {
										$("#manager_edit").dialog("close")
												.form("reset");
									},
								} ],
					});

	manager_tool = {
		// 新增
		add : function() {
			$("#manager_add").dialog("open");
			$("input[name='clientCoding']").focus();
		},

		// 模糊查询
		search : function() {
			$('#resource').datagrid('load', {
				likeName : $("input[name='resourcelikeName']").val(),
				likeState : $("input[name='likeState']").val(),
			});
		},

		// 删除
		remove : function() {
			var rows = $("#resource").datagrid("getSelections");

			if (rows.length == 1) {
				$.messager.confirm("确定操作", "您确定要删除所选的记录吗？", function(flag) {
					if (flag) {
						console.log(rows);
						$.ajax({
							type : "post",
							url : "../clientManagementAction/deletePost",
							data : {
								clientId : rows[0].clientId
							},

							success : function(result) {
								if (result == "true") {
									alert("删除成功")
									$("#resource").datagrid("reload"); // 自动刷新
								} else {
									$.messager.confrim("提示操作", "删除失败",
											"warning");
								}
							},
						});
					}
				});
			} else {
				$.messager.alert("提示", "请选择要删除的记录", "info");
			}
		},

		// 修改 获取值
		edits : function() {
			var rows = $("#resource").datagrid("getSelections");
			if (rows.length > 1) {
				$.messager.alert("警告操作！", "编辑记录只能选定一条记录！", "warning");
			} else if (rows.length == 1) {
				$
						.ajax({
							url : "../clientManagementAction/updatePost",
							type : "post",
							data : {
								clientId : rows[0].clientId
							},

							success : function(result) {
								console.log(result);
								if (result) {
									$('#manager_edit')
											.form(
													'load',
													{
														"clientId_edit" : result.clientId,
														"clientCoding_edit" : result.clientCoding,
														"clientName_edit" : result.clientName,
														"clientSex_edit" : result.clientSex,
														"clientBirthday_edit" : result.clientBirthday,
														/*
														 * "clientType_edit":result.clientType,
														 * "clientState_edit":result.clientState,
														 */
														"clientPhone_edit" : result.clientPhone,
														"clientWorkphone_edit" : result.clientWorkphone,
														"clientEmail_edit" : result.clientEmail,
														"clientHomephone_edit" : result.clientHomephone,
														"clientAddress_edit" : result.clientAddress,
														"clientRemark_edit" : result.clientRemark,

													}).dialog('open')
								}

								// 类型和状态的下拉框 权限
								$("#clientType_edit")
										.combobox(
												{
													url : "../DataDictionaryAction/queryData?dataCode=client_type",
													valueField : 'dataId',
													textField : 'dataValue',
													limitToList : 'true',
													panelHeight : '100px'
												});
								$("#clientState_edit")
										.combobox(
												{
													url : "../DataDictionaryAction/queryData?dataCode=client_state",
													valueField : 'dataId',
													textField : 'dataValue',
													limitToList : 'true',
													panelHeight : '100px'

												});
							}
						});
			} else if (rows.length == 0) {
				$.messager.alert("警告操作！", "编辑记录至少选定一条记录！", "warning");
			}
		},

		// 查看
		look : function() {
			var rows = $("#resource").datagrid("getSelections");
			if (rows.length > 1) {
				$.messager.alert("警告操作！", "编辑记录只能选定一条记录！", "warning");
			} else if (rows.length == 1) {
				$
						.ajax({
							url : "../clientManagementAction/updatePost",
							type : "post",
							data : {
								clientId : rows[0].clientId
							},

							success : function(result) {
								console.log(result);
								if (result) {
									$('#manager_edit')
											.form(
													'load',
													{
														"clientId_edit" : result.clientId,
														"clientCoding_edit" : result.clientCoding,
														"clientName_edit" : result.clientName,
														"clientSex_edit" : result.clientSex,
														"clientBirthday_edit" : result.clientBirthday,
														"clientType_edit" : result.clientType,
														"clientState_edit" : result.clientState,
														"clientPhone_edit" : result.clientPhone,
														"clientWorkphone_edit" : result.clientWorkphone,
														"clientEmail_edit" : result.clientEmail,
														"clientHomephone_edit" : result.clientHomephone,
														"clientAddress_edit" : result.clientAddress,
														"clientRemark_edit" : result.clientRemark,

													}).dialog('open')
								}

								// 类型和状态的下拉框 权限
								$("#clientType_edit")
										.combobox(
												{
													url : "../DataDictionaryAction/queryData?dataCode=client_type",
													valueField : 'dataId',
													textField : 'dataValue',
													limitToList : 'true',
													panelHeight : '100px'
												});
								$("#clientState_edit")
										.combobox(
												{
													url : "../DataDictionaryAction/queryData?dataCode=client_state",
													valueField : 'dataId',
													textField : 'dataValue',
													limitToList : 'true',
													panelHeight : '100px'

												});
							}
						});
			} else if (rows.length == 0) {
				$.messager.alert("警告操作！", "编辑记录至少选定一条记录！", "warning");
			}
		},
		assign : function() {
			var rows = $("#resource").datagrid("getSelections");
			if (rows.length > 1) {
				$.messager.alert("警告操作！", "一次只能分配一条记录！", "warning");
			} else if (rows.length == 1) {
				if (rows[0].clientAssignstate =='未分配' || rows[0].clientState=='已流失') {

					$.ajax({
						url : "../clientManagementAction/updatePost",
						type : "post",
						data : {
							clientId : rows[0].clientId
						},

						success : function(result) {
							if (result) {
								$("span[name='clientId']")
										.val(result.clientId);
								$("span[name='clientCoding']").text(
										result.clientCoding);
								$("span[name='clientName']").text(
										result.clientName);
								$("span[name='clientSex']").text(
										result.clientSex)
								$("span[name='clientBirthday']").text(
										result.clientBirthday);
								$("span[name='clientType']").text(
										result.clientType);
								$("span[name='clientState']").text(
										result.clientState);
								$("span[name='clientPhone']").text(
										result.clientPhone);
								$("span[name='clientWorkphone']").text(
										result.clientWorkphone);
								$("span[name='clientEmail']").text(
										result.clientEmail);
								$("span[name='clientHomephone']").text(
										result.clientHomephone);
								$("span[name='clientAddress']").text(
										result.clientAddress);
								$("span[name='clientRemark']").text(
										result.clientRemark);
								$("#queryResource").window({
									width : 600,
									height : 400,
									modal : true,
									title : "客户分配"
								});
							}
						}
					});
				}else{
					alert("此客户不能分配")
				}
			} else if (rows.length == 0) {
				$.messager.alert("警告操作！", "每次至少分配一条记录！", "warning");
			}
		},
		close : function() {
			$("#queryResource").window("close");
		},
		submit : function() {
			if ($("input[name='serveStayhandle']").val() != "") {
				$.ajax({
					url : "../clientManagementAction/updateState",
					type : "post",
					data : {
						clientId : $("span[name='clientId']").val(),
						clientAllot : $("input[name='serveStayhandle']").val()
					},
					success : function(result) {
						if (result == "true") {
							alert("分配成功");
							$("#queryResource").window("close");
							$('#resource').datagrid('reload');
						} else {
							alert("分配失败");
						}
					}
				})
			} else {
				alert("请选择你要分配的员工")
			}
		}

	};
})
