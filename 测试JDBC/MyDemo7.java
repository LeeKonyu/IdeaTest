package 测试JDBC;

import java.io.*;
import java.sql.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 19:24
 */
public class MyDemo7 {
    public static void main(String[] args) {
        OutputStream ot=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/testsql?useUnicode=true&characterEncoding=UTF-8", "root", "admin");
            PreparedStatement p = c.prepareStatement("select * from message where id=?");
            p.setObject(1,30038);

            ResultSet rs=p.executeQuery();
            while (rs.next()){
                Blob b=rs.getBlob("pct");
                InputStream in=b.getBinaryStream();
                ot=new FileOutputStream("d:/a.png");
                int t=0;
                while ((t=in.read())!=-1){
                    ot.write(t);
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
