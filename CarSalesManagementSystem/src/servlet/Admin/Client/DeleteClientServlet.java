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
 * @Date 23:56 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "DeleteClientServlet", urlPatterns = "/servlet/Admin/Client/DeleteClientServlet")
public class DeleteClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int clientid = Integer.parseInt(request.getParameter("clientid"));

        ClientService clientService = new ClientService();
        clientService.deleteClient(clientid);

        List<Client> clientList = clientService.selectClientList();
        request.getSession().setAttribute("clientList", clientList);

        response.sendRedirect("../../../delete_client_success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
