package clase03;

public class Clase03 {

    public static void main(String[] args) {
        class Saludo {

            public synchronized void saludar(String nombre, boolean esJefe) {
                if (esJefe) {
                    System.out.println("Llego el Jefe.");
                    System.out.println("Jefe -> Hola a todos.");
                    notifyAll();
                    //notify();
                    //notify();
                } else {
                    //System.out.println("LLego "+nombre+".");
                    //String texto=String.format("Llego %s %s %d.", nombre,"Hola",10);
                    System.out.format("Llego %s.\n", nombre);
                    try {
                        wait();
                    } catch (Exception e) {
                    }
                    System.out.println(nombre + " -> Hola Jefe.");
                }
            }
        }//end class Saludo
        class Empleado implements Runnable {

            private String nombre;
            private boolean esJefe;
            private Saludo saludo;

            public Empleado(String nombre, boolean esJefe, Saludo saludo) {
                this.nombre = nombre;
                this.esJefe = esJefe;
                this.saludo = saludo;
            }

            @Override
            public void run() {
                this.saludo.saludar(nombre, esJefe);
            }
        }//end class Empleado
        Saludo saludo = new Saludo();
        Empleado mario =    new Empleado("Mario", false, saludo);
        Empleado ana =      new Empleado("Ana", false, saludo);
        Empleado dario =    new Empleado("Dario", false, saludo);
        Empleado diego =    new Empleado("Diego", false, saludo);
        Empleado jefe =     new Empleado("Jefe", true, saludo);
        
        new Thread(mario).start();
        new Thread(ana).start();
        new Thread(dario).start();
        new Thread(diego).start();
        try{ Thread.sleep(100);} catch(Exception e) {}
        new Thread(jefe).start();
        
        
        /*
            Protocolo IP
            IP Profe: 192.168.0.110
        
        Conexion: Protocolo TCP y Protocolo UDP
        
        Protocolo TCP
        
        SERVER                                  CLIENT
        ---------------                         ---------------
        ServerSocket(port)                      Socket(ip,port)
        .accept()
        
        OutputStream        ---------------->   InputStream
        InputStream         <----------------   OutputStream
        
        .close()                                .close()
        
        OutputStream - InputStream: Streaming de bytes standard
        DataOutputStream - DataInputStream: Streaming de tipo de datos primitivos
        ObjectOutputStream - ObjectInputStream: Streaming de objetos
        */
        
    }
}


