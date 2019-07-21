package 测试JDBC;

import java.sql.*;
import java.util.Random;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 16:53
 */
public class MyDemo4 {
    public static void main(String[] args) {
        Connection c = null;
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/testsql?useUnicode=true&characterEncoding=UTF-8", "root", "admin");
            String s1="insert into message(date) values(?)";
            ps1=c.prepareStatement(s1);
            String s2="insert into message(timesta) values(?)";
            ps2=c.prepareStatement(s2);

            int date2=new Random().nextInt(10000000);

            //Date只有年月日
            Date date=new Date(System.currentTimeMillis()-date2);
            //Time只有时分秒
            java.sql.Time time=new java.sql.Time(System.currentTimeMillis());
            System.out.println(time);
            //Timestamp有年月日时分秒
            java.sql.Timestamp timestamp=new java.sql.Timestamp(System.currentTimeMillis()-date2);
            System.out.println(timestamp);


            ps1.setObject(1,date);
            ps2.setObject(1,timestamp);

            ps1.execute();
            ps2.execute();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(ps2!=null) {
                try {
                    ps2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps1!=null) {
                try {
                    ps1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(c!=null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
