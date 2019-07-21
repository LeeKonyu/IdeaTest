package SocketIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 16:05
 */
public class TCPSend {
    public static void main(String[] args) throws IOException {
        //创建发送端对象
        Socket socket=new Socket(InetAddress.getByName("DESKTOP-U46EVM6"),10086);
        //获取输出流对象
        OutputStream os = socket.getOutputStream();
        //发送数据
        String s="hello world";
        os.write(s.getBytes());
        //释放资源
        socket.close();
    }
}
