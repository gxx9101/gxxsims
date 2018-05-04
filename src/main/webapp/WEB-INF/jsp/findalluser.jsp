<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/source/js/jquery-3.3.1.min.js"></script>

<title>Insert title here</title>
<script type="text/javascript">     
function Onclick(){  
	var Username=$('#username').val();
	
	$.ajax({
        url:'./finduser',
        type:'post',  
        data:Username,
        contentType : 'application/json;charset=UTF-8',       
        success : function(data) {        	
        	var show="";
        	for(var i=0;i<data.length;i++){    //遍历data数组
        	var user = data[i];     
        	show +="<tr><td>"+user.username+"</td><td>"+user.password+"</td><td>"+user.phone+"</td>";
        	}
            $("#table").html(show); //在html页面id=table的标签里显示show内容
            },
             
        error : function() {
            alert("失败!");  
            }
            });
}  

</script>
</head>
<body>
<table id="travel">
 
    <thead>        	 
        <tr> 
            <th scope="col">用户ID</th> 
            <th scope="col">用户名</th>      
            <th scope="col">密码</th>
            <th scope="col">电话</th>
            <th scope="col">编辑</th>
        </tr>        
    </thead>    
    
    <tbody>
    <c:forEach items="${alluser}" var="u" >   	             
        <tr> 
            <td class="count">${u.userid}</td>
            <td class="count">${u.username}</td>
            <td class="subtotal">${u.password} </td>
            <td class="count">${u.phone}</td>

             <td class="count"><a href="/deleteuser?userid=${u.userid }">删除</a>&nbsp;&nbsp;&nbsp;<a href="/updatestudent">更新</a></td>
        </tr>        
      </c:forEach>   
          
    </tbody>
 

</table>
<form action="./insertuser" method="post">
用户名：<input  type="text" name="username" />
密码：<input  type="password" name="password" />
重复密码：<input  type="password" name="repassword" />
电话号码：<input  type="text" name="phone" />
<input  type="submit" value="添加用户" name="tianjia" />
</form>

<div id="finduser">
    <input type="text" name="username" id="username"/>
	<input type="submit" onclick="Onclick();" value="查找"/>
</div>

<div>
<table id="table">

</table>
</div>
</body>
</html>