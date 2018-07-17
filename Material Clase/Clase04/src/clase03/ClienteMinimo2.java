package clase03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClienteMinimo2 {
    public static void main(String[] args) {
        int car;
        try(Socket so=new Socket("192.168.0.110",4000);
            InputStream in=so.getInputStream();
            InputStreamReader in2=new InputStreamReader(in);
            //BufferedInputStream in3=new BufferedInputStream(in);
            BufferedReader in4=new BufferedReader(in2);
        ){
            //Lectura con Scanner
            //Scanner sc=new Scanner(in).useDelimiter("\\A");
            //String texto=sc.next();
            //System.out.println(texto);
            
            //Lectura con BufferedReader
            System.out.println(in4.readLine());
            
            
            //Lectura byte a byte
            //while((car=in.read())!=-1){
            //    System.out.print((char)car);
            //}
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
