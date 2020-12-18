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
public class Eje13_6 extends JFrame {

    public Eje13_6() {
        super("Circulos con drawArc --- Autor Maureen Barahona ---");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        Eje13_6 ejercicio13_6 = new Eje13_6();
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {

            //Colores random
            Random ram = new Random();
            int width = getWidth(); // total width   
            int height = getHeight(); // total height

            g.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
            g.drawString("Circulos centricos con colores random", 30, 30);

            for (int i = 8; i > 0; i--) {
                //color random
                int R = ram.nextInt(255) + 1;
                int G = ram.nextInt(255) + 1;
                int B = ram.nextInt(255) + 1;

                Color cColor = new Color(R, G, B);
                g.setColor(cColor);

                g.drawArc(width / 2 - (i + 1) * 10,
                        height / 2 - (i + 1) * 10,
                        20 * i,
                        20 * i,
                        0,
                        -360);

            }

        }
    }
}
