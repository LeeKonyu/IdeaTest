package 测试JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 19:04
 */
public class MyDemo6 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/testsql?useUnicode=true&characterEncoding=UTF-8","root","admin");
            PreparedStatement p=c.prepareStatement("insert into message(name,pct) values (?,?)");
            p.setObject(1,"粟振华");
            p.setObject(2,new FileInputStream("C:/Users/Envy/Desktop/1.png"));
            p.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
