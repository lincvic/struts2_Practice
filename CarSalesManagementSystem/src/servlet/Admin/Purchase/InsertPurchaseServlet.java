package servlet.Admin.Purchase;

import entity.DetailPurchase;
import service.PurchaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 23:23 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "InsertPurchaseServlet", urlPatterns = "/servlet/Admin/Purchase/InsertPurchaseServlet")
public class InsertPurchaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int clientid = Integer.parseInt(request.getParameter("clientid"));
        int sid = Integer.parseInt(request.getParameter("sid"));


        PurchaseService purchaseService = new PurchaseService();
        purchaseService.insertPurchase(clientid, sid);

        List<DetailPurchase> purchaseList = purchaseService.selectDetailPurchaseList();
        request.getSession().setAttribute("purchaseList", purchaseList);
        response.sendRedirect("../../../insert_purchase_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
