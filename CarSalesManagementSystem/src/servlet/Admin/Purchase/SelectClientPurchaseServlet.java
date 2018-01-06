package servlet.Admin.Purchase;

import service.PurchaseService;

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
@WebServlet(name = "SelectClientPurchaseServlet", urlPatterns = "/servlet/Admin/Purchase/SelectClientPurchaseServlet")
public class SelectClientPurchaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        PurchaseService purchaseService = new PurchaseService();
       /* Purchase purchase = purchaseService.selectClientPurchase(id);

        request.getSession().setAttribute("clientPurchase", purchase);
        response.sendRedirect("");*/
    }
}
