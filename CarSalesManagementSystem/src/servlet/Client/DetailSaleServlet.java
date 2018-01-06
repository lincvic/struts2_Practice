package servlet.Client;

import entity.DetailSale;
import service.SaleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * DetailSaleServlet
 *
 * Created by MurphySL on 2017/6/24.
 * 错误页面待添加
 */
@WebServlet(name = "DetailSaleServlet",value = "/servlet/DetailSaleServlet")
public class DetailSaleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int carid = Integer.parseInt(request.getParameter("carid"));
        SaleService saleService = new SaleService();
        DetailSale detailSale = saleService.selectRandomDetailSale(carid);

        if (detailSale != null) {
            request.getSession().setAttribute("detailSale", detailSale);
            try {
                response.sendRedirect("../../sale_detail.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String message = "未知的错误";
            request.getSession().setAttribute("message", message);
            try {
                response.sendRedirect("../../not_sale.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
