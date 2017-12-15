var ye = false;
var actionscsp = {
	query : function() {
		$("#dentdcs").datagrid("load", {
			type : $("#cc").val(),
			likeval : $("[name=usernamse]").val()
		})
	}
}
$(function() {
	$('#dentdcs').datagrid({
		url : "http://localhost:8080/CrmSystem/indent/query",
		height : 520,
		fitColumns : true,
		striped : true,
		rownumbers : true,
		border : false,
		pagination : true,
		singleSelect : true,
		// 分页的
		pageSize : 10,
		pageList : [ 5, 10, 15, 20 ],
		pageNumber : 1,
		toolbar : "manager_tool",
		columns : [ [ {
			field : 'Code',
			width : 35,
			formatter : function(value, row, index) {
				var s = '<input name="insertinto" type="radio" />';
				return s;
			}
		}, {
			field : 'name',
			title : '客户姓名',
			width : 190,
			align : 'center',
		}, {
			field : 'sex',
			title : '性别',
			width : 190,
			align : 'center',
		}, {
			field : 'phone',
			title : '电话',
			align : 'center',
			hidden : true
		}, {
			field : 'type',
			title : '类型',
			width : 190,
			align : 'center',
		}, {
			field : 'state',
			title : '状态',
			width : 190,
			align : 'center',
		}, {
			field : 'consumption',
			title : '已消费次数',
			width : 190,
			align : 'center',
		}, {
			field : 'sum',
			title : '消费总额(单位:元)',
			width : 190,
			align : 'center',
		}, {
			field : 'withs',
			title : '服务代表',
			width : 190,
			align : 'center',
		}, ] ],
		onClickCell : function(index, field, value) {
			if (field == "vs_id") {
				/*
				 * if (!$("#tabs").tabs("exists", "维护投票信息")) {
				 * $('#tabs').tabs('add', { title : "维护投票信息", closable : true,
				 * justified : true, href : "UpdataActions_update.action?id=" +
				 * value, }); }
				 */
			}
		}
	});
	$("#built-inec")
			.datagrid(
					{
						url : "http://localhost:8080/CrmSystem/indent/queryProduct",
						height : 320,
						fitColumns : true,
						striped : true,
						rownumbers : true,
						border : false,
						pagination : true,
						// 分页的
						pageSize : 10,
						pageList : [ 5, 10, 15, 20 ],
						pageNumber : 1,
						columns : [ [
								{
									field : 'cppId',
									width : 35,
									checkbox : true
								},
								{
									field : 'name',
									title : '商品名称',
									width : 100,
									align : 'center',
								},
								{
									field : 'cppCoding',
									title : '型号',
									width : 100,
									align : 'center',
								},
								{
									field : 'id',
									hidden : true
								},
								{
									field : 'cppPrice',
									title : '单价',
									width : 100,
									align : 'center',
								},
								{
									title : '数量',
									field : 'cpp',
									width : 100,
									align : 'center',
									formatter : function(value, row, index) {
										var s = '<span class="jian" style="font-size: 20px;color: red;width25px;">-&nbsp;&nbsp;&nbsp;</span>';
										s += '<input class="readonly" style="width: 28px" type="text" value="0" readonly="readonly">'
										s += '<span class="jia" style="font-size: 14px;color: blue;width25px;">&nbsp;&nbsp;&nbsp;+</span>';
										return s;
									},
								}, {
									field : 'cppCount',
									title : '库存',
									width : 155,
									align : 'center',
									formatter : function(value, row, index) {
										return "库存充足";
									}
								} ] ],
					})
})
function add() {
	var is = false;
	$("[name=insertinto]").each(function(i, e) {
		if (e.checked == true) {
			is = true;
		}
	})
	if (!is) {
		$.messager.alert('警告', '你还没有选择一行..');
		return false;
	}
	$('#ddssspc').window({
		width : 1000,
		height : 700,
		modal : true,
		title : "代下订单",
		onBeforeOpen : function() {
			var id = 0;
			var allrows = $('#dentdcs').datagrid("getRows");
			$("[name=insertinto]").each(function(i, e) {
				if (e.checked == true) {
					id = i;
				}
			})
			$(".infostts").each(function(i, e) {
				if (i == 0) {
					$(e).html(allrows[id].name);
				} else if (i == 1) {
					$(e).html(allrows[id].sex);
				} else if (i == 2) {
					$(e).html(allrows[id].type);
				} else if (i == 3) {
					$(e).html(allrows[id].state);
				} else if (i == 4) {
					$(e).html(allrows[id].phone);
				} else if (i == 5) {
					$(e).html(allrows[id].withs);
				} else if (i == 6) {
					$(e).html(allrows[id].consumption);
				} else if (i == 7) {
					$(e).html(allrows[id].sum);
				} else {
				}
			});
			$(".infostts").each(function(i, e) {
				console.log($(e).html());
			});
			if(!ye){
				ye=true;
				$(".jia").click(function() {
					$(this).prev().val(parseInt($(this).prev().val()) + 1);
				})
				$(".jian").click(function() {
					if (parseInt($(this).next().val()) == 0) {
					} else {
						$(this).next().val(parseInt($(this).next().val()) - 1);
					}
				})
			}
		}
	});
	
}
function addPost() {
	$('#xianxi')
			.window(
					{
						width : 1000,
						height : 700,
						modal : true,
						title : "代下订单",
						onBeforeOpen : function() {
							var id = 0;
							var selectArrays = $('#built-inec').datagrid(
									"getSelections");
							var ary = new Array();
							var ii = 0;
							$(".readonly").each(function(i, e) {
								if (e.value > 0) {
									ary[ii] = i;
									ii++;
								}
							})
							var id = 0;
							var allrows = $('#dentdcs').datagrid("getRows");
							$("[name=insertinto]").each(function(i, e) {
								if (e.checked == true) {
									id = i;
								}
							})
							$("#shouhuo").html(allrows[id].name);
							$("#clentid").val(allrows[id].id);
							for (var int = 0; int < selectArrays.length; int++) {
								var array_element = selectArrays[int];
								var data = '<tr style="color:red">';
								data += '<td><label class="cppId" for="name">'
										+ array_element.cppId + '</label></td>';
								data += '<td><label class="nammm" for="name">'
										+ array_element.name + '</label></td>';
								data += '<td><label  for="name">'
										+ array_element.cppCoding
										+ '</label></td>';
								data += '<td><label class="pricess" for="name">'
										+ array_element.cppPrice
										+ '</label></td>';
								data += '<td><label class="numbers" for="name">'
										+ $(".readonly:eq(" + ary[int] + ")")
												.val() + '</label></td>';
								data += '<td><label for="name">满的</label></td>';
								data += '</tr>';
								$("#batttt").append(data);
							}
							var infos = "";
							var array1 = new Array();
							var array2 = new Array();
							var array3 = new Array();
							$(".nammm").each(function(i, e) {
								array1[i] = $(e).html();
							})
							$(".pricess").each(function(i, e) {
								array2[i] = $(e).html();
							})
							$(".numbers").each(function(i, e) {
								array3[i] = $(e).html();
							})
							var heji = 0;
							for (var int2 = 0; int2 < array1.length; int2++) {
								infos += array1[int2] + " " + array3[int2]
										+ "件    小计:" + parseFloat(array3[int2])
										* parseFloat(array2[int2]) + "<br>";
								heji += parseFloat(array3[int2])
										* parseFloat(array2[int2]);
							}
							$("#infos")
									.html(
											infos
													+ "合计：<spen id='hejisff' style='color:red'>"
													+ heji + "</spen>");
						}
					});
}
function close() {
	$('#ddssspc').window('close');
}
function submitdd() {
	var infos = "";
	var array1 = new Array();
	var array2 = new Array();
	var array3 = new Array();
	var array4 = new Array();
	$(".nammm").each(function(i, e) {
		array1[i] = $(e).html();
	})
	$(".pricess").each(function(i, e) {
		array2[i] = $(e).html();
	})
	$(".numbers").each(function(i, e) {
		array3[i] = $(e).html();
	})
	$(".cppId").each(function(i, e) {
		array4[i] = $(e).html();
	})
	for (var int2 = 0; int2 < array1.length; int2++) {
		infos += array4[int2] + "-" + array1[int2] + "-" + array3[int2]
				+ "<br>";
	}

	$.ajax({
		url : "http://localhost:8080/CrmSystem/indent/insertProduct",
		type : "POST",
		data : {
			id : $("#clentid").val(),
			info : infos,
			heji : $("#hejisff").html(),
			fapiao : $("#infos").html()
		},
		success : function(result) {
			if (result) {
				$.messager.alert('成功', '已成功下单..');
				$('#ddssspc').window('close');
				$('#xianxi').window('close');
				$("[style='color:red']").remove();
				$('#dentdcs').datagrid('reload');
				$(".readonly").each(function(i, e) {
					e.value = 0;
				})
			}
		},
		error : function(result) {
			alert("加载失败!")
		}
	})
}
