/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class Eje13_7 extends JFrame {

    public Eje13_7() {
        super("Circulos con Ellipse2D  --- Autor Maureen Barahona ---");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        Eje13_7 ejercicio3_6 = new Eje13_7();
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Random ram = new Random();
            double width = getWidth(); // total width   
            double height = getHeight(); // total height

            for (int i = 8; i > 0; i--) {
                //color random
                int R = ram.nextInt(255) + 1;
                int G = ram.nextInt(255) + 1;
                int B = ram.nextInt(255) + 1;

                Color cColor = new Color(R, G, B);
                g.setColor(cColor);
                g2d.draw(new Ellipse2D.Double(width / 2 - (i + 1) * 10, height / 2 - (i + 1) * 10,
                        20 * i, 20 * i));

            }

        }

    }
}
