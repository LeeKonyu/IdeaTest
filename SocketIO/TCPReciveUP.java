package SocketIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 16:40
 */
public class TCPReciveUP {
    public static void main(String[] args) throws IOException {
        //创建接受端对象
        ServerSocket serverSocket=new ServerSocket(10086);
        //监听
        Socket socket = serverSocket.accept();
        //创建输入流
        InputStream in=socket.getInputStream();
        byte []bytes=new byte[1024];
        int i=0;
        i=in.read(bytes);
        String s=new String(bytes,0,i);
        System.out.println(s);
        //将小写改成大写
        String ups=s.toUpperCase();
        //创建输出流对象
        OutputStream out=socket.getOutputStream();
        //写入数据
        out.write(ups.getBytes());

        //释放资源
        socket.close();

    }
}
