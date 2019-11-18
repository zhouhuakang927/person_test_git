package testgit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handleLogic(req,resp);
	}

	public void handleLogic(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Ω¯»ÎTestServlet");
		String requestURI = req.getRequestURI();
		System.out.println(requestURI);
		
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogic(req,resp);
	}
}
