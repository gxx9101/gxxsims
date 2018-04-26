<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/source/js/jquery-3.3.1.min.js"></script>


<title>Insert title here</title>
<script type="text/javascript">     
function Onclick(){  
	$.ajax({
        url:'./starttext',
        type:'post',  
        dataType:'json',       
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
 <div id="showme">
	<button id="press" onclick="Onclick();"> showList</button>
</div>
 <div>
 <table >
 <thead>
    <tr>
        <td>username</td>
        <td>password</td>
        <td>phone</td>
                     
    </tr>  
    </thead>
    <tbody id="table">
    
    </tbody>
 </table>
 </div>
</body>
</html>