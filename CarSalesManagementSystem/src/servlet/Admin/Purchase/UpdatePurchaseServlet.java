package servlet.Admin.Purchase;

import entity.DetailPurchase;
import entity.Purchase;
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
 * @Date 0:03 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "UpdatePurchaseServlet", urlPatterns = "/servlet/Admin/Purchase/UpdatePurchaseServlet")
public class UpdatePurchaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pid = Integer.parseInt(request.getParameter("pid"));
        int clientid = Integer.parseInt(request.getParameter("clientid"));
        int sid = Integer.parseInt(request.getParameter("sid"));
        String purchasedate = request.getParameter("purchasedate");
        System.out.println(pid + " " + clientid + " " + sid + " " +purchasedate);

        PurchaseService purchaseService = new PurchaseService();
        purchaseService.updatePurchase(pid, clientid, sid, purchasedate);

        List<DetailPurchase> purchaseList = purchaseService.selectDetailPurchaseList();
        request.getSession().setAttribute("purchaseList", purchaseList);

        response.sendRedirect(request.getContextPath() + "../../../update_purchase_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
