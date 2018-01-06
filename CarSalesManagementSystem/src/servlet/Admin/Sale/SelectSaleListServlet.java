package servlet.Admin.Sale;

import entity.DetailSale;
import service.SaleService;

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
@WebServlet(name = "SelectSaleListServlet", urlPatterns = "/servlet/Admin/Sale/SelectSaleListServlet")
public class SelectSaleListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SaleService saleService = new SaleService();
        List<DetailSale> detailSaleList = saleService.selectDetailSaleList();
        request.getSession().setAttribute("detailSaleList", detailSaleList);

        response.sendRedirect("../../../admin_sale.jsp");
    }
}
