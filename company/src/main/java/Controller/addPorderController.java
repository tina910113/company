package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.porder;
import Dao.porder.implDao;

@WebServlet("/addPorderController")
public class addPorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addPorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.����session�\��
		 * 2.�^��session����-->P
		 * 3.add-->p
		 * 4.����-->finish.jsp
		 * 
		 * 	
		 */
		
		HttpSession session=request.getSession();
		porder p=(porder) session.getAttribute("P");
		new implDao().add(p);
		
		response.sendRedirect("porder/finish.jsp");
	}

}