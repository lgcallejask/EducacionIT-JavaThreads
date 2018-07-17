package clase03;

import java.io.InputStream;
import java.net.Socket;

public class ClienteMinimo {
    public static void main(String[] args) throws Exception{
        Socket so=new Socket("192.168.0.110",4000);
        InputStream in=so.getInputStream();
        int car;
        while((car=in.read())!=-1){
            System.out.print((char)car);
        }
        in.close();
        so.close();
        System.out.println();
    }
}
