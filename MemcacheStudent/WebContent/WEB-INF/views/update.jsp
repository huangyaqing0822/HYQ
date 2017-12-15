<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function update() {
		 $.ajax({
			url : "updataPost",
			type : "post",
			data : {
				id : $("#id").val(),
				name : $("#name").val(),
			},
			success : function(result) {
				if (result == "true") {
					alert("修改成功!");
					location = "index";
				} else {
					alert("修改失败!");
					location = "update";
				}
			}
		}) 
	}
</script>
</head>
<body>
	<s:form action="updataPost" method="post" commandName="student">
		<table>
			<tr>
				<td>学生id:</td>
				<td><s:input path="id" id="id"/></td>
			</tr>
			<tr>
				<td>学生姓名:</td>
				<td><s:input path="name" id="name"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" value="修改" onclick="update()"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>