package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porder.implDao;
import Model.porder;

@WebServlet("/updatePorderController")
public class updatePorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public updatePorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 1.request-->擷取-->getParameter-->id,desk,A,B,C
		 2.if-->全部!= NULL ,""-->queryid-->改-->update()
		 3.if-->有一個null,""->不執行動作
		 4.response-->回update.jsp
		 
		 */
		 
		request.setCharacterEncoding("big5");
		String ID=request.getParameter("id");
		 String DESK=request.getParameter("desk");
		 String A=request.getParameter("A");
		 String B=request.getParameter("B");
		 String C=request.getParameter("C");
		 
		 if(ID!=null && ID!="" && DESK!=null
				 && DESK!=""&&A!=null&&A!=""
				 &&B!=null&&B!="")
		 {
			 int I=Integer.parseInt(ID);
			 int a=Integer.parseInt(A);
			 int b=Integer.parseInt(B);
			 int c=Integer.parseInt(C);
			 
			 porder p=new implDao().queryId(I);
			 p.setDesk(DESK);
			 p.setA(a);
			 p.setB(b);
			 p.setC(c);
			 p.getSum();
			
			 new implDao().update(p);
			 
		 }
		 
		 
		 response.sendRedirect("porder/update.jsp");
		 
	}

}