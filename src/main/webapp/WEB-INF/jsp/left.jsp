<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="/source/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="/source/js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>通讯录</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="/source/images/leftico01.png" /></span>学生管理
    </div>
    	<ul class="menuson">
        
        <li class="active"><cite></cite><a href="/hello" target="rightFrame">欢迎页面</a><i></i></li>
        <li><cite></cite><a href="/addstudent" target="rightFrame">添加学生信息</a><i></i></li>
        <li><cite></cite><a href="/findallstudent" target="rightFrame">编辑学生信息</a><i></i></li>
        <li><cite></cite><a href="imglist.html" target="rightFrame">编辑学籍</a><i></i></li>
        <li><cite></cite><a href="imglist1.html" target="rightFrame">添加班级信息</a><i></i></li>
        <li><cite></cite><a href="tools.html" target="rightFrame">修改班级信息</a><i></i></li>
        
        </ul>    
    </dd>
        
    
    <dd>
    <div class="title">
    <span><img src="/source/images/leftico02.png" /></span>课程管理
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="#">添加课程信息</a><i></i></li>
        <li><cite></cite><a href="#">修改课程信息</a><i></i></li>
        <li><cite></cite><a href="#">学生课表</a><i></i></li>
        <li><cite></cite><a href="#">发布信息</a><i></i></li>
        <li><cite></cite><a href="#">上传资料</a><i></i></li>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="/source/images/leftico03.png" /></span>成绩管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="#">学生成绩</a><i></i></li>
        <li><cite></cite><a href="#">考试安排</a><i></i></li>
        <li><cite></cite><a href="#">修改成绩</a><i></i></li>
        <li><cite></cite><a href="#">其他</a><i></i></li>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="/source/images/leftico04.png" /></span>系统管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="#">添加用户</a><i></i></li>
        <li><cite></cite><a href="#">修改密码</a><i></i></li>
        <li><cite></cite><a href="#">退出系统</a><i></i></li>
       
    </ul>
    
    </dd>   
    
    </dl>
</body>
</html>
