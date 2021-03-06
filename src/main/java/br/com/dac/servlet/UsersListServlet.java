package br.com.dac.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dac.dao.UsuarioDAO;

@WebServlet(
        name = "UserListServlet",
        urlPatterns = {"/usersList"}
)
public class UsersListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        UsuarioDAO dao = UsuarioDAO.getInstanse();
        req.setAttribute("users", dao.findAll());
        req.getRequestDispatcher("usersList.jsp").forward(req, resp);
    }
}
