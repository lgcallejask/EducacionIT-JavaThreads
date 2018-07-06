package ar.com.eduit.curso.javaadv.clase01;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HiloCrono implements Runnable{
    private JTextField  swTxt=null;
    private JLabel      swLbl=null;
    private TextField   fxTxt=null;
    private Label       fxLbl=null;
    private int cont=0;
    private boolean correr=false;
    public HiloCrono(JTextField swTxt)   { this.swTxt = swTxt; }
    public HiloCrono(JLabel swLbl)       { this.swLbl = swLbl; }
    public HiloCrono(TextField fxTxt)    { this.fxTxt = fxTxt; }
    public HiloCrono(Label fxLbl)        { this.fxLbl = fxLbl; }
    private void setText(String text){
        if(swTxt!=null) swTxt.setText(text);
        if(swLbl!=null) swLbl.setText(text);
        if(fxTxt!=null) fxTxt.setText(text);
        if(fxLbl!=null) fxLbl.setText(text);
    }
    @Override public void run(){
        while(true){
            try{ Thread.sleep(1000); }catch(Exception e){}
            if(correr){
                cont++;
                setText(cont+"");
            }
        }
    }
    public void start() { correr=true;  }
    public void pause() { correr=false; }
    public void stop() {
        correr=false;
        setText("0");
        cont=0;
    }
}
