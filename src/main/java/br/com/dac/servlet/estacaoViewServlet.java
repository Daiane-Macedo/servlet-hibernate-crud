package br.com.dac.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.Helper;
import br.com.dac.dao.EstacaoDAO;
import br.com.dac.dao.FactoryDAO;
import br.com.dac.entity.Estacao;

@WebServlet(
        name = "estacaoViewServlet",
        urlPatterns = {"/estacaoView"}
)
public class estacaoViewServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	
		Integer estacaoId = Helper.requestParameterInt(req, "id");

    	EstacaoDAO<Estacao> dao = FactoryDAO.getFactory().getEstacaoDAO();
	    Estacao estacao = new Estacao();
	    	
	    if (estacaoId != null) {
	    	estacao = FactoryDAO.getFactory().getEstacaoDAO().findByid(estacaoId.intValue());
	    	req.setAttribute("estacao", estacao);
		    req.getRequestDispatcher("Estacaoview.jsp").forward(req, resp);
		   // resp.sendRedirect("/Estacaoview");
	    }
	}
}
