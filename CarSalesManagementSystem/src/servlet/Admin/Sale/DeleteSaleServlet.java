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
 * @Date 23:56 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "DeleteSaleServlet", urlPatterns = "/servlet/Admin/Sale/DeleteSaleServlet")
public class DeleteSaleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        SaleService saleService = new SaleService();
       /* saleService.deleteCarSale(id);*/

       /* List<AdminCarSaleModel> adminCarSaleModelList = saleService.adminSelectCarSaleList();*/
       /* request.getSession().setAttribute("adminCarSaleModelList", adminCarSaleModelList);*/

        response.sendRedirect("../../jsp/outline/outline_list_admin.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
