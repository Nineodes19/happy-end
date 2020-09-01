<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>My JSP 'Login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
    <br/><br/><br/><br/><br/><br/><br/>
    <center>
    <form action="Login"  method="post">
	<table style="background-color: pink;">
		<tr style="background-color: blue;color:#ffffff">
			<td colspan="2" align="center">
			   <b>系统登录</b>
			</td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="userPwd"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			    <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;
			    <input type="reset" value="重置">
			</td>
		</tr>
	</table>
	<span style="color:red"><%=request.getAttribute("error") %></span>
	</form>
	</center>
</body>
</html>
