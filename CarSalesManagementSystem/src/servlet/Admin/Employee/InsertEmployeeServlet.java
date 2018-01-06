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
 * @Date 23:23 2017/6/22.
 * @Descrip 插入员工信息servlet
 */
@WebServlet(name = "InsertEmployeeServlet", urlPatterns = "/servlet/Admin/Employee/InsertEmployeeServlet")
public class InsertEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phonenumber = request.getParameter("phonenumber");
        // 其他字段数据库中默认为0
        EmployeeService employeeService = new EmployeeService();
        employeeService.insertEmployee(name, phonenumber);

        List<Employee> employeeList = employeeService.selectEmployeeList();
        request.getSession().setAttribute("employeeList", employeeList);
        response.sendRedirect("../../../insert_employee_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
