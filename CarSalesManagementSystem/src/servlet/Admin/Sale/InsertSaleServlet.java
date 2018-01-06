package servlet.Admin.Sale;

import service.SaleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 23:23 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "InsertSaleServlet", urlPatterns = "/servlet/Admin/Sale/InsertSaleServlet")
public class InsertSaleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employeeId = request.getParameter("employeeId");
        String carId = request.getParameter("carId");
        String singlesale = request.getParameter("singlesale");
        String singleprofit = request.getParameter("singleprofit");

        SaleService saleService = new SaleService();
        /*saleService.insertCarSale(employeeId, carId, singlesale, singleprofit);*/

        /*List<AdminCarSaleModel> adminCarSaleModelList = saleService.adminSelectCarSaleList();
        request.getSession().setAttribute("adminCarSaleModelList", adminCarSaleModelList);*/
        response.sendRedirect("");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
