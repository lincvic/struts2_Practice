package service;

import dao.EmployeeDao;
import entity.Employee;

import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 23:37 2017/6/22.
 * @Descrip
 */
public class EmployeeService {

    public void insertEmployee(String name, String phonenumber) {
        if ((name != null && !"".equals(name.trim())) &&
                (phonenumber != null && !"".equals(phonenumber.trim()))) {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setPhonenumber(phonenumber);

            EmployeeDao employeeDao = new EmployeeDao();
            employeeDao.insertEmployee(employee);
        } else throw new RuntimeException("EmployeeService 的 insertEmployee 方法 参数输入不合法！");
    }

    public List<Employee> selectEmployeeList() {
        EmployeeDao employeeDao = new EmployeeDao();
        return employeeDao.selectEmployeeList();
    }

    public Employee selectEmployee(String id) {
        if (!"".equals(id) && id != null) {
            EmployeeDao employeeDao = new EmployeeDao();
            return employeeDao.selectEmployee(Integer.parseInt(id));
        } else throw new RuntimeException("EmployeeService 的 selectEmployee 方法 参数输入不合法！");
    }

    public void deleteEmployee(int eid) {
        if (eid > 0) {
            EmployeeDao employeeDao = new EmployeeDao();
            employeeDao.deleteEmployee(eid);
        } else throw new RuntimeException("EmployeeService 的 deleteEmployee 参数输入不合法！");
    }

    public void UpdateEmployee(int eid, String name, String phonenumber, int totalnum, int totalprofit) {
        if (eid > 0 &&
                (name != null && !"".equals(name.trim())) &&
                (phonenumber != null && !"".equals(phonenumber.trim())) &&
                totalnum > 0 &&
                totalprofit > 0) {
            Employee employee = new Employee();
            employee.setEid(eid);
            employee.setName(name);
            employee.setPhonenumber(phonenumber);
            employee.setTotalnum(totalnum);
            employee.setTotalprofit(totalprofit);

            EmployeeDao employeeDao = new EmployeeDao();
            employeeDao.UpdateEmployee(employee);
        } else throw new RuntimeException("EmployeeService 的 UpdateEmployee 参数输入不合法！");
    }
}
