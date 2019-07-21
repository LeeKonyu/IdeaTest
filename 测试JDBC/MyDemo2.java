package 测试JDBC;

import java.sql.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 15:21
 */
public class MyDemo2 {
    public static void main(String[] args) {
        Connection ct=null;
        PreparedStatement p=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/testsql?useUnicode=true&characterEncoding=UTF-8","root","admin");

            String sql="select * from message where id>?";
            p=ct.prepareStatement(sql);
            p.setObject(1,5);
            rs= p.executeQuery();
            while(rs.next()){

                System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3));

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(p!=null)
                    p.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(ct!=null)
                ct.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
