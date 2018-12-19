package br.com.dac.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.dao.FactoryDAO;
import br.com.dac.entity.Estacao;


@WebServlet(
        name = "homeUserServlet",
        urlPatterns = {"/"}
)
public class homeUserServlet extends HttpServlet{
	 @Override
	 public void doGet(HttpServletRequest req, HttpServletResponse resp)
		        throws IOException, ServletException {
		 
		 List<Estacao> estacoes = (List<Estacao>) FactoryDAO.getFactory().getEstacaoDAO().listAll();		
		 
		req.setAttribute("estacoes", estacoes);
	    req.getRequestDispatcher("/homeUser.jsp").forward(req, resp);
	}
}
