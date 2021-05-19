package in.jeya.service.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.jeya.service.Validation.AdminLoginValid;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLoginServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		boolean valid = AdminLoginValid.login(username, password);
		if (valid) {
			System.out.println("Successfully Logged In");
			response.sendRedirect("AdminPage.jsp");
		} else {
			String message = "Invalid Login - Enter Correct Details";
			response.sendRedirect("AdminLogin.jsp?errorMessage=" + message);
		}

	}

}
