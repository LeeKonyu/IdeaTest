package 测试JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 10:00
 */
public class MyDemo1 {
    public static void main(String[] args) {
        Connection c=null;
        //加载驱动类
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("加载驱动类成功");
            //建立与数据库的连接
            String s1="jdbc:mysql://localhost:3306/testsql?useUnicode=true&characterEncoding=UTF-8";
            String s2="root";
            String s3="admin";
            c= DriverManager.getConnection(s1,s2,s3);
            System.out.println("连接数据库成功");

//            Statement stmt=c.createStatement();
//            String s4="insert into message (name,password) values('吴彦祖',123)";
//            stmt.execute(s4);

            String s5="insert into message(name,password) values(?,?)";
            PreparedStatement psmt=c.prepareStatement(s5);
            psmt.setString(1,"张学友");
            psmt.setString(2,"123");
            //setObject方法处理参数，这样可以不用管数据类型
            psmt.setObject(1,"张龙");
            psmt.setObject(2,456);
            psmt.execute();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
    }
}
