package SocketIO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 14:53
 */
public class Test1 {
    //使用UDP进行发送
    //1.创建发送端Socket对象
    //2.获取要发送的数据包
    //3.进行发送
    //4.释放资源
    public static void main(String[] args) throws IOException {
        //使用UDP进行发送
        //1.创建发送端Socket对象
        DatagramSocket d=new DatagramSocket();
        //2.获取要发送的数据包
        String s="Hello World!";
        byte []b=s.getBytes();
        int l=b.length;
        InetAddress ia=InetAddress.getByName("DESKTOP-U46EVM6");
        int dkh=8888;                                           //要发送的端口号
        DatagramPacket dp=new DatagramPacket(b,l,ia,dkh);
        //3.进行发送
        d.send(dp);
        //4.释放资源
        d.close();
    }

}
