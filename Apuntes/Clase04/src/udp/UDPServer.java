package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        String mensaje = "Servidor de Gonzalo";
        int longitud = mensaje.length();
        InetAddress dirServer = InetAddress.getByName("localhost");
        InetAddress dirClient = InetAddress.getByName("localhost");
        DatagramSocket socket = new DatagramSocket(5000, dirServer);
        DatagramPacket dato = new DatagramPacket(
                mensaje.getBytes(),
                longitud,
                dirClient,
                4000
        );
        while(true) {
            System.out.println("Enviando paquete...");
            socket.send(dato);
            Thread.sleep(2000);
        }
    }
}