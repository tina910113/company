<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.porder.implDao"
    import="Model.porder"
    import="java.util.List"
    %>
    <%
    /*
    1.getParameter--->�S���-->null(��檫��S����),""->���S��J���
    2.getParameter�^��-->start,end����
    3.if-->start+end--->null,""-->queryAll
    4.if-->star+end-->�����--->querySum
    */
    String Start=request.getParameter("start");
    String End=request.getParameter("end");
    //out.println(Start); 
    
    
    List<porder> l=null;
    
    if(Start!=null && Start!="" && End!=null && End!="")
    {	
   	 int S=Integer.parseInt(Start);
   	 int E=Integer.parseInt(End);
   	 l=new implDao().querySum(S, E);
    }
    else
    {
   	 l=new implDao().queryAll();
    }
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
			<form action="" method="post">
				<table width=500 align=center border=1>
					<tr align=center>
						<td>
						���B�q
						<input type="text" name="start" size=3>
						��
						<input type="text" name="end" size=3>
						<input type="submit" value="ok">
				
				</table>		
			
			</form>
			<hr>
			<table width=500 align=center border=1>
					<tr align=center>
						<td>ID<td>�ู<td>A�\<td>B�\<td>C�\<td>���B 
					<%
						for(porder p:l)
						{
							out.println("<tr align=center><td>"+p.getId()+
									"<td>"+p.getDesk()+
									"<td>"+p.getA()+
									"<td>"+p.getB()+
									"<td>"+p.getC()+
									"<td>"+p.getSum());
						}
					
					
					%>
						
					<tr>
						<td colspan=6 align=center>
						<a href="porder.jsp">�^�ʪ��޲z��</a>
				
				
				</table>
				
			
		<tr height=50>
			<td align=center><%@include file="../end.jsp" %>
	</table>

</body>
</html>