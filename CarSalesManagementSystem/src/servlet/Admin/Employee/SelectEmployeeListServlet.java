package servlet.Admin.Employee;

import entity.Employee;
import service.EmployeeService;

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
 * @Descrip 查询员工信息列表serlvet
 */
@WebServlet(name = "SelectEmployeeListServlet", urlPatterns = "/servlet/Admin/Employee/SelectEmployeeListServlet")
public class SelectEmployeeListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.selectEmployeeList();
        request.getSession().setAttribute("employeeList", employeeList);
        response.sendRedirect("../../../admin_employee.jsp");
    }
}
