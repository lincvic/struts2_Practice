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
 * @Date 23:56 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "DeletePurchaseServlet", urlPatterns = "/servlet/Admin/Purchase/DeletePurchaseServlet")
public class DeletePurchaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pid = Integer.parseInt(request.getParameter("pid"));

        PurchaseService purchaseService = new PurchaseService();
        purchaseService.deleteClientPurchase(pid);
        List<DetailPurchase> purchaseList = purchaseService.selectDetailPurchaseList();
        request.getSession().setAttribute("purchaseList", purchaseList);

        response.sendRedirect("../../../delete_purchase_success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
