package br.com.dac.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.Helper;
import br.com.dac.dao.FactoryDAO;
import br.com.dac.entity.Administrador;


public class AdministradorManagerServlet extends HttpServlet{
	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       
	    	Integer admId = Helper.requestParameterInt(req, "id");
	        
	    	if (admId != null) {
	        	Administrador adm = FactoryDAO.getFactory().getAdministradorDAO().findByid(admId);
	        
	        	req.setAttribute("adm",adm );
	    	}
	    	req.getRequestDispatcher("admManager.jsp").forward(req, resp);
	    }
}
