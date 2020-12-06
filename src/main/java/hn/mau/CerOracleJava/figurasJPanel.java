/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class figurasJPanel extends JFrame {

    public figurasJPanel() {
        super("Dibujando");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new figurasJPanel();
    }

    public void drawCircle(Graphics g, int x, int y, int r) {
        x = x - (r / 2);
        y = y - (r / 2);
        g.fillOval(x, y, r, r);
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {
            //Area del cielo
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, getWidth(), getHeight());
            
                 //Ovalo de la montana
            g.setColor(Color.black);
            g.drawOval(422, 270, 260, 150);
            g.setColor(Color.GREEN);
            g.fillOval(422, 270, 260, 150);

            //Area de montana 
            g.setColor(Color.green);
            g.fillRect(0, 300, getWidth(), getHeight());

            //Ovalo de la montana
                 
           g.setColor(Color.GREEN);
           drawCircle(g, 960, 400, 300);

            //Casa  Azul
            g.setColor(Color.BLUE);
            g.fillRect(100, 200, 100, 100);
            g.setColor(Color.black);
            g.drawRect(100, 200, 100, 100);

            int x[] = {100, 150, 200};
            int y[] = {200, 100, 200};
            g.setColor(Color.red);
            g.fillPolygon(x, y, 3);

            //casa Amarilla
            g.setColor(Color.YELLOW);
            g.fillRect(350, 200, 100, 100);
            g.setColor(Color.black);
            g.drawRect(350, 200, 100, 100);

            int x1[] = {350, 400, 450};
            g.setColor(Color.RED);
            g.fillPolygon(x1, y, 3);
            
          

            //casa Roja 1
            Color c = new Color(181, 20, 20);
            g.setColor(c);
            g.fillRect(650, 100, 100, 200);
            g.setColor(Color.BLACK);
            g.drawRect(650, 100, 100, 200);

            //techo cuadrado
            g.setColor(Color.red);
            g.fillRect(700, 50, 100, 100);

            //Linea negra
            g.setColor(Color.BLACK);
            g.fillRect(750, 100, 2, 200);
            g.setColor(Color.red);
            g.fillRect(700, 50, 100, 100);

            //casa Roja 2
            g.setColor(c);
            g.fillRect(751, 100, 100, 200);
            g.setColor(Color.BLACK);
            g.drawRect(751, 100, 100, 200);
            g.setColor(Color.red);
            g.fillRect(700, 50, 100, 100);

            //Area de carretera
            g.setColor(Color.GRAY);
            g.fillRect(0, 600, getWidth(), getHeight());
            g.setColor(Color.WHITE);
            g.drawRect(0, 600, getWidth(), getHeight());

            //Area negra del Camion
            g.setColor(Color.BLACK);

            g.fillRect(150, 400, 700, 220);
            g.setColor(Color.WHITE);
            g.drawRect(150, 400, 700, 220);
            
             //Area blanca del Camion
            g.setColor(Color.WHITE);

            g.fillRect(160, 410, 680, 200);
            g.setColor(Color.BLACK);
            g.drawRect(160, 410, 680, 200);

            //Area Cabezal
            g.setColor(Color.blue);
            g.fillRect(850, 400, 150, 220);
            g.setColor(Color.BLACK);
            g.drawRect(850, 400, 150, 220);
            
            
            int x2[] = {850, 910, 1010};
            int y2[] = {400, 310, 400};
            g.setColor(Color.RED);
            g.fillPolygon(x2, y2, 3);

            g.setColor(Color.CYAN);
            g.fillRect(860, 410, 130, 50);
            g.setColor(Color.BLACK);
            g.drawRect(860, 410, 130, 50);

            Color cGreen = new Color(54, 85, 8);
            g.setColor(cGreen);
            g.fillRect(875, 490, 85, 85);
            g.setColor(Color.BLACK);
            g.drawRect(875, 490, 85, 85);
            
            
            int x3[] = {1030, 1045, 1070};
            int y3[] = {500, 440, 500};
            g.setColor(Color.MAGENTA);
            g.fillPolygon(x3, y3, 3);

            g.setColor(Color.blue);
            g.fillRect(1000, 500, 100, 120);
            g.setColor(Color.BLACK);
            g.drawRect(1000, 500, 100, 120);
            
            int x4[] = {1100, 1200, 1200};
            int y4[] = {550, 600, 480};
            g.setColor(Color.YELLOW);
            g.fillPolygon(x4, y4, 3);

            g.setColor(Color.WHITE);
            g.drawLine(150, 650, 250, 650);

            g.setColor(Color.WHITE);
            g.drawLine(350, 650, 450, 650);

            g.setColor(Color.WHITE);
            g.drawLine(550, 650, 650, 650);
            
            g.setColor(Color.WHITE);
            g.drawLine(750, 650, 850, 650);
            
            g.setColor(Color.WHITE);
            g.drawLine(950, 650, 1050, 650);
            
             g.setColor(Color.WHITE);
            g.drawLine(1150, 650, 1250, 650);

            //LLantas
            g.setColor(Color.BLACK);
            drawCircle(g, 200, 655, 75);
            g.setColor(Color.BLACK);
            drawCircle(g, 275, 655, 75);
            g.setColor(Color.BLACK);
            drawCircle(g, 740, 655, 75);
            g.setColor(Color.BLACK);
            drawCircle(g, 815, 655, 75);

            g.setColor(Color.BLACK);
            drawCircle(g, 1045, 655, 75);

        }
    }
}
