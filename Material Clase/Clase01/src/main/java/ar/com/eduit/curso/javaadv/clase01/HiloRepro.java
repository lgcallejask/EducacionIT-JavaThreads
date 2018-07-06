package ar.com.eduit.curso.javaadv.clase01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class HiloRepro implements Runnable{
    public static void main(String[] args) throws Exception{
        new Player(
                new BufferedInputStream(
                        new FileInputStream("c:/condor.mp3")
                )
        ).play();   
    }
    @Override public void run(){
        try {
            new Player(
                new BufferedInputStream(
                        new FileInputStream("c:/condor.mp3")
                )
            ).play(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
