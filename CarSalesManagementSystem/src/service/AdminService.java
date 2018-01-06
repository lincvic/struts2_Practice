package service;


import dao.AdminDao;
import entity.Admin;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 15:07 2017/6/22.
 * @Descrip
 */
public class AdminService {

    public Admin LoginAdmin(int id, String password) {
        if ((id > 0) && (password != null && !"".equals(password.trim()))) {
            AdminDao adminDao = new AdminDao();
            Admin admin = new Admin();
            admin.setId(id);
            admin.setPassword(password);
            return adminDao.LoginAdmin(admin);
        } else throw new RuntimeException("AdminService 的 LoginAdmin 方法 参数输入不合法！");
    }


}
