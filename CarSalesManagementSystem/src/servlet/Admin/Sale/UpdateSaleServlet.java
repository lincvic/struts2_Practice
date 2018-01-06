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
 * @Date 0:03 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "UpdateSaleServlet", urlPatterns = "/servlet/Admin/Sale/UpdateSaleServlet")
public class UpdateSaleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employeeId = request.getParameter("employeeId");//展示，而不是文本框
        String carId = request.getParameter("carId");
        String singlesale = request.getParameter("singlesale");
        String singleprofit = request.getParameter("singleprofit");

        SaleService saleService = new SaleService();
       /* saleService.UpdateCarSale(employeeId, carId, singlesale, singleprofit);*/

        /*List<AdminCarSaleModel> adminCarSaleModelList = saleService.adminSelectCarSaleList();
        request.getSession().setAttribute("adminCarSaleModelList", adminCarSaleModelList);*/

        response.sendRedirect(request.getContextPath() + "../../jsp/outline/outline_list_admin.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
