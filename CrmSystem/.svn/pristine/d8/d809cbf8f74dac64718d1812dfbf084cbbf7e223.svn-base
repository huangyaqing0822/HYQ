<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单统计</title>
<%
	String path = request.getContextPath();
%>
</head>
<body>
	<div>
		选择年份： <select id="selectOption"
			style="width: 100px; height: 24px; color: blue">
		</select> <a id="ccsfsfs" href="javascript:dsfsf()" class="easyui-linkbutton"
			data-options="iconCls:'icon-search'">搜索</a>
	</div>
	<div id="container" style="min-width: 600px; height: 400px;"></div>
	<script type="text/javascript" src="<%=path%>/scripts/series-main.js"></script>
	<script type="text/javascript">
		$(function() {
			var date = new Date();
			var year = date.getFullYear();
			var dat = "";
			for (var i = 1980; i < year + 1; i++) {
				if(i==year){
					dat += '<option selected="true" value="'+i+'">' + i + '年</option>';
				}else{
					dat += '<option value="'+i+'">' + i + '年</option>';
				}
			}
			$("#selectOption").html(dat);
		})
	</script>
</body>
</html>