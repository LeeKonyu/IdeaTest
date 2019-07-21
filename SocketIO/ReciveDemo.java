package SocketIO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 15:47
 */
public class ReciveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket(9999);
        byte []b=new byte [1024];
        DatagramPacket datagramPacket=new DatagramPacket(b,b.length);
        datagramSocket.receive(datagramPacket);
        System.out.println("IP adress is "+datagramPacket.getAddress());
        System.out.println("the content is "+new String(datagramPacket.getData(),0,datagramPacket.getData().length));
        datagramSocket.close();
    }
}
