package br.com.dac.servlet;

import java.io.IOException;
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
        name = "BicicletasManageServlet",
        urlPatterns = {"/bicicletas"}
)
public class BicicletasManageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    	Integer bikeId = Helper.requestParameterInt(req, "id");
        
    	if (bikeId != null) {
        	Bicicleta biclicleta = FactoryDAO.getFactory().getBicicletaDAO().findByid(bikeId);
        
        	req.setAttribute("bicicleta",biclicleta );
    	}
    	req.getRequestDispatcher("bicicletasManage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	Integer bikeId = Helper.requestParameterInt(req, "id");

    	BicicletaDAO<Bicicleta> dao = FactoryDAO.getFactory().getBicicletaDAO();
    	Bicicleta bicicleta = null;
    	
        if (bikeId != null) {
	        bicicleta = FactoryDAO.getFactory().getBicicletaDAO().findByid(bikeId.intValue());		
        }

        if (bikeId == null) {
            bicicleta = new Bicicleta();
        }
        if (!(req.getParameter("idEstacao").isEmpty())) {
        	bicicleta.setIdEstacao(Integer.parseInt(req.getParameter("idEstacao")));
    	}
        if (!(req.getParameter("ativa").isEmpty())) { 
        	bicicleta.setAtiva(Integer.parseInt(req.getParameter("ativa")));
        }
        if (!(req.getParameter("emUso").isEmpty())) {
        	bicicleta.setEmUso(Integer.parseInt(req.getParameter("emUso")));
    	}
        if (!(req.getParameter("codigo").isEmpty())) {
        	bicicleta.setCodigo(Integer.parseInt(req.getParameter("codigo")));
        }
        
        if(bicicleta == null) {
	        req.setAttribute("bicicleta", bicicleta);
	        req.setAttribute("error", "Invalid data");
	        req.getRequestDispatcher("bicicletasManage.jsp").forward(req, resp);  
	        return;
        }
        dao.beginTransaction();
		dao.save(bicicleta);
		dao.commitTransaction(); 
		resp.sendRedirect("/listaBicicletas");
    
    	}
    	private int parseInt(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}
}
