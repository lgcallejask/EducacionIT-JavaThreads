package ar.com.eduit.curso.javaadv.clase01;

import java.time.LocalDateTime;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HiloHora implements Runnable{
    private JTextField  swTxt=null;
    private JLabel      swLbl=null;
    private TextField   fxTxt=null;
    private Label       fxLbl=null;
    public HiloHora(JTextField swTxt)   { this.swTxt = swTxt; }
    public HiloHora(JLabel swLbl)       { this.swLbl = swLbl; }
    public HiloHora(TextField fxTxt)    { this.fxTxt = fxTxt; }
    public HiloHora(Label fxLbl)        { this.fxLbl = fxLbl; }
    private void setText(String text){
        if(swTxt!=null) swTxt.setText(text);
        if(swLbl!=null) swLbl.setText(text);
        if(fxTxt!=null) fxTxt.setText(text);
        if(fxLbl!=null) fxLbl.setText(text);
    }
    @Override public void run(){
        while(true){
            LocalDateTime ldt=LocalDateTime.now();
            String hora=(ldt.getHour()<10)?"0"+ldt.getHour():""+ldt.getHour();
            String minuto=(ldt.getMinute()<10)?"0"+ldt.getMinute():""+ldt.getMinute();
            String segundo=(ldt.getSecond()<10)?"0"+ldt.getSecond():""+ldt.getSecond();
            setText(hora+":"+minuto+":"+segundo);
            try{ Thread.sleep(1000); }catch(Exception e){}
        }
    }
}
