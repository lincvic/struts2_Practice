package servlet.Admin.Purchase;

import entity.DetailPurchase;
import service.PurchaseService;

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
@WebServlet(name = "SelectPurchaseListServlet", urlPatterns = "/servlet/Admin/Purchase/SelectPurchaseListServlet")
public class SelectPurchaseListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PurchaseService purchaseService = new PurchaseService();
        List<DetailPurchase> purchaseList = purchaseService.selectDetailPurchaseList();

        request.getSession().setAttribute("purchaseList", purchaseList);
        response.sendRedirect("../../../admin_purchase.jsp");
    }
}
