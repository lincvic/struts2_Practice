package servlet.Admin.Car;

import entity.Car;
import service.CarService;

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
@WebServlet(name = "SelectCarServlet", urlPatterns = "/servlet/Admin/Car/SelectCarServlet")
public class SelectCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        CarService carService = new CarService();
       /* Car car = carService.selectCar(id);*/

      /*  request.getSession().setAttribute("car", car);*/
        response.sendRedirect("");
    }
}
