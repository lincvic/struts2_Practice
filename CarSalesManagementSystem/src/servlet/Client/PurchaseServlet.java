package servlet.Client;

import service.PurchaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MurphySL on 2017/6/25.
 */
@WebServlet(name = "PurchaseServlet", value = "/servlet/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sid = Integer.parseInt(request.getParameter("sid"));
        int clientid = Integer.parseInt(request.getParameter("clientid"));
        PurchaseService purchaseService = new PurchaseService();
        purchaseService.insertPurchase(clientid, sid);

        response.sendRedirect("../../purchase_success.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
