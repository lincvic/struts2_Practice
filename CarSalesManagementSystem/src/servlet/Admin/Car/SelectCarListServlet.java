package servlet.Admin.Car;

import entity.Car;
import service.CarService;

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
@WebServlet(name = "SelectCarListServlet", urlPatterns = "/servlet/Admin/Car/SelectCarListServlet")
public class SelectCarListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CarService carService = new CarService();
        List<Car> carList = carService.selectCarList();

        request.getSession().setAttribute("carList", carList);
        response.sendRedirect("../../../admin_cars.jsp");
    }
}
