$("#manager6").datagrid({
	url : "../CommonproblemAction/query",
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
		field : "cpId",
		width : 20,
		formatter : function(value, row, index) {
			var s = '<input name="isShow6" type="radio"/> ';
			return s;
		}
	}, {
		field : "cpTitle",
		title : "标题",
		width : 100,
	}, {
		field : "cpTypeName",
		title : "类型",
		width : 100,
	}, {
		field : "cpCreateName",
		title : "创建人",
		width : 100,
	}, {
		field : "cpUpdateTime",
		title : "最后操作时间  ",
		width : 100,
	}, {
		field : "cpUpdateTime",
		title : "最后更新时间  ",
		width : 100,
	}, ] ],
});

function add() {
	$('#addProblem').window({
		width : 600,
		height : 400,
		modal : true,
		title : "新建服务"
	});
}
function addSubmit() {
	$('#addProblemPost').form('submit', {
		url : "../CommonproblemAction/add",
		success : function(data) {
			if (data == "true") {
				$('#addProblem').window("close");
				$('#manager6').datagrid('reload');
			}

		}
	});
}
function onClickCell() {
	var id;// 返回该行的id
	$("input[name='isShow6']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager6").datagrid("getRows");
	if (arrays[id] != undefined) {
		if (confirm("是否确认删除？")) {
			$.ajax({
				url : "../CommonproblemAction/delete",
				type : "post",
				data : {
					commId : arrays[id].cpId
				},
				success : function(result) {
					if (result == "true") {
						alert("删除成功！");
						$('#manager6').datagrid('reload');
					} else {
						alert("删除失败！");
					}
				}

			})
		}
	}else{
		alert("你还未选择！！")
	}

}
function update() {
	var id;// 返回该行的id
	$("input[name='isShow6']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager6").datagrid("getRows");
	if (arrays[id] != undefined) {
		if (confirm("是否确认修改？")) {
			$.ajax({
				url : "../CommonproblemAction/update",
				type : "post",
				data : {
					commId : arrays[id].cpId
				},
				success : function(result) {
					if (result != null) {
						$("#updateProblemPost").form("load", {
							cpId : result.cpId,
							cpTitle : result.cpTitle,
							cpType : result.cpType,
							cpAnswer : result.cpAnswer,
							cpRemark : result.cpRemark
						});
						$('#updateProblem').window({
							width : 600,
							height : 400,
							modal : true,
							title : "修改常见问题"
						});
					} else {
						alert("修改出错！");
					}
				}

			})
		}
	} else {
		alert("你还未选择！！")
	}
}
function updatePost() {
	$('#updateProblemPost').form('submit', {
		url : "../CommonproblemAction/updatePost",
		success : function(data) {
			if (data == "true") {
				$('#updateProblem').window("close");
				$('#manager6').datagrid('reload');
			}
		}
	});
}
function closeUpdate() {
	$('#updateProblem').window("close")
}
function close() {
	alert(123)
	$('#add').window("close")
}
function select() {
	var id;// 返回该行的id
	$("input[name='isShow6']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager6").datagrid("getRows");

	if (arrays[id] != undefined) {
			$.ajax({
				url : "../CommonproblemAction/update",
				type : "post",
				data : {
					commId : arrays[id].cpId
				},
				success : function(result) {
					if (result != null) {
						$("span[name='cpId']").val(result.cpId);
						$("span[name='cpTitle']").text(result.cpTitle);
						$("span[name='cpType']")
								.text(result.cpTypeName);
						$("span[name='cpAnswer']").text(result.cpAnswer);
						$("span[name='cpRemark']").text(result.cpRemark);
						$("span[name='cpCreateName']").text(
								result.cpCreateName);
						

						$('#lookProblem').window({
							width : 600,
							height : 400,
							modal : true,
							title : "查看问题"
						});
					} else {
						alert("查看出错！");
					}
				}

			})
		
	} else {
		alert("你还未选择你要查看的问题")
	}
}
function closeLook() {
	$('#lookProblem').window("close")
}
function likeSelect() {
	$('#manager6').datagrid('load',{
		likeName: $("#managerName").val(),
		likeType: $("#cpType").val()
	});
}