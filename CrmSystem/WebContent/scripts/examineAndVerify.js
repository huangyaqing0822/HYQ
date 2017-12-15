$("#envcontractcc").datagrid({
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
function submites() {
	var val = $("#envcontractcc").datagrid("getSelected");
	if (val != undefined) {
		if (val.state == "已订立") {
			$.ajax({
				url : "http://localhost:8080/CrmSystem/contract/updateState",
				type : "POST",
				data : {
					id : val.id
				},
				dataType : "json",
				success : function(result) {
					if (result) {
						alert(result ? "提交成功！" : "提交失败！");
						$('#envcontractcc').datagrid('reload');
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
	var val = $("#envcontractcc").datagrid("getSelected");
	if (val.state == "已归档") {
		alert("已归档的无法修改.")
		return false;
	}
	if (val != undefined) {
		$("#envesc").fadeIn(1000);
		$("#envesc").fadeOut(1500);
		$("#evncontractUpdate").window({
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
				$("#evncontractUpdate :input").each(function(i, e) {
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
function examineandverify() {
	$("#tg").css("display", "block");
	$("#dh").css("display", "block");
	select("审核合同");
}
function aj(cds,ins, state) {
	$.ajax({
		url : "http://localhost:8080/CrmSystem/contract/upcontractState",
		type : "POST",
		data : {
			id : ins,
			state : state
		},
		dataType : "json",
		success : function(resutl) {
			if (cds == 1) {
				alert(resutl ? "审核通过！" : "执行出现错误！");
				$("#envcontractcc").datagrid("reload");
				close();
			} else {
				alert(resutl ? "已经打回！" : "执行出现错误！");
				$("#envcontractcc").datagrid("reload");
				close();
			}
		}
	})
}
function examine(examine) {
	var val = $("#envcontractcc").datagrid("getSelected");
	if (examine == 1) {
		aj(examine,val.id, 17);
	} else {
		aj(examine,val.id, 14);
	}
}
function xcs(valce) {
	var val = $("#envcontractcc").datagrid("getSelected");
	$("#envesc").fadeIn(1000);
	$("#envesc").fadeOut(1500);
	$("#contractLook").window({
		width : 1000,
		height : 600,
		modal : true,
		title : valce,
		onBeforeClose : function() {
			$("#tg").css("display", "none");
			$("#dh").css("display", "none");
		}
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
}
function select(valce) {
	var val = $("#envcontractcc").datagrid("getSelected");
	if (val != undefined && (val.state == "已提交" || val.state == "待审核")) {
		xcs(valce);
	} else if (valce == "查看合同") {
		xcs(valce);
	} else {
		alert("此合同无法被审核！！")
	}
}
function addSubmit() {
	$('#addPost').form('submit', {
		url : "http://localhost:8080/CrmSystem/contract/contractAdd",
		success : function(data) {
			if (data) {
				$('#contractAdd').window("close");
				$('#envcontractcc').datagrid('reload');
			}

		}
	});
}
function updatePost() {
	$('#updatePost').form('submit', {
		url : "http://localhost:8080/CrmSystem/contract/updateContract",
		success : function(data) {
			if (data == "true") {
				$('#evncontractUpdate').window("close");
				$('#envcontractcc').datagrid('reload');
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
	var arrays = $("#envcontractcc").datagrid("getRows");
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
						$('#envcontractcc').datagrid('reload');
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
	$("#envcontractcc").datagrid("load", {
		name : $("#envhetonname").val(),
		type : $("#envhttyp").val(),
		state : $("#envhtstate").val()
	})
}
function deletecontes() {
	var val = $("#envcontractcc").datagrid("getSelected");
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
				$("#envcontractcc").datagrid("reload");
			}
		})

	} else {
		alert("你还没有选择一行");
	}
}