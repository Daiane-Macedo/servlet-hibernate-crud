package br.com.dac.servlet;

import java.io.IOException;

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
        name = "EstacaoDeleteServlet",
        urlPatterns = {"/deleteEstacao"}
)
public class EstacaoDeleteServlet extends HttpServlet{
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	Integer estacaoId = Helper.requestParameterInt(req, "id");

    	EstacaoDAO<Estacao> dao = FactoryDAO.getFactory().getEstacaoDAO();
    	Estacao estacao = null;
    	
        try {
	        estacao = FactoryDAO.getFactory().getEstacaoDAO().findByid(estacaoId.intValue());	
	        dao.beginTransaction();
	        dao.delete(estacao);
	        dao.commitTransaction(); 
			resp.sendRedirect("/listaEstacoes");	        
		}catch(Exception e) {
	       	req.setAttribute("estacao", estacao);
	       	req.setAttribute("error", "Não foi possível remover esta estação");
	 	    req.getRequestDispatcher("listaEstacoes.jsp").forward(req, resp);  
	 	    return;
        }
 }
}
