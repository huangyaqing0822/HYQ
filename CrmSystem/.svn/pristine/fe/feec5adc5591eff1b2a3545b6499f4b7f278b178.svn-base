
		$(function() {
			$("#yuanMima").blur(function() {
				var password = $("#yuanMima").val();
				$("#span2").hide();
				$("#span").hide();
				$.ajax({
					url : "http://localhost:8080/CrmSystem/staffAction/selectPassWorld",
					type : "post",
					data : {
						"password" : password
					},
					success : function(data) {
						if (data ==true) {
							$("#span2").show();
						} else {
							$("#span").show();
						}
					}
				})
			});
		})
		function tijiao() {
			var newPassword = $("#xinMima").val();
			var newPassword2 = $("#xinMima2").val();
			if (newPassword == newPassword2) {
				$.ajax({
					url : "http://localhost:8080/CrmSystem/staffAction/updatPassWorld",
					type : "post",
					data : {
						"staffPass" : newPassword
					},
					 success : function(data) {
						 if(data!=null){
							 $.messager.show({
									title:'温馨提示',
									msg:'密码修改成功!',
									timeout:5000,
									showType:'slide'
								});
							 location="../index.html";
						 }
					 }
				})
			} else {
				$("#span3").show();
			}
			
		}
		function updatePassword() {
			$("#user_message").hide(1000);
			$("#xiugai").hide();
			$("#passwordDiv").show(1000);
			$("#title").text("系统设置>>个人信息>>修改密码");
		}
		function fanhui() {
			$("#user_message").show(1000);
			$("#xiugai").show();
			$("#passwordDiv").hide(1000);
			$("#title").text("系统设置>>个人信息");
		}
		function updateLoginId2() {
			$("#loginButton2").attr("type", "hidden");
			$("#loginButton").attr("type", "button");
			var name = $("#loginInput").val();
			$.ajax({
				url : "http://localhost:8080/CrmSystem/staffAction/updatLoginNames",
				type : "post",
				data:{
					staffLoginName:name
				},
				success : function(data) {
					if (data) {
						$("#loginInput").attr("readOnly", true);
					}
				}
			});
			$("#loginInput").attr("readOnly", true);
		}
		function updateLoginId() {
			$("#loginButton2").attr("type", "button");
			$("#loginButton").attr("type", "hidden");
			$("#loginInput").attr("readOnly", false);
		}
		function updateIphone2() {
			$("#iphoneButton2").attr("type", "hidden");
			$("#iphoneButton").attr("type", "button");
			var number = $("#telInput").val();
			$.ajax({
				url : "http://localhost:8080/CrmSystem/staffAction/updatTephone",
				type : "post",
				data :{
					stanftephone:number,
				},
				success : function(data) {
					if (data) {
						$("#telInput").attr("readOnly", true);
					}
				}
			});
			$("#loginInput").attr("readOnly", true);
		}
		function updateIphone() {
			$("#iphoneButton2").attr("type", "button");
			$("#iphoneButton").attr("type", "hidden");
			$("#telInput").attr("readOnly", false);
		}
	