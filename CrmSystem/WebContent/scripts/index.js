$(function() {
	// 链接导航的数据
	$("#tabs").tabs({
		fit : true,
		border : false,
	})
	$('#nav').tree({
		type : "post",
		url : "http://localhost:8080/CrmSystem/treeAction/tree",
		animate : true,//是否显示被选中状态
		cascadeCheck : false,//切断关联状态
		onlyLeafCheck : true,//文件根节点不选中
		lines : true,//显示虚线
		dnd : false,//可拖拽(所以依赖于拖动和放置)	
		onClick : function(node) {
			if (node.url) {
				if ($("#tabs").tabs("exists", node.text)) {
					$("#tabs").tabs("select", node.text);
				} else {
					$("#tabs").tabs("add", {
						title : node.text,
						iconCls : node.iconCls,
						closable : true,
						href : node.url,
					});
				}
			}

		}
	});
})