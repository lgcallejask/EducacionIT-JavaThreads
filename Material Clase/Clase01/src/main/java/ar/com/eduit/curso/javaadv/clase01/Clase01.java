package ar.com.eduit.curso.javaadv.clase01;

public class Clase01 {
    public static void main(String[] args) {
        
        /*
        Curso: Java Advanced 15 horas
        Días: Martes y Viernes 09:00 a 12:00 hs
        Profe: Carlos Ríos  carlos.rios@educacionit.com
        */
        
        // educacionit 43280457
        System.out.println("Versión de Java: "+System.getProperty("java.version"));
        System.out.println("Cantidad de nucleos: "+Runtime.getRuntime().availableProcessors());
        
        /*
        LTS: Long Time Supports tienen soporte de 8 años
        
        JDK 8 LTS   Se libero en marzo 2014 tiene soporte hasta Marzo 2022
        JDK 9   Se libero en Septiembre 2017 caduco en Marzo 2018
        JDK10   Se libero en Marzo 2018 caduca en Septiembre 2018
        JDK11 LTS   Se libera en Septiembre 2018 con soporte hasta Septiembre 2026
        
        */
        
        /*
            Tarea 1 Cargar file medio a     10 s
            Tarea 2 Cargar file medio b     10 s
            Tarea 3 Abrir form y mostrar info de files      1 s
        
                10 s        10 s   1s
            |----------|----------|-|
             Tarea 1      Tarea 2  Tarea 3
        
             Tiempo total 21 s
        
                10 s
            |----------|
             Tarea 1 
        
                10 s
            |----------|
             Tarea 2
        
                         1 s
                        |-|
                        Tarea 3
            Total 11 s                
       
                10 s
            |----------|
             Tarea 1 
        
                10 s
            |----------|
             Tarea 2
        
             1 s
            |-|
             Tarea 3
        */
        
        //clase interna
        class Hilo extends Thread{
            private String nombre;
            public Hilo(String nombre) {
                this.nombre = nombre;
            }
            @Override
            public void run() {
                //Este método se ejecuta en un hilo a parte
                for(int a=1;a<=10;a++){
                    System.out.println(nombre+" "+a);
                    try { Thread.sleep(1000); } catch(Exception e) {}
                }
            } 
        } //end class Hilo
        
        Hilo hilo1=new Hilo("hilo1");
        Hilo hilo2=new Hilo("hilo2");
        Hilo hilo3=new Hilo("hilo3");
        Hilo hilo4=new Hilo("hilo4");
        
        //el mètodo run no ejecuta en un hilo nuevo
        //hilo1.run();
        //hilo2.run();
        //hilo3.run();
        //hilo4.run();
        
        //el método start() ejecuta el método run en un nuevo thread
        //hilo1.start();
        //hilo2.start();
        //hilo3.start();
        //hilo4.start();
        
        //new Hilo("hilo5").start();
        
        //java.lang.IllegalThreadStateException
        //hilo1.start();
        
        //Interface Runnable
        class HiloRunnable implements Runnable{
            private String nombre;
            public HiloRunnable(String nombre) {
                this.nombre = nombre;
            }
            @Override
            public void run() {
                for(int a=1;a<=10;a++){
                    System.out.println(nombre+" "+a);
                    try { Thread.sleep(1000); } catch(Exception e) {}
                }
            } 
        }//end class HiloRunnable
        
        HiloRunnable hiloR1=new HiloRunnable("hiloR1");
        HiloRunnable hiloR2=new HiloRunnable("hiloR2");
        HiloRunnable hiloR3=new HiloRunnable("hiloR3");
        HiloRunnable hiloR4=new HiloRunnable("hiloR4");
        
        Thread tHilo1=new Thread(hiloR1);
        Thread tHilo2=new Thread(hiloR2);
        Thread tHilo3=new Thread(hiloR3);
        Thread tHilo4=new Thread(hiloR4);
        
        tHilo1.start();
        tHilo2.start();
        tHilo3.start();
        tHilo4.start();
        
        new Thread(new HiloRunnable("hiloR5")).start();
        
    }// end main
}// end class Clase01
