package SocketIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 16:40
 *
 * 客户端发出数据
 * 服务端接收数据
 * 服务端转换数据
 * 服务端发出数据
 * 客户端接收数据
 */
public class TCPSendUP {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket=new Socket(InetAddress.getByName("DESKTOP-U46EVM6"),10086);
        //创建输出流对象
        OutputStream os=socket.getOutputStream();
         //发送数据
        String s="hello tcp";
        os.write(s.getBytes());

        //接收数据
        InputStream in=socket.getInputStream();
        byte []bytes=new byte[1024];
        int i=0;
        while ((i=in.read(bytes,0,bytes.length))!=-1){
            System.out.println(new String(bytes,0,i));
        }

        //释放资源
        os.close();
    }
}
