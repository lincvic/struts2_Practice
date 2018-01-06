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
 * @Date 23:56 2017/6/22.
 * @Descrip
 */
@WebServlet(name = "DeleteCarServlet", urlPatterns = "/servlet/Admin/Car/DeleteCarServlet")
public class DeleteCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int carid = Integer.parseInt(request.getParameter("carid"));

        CarService carService = new CarService();
        carService.deleteCar(carid);

        List<Car> carList = carService.selectCarList();
        request.getSession().setAttribute("carList", carList);

        try {
            response.sendRedirect("../../../delete_car_success.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
