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
public class Hilo2 extends Thread{
   

    public void run(){
    int intentos = 5;
    int numeroSecreto = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca numero que su compañero debe adivinar entre 1 y 50"));
        JOptionPane.showMessageDialog(null, "Ya puede mirar el segundo jugador");
        JOptionPane.showMessageDialog(null, "Posees un total de 5 intentos");
        for (int contador = 0; contador < intentos; contador++) {
            int probar = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un numero entre 1 y 50"));
            if (probar > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Su numero es mayor que el que su compañero ha introducido");
            } else if (probar < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Su numero es menor que el que su compañero ha introducido");
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades has ganado");
                break;
            }
        }
        
    }
    
    }
    
