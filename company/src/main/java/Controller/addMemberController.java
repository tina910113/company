package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.member.implMember;
import Model.member;

@WebServlet("/addMemberController")
public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.接收username
		 * 2.true-->有人用->重複-->addMemberError
		 * 3.false-->接收所有資料 password,name,address....
		 * 4.new member
		 * add(m)
		 * 5.addMemberSuccess
		 */
		
		request.setCharacterEncoding("big5");//可讀取中文
		String Username=request.getParameter("username");
		if(new implMember().selectUser(Username))
		{
			response.sendRedirect("member/addMemberError.jsp");
		}
		else
		{
			String Password=request.getParameter("password");
			String Name=request.getParameter("name");
			String Address=request.getParameter("address");
			String Phone=request.getParameter("phone");
			String Mobile=request.getParameter("mobile");
			
			member m=new member(Username,Password,Name,Address,Phone,Mobile);
			new implMember().add(m);
			response.sendRedirect("member/addMemberSuccess.jsp");
		}
	}

}