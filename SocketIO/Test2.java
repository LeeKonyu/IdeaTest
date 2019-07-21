package SocketIO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 15:17
 */
public class Test2 {
    //1.创建接收端对象
    //2.接收数据包
    //3.解析数据
    //4.输出数据
    //5.释放资源
    public static void main(String[] args) throws IOException {
        //1.创建接收端对象
        DatagramSocket d=new DatagramSocket(8888);
        //2.接收数据包
        byte []b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,b.length);
        d.receive(dp);
        //3.解析数据
        InetAddress inetAddress=dp.getAddress();//获取发送时的IP
        byte []bytes=dp.getData();              //获取包中的数据
        int length=bytes.length;                //获取数据的长度
        //4.输出数据
        System.out.println("主机IP地址为："+inetAddress.getHostAddress());
        System.out.println("主机发送的信息为："+new String(bytes,0,length));
        //5.释放资源
        d.close();
    }
}
