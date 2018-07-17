package clase03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

public class HiloChat implements Runnable{
    private JTextArea txa;
    public HiloChat(JTextArea txa) {
        this.txa = txa;
    }
    @Override
    public void run() {
        try(ServerSocket ss=new ServerSocket(7000)){
            while(true){
                try(
                    Socket so=ss.accept();
                    BufferedReader in=new BufferedReader(new InputStreamReader(so.getInputStream()));                 
                ){
                    String mensaje=in.readLine();
                    String destinatario="";
                    String ip=so.getInetAddress().getHostAddress();
                    for(String st: MapaDirecciones.getMap().keySet()){
                        if(MapaDirecciones.getMap().get(st).equals(ip)) 
                            destinatario=st;
                    }
                    txa.append(destinatario+" : "+mensaje+"\n");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
