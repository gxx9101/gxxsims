<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<title>添加学生</title>

<link href="/source/css/styleback.css" rel="stylesheet" type="text/css" />
<script src="/source/js/jquery-1.11.3.min.js"></script>

<style>
	*{padding: 0px;margin:0px ;font-style: normal;list-style-type: none;text-decoration: none;font-family: "微软雅黑";font-size: 14px;border:0 none;line-height: 24px;color: #666; }
	table{table-layout: fixed;width: 100%;margin-top:30px}
	input,button,select,textarea{outline: none;resize:none;padding: 3px 5px;border:1px solid #ddd;}
	input:focus,textarea:focus{border:1px solid #9ab6d6;}
	.whiteBg{background: #fff;}
	.normTbe{border-left:1px solid #ddd;border-top:1px solid #ddd; }
	.normTbe td,.normTbe th{border-bottom: 1px solid #ddd;border-right:1px solid #ddd;padding: 15px;text-align: center;}
	.normTbe input{width: 80%;text-align: center;}
	.wrapper{width: 1140px;padding: 0 20px; margin: 0 auto;clear: both;}
	.hide{display: none;}
	.hideTr{background: #ddd;}
	.pop_box{position: fixed;top: 0;left: 0;right: 0;bottom: 0;z-index: 99999;}
	.pop_box .bg{background: #000;opacity: 0.7;filter:alpha(opacity=70);position: absolute;top:0;left: 0;right: 0;bottom: 0;}
	.pop_box .contentP{position: relative;margin:0 auto;margin-top: 10%; background: #fff;width: 80%;}
	.pop_box .PTit{height: 45px;background: #eee;}
	.pop_box .PTit h3{line-height: 45px;float: left;padding-left: 15px;font-weight: normal;font-size: 16px;}
	.pop_box .PTit a{display: block;width: 45px;line-height: 45px;text-align: center;background: #ddd;float: right;font-size: 20px;}
	.pop_box .PTit a:hover{background: #50abfd;color: #fff;}
	.pop_box .textmian{padding: 15px;}
	.btn_a1{padding-top: 15px;}
	.btn_a1 a{display: inline-block;*display: inline;*zoom: 1;width: 120px;line-height: 45px;background: #50abfd;color: #fff;}
	.btn_a1 .addtr2,.btn_a1 .dtadd{background: #ff9900;}
</style>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">学生管理</a></li>
    <li><a href="#">添加学生信息</a></li>
    </ul>    
    </div>

<div class="wrapper">
<div class="itemInfo">
    <form action="/student" method="post">
    <table cellspacing="0" cellpadding="0" border="0" class="normTbe tabInfo">
    <thead>
    	<tr>
    	   
			<th><em>*</em>学号</th>
			<th><em>*</em>姓名</th>
			<th><em>*</em>班级</th>
			<th><em>*</em>联系电话</th>
			<th>母亲名</th>
			<th>父亲名</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody class="tbody1">
		<tr>
		   
			<td><input type="text" name="stuid"/></td>
			<td><input type="text" name="stuname"/></td>
			<td><input type="text" name="grade"/></td>
			<td><input type="text" name="stuphone"/></td>
			<td><input type="text" name="mother"/></td>
			<td><input type="text" name="father"/></td>
			<td>					
			<input type="submit" name="tianjia" class="innerbtn" value="确定添加"/>
        
			</td>
		</tr>
	</tbody>
    </table>
    </form>  
    
      <form action="/uploadimg" enctype="multipart/form-data" method="post">
      <input type="text" name="stuid" placeholder="学号"/>
           上传图片：<input type="file" name="file" value="选择图片"/><br/>
     <input type="submit" value="上传"/>
     </form>
     
     <form action="/uploadimg" enctype="multipart/form-data" method="post">      
           上传excel：<input type="file" name="file" value="上传excel"/><br/>
     <input type="submit" value="上传excel"/>
     </form>
    
    </div>
    
    
  
    
   </div>


</body>
</html>