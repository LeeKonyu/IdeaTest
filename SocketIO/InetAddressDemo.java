package SocketIO;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author : 猕猴桃
 * @create 2019/7/19 11:43
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("DESKTOP-U46EVM6");
        System.out.println(address);
    }
}
