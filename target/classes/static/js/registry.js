$("#registry").click(function() {
	var username = $("#username").val();
	var password = $("#password").val();
	var nickname = $("#nickname").val();
	var type = $("input[name='type']:checked").val();

	if (username == "" || username == null) {
		alert("用户名不能为空");
		return false;
	} else if (password == "" || password == null) {
		alert("密码不能为空");
		return false;
	}

	$.ajax({
		type : "post",
		url : "user/registry",
		data : {
			username : username,
			password : password,
			nickname : nickname,
			type : type
		},
		dataType : "json",
		error : function(result) {
			result = JSON.parse(result.responseText);
			alert("注册失败 " + result.message);
		},
		success : function(result) {
			console.log(result);
			alert(result.message);
			window.location.href = "/blog";
		}
	});
})