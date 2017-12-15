$("#contractqyh").datagrid({
	url : "http://localhost:8080/CrmSystem/contract/selectContract",
	height : 520,
	fitColumns : true,
	striped : true,
	rownumbers : true,
	border : false,
	pagination : true,
	singleSelect : true,
	// 分页的
	pageSize : 10,
	pageList : [ 10, 20, 40, 80 ],
	pageNumber : 1,
	
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

function searchqyh() {
	$("#contractqyh").datagrid("load", {
		name : $("#whereName").val()
	})
}
function sendContractCon() {
	var sb = $('#contractqyh').datagrid('getSelected');
	console.log(sb);
	if ($('#tabs').tabs('exists',"合同具体操作")) {
		$('#tabs').tabs('close','合同具体操作');
		$('#tabs').tabs('add', {
			title : "合同具体操作",
			iconCls : "",
			closable : true,
			href : "../contract/sendContractCon?cid="+sb.id
		})
	} else {
		$('#tabs').tabs('add', {
			title : "合同具体操作",
			iconCls : "",
			closable : true,
			href : "../contract/sendContractCon?cid="+sb.id
		})
	}
}

