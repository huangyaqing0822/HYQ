<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url:"query",
			type:"post",
			success:function(result){
				var data="";
				data+="<tr><td>id</td><td>name</td></tr>";
				for (var i = 0; i < result.length; i++) {
					data+="<tr><td>"+result[i].id+"</td><td>"+result[i].name+"</td>";
					data+="<td><a href='#' onclick=del("+result[i].id+")>删除</a></td><td><a href=upd?id="+result[i].id+">修改</a></td>";
					data+="</tr>"
				}
				$("#table").html(data);
			}
		})
	})
	function del(stuId) {
		$.ajax({
			url:"delete",
			type:"post",
			data:{
				id:stuId,
			},
			success:function(result){
				if(result=="true"){
					alert("删除成功!");
					location="index";
				}else{
					alert("删除失败!");
					location="index";
				}
			}
		})
	}

</script>
</head>
<body>
	<a href="add">增加</a>
	<table id="table">
		
	</table>
	
</body>
</html>