<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


<div>
<table>
<tr>   
    <td>tid</td>
    <td>departure_add</td>
    <td>destination_add</td>
    <td>departure_time</td>
    <td>arrival_time</td>
    <td>price</td>
    <td>uname_code</td>
</tr>

<c:forEach items="${tests}" var="test">
<tr>
    <td> ${test.tid} </td>
    <td> ${test.departure_add} </td>
    <td> ${test.destination_add} </td>
    <td> ${test.departure_time} </td>
    <td> ${test.arrival_time} </td>
    <td> ${test.price} </td>
    <td> ${test.uname_code} </td>
   </tr> 
</c:forEach>

</table>
</div>
</body>
</html>