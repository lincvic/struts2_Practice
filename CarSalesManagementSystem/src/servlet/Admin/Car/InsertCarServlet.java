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
 * @Date 23:23 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "InsertCarServlet", urlPatterns = "/servlet/Admin/Car/InsertCarServlet")
public class InsertCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        int price = Integer.parseInt(request.getParameter("price"));
        String picture = request.getParameter("picture");

        CarService carService = new CarService();
        carService.insertCar(brand, model, price, picture);

        List<Car> carList = carService.selectCarList();
        request.getSession().setAttribute("carList", carList);

        response.sendRedirect("../../../insert_car_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
