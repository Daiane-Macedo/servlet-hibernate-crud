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
import br.com.dac.entity.Estacao;

@WebServlet(
        name = "EstacaoManagerServlet",
        urlPatterns = {"/estacoes"}
)
public class EstacaoManagerServlet extends HttpServlet {
	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       
	    	Integer estacaoId = Helper.requestParameterInt(req, "id");
	        
	    	if (estacaoId != null) {
	        	Estacao estacao = FactoryDAO.getFactory().getEstacaoDAO().findByid(estacaoId);
	        
	        	req.setAttribute("estacao",estacao );
	    	}
	    	req.getRequestDispatcher("estacaoManager.jsp").forward(req, resp);
	    }
	 
	 @Override
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        
		 Integer estacaoId = Helper.requestParameterInt(req, "id");

	    EstacaoDAO<Estacao> dao = FactoryDAO.getFactory().getEstacaoDAO();
	    Estacao estacao = new Estacao();
	    	
	    if (estacaoId != null)
	    	estacao = FactoryDAO.getFactory().getEstacaoDAO().findByid(estacaoId.intValue());		

	     if (!(req.getParameter("nome").isEmpty())) 
	       	estacao.setNome(req.getParameter("nome"));
	    
	    if (!(req.getParameter("ativa").isEmpty())) 
	       	estacao.setAtiva(Integer.parseInt(req.getParameter("ativa")));
	    
	    if (!(req.getParameter("qtdSlotsDisponiveis").isEmpty())) 
	      	estacao.setQtdSlotsDisponiveis(Integer.parseInt(req.getParameter("qtdSlotsDisponiveis")));
	    
	    if (!(req.getParameter("capacidade").isEmpty())) 
	    	estacao.setCapacidade(Integer.parseInt(req.getParameter("capacidade")));
	    
	    if (!(req.getParameter("latitude").isEmpty()) && req.getParameter("latitude") != null)
	    	estacao.setLatitude(req.getParameter("latitude"));
	    
	    if (!(req.getParameter("localizacao").isEmpty()) && req.getParameter("localizacao") != null)
	       	estacao.setLocalizacao(req.getParameter("localizacao"));
	    
	    if (!(req.getParameter("longitude").isEmpty())  && req.getParameter("longitude") != null) 
	    	estacao.setLongitude(req.getParameter("longitude"));
	    	    	
	    try {
		    dao.beginTransaction();
			dao.save(estacao);
			dao.commitTransaction(); 
			resp.sendRedirect("/listaEstacoes");
			
	    }catch(Exception e) {
	    	req.setAttribute("estacao", estacao);
		    req.setAttribute("error", "Dados inválidos");
		    req.getRequestDispatcher("estacaoManager.jsp").forward(req, resp);  
		    return;
	    }
	 }

	 private int parseInt(String parameter) {
		 // TODO Auto-generated method stub
		 return 0;
	 }
}
