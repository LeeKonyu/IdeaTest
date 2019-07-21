package 测试JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : 猕猴桃
 * @create 2019/7/17 20:36
 */
public class Demo01 {
    public static void main(String[] args) {
        Connection c = null;
        try {
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");    //Driver是个接口
            //建立连接                                                       端口号/数据库名
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testsql","root","admin");
            //可以通过DriverMangager接口建立连接,返回对象

            System.out.println(c);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(c!=null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
