/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class ejercicio13_6 extends JFrame {

    public ejercicio13_6() {
        super("Circulos con drawArc --- Autor Maureen Barahona ---");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        ejercicio13_6 ejercicio3_6 = new ejercicio13_6();
    }

    class Lienzo extends Canvas {

        public void paint(Graphics graphic) {

            //Colores random
            Random ram = new Random();

            graphic.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
            graphic.drawString("Circulos centricos", 30, 30);
            int i = 100, j = 100;
            while (i >= 30) {
                //color random
                int R = ram.nextInt(255) + 1;
                int G = ram.nextInt(255) + 1;
                int B = ram.nextInt(255) + 1;

                Color cColor = new Color(R, G, B);
                graphic.setColor(cColor);

                graphic.drawArc(i, i, j, j, 0, -360);
                i = i - 10;
                j = j + 20;
            }

        }
    }
}
