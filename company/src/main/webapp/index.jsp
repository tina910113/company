<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=100>
			<td align=center><%@include file="title.jsp" %>
		<tr height=450>
			<td>
				<form action="LoginController" method="post">
					<table width=400 align=center border=1>
						<tr>
							<td colspan=2 align=center><h3>�|���n�J</h3>
						<tr>
							<td>�b��
							<td><input type="text" name="username">
						<tr>
							<td>�K�X
							<td><input type="password" name="password">
						<tr>
							<td colspan=2 align=center>
							<input type="submit" value="�n�J">
							
					</table>
				
				</form>
			
		<tr height=50>
			<td align=center><%@include file="end.jsp" %>
	</table>

</body>
</html>