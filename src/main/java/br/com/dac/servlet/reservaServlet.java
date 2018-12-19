package br.com.dac.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.Helper;
import br.com.dac.dao.BicicletaDAO;
import br.com.dac.dao.HistoricoDAO;
import br.com.dac.dao.FactoryDAO;
import br.com.dac.dao.HistoricoDAO;
import br.com.dac.entity.Bicicleta;
import br.com.dac.entity.Historico;
import br.com.dac.entity.Historico;
///reservarBicicleta
@WebServlet(
        name = "reservaServlet",
        urlPatterns = {"/reservarBicicleta"}
)
public class reservaServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		
		Date data = new Date();
		
		Integer estacaoId = Helper.requestParameterInt(req, "estacaoId");
		Integer bikeId = Helper.requestParameterInt(req, "bikeId");
    	
	    HistoricoDAO<Historico> dao = FactoryDAO.getFactory().getHistoricoDAO();
		Historico historico = new Historico();
		
		String url = "/listaBicicletas?id=" + estacaoId;
		
		
		try {
			historico.setDataInicio(data);
			historico.setIdBicicleta(bikeId);
			historico.setIdEstacao(estacaoId);
			
	        dao.beginTransaction();
			dao.save(historico);
			dao.commitTransaction();
			req.setAttribute("historico", historico);
 	        req.setAttribute("success", "Bicicleta Reservada com Sucesso");
 	        
			resp.sendRedirect(url);
			
        }catch(Exception e) {
        	req.setAttribute("historico", historico);
 	        req.setAttribute("error", "Não foi possível reservar");
 	        req.getRequestDispatcher(url).forward(req, resp);  

       }
    }
}
