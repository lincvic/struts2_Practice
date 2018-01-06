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
 * @Date 23:56 2017/6/22.
 * @Descrip 删除员工信息的servlet
 */
@WebServlet(name = "DeleteEmployeeServlet", urlPatterns = "/servlet/Admin/Employee/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("eid"));

        EmployeeService employeeService = new EmployeeService();
        employeeService.deleteEmployee(id);

        List<Employee> employeeList = employeeService.selectEmployeeList();
        request.getSession().setAttribute("employeeList", employeeList);

        response.sendRedirect("../../../delete_employee_success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
