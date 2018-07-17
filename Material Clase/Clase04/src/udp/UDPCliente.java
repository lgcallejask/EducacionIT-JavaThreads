package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPCliente {
    public static void main(String[] args) throws Exception{
        InetAddress dir=InetAddress.getByName("localhost");
        DatagramSocket socket=new DatagramSocket(4000,dir);
        DatagramPacket dato=new DatagramPacket(new byte[100],100);
        while(true){
            socket.receive(dato);
            System.out.println(new String(dato.getData()));
            Thread.sleep(2000);
        }
    }
}
