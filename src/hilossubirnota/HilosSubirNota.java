/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilossubirnota;

/**
 *
 * @author Samuel
 */
public class HilosSubirNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Hilo1 h1= new Hilo1();
        Hilo2 h2= new Hilo2();
        Hilo3 h3= new Hilo3();
        
        h1.start();
        h1.join();
        if(Hilo1.vs=="persona"){
        h2.start();
        h2.join();
        }
        else{
        h3.start();
        h3.join();
        }
            
        System.out.println("EL juego se ha acabdo\nGracias por jugar");
    }
    
}
