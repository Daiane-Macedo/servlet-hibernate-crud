package br.com.dac.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		List<Bicicleta> bikes = FactoryDAO.getFactory().getBicicletaDAO().listAll();		
		 req.setAttribute("bicicletas",bikes );
	     req.getRequestDispatcher("listaBicicletas.jsp").forward(req, resp);
    }
}
