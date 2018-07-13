package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        InetAddress dir = InetAddress.getByName("localhost");
        DatagramSocket socket = new DatagramSocket(4000);
        DatagramPacket packet = new DatagramPacket(new byte[100],100);
        while(true) {
            socket.receive(packet);
            System.out.println(new String(packet.getData()));
            Thread.sleep(2000);
        }
    }
}
