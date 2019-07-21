package SocketIO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 15:43
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket();
        byte []b="Hello Wrold Again!!!".getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(b,b.length, InetAddress.getByName("DESKTOP-U46EVM6"),9999);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
