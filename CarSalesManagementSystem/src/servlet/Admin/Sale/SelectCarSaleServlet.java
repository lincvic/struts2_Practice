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
 * @Date 0:15 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "SelectCarSaleServlet", urlPatterns = "/servlet/Admin/Sale/SelectCarSaleServlet")
public class SelectCarSaleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        SaleService saleService = new SaleService();
       /* Sale sale = saleService.selectCarSale(id);*/

        /*request.getSession().setAttribute("carSale", sale);*/
        response.sendRedirect("");
    }
}
