/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

/**
 *
 * @author maureen
 */
public class Ejercicio13_14 {

    public static void main(String[] args) {
        new Ejercicio13_14();
    }

    public Ejercicio13_14() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                JFrame frame = new JFrame("Cuadricula");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            int size = Math.min(getWidth() - 4, getHeight() - 4) / 10;
            int width = getWidth() - (size * 2);
            int height = getHeight() - (size * 2);
            int y = (getHeight() - (size * 10)) / 2;
            for (int horz = 0; horz < 10; horz++) {
                int x = (getWidth() - (size * 10)) / 2;
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
