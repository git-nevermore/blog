/**
 * 登录授权
 */
$("#login").click(function() {
	var username = $("#username").val();
	var password = $("#password").val();
	if (username == "" || username == null) {
		alert("用户名不能为空");
		return false;
	} else if (password == "" || password == null) {
		alert("密码不能为空");
		return false;
	}

	$.ajax({
		type : "post",
		url : "user/login",
		data : {
			username : username,
			password : password
		},
		dataType : "json",
		success : function(result) {
			console.log(result);
			if (result.message =='登录成功') {
				window.location.href = "main";		//主界面
			} else {
				alert("登录失败");
			}
		},
		error : function(result){
	     	result = JSON.parse(result.responseText);
        	alert(result.message);
		}
	});
})
