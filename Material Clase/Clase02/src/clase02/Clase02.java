package clase02;
public class Clase02 {
    public static void main(String[] args) {
        // Clase 02
        class Hilo implements Runnable{
            private String nombre;
            public Hilo(String nombre) { this.nombre = nombre; }
            @Override public void run() {
                for(int a=1;a<=10;a++){
                    System.out.println(nombre+" "+a);
                    try { Thread.sleep(1000); } catch (Exception e) {}
                }
            }
        }// end class Hilo
        
        /*
        Thread t1=new Thread(new Hilo("Hilo 1"));
        Thread t2=new Thread(new Hilo("Hilo 2"));
        Thread t3=new Thread(new Hilo("Hilo 3"));
        Thread t4=new Thread(new Hilo("Hilo 4"));
        
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        */
        /*
        JDK/JVM     Linux   MAC     Windows     Solaris
        1           1       1       -10         1
        3           6       30      -4          15
        5           10      50      0           25
        
        10          20      100     10          50
        
        */
        
        //t1.start();
        //t2.start();
        //t3.start();
        //t4.start();
        /*
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        
        try { Thread.sleep(500); } catch (Exception e) {}
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        //t1=new Thread(new Hilo("hilo5"));
        //t1.start();
        try { Thread.sleep(11000); } catch (Exception e) {}
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        */
        //t1.start();
        //t1=new Thread(new Hilo("hilo5"));
        //t1.start();
        
        /*
        Ciclo de vida de un Thread
        
        NEW     RUNNING         BLOCKED         TERMINATED
                .start()        por IO          Assesinado .stop()
                                .sleep()        Muerte natural
                                .suspend()
                                .wait()
        */
        
        class HiloP implements Runnable{
            private String nombre;
            private int ms;
            public HiloP(String nombre, int ms) {
                this.nombre = nombre;
                this.ms = ms;
            }
            public int getMs()          { return ms; }
            public void setMs(int ms)   { this.ms = ms; }
            @Override public void run() {
                for(int a=1;a<=10;a++){
                    System.out.println(nombre+" "+a);
                    try { Thread.sleep(ms); } catch(Exception e) {}
                    Thread.yield();
                }
            }  
        }// end class HiloP
        Thread t1=new Thread(new HiloP("hilo 1",400));
        Thread t2=new Thread(new HiloP("hilo 2",200));
        Thread t3=new Thread(new HiloP("hilo 3",100));
        Thread t4=new Thread(new HiloP("hilo 4",300));
        
        try{
        
            //t1.start();
            //t2.start();
            //t1.join();
            //t2.join();
            //t3.start();
            //t4.start();
        
            //t1.join();
            //t2.join();
            //t3.join();
            //t4.join();
        
            
            
        }catch(Exception e){}
        
        //System.out.println("-- Fin del programa --");
        
        class Cuenta{
            private float saldo=1000;
            public void depositar(float monto){
                System.out.println("-- iniciando deposito --");
                try { Thread.sleep(2000);} catch(Exception e){}
                saldo+=monto;
                System.out.println("Saldo = "+saldo);
                System.out.println("-- finalizando deposito --");
            }
            public void debitar(float monto){
                System.out.println("-- iniciando debito --");
                if(saldo>=monto){
                    try { Thread.sleep(2000);} catch(Exception e){}
                    saldo-=monto;
                    System.out.println("Saldo = "+saldo);
                }else{
                    System.out.println("Saldo insuficiente");
                }
                System.out.println("-- finalizando debito --");
            }
            public float getSaldo() { return saldo; }
        }// end class Cuenta
        
        
    }// end main
}// end class Clase02