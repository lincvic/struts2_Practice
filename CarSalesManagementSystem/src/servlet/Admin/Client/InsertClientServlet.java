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
 * @Date 23:23 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "InsertClientServlet", urlPatterns = "/servlet/Admin/Client/InsertClientServlet")
public class InsertClientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String phonenumber = request.getParameter("phonenumber");
        String address = request.getParameter("address");

        ClientService clientService = new ClientService();
        clientService.insertClient(name, password, phonenumber, address);

        List<Client> clientList = clientService.selectClientList();
        request.getSession().setAttribute("clientList", clientList);
        response.sendRedirect("../../../insert_client_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
