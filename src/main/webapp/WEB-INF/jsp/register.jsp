<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理注册 </title>

<link href="/source/css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/source/js/jquery-3.3.1.min.js"></script>


<script type="text/javascript">     
function onClick(){      
        var Username=$('#username').val();        
        var Password=$('#password').val();
        var Phone=$('#phone').val();
        var json_string={username:Username,password:Password,phone:Phone};        
        $.ajax({
            url:'./zhuce',
            type:'post',  
            data:JSON.stringify(json_string),
            contentType : 'application/json;charset=UTF-8',        
            success : function(data) {
            	alert(data.username);
                var html ="";           	 
            	 html="<li>"+data.username+"</li><li>"+data.password+"</li><li>"+data.phone+"</li>";           	
                $("#ulul").html(html); //在html页面id=ulul的标签里显示html内容
                },
                 
            error : function() {
                alert("失败!");  
                }
                });
}  
</script>  



<!-- 
 <script type="application/javascript">    
 $.fn.serializeObject = function()    
 {    
    var o = {};    
    var a = this.serializeArray();    
    $.each(a, function() {    
        if (o[this.name]) {    
            if (!o[this.name].push) {    
                o[this.name] = [o[this.name]];    
            }    
            o[this.name].push(this.value || '');    
        } else {    
            o[this.name] = this.value || '';    
        }    
    });    
    return o;    
 };  
   
 function onClick(){  
         //var data = $("#form1").serializeArray(); //自动将form表单封装成json  
         //alert(JSON.stringify(data));  
         var jsonuserinfo = $('#zhuce').serializeObject();  
         alert(JSON.stringify(jsonuserinfo));
         
         $.ajax({
        	    url : "./zhuce",
        	    type : "post",  
        	    data:JSON.stringify(jsonuserinfo),
        	    contentType : "application/json;charset=UTF-8",
        	    success : function(result) {
        	        alert("注册成功！"result.username);
        	        },
        	    error : function() {
        	        alert("失败!");  
        	        }
         });
 }  
</script> 
 -->
</head>
<body>


<div class="login">
<ul id="jieshou"></ul>
    <div class="box png">
		<div class="logo png"></div>
		<div class="input">
		<form  id="zhuce" action="#"> 
			<div class="log">
				<div class="name">
					<label>用户名</label><input type="text" class="text" id="username" placeholder="用户名" name="username" />
				</div>
				<div class="pwd">
					<label>密码</label><input type="password" class="text" id="password" placeholder="密码" name="password" />
					<label>重复密码</label><input type="password" class="text" id="repassword" placeholder="重复密码" name="repassword" />
					<label>电话号码</label><input type="text" class="text" id="phone" placeholder="电话号码" name="phone" />
					<input type="submit" class="submit"  value="注册" onclick="onClick();"/>
					<a href="/login"><input type="button" class="submit"  value="登陆"/></a>
					<div class="check"></div>
				</div>
				<div class="tip"></div>
			</div>
			</form>
		</div>
	</div>
    <div class="air-balloon ab-1 png"></div>
	<div class="air-balloon ab-2 png"></div>
    <div class="footer"></div>
</div>
<div>
<ul id="ulul">

</ul>
</div>


</body>
</html>