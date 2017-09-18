package Tsofen.wb.servletsTests;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/LogIn.jsp");
		rd.forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		User l1= new User();
		l1.setPassword(request.getParameter("uPass"));
		l1.setUserName(request.getParameter("uName"));
		
	
		if(l1.getUserName().equals("tsofen")&&l1.getPassword().equals("tsofen"))
		{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Valid.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("isNotEntered",1);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/LogIn.jsp");
			rd.forward(request, response);
		}
		
	}

}
