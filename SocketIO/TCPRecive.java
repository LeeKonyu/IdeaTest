package SocketIO;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 16:10
 */
public class TCPRecive {
    public static void main(String[] args) throws IOException {
        //创建接收端对象
        ServerSocket serverSocket=new ServerSocket(10086);
        //进行监听（阻塞）
        Socket socket= serverSocket.accept();
        //创建输入流对象
        InputStream in = socket.getInputStream();
        //获取数据
        byte [] b=new byte[1024];
        int i=0;
        while ((i=in.read(b,0,b.length))!=-1){
            System.out.println(new String(b,0,i));
        }

        //测试
        InetAddress ia = socket.getInetAddress();
        System.out.println("send name:"+ia.getHostName());
        socket.close();
        //服务器一般都不关
        //serverSocket.close();
    }
}
