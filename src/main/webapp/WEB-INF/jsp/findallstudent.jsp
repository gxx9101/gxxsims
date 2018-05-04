<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 商品展示页 -->
<link rel="stylesheet" type="text/css" media="screen" href="/source/css/table.css" />
<script type="text/javascript" src="/source/js/jquery-1.2.6.min.js"></script>
<script type="text/javascript" src="/source/js/style-table.js"></script>
 <link href="/source/css/gouwuche.css" type="text/css" rel="stylesheet" media="all">
 <link href="/source/css/styleback.css" rel="stylesheet" type="text/css" />
<title>编辑商品</title>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">学生管理</a></li>
    <li><a href="#">编辑学生信息</a></li>
    </ul>    
    </div>
    
<div style="margin-right:10%;margin-top:-30px;float:right;">
<form action="AdminfindteaServlet" method="post">
<input type="text"  name="findtea"   style="height:28px;width:150px;border: 1px solid black "  />
<input type="submit" value="查找学生"  name="chazhao" style="height:30px;width:80px;background-color:#33ccff" />
</form>
</div>

  <table id="travel">
 
    <thead>        	 
        <tr>  
            <th scope="col">照片</th>      
            <th scope="col">学号</th>
            <th scope="col">姓名</th>
            <th scope="col">年级</th>
            <th scope="col">联系电话</th>
            <th scope="col">母亲名</th>
            <th scope="col">父亲名</th>
            <th scope="col">编辑</th>
        </tr>        
    </thead>    
    
    <tbody>
    <c:forEach items="${pb.beanlist}" var="s" >   	             
        <tr> 
             	
           <td class="goods"><img src="${s.image}"/></td>
            <td class="subtotal">${s.stuid }</td>
            <td class="subtotal">${s.stuname }</td>
            <td class="count">${s.grade }</td>
            <td class="subtotal">${s.stuphone} </td>
            <td class="count">${s.mother }</td>
            <td class="count">${s.father }</td>
             <td class="count"><a href="/deletestudent?stuid=${s.stuid }">删除</a>&nbsp&nbsp&nbsp<a href="/updatestudent">更新</a></td>
        </tr>        
      </c:forEach>   
          
    </tbody>
 

</table>
<%@ include file="/WEB-INF/jsp/pager.jsp" %>  
</body>
</html>