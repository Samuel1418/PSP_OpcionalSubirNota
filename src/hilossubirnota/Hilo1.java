/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilossubirnota;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Hilo1 extends Thread{
    static String vs;
    String persona="persona";
    String maquina="maquina";
    public void run(){
    String eleccion=JOptionPane.showInputDialog("Contra quien quieres jugar, contra la maquna o contra alguien?\nEscribe persona o maquina para jugar");
    if(eleccion==persona)
            vs="persona";
    else
        vs="maquina";
    }
}
