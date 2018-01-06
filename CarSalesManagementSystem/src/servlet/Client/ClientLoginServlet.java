package servlet.Client;

import entity.Client;
import service.ClientService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 15:01 2017/6/22.
 * @Descrip 用户登录servlet
 */
@WebServlet(name = "ClientLoginServlet", urlPatterns = "/servlet/Client/ClientLoginServlet")
public class ClientLoginServlet extends HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)  {
        int id = Integer.parseInt(request.getParameter("clientid"));
        String password = request.getParameter("password");

        ClientService clientService = new ClientService();
        Client client = clientService.LoginClient(id, password);

        if (client != null) {
            request.getSession().setAttribute("client", client);
            try {
                response.sendRedirect("../../client_main.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String message = "用户或者密码不正确";
            request.getSession().setAttribute("message", message);
            try {
                response.sendRedirect("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
