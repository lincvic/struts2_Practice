package servlet.Admin.Employee;

import entity.Employee;
import service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 0:15 2017/6/23.
 * @Descrip 查询员工详细的servlet
 */
@WebServlet(name = "SelectEmployeeServlet", urlPatterns = "/servlet/Admin/Employee/SelectEmployeeServlet")
public class SelectEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.selectEmployee(id);

        request.getSession().setAttribute("employee", employee);
        response.sendRedirect("");
    }
}
