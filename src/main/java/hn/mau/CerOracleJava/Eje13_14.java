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
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class Eje13_14 extends JFrame {

    int x1, y1, x2, y2;

    public Eje13_14() {
        super("Cuadrícula mediante el uso de la clase Rectangle2D.Double  )--- Autor Maureen Barahona ---");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        Eje13_14 ejercicio3_8 = new Eje13_14();
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {

            int w = getWidth();
            int h = getHeight();

            Graphics2D g2d = (Graphics2D) g.create();
            int size = Math.min(w - 4, h - 4) / 10;

            Random ram = new Random();

            int y = (w - (size * 10)) / 2;
            for (int horz = 0; horz < 10; horz++) {
                //color random
                int R = ram.nextInt(255) + 1;
                int G = ram.nextInt(255) + 1;
                int B = ram.nextInt(255) + 1;

                Color cColor = new Color(R, G, B);
                g2d.setColor(cColor);

                int x = (h - (size * 10)) / 2;
                for (int vert = 0; vert < 10; vert++) {
                     g2d.draw(new Rectangle2D.Double(x, y, size, size));
                    x += size;
                }
                y += size;
            }
            g2d.dispose();

        }
    }
}
