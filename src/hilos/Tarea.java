/*1. extends Thread
2. extends otraClase implements Runnable
 */
package hilos;

public class Tarea extends otraClase implements Runnable{
    @Override
    public void run (){
        for(int i=0; i<10; i++){
            System.out.println("Soy un hilo y esto es lo que hago");
        }
    }
    
}
