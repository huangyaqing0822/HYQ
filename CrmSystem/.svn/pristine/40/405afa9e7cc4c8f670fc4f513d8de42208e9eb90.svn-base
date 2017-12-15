$("#manager2").datagrid({
	url : "../ServerAction/queryById?flag=2",
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
		field : "serveId",
		width : 20,
		formatter : function(value, row, index) {
			var s = '<input name="isShow2" type="radio"/> ';
			return s;
		}
	}, {
		field : "serveName",
		title : "服务名称",
		width : 100,
	}, {
		field : "dataType",
		title : "类型",
		width : 100,
	}, {
		field : "dataValue",
		title : "状态",
		width : 100,
	}, {
		field : "serveUpdateTime",
		title : "最后操作时间  ",
		width : 100,
	}, {
		field : "serveManageName",
		title : "操作人  ",
		width : 100,
	}, {
		field : "serveStayhandle",
		title : "待处理人  ",
		width : 100,
	}, ] ],
});

function select() {
	var id;// 返回该行的id
	$("input[name='isShow2']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager2").datagrid("getRows");
	if (arrays[id] != undefined) {

		$.ajax({
			url : "../ServerAction/update",
			type : "post",
			data : {
				serveId : arrays[id].serveId
			},
			success : function(result) {
				if (result != null) {
					$("#selectPost").form("load", {
						serveId : result.serveId,
						serveName : result.serveName,
						serveClientId : result.serveClientId,
						servePhone : result.servePhone,
						serveContent : result.serveContent,
						serveRemark : result.serveRemark,
						dataType : result.dataType
					});
					$('#look').window({
						width : 600,
						height : 400,
						modal : true,
						title : "查看服务"
					});
				} else {
					alert("查看出错！");
				}
			}

		})

	} else {
		alert("你还未选择你要查看的服务！！")
	}
}
function selectClose() {
	$('#look').window("close")
}
function close() {
	$("#distribute").window("close")
}
function distribute() {
	var id;// 返回该行的id
	$("input[name='isShow2']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager2").datagrid("getRows");

	if (arrays[id] != undefined) {
		if (arrays[id].dataValue == "已提交") {
			$.ajax({
				url : "../ServerAction/update",
				type : "post",
				data : {
					serveId : arrays[id].serveId
				},
				success : function(result) {
					if (result != null) {
						$("span[name='serveId']").val(result.serveId);
						$("span[name='serveName']").text(result.serveName);
						$("span[name='serveContent']")
								.text(result.serveContent);
						$("span[name='dataType']").text(result.dataType);
						$("span[name='dataValue']").text(result.dataValue);
						$("span[name='serveManageName']").text(
								result.serveManageName);
						$("span[name='serveCreateTime']").text(
								result.serveCreateTime);
						$("span[name='serveStayhandle']").text(
								result.serveStayhandle);

						$('#distribute').window({
							width : 600,
							height : 400,
							modal : true,
							title : "服务分配"
						});
					} else {
						alert("分配出错！");
					}
				}

			})
		} else {
			alert("此服务无法分配")
		}
	} else {
		alert("你还未选择你要分配的服务")
	}
}
function submit() {
	if ($("input[name='serveStayhandle']").val() != "") {
		$.ajax({
			url : "../ServerAction/updateState",
			type : "post",
			data : {
				serveId : $("span[name='serveId']").val(),
				serveStayhandle : $("input[name='serveStayhandle']").val()
			},
			success : function(result) {
				if(result=="true"){
					alert("分配成功");
					$("#distribute").window("close");
					$('#manager2').datagrid('reload');
				}else{
					alert("分配失败");
				}
			}
		})
	}else{
		alert("请选择你要分配的员工")
	}
}
function likeSelect2() {
	$('#manager2').datagrid('load',{
		likeName: $("input[name='likeName2']").val(),
		likeType: $("input[name='likeType2']").val(),
		likeState: $("input[name='likeState2']").val()
	});
}