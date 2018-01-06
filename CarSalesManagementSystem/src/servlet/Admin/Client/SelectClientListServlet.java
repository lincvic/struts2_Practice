package servlet.Admin.Client;

import entity.Client;
import service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 7:40 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "SelectClientListServlet", urlPatterns = "/servlet/Admin/Client/SelectClientListServlet")
public class SelectClientListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ClientService clientService = new ClientService();
        List<Client> clientList = clientService.selectClientList();

        request.getSession().setAttribute("clientList", clientList);
        response.sendRedirect("../../../admin_client.jsp");
    }
}
