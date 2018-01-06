package servlet.Admin;

import entity.Admin;
import service.AdminService;
import util.MySql;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 15:01 2017/6/22.
 * @Descrip 管理员登录的servlet
 */
@WebServlet(name = "AdminLoginServlet", urlPatterns = "/servlet/Admin/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String password = request.getParameter("password");

        AdminService adminService = new AdminService();
        Admin admin = adminService.LoginAdmin(id, password);

        MySql.backup();

        if (admin != null) {
            request.getSession().setAttribute("admin", admin);
            response.setHeader("refresh","1;URL=../../admin_main.jsp");

        } else {
            String message = "用户名或者密码不正确";
            request.getSession().setAttribute("message", message);
            try {
                response.sendRedirect("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
