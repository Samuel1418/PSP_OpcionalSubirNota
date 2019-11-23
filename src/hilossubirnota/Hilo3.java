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
public class Hilo3 extends Thread{
   
    public void run(){
      int intentos = 5;  
    int numMaquina = (int)(Math.random()*50)+1;
        JOptionPane.showMessageDialog(null, "Ya hemos seleecionado el numero que debes adivinar");
        JOptionPane.showMessageDialog(null, "Posees un total de 5 intentos");

        for (int contador = 0; contador < intentos; contador++) {
            int probar = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un numero entre 1 y 50"));
            int proba=numMaquina-probar;
            if (proba>20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            } else if (proba<=5&&proba>=1) {
                JOptionPane.showMessageDialog(null, "Moi preto");
            } else if (proba<10&&proba>5) {
                JOptionPane.showMessageDialog(null, "Preto");
            } else if (proba>=10&&proba<=20) {
                JOptionPane.showMessageDialog(null, "Lonxe");
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades has ganado");
                break;
            }
        }
       
    }
    }
