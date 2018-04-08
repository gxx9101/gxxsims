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
<script>


$(function(){
	$('.innerbtn').click(function(){
		$(this).next('.pop_box').slideDown('400');
	});
	$('.closepop').click(function(){
		$('.pop_box').slideUp('400');
	});

	$('.tbody1').on("click",".alonTr .innerbtn",function(){
		$(this).next('.pop_box').slideDown('400');
	})
	$('.tbody1').on("click",".alonTr .closepop",function(){
		$('.pop_box').slideUp('400');
	})

// 新增表单
	var show_count = 20;  
	var count = 1;  
	$(".AddTr").click(function () {
		var length = $(".tabInfo .tbody1>tr").length;
		//alert(length);
		if (length < show_count) 
		{
			$(".model1 tbody .alonTr").clone().appendTo(".tabInfo .tbody1");  
		}
	});


// 新增内件
	var show_count2 = 20;  
	var count2 = 1;  
	$(".addtr2").click(function () {
		var length = $(this).parent('.btn_a1').prev('.neijian').children('.tbody2 tr').length;
		//alert(length);
		if (length < show_count2) 
		{
			$(".model2 tbody tr").clone().appendTo($(this).parent('.btn_a1').prev('.neijian').children('.tbody2'));  
		}
	});

	// 动态的新增内件
	var show_count3 = 20;  
	var count3 = 1;  
	$(".tbody1").on("click",".dtadd",function () {
		var length = $(".neijian .tbody2 tr").length;
		//alert(length);
		if (length < show_count3) 
		{
			$('.model2 tbody tr').clone().appendTo($(this).parent('.btn_a1').prev('.neijian').children('.tbody2'));  
		}
	});
});


function deltr(opp) {
	var length = $(".tabInfo .tbody1>tr").length;
	//alert(length);
	if (length <= 1) {
		alert("至少保留一行");
	} else {
		$(opp).parent().parent().remove();//移除当前行
		
	}
}
// ----

function deltr2(opp) {
	var length = $(this).parent('.btn_a1').prev('.neijian').children('.tbody2 tr').length;
	//alert(length);
	if (length <= 1) {
		alert("至少保留一行");
	} else {
		$(opp).parent().parent().remove();//移除当前行
		
	}
}
// ----

function deltr3(opp) {
	var length = $('.neijian .tbody2 tr').length;
	//alert(length);
	if (length <= 1) {
		alert("至少保留一行");
	} else {
		$(opp).parent().parent().remove();//移除当前行
		
	}
}
// ----
</script>
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


<div class="wrapper">
<table cellspacing="0" cellpadding="0" border="0" class="normTbe model2 hide">
	<tbody>
	<tr class="alonTr2">
	<td><input type="button" value="上传照片" /></td>
		<td><input type="text" /></td>
		<td><input type="text" /></td>
		<td><input type="text" /></td>
		<td><input type="text" /></td>
		<td><input type="text" /></td>
		<td><input type="text" /></td>
		
		<td><a class="text_a" href="javascript:;" onclick="deltr3(this)">删除</a></td>
	</tr>
	</tbody>
</table>
<table cellspacing="0" cellpadding="0" border="0" class="normTbe model1 hide">
	<tbody>
		<tr class="alonTr">
		<td><input type="button" value="上传照片" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td>
				
				<a class="text_a" href="javascript:;" onclick="deltr(this)">删除</a>
			</td>
		</tr>
	</tbody>
</table>
<div class="itemInfo">
    <table cellspacing="0" cellpadding="0" border="0" class="normTbe tabInfo">
    <thead>
    	<tr>
    	    <th><em>*</em>照片</th>
			<th><em>*</em>学号</th>
			<th><em>*</em>姓名</th>
			<th><em>*</em>班级</th>
			<th><em>*</em>联系电话</th>
			<th>父亲名</th>
			<th>母亲名</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody class="tbody1">
		<tr>
		    <td><input type="button" value="上传照片" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td><input type="text" /></td>
			<td>					
			
          <a class="text_a" href="javascript:;" onclick="deltr(this)">删除</a>
			</td>
		</tr>
	</tbody>
    </table>
    <div class="copybtn">
		<a href="javascript:;" class="AddTr">新增</a>
		<a href="javascript:;" class="ture">确定</a>
	</div>
    </div>

</div><!-- itemInfo -->


</body>
</html>