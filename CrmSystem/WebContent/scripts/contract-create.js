$("#contractcc").datagrid({
	url : "http://localhost:8080/CrmSystem/contract/contractQuerys",
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
		checkbox : true
	}, {
		field : 'title',
		title : '合同标题',
		width : 190,
		align : 'center',
	}, {
		field : 'id',
		title : '订单号',
		width : 190,
		align : 'center',
		hidden : true
	}, {
		field : 'state',
		width : 190,
		title : '合同状态',
		align : 'center',
	}, {
		field : 'type',
		title : '合同类型',
		width : 190,
		align : 'center',
	}, {
		field : 'time',
		title : '创建时间',
		width : 190,
		align : 'center',
	}, {
		field : 'dai',
		title : '待处理人',
		width : 190,
		align : 'center',
	}, ] ],
});
function onClickCell() {
	var id;// 返回该行的id
	$("input[name='isShow1']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#contractcc").datagrid("getRows");
	console.log(id);
	if (arrays[id] != undefined) {
		if (confirm("是否确认删除？")) {
			$.ajax({
				url : "../ServerAction/delete",
				type : "post",
				data : {
					id : arrays[id].serveId
				},
				success : function(result) {
					console.log(result);
					if (result == "true") {
						alert("删除成功！");
						$('#contractcc').datagrid('reload');
					} else {
						alert("删除失败！");
					}
				}

			})
		}
	} else {
		alert("你还未选择！！")
	}

}
function submites() {
	var val = $("#contractcc").datagrid("getSelected");
	if (val != undefined) {
		if (val.state == "已订立") {
			$
					.ajax({
						url : "http://localhost:8080/CrmSystem/contract/updateState",
						type : "POST",
						data : {
							id : val.id
						},
						dataType : "json",
						success : function(result) {
							if(result){
								alert(result ? "提交成功！" : "提交失败！");
								$('#contractcc').datagrid('reload');
								return;
							}
						}
					})
		} else {
			alert("只能对订立的进行提交.")
			return false;
		}
	} else {
		alert("你还未选择！！")
	}

}
function contractUpdate() {
	var val = $("#contractcc").datagrid("getSelected");
	if (val.state == "已归档") {
		alert("已归档的无法修改.")
		return false;
	}
	if (val != undefined) {
		$("#esc").fadeIn(1000);
		$("#esc").fadeOut(1500);
		$("#contractUpdate").window({
			width : 1000,
			height : 600,
			modal : true,
			title : "查看合同"
		})
		$.ajax({
			url : "http://localhost:8080/CrmSystem/contract/contractQueryView",
			type : "POST",
			data : {
				id : val.id
			},
			dataType : "json",
			success : function(result) {
				$("#contractUpdate :input").each(function(i, e) {
					var v = e.name;
					if (v == "context") {
						e.value = result.context;
					} else if (v == "jia") {
						e.value = result.jia;
					} else if (v == "jiaqz") {
						e.value = result.jiaqz;
					} else if (v == "price") {
						$('#pric').numberbox('setValue', result.price);
					} else if (v == "remark") {
						e.value = result.remark;
					} else if (v == "state") {
						e.value = result.state;
					} else if (v == "time") {
						e.value = result.time;
					} else if (v == "name") {
						e.value = result.title;
					} else if (v == "type") {
						e.value = result.type;
					} else if (v == "yi") {
						e.value = result.yi;
					} else if (v == "yiqz") {
						e.value = result.yiqz;
					} else if (v == "id") {
						e.value = result.id;
					}
				})
			}
		})
	} else {
		alert("你还未选择你要查看的合同！！")
	}
}
function contractAdd() {
	$('#contractAdd').window({
		width : 1000,
		height : 600,
		modal : true,
		title : "新建合同"
	});
}
function select() {
	var val = $("#contractcc").datagrid("getSelected");
	if (val != undefined) {
		$("#esc").fadeIn(1000);
		$("#esc").fadeOut(1500);
		$("#contractLook").window({
			width : 1000,
			height : 600,
			modal : true,
			title : "查看合同"
		})
		$.ajax({
			url : "http://localhost:8080/CrmSystem/contract/contractQueryView",
			type : "POST",
			data : {
				id : val.id
			},
			dataType : "json",
			success : function(result) {
				$("#contractLook :input").each(function(i, e) {
					var v = e.name;
					if (v == "context") {
						e.value = result.context;
					} else if (v == "jia") {
						e.value = result.jia;
					} else if (v == "jiaqz") {
						e.value = result.jiaqz;
					} else if (v == "price") {
						e.value = result.price;
					} else if (v == "remark") {
						e.value = result.remark;
					} else if (v == "state") {
						e.value = result.state;
					} else if (v == "time") {
						e.value = result.time;
					} else if (v == "name") {
						e.value = result.title;
					} else if (v == "type") {
						e.value = result.type;
					} else if (v == "yi") {
						e.value = result.yi;
					} else if (v == "yiqz") {
						e.value = result.yiqz;
					}
				})
			}
		})
	} else {
		alert("你还未选择你要查看的合同！！")
	}
}
function addSubmit() {
	$('#addPost').form('submit', {
		url : "http://localhost:8080/CrmSystem/contract/contractAdd",
		success : function(data) {
			if (data) {
				$('#contractAdd').window("close");
				$('#contractcc').datagrid('reload');
			}

		}
	});
}
function updatePost() {
	$('#updatePost').form('submit', {
		url : "http://localhost:8080/CrmSystem/contract/updateContract",
		success : function(data) {
			if (data == "true") {
				$('#contractUpdate').window("close");
				$('#contractcc').datagrid('reload');
			}
		}
	});
}
function submit() {
	var id;// 返回该行的id
	$("input[name='isShow1']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#contractcc").datagrid("getRows");
	if (arrays[id] != undefined) {
		if (arrays[id].dataValue == "新创建") {
			$.ajax({
				url : "../ServerAction/updateState",
				type : "post",
				data : {
					serveId : arrays[id].serveId
				},
				success : function(result) {
					if (result == "true") {
						alert("提交成功！");
						$('#contractcc').datagrid('reload');
					} else {
						alert("提交失败！");
					}
				}
			})
		} else {
			alert("此服务已提交过了")
		}
	} else {
		alert("你还未选择你要提交的服务")
	}
}
$(function() {
	$(document).keyup(function(k) {
		if (k.keyCode == 27) {
			$(".wins").each(function(i, e) {
				if ($(e).css("display") == "block") {
					$('#' + e.id).window("close");
				}
			})
		} else if (k.keyCode == 13) {
			select();
		}
	})
})
function close() {
	$(".wins").each(function(i, e) {
		if ($(e).css("display") == "block") {
			$('#' + e.id).window("close");
		}
	})
}

function search() {
	$("#contractcc").datagrid("load", {
		name : $("#hetonname").val(),
		type : $("#httyp").val(),
		state : $("#htstate").val()
	})
}
function deletecontes() {
	var val = $("#contractcc").datagrid("getSelected");
	if (val != undefined) {
		$.ajax({
			url : "http://localhost:8080/CrmSystem/contract/deletecontes",
			type : "POST",
			data : {
				id : val.id
			},
			dataType : "json",
			success : function(result) {
				alert(result ? "删除成功！" : "删除失败！");
				$("#contractcc").datagrid("reload");
			}
		})

	} else {
		alert("你还没有选择一行");
	}
}