/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.cap12.fig12_2;

import javax.swing.JOptionPane;

/**
 *
 * @author maureen
 */
public class Suma {

    public static void main(String[] args) {
        // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane
        String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");

        // convierte las entradas String en valores int para usarlos en un cálculo
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

    }
}
