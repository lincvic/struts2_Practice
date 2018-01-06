package servlet.Client;

import service.SaleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 7:40 2017/6/23.
 * @Descrip 用户查看轿车销售servlet
 */
@WebServlet(name = "SelectSaleListServlet", urlPatterns = "/servlet/Client/SelectSaleListServlet")
public class SelectCarSaleListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SaleService saleService = new SaleService();
       /* ClientCarSaleInformation carSaleInformation = saleService.clientSelectCarSaleList();

        request.getSession().setAttribute("carSaleInformation", carSaleInformation);*/
        response.sendRedirect("");
    }
}
