package br.com.dac.servlet;

import java.io.IOException;

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
        name = "BicicletaDeleteServlet",
        urlPatterns = {"/deleteBicicleta"}
)
public class BicicletaDeleteServlet extends HttpServlet{
	
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        
	    	Integer bikeId = Helper.requestParameterInt(req, "id");

	    	BicicletaDAO<Bicicleta> dao = FactoryDAO.getFactory().getBicicletaDAO();
	    	Bicicleta bicicleta = null;
	    	
	        try {
		        bicicleta = FactoryDAO.getFactory().getBicicletaDAO().findByid(bikeId.intValue());	
		        dao.beginTransaction();
		        dao.delete(bicicleta);
		        dao.commitTransaction(); 
				resp.sendRedirect("/listaBicicletas");	        
			}catch(Exception e) {
		       	req.setAttribute("bicicleta", bicicleta);
		       	req.setAttribute("error", "Não foi possível remover esta bicicleta");
		 	    req.getRequestDispatcher("listaBicicletas.jsp").forward(req, resp);  
		 	    return;
	        }
	 }
}
