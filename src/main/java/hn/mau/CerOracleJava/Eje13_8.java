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
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class Eje13_8 extends JFrame {

    int x1, y1, x2, y2;

    public Eje13_8() {
        super("Líneas Random con Line2D.Double --- Autor Maureen Barahona ---");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        Eje13_8 ejercicio3_8 = new Eje13_8();
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {

            int w = getWidth();
            int h = getHeight();

            Random ram = new Random();

            g.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
            g.drawString("Lineas Ramdom de ancho " + w + " por alto " + h, 30, 30);

            for (int i = 20; i > 0; i--) {

                x1 = ram.nextInt(h) + 1;
                x2 = ram.nextInt(h) + 1;
                y1 = ram.nextInt(w) + 1;
                x2 = ram.nextInt(w) + 1;

                Graphics2D g2 = (Graphics2D) g;

                //color random
                int R = ram.nextInt(255) + 1;
                int G = ram.nextInt(255) + 1;
                int B = ram.nextInt(255) + 1;

                Color cColor = new Color(R, G, B);
                g.setColor(cColor);

                g2.draw(new Line2D.Double(x1, y1, x2, y2));

            }
        }
    }
}
