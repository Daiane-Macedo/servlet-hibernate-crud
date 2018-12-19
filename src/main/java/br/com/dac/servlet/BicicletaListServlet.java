package br.com.dac.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.Helper;
import br.com.dac.dao.BicicletaDAO;
import br.com.dac.dao.FactoryDAO;
import br.com.dac.entity.Bicicleta;

@WebServlet(
        name = "BicicletaListServlet",
        urlPatterns = {"/listaBicicletas"}
)
public class BicicletaListServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		
		Integer estacaoId = Helper.requestParameterInt(req, "id");

    	BicicletaDAO<Bicicleta> dao = FactoryDAO.getFactory().getBicicletaDAO();
    	Bicicleta bicicleta = new Bicicleta();;
    	List<Bicicleta> bikes = new ArrayList<Bicicleta>();
    	List<Bicicleta> disponiveis = new ArrayList<Bicicleta>();
    	
    	if (estacaoId != null) {
	        
    		disponiveis = ((List<Bicicleta>)FactoryDAO.getFactory().getBicicletaDAO().findByEstacaoId(estacaoId.intValue()));	
    		if(disponiveis != null)
;    			bikes.addAll(disponiveis);

	        req.setAttribute("bicicletas",bikes );
		    req.getRequestDispatcher("bicicletasView.jsp").forward(req, resp);
		    return ;
    	}else {
        	bikes = FactoryDAO.getFactory().getBicicletaDAO().listAll();		
        }
    	req.setAttribute("bicicletas",bikes );
	    req.getRequestDispatcher("listaBicicletas.jsp").forward(req, resp);
    }
}
