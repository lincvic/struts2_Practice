package util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 14:42 2017/6/20.
 * @Descrip
 */
public class ConnUtil {
    private static Connection connection = null;
    private static String URL = null;
    private static String USERNAME = null;
    private static String PASSWORD = null;
    private static String DRIVER = null;

    private ConnUtil() {

    }

    /**
     * 加载数据库配置
     */
    private static void loadConfig() {
        try {
            InputStream is = ConnUtil.class.getResourceAsStream("../config/jdbc.properties");
            Properties prop = new Properties();
            prop.load(is);
            USERNAME = prop.getProperty("jdbc.username");
            PASSWORD = prop.getProperty("jdbc.password");
            URL = prop.getProperty("jdbc.url");
            DRIVER = prop.getProperty("jdbc.driver");
        } catch (Exception e) {
            throw new RuntimeException("加载配置文件出错！", e);
        }
    }

    /**
     * 获取数据库连接
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        loadConfig();
        Class.forName(DRIVER);//加载数据库驱动
        if (connection == null) {
            synchronized (ConnUtil.class) {
                if (connection == null) {
                    connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                }
            }
        }
        return connection;
    }

    /**
     * 关闭数据库连接
     *
     * @throws SQLException
     */
    public static void closeConn() throws SQLException {
        if (connection != null)
            connection.close();
    }

}
