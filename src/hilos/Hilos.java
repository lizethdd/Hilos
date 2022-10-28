
package hilos;


public class Hilos {

 
    public static void main(String[] args) {
            hilo();
            //hiloRunable();
            //claseAnonima();
    }
    public static void claseAnonima(){
        Tarea tarea = new Tarea();
        
        Thread hilo= new Thread(new Runnable(){
    
        @Override
     public void run (){
        for(int i=0; i<10; i++){
            System.out.println("Soy un hilo y esto es lo que hago");
        }
     }
        });
        
        hilo.start();
        System.out.println("Soy el hilo principal y sigo haciendo mi trabajo");
        System.out.println("Fin del hilo principal");
        
        }
        
    public static void  hilo(){
        Tarea tarea= new Tarea();
        tarea.run();
        System.out.println("Soy el hilo principal y sigo haciendo mi trabajo");
        System.out.println("Fin del hilo principal");
    }
    public static void hiloRunable(){
        Tarea tarea= new Tarea();
         Thread hilo= new Thread(tarea);
        hilo.start();
        System.out.println("Soy el hilo principal y sigo haciendo mi trabajo");
        
        System.out.println("Fin del hilo principal");
    }
}
