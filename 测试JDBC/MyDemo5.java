package 测试JDBC;

import java.io.*;
import java.sql.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 18:01
 */
public class MyDemo5 {
    public static void main(String[] args) {
        Connection c = null;
        PreparedStatement ps1=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/testsql?useUnicode=true&characterEncoding=UTF-8", "root", "admin");
//            String s1="insert into message(tx) values(?)";
//            ps1=c.prepareStatement(s1);
//
//            ps1.setClob(1,new FileReader(new File("C:\\Users\\Envy\\Desktop\\a.txt")));
//
//            ps1.execute();

            ps1=c.prepareStatement("select *from message where id>?");
            ps1.setObject(1,3);

            ResultSet rs=ps1.executeQuery();

            while (rs.next()){
                Clob cb=rs.getClob("id");
                Reader r=cb.getCharacterStream();
                int temp=0;
                while ((temp=r.read())!=-1){
                    System.out.println((char) temp);
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
