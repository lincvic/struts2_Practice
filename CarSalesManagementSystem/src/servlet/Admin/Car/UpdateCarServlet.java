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
 * @Date 0:03 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "UpdateCarServlet", urlPatterns = "/servlet/Admin/Car/UpdateCarServlet")
public class UpdateCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int carid = Integer.parseInt(request.getParameter("carid"));
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String picture = request.getParameter("picture");

        CarService carService = new CarService();
        carService.UpdateCar(carid, brand, model, price, picture, quantity);

        List<Car> carList = carService.selectCarList();
        request.getSession().setAttribute("carList", carList);

        response.sendRedirect("../../../update_car_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
