$("#manager5").datagrid({
	url : "../ServerAction/queryById?flag=4",
	height : 520,
	fitColumns : true,
	striped : true,
	rownumbers : true,
	border : false,
	pagination : true,

	// 分页的
	pageSize : 10,
	pageList : [ 5, 10, 15, 20 ],
	pageNumber : 1,
	toolbar : "manager_tool",

	columns : [ [ {
		field : "serveId",
		width : 20,
		checkbox : true,
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
	var arrays = $("#manager5").datagrid("getSelections");
	if (arrays.length == 0) {
		alert("您还未选择你要查看的服务")
	} else if (arrays.length == 1) {
		$.ajax({
			url : "../ServerAction/update",
			type : "post",
			data : {
				serveId : arrays[0].serveId
			},
			success : function(result) {
				if (result != null) {
					$("#selectPlace").form("load", {
						serveId : result.serveId,
						serveName : result.serveName,
						serveClientId : result.serveClientId,
						servePhone : result.servePhone,
						serveContent : result.serveContent,
						serveRemark : result.serveRemark,
						dataType : result.dataType
					});
					$('#lookPlace').window({
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
		alert("最多只能选择一行")
	}
}
function handle() {
	var strArray = [];
	var arrays = $("#manager5").datagrid("getSelections");
	console.log(arrays)
	if (arrays.length == 0) {
		alert("你还未选择你要归档的服务")
	} else {
		for (var i = 0; i < arrays.length; i++) {
			strArray.push(arrays[i].serveId)
		}
		$.ajax({
			url : "../ServerAction/updateHandle",
			type : "post",
			data : {
				array:strArray.join(","),
			},
			success : function(result) {
				if (result == "true") {
					alert("归档成功");
					$('#manager5').datagrid('reload');
				} else {
					alert("归档失败");
				}
			}
		})
	}
}
function likeSelect5() {
	$('#manager5').datagrid('load',{
		likeName: $("input[name='likeName5']").val(),
		likeType: $("input[name='likeType5']").val(),
		likeState: $("input[name='likeState5']").val()
	});
}
function selectClose(){
	$('#lookPlace').window("close");
}