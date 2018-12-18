package br.com.dac.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.Helper;
import br.com.dac.dao.UsersDAO;
import br.com.dac.entity.User;

@WebServlet(
        name = "DeleteServlet",
        urlPatterns = {"/delete"}
)
public class UsersDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        if (!type.equals("user")) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        Integer id = Helper.requestParameterInt(req, "id");
        if (id == null) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        if (type.equals("user")) {
            UsersDAO dao = UsersDAO.getInstanse();
            User user = dao.findById(id.intValue());
            if (user == null) {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
                return;
            }

            dao.delete(user);
        }
        resp.sendRedirect("/usersList");
    }
}
