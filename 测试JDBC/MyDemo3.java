package 测试JDBC;

import java.sql.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/18 16:11
 */
public class MyDemo3 {
    public static void main(String[] args) {
        Connection c=null;
        Statement sta=null;
        ResultSet rs=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/testsql?useUnicode=true&characterEncoding=UTF-8","root","admin");

            //设为手动提交
            c.setAutoCommit(false);
            sta=c.createStatement();
            long l1=System.currentTimeMillis();
            //进行批处理
            for (int i = 0; i <10000 ; i++) {
                sta.addBatch("insert into message(name,password) values ('lky','0"+i+"')");
            }
            //上传批处理
            sta.executeBatch();
            c.commit();

            long l2=System.currentTimeMillis();
            long s=(l2-l1)/1000;
            System.out.println("这次批处理大概花了"+s+"秒");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(sta!=null){
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
