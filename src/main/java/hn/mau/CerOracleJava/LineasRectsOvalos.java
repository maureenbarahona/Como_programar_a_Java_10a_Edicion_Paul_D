/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class LineasRectsOvalos {

    public static void main(String[] args) {
// crea marco para LineasRectsOvalosJPanel
        JFrame marco
                = new JFrame("Dibujo de lineas , rectangulos y ovalos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LineasRectsOvalosJPanel lineasRectsOvalosJPanel
                = new LineasRectsOvalosJPanel();
        lineasRectsOvalosJPanel.setBackground(Color.WHITE);
        marco.add(lineasRectsOvalosJPanel);
        marco.setSize(400, 210);
        marco.setVisible(true);
    }
}
