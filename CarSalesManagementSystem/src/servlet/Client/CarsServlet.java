package servlet.Client;

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
 * Created by lenovo on 2017/6/24.
 */
@WebServlet(name = "CarsServlet", value = "/servlet/CarsServlet")
public class CarsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CarService carService = new CarService();
        List<Car> cars = carService.selectCarList();

        if (cars != null) {
            request.getSession().setAttribute("cars", cars);
            try {
                response.sendRedirect("../../cars.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String message = "未知的错误";
            request.getSession().setAttribute("message", message);
            try {
                response.sendRedirect("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
