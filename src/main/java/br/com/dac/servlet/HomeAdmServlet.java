package br.com.dac.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "HomeAdmServlet",
        urlPatterns = {"/homeAdm"}
)
public class HomeAdmServlet extends HttpServlet{
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException, ServletException {
	   
    	req.getRequestDispatcher("/homeAdmin.jsp").forward(req, resp);
	}
}
