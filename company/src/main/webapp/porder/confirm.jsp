<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"
    %>
<%
/*
1.����-->request->desk,A,B,C
2.A,B,C-->String--->int
3.new porder

*/
request.setCharacterEncoding("big5");
String Desk=request.getParameter("desk");	//��addPorder.jsp��desk(�ู)
int A=Integer.parseInt(request.getParameter("A"));
int B=Integer.parseInt(request.getParameter("B"));
int C=Integer.parseInt(request.getParameter("C"));

porder p=new porder(Desk,A,B,C);
session.setAttribute("P",p);//P=p�A�]�wP�h��p

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=100>
			<td align=center><%@include file="../title.jsp" %>
		<tr height=450>
			<td>
			<table width=400 align=center border=1>
				<tr>
					<td colspan=2 align=center>//�X�֪�����
					<h4>�A���q��ӥج�:</h4>
				<tr>
					<td>�ู
					<td><%=p.getDesk() %>
				<tr>
					<td>A�\
					<td><%=p.getA() %>
				<tr>
					<td>B�\
					<td><%=p.getB() %>
				<tr>
					<td>C�\
					<td><%=p.getC() %>
				<tr>
					<td>�@
					<td><%=p.getSum() %>��
				<tr>
					<td colspan=2 align=center>
					<a href="addPorder.jsp">���s���</a>
					<a href="../addPorderController">�T�w</a>
			
			</table>
				
			
		<tr height=50>
			<td align=center><%@include file="../end.jsp" %>
	</table>

</body>
</html>