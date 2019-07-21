package 测试JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : 猕猴桃
 * @create 2019/7/17 21:16
 */
public class Demo2 {
    public static void main(String[] args) {
        Connection c= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String s1="jdbc:mysql://localhost:3306/mydb1";
        String s2="root";
        String s3="admin";

        long t1=System.currentTimeMillis();

        try {
            c = DriverManager.getConnection(s1,s2,s3);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(c!=null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
        System.out.println(c+"ms");
    }
}
