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
 * @Date 0:03 2017/6/23.
 * @Descrip
 */
@WebServlet(name = "UpdateEmployeeServlet", urlPatterns = "/servlet/Admin/Employee/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int eid = Integer.parseInt(request.getParameter("eid"));
        String name = request.getParameter("name");
        String phonenumber = request.getParameter("phonenumber");
        int totalprofit = Integer.parseInt(request.getParameter("totalprofit"));
        int totalnum = Integer.parseInt(request.getParameter("totalnum"));

        EmployeeService employeeService = new EmployeeService();
        employeeService.UpdateEmployee(eid, name, phonenumber, totalnum, totalprofit);

        List<Employee> employeeList = employeeService.selectEmployeeList();
        request.getSession().setAttribute("employeeList", employeeList);

        response.sendRedirect(request.getContextPath() + "../../../update_employee_success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
