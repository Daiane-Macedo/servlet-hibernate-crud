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
        name = "EstacaoListServlet",
        urlPatterns = {"/listaEstacoes"}
)
public class EstacaoListServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

		List<Estacao> estacoes = (List<Estacao>) FactoryDAO.getFactory().getEstacaoDAO().listAll();		
		 req.setAttribute("estacoes", estacoes);
	     req.getRequestDispatcher("listaEstacoes.jsp").forward(req, resp);
    }
}
