package servlet.Admin.Client;

import entity.Client;
import service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 0:15 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "SelectClientServlet", urlPatterns = "/servlet/Admin/Client/SelectClientServlet")
public class SelectClientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        ClientService clientService = new ClientService();
        Client client = clientService.selectClient(id);

        request.getSession().setAttribute("client", client);
        response.sendRedirect("");
    }
}
