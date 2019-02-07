package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FieldAcres;

/**
 * Servlet implementation class getFieldSize
 */
@WebServlet("/getFieldSize")
public class getFieldSize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFieldSize() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userLength = request.getParameter("length");
		String userWidth = request.getParameter("width");
		
		FieldAcres userFieldSize = new FieldAcres(Integer.parseInt(userLength), Integer.parseInt(userWidth));
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userFieldSize.toString());
		//writer.close();
		
		request.setAttribute("thisFieldSize", userFieldSize);
		
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
