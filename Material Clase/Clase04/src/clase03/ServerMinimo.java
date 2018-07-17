package clase03;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerMinimo {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(4000);
        String mensaje="Servidor de Carlos.";
        //String mensaje="<!DOCTYPE html>"
        //        + "<html>"
        //        + "<head><title>java</title></head>"
        //        + "<body>"
        //        + "<h1>Servidor de Carlos.</h1>"
        //        + "</body></html>";
        //mensaje="HTTP/1.0 200 ok\n"
        //        + "Content-Type: text/html\n"
        //        + "Content-Length: " + mensaje.length()
        //        +"\n\n"+mensaje;
        //String mensaje=System.getProperties()+"";
        while(true){
            System.out.println("Esperando conexión de cliente.");
            Socket so=ss.accept();
            System.out.println("Se conecto "+so.getInetAddress());
            OutputStream out=so.getOutputStream();
            out.write(mensaje.getBytes());
            out.close();
            so.close();
        }
    }
}
