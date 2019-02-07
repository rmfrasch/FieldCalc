package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SeedPopulation;

/**
 * Servlet implementation class getSeedPop
 */
@WebServlet("/getSeedPop")
public class getSeedPop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getSeedPop() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userPop = request.getParameter("pop");

		SeedPopulation userSeedPop = new SeedPopulation(Integer.parseInt(userPop));

		request.setAttribute("thisPop", userSeedPop);

		getServletContext().getRequestDispatcher("/seedPopResults.jsp").forward(request, response);
	}

}
