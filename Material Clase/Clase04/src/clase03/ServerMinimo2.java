package clase03;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMinimo2 implements Runnable{
    public static void main(String[] args) {
        new Thread(new ServerMinimo2()).start();
    }
    @Override
    public void run() {
        String mensaje="Servidor de Carlos.";
        try (ServerSocket ss=new ServerSocket(4000)) {
            while(true){
                System.out.println("Esperando conexión de cliente.");
                try(
                    Socket so=ss.accept();
                    OutputStream out=so.getOutputStream();
                ){
                    System.out.println("Se conecto "+so.getInetAddress());
                    out.write(mensaje.getBytes());
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
