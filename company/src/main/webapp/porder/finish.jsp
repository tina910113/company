<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"
    import="Model.member"
    %>
<%
/*
1.�^�� session����-->�n�J�|��+�q��ӥت���
2.�]�p�X�f�檺����
3.���XjavaScript�C�L���s
*/
porder p=(porder)session.getAttribute("P");
member m=(member)session.getAttribute("M");



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<SCRIPT LANGUAGE="JavaScript">

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function varitext(text){
text=document
print(text)
}
//  End -->
</script>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=100>
			<td align=center><%@include file="../title.jsp" %>
		<tr height=450>
			<td>
				<table width=450 align=center border=1>
					<tr>
						<td colspan=2 align=center>
						<h4>�q�즨�\,�o�O�A���ӥ�</h4>
					<tr>
						<td width=100 align=center>�Ȥ�W:
						<td><%=m.getName() %>
					<tr>
						<td width=100 align=center>�ู:
						<td><%=p.getDesk() %>
					<tr>
						<td width=100 align=center>A�\:
						<td><%=p.getA() %>
					<tr>
						<td width=100 align=center>B�\:
						<td><%=p.getB() %>
					<tr>
						<td width=100 align=center>C�\:
						<td><%=p.getC() %>
					<tr>
						<td width=100 align=center>�@:
						<td><%=p.getSum() %>��
					<tr>
						<td width=100 align=center>�X�f�a�}:
						<td><%=m.getAddress() %>
					<tr>
						<td width=100 align=center>�s���q��:
						<td><%=m.getPhone() %>
					<tr>
						<td width=100 align=center>���:
						<td><%=m.getMobile() %>
					<tr>
						<td colspan=2 align=center>
						<a href="porder.jsp">�^�ʪ���</a>
						<DIV ALIGN="CENTER">
							<FORM>
								<INPUT NAME="print" TYPE="button" VALUE="�C�L����"
								ONCLICK="varitext()">
							</FORM>
						</DIV>
				</table>
			
			
				
			
		<tr height=50>
			<td align=center><%@include file="../end.jsp" %>
	</table>

</body>
</html>