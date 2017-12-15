$("#manager4").datagrid({
	url : "../ServerAction/queryById?flag=3",
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
			var s = '<input name="isShow4" type="radio"/> ';
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
function handle() {
	var id;// 返回该行的id
	$("input[name='isShow4']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager4").datagrid("getRows");

	if (arrays[id] != undefined) {
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

						$('#feedback').window({
							width : 600,
							height : 400,
							modal : true,
							title : "服务反馈"
						});
					} else {
						alert("反馈出错！");
					}
				}

			})
		
	} else {
		alert("你还未选择你要处理的服务")
	}
}
function close() {
	$("#feedback").window("close")
}
function submit() {
		$.ajax({
			url : "../ServerAction/updateHandle",
			type : "post",
			data : {
				serveId : $("span[name='serveId']").val(),
				serveState:$("#dataValue4").val(),
				serveRemark:$("input[name='serveRemark4']").val()
			},
			success : function(result) {
				if(result=="true"){
					alert("反馈成功");
					$("#feedback").window("close");
					$('#manager4').datagrid('reload');
				}else{
					alert("反馈失败");
				}
			}
		})
}
function select() {
	var id;// 返回该行的id
	$("input[name='isShow4']").each(function(i, e) {
		if (e.checked == true) {
			id = i;
		}
	})
	var arrays = $("#manager4").datagrid("getRows");
	if (arrays[id] != undefined) {

		$.ajax({
			url : "../ServerAction/update",
			type : "post",
			data : {
				serveId : arrays[id].serveId
			},
			success : function(result) {
				if (result != null) {
					$("#selectFeedback").form("load", {
						serveId : result.serveId,
						serveName : result.serveName,
						serveClientId : result.serveClientId,
						servePhone : result.servePhone,
						serveContent : result.serveContent,
						serveRemark : result.serveRemark,
						dataType : result.dataType
					});
					$('#lookFeedback').window({
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
	$('#lookFeedback').window("close")
}
function likeSelect4() {
	$('#manager4').datagrid('load',{
		likeName: $("input[name='likeName4']").val(),
		likeType: $("input[name='likeType4']").val(),
		likeState: $("input[name='likeState4']").val()
	});
}