$(document).ready(function(){
	$('#mainForm').css('display','block');
	
	$('#mainForm').bootstrapValidator({
		fields:{
			fAccount:{
				message:'用户名验证失败',
				validators:{
					notEmpty:{
						message:'用户名不能为空！'
					}
				}
			},
			fPassword:{
				validators:{
					notEmpty:{
						message:'密码不能为空！'
					}
				}
			}
		}
	})
	
	$('#btnSubmit').click(function(){
		$('#mainForm').bootstrapValidator('validate');
		if($('#mainForm').data('bootstrapValidator').isValid()){
			$.ajax({
				type:"post",
				url:"login",
				async:true,
				dataType: 'json'
				data:{
					account:$('#account').val();
					pass:$('#inputPassword').val();
				},
				success:function(data, textStatus){
					
				}
				error: function(XMLHttpRequest, textStatus, errorThrown){
					
				}
			});
		};
	})
});