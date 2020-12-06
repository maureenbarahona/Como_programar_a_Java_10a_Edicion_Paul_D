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
public class figurasJPanel2 extends JFrame {

    public figurasJPanel2() {
        super("Figura 2");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new figurasJPanel2();
    }

    public void drawCircle(Graphics g, int x, int y, int r) {
        x = x - (r / 2);
        y = y - (r / 2);
        g.fillOval(x, y, r, r);
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {
            //Area del cielo
            Color cCielo = new Color(0, 147, 221);
            g.setColor(cCielo);
            g.fillRect(0, 0, getWidth(), getHeight());

            //Area de la grama
            Color cGrama = new Color(133, 194, 38);
            g.setColor(cGrama);
            g.fillRect(0, 500, getWidth(), getHeight());

            //Sol
            Color cSol = new Color(255, 245, 0);
            g.setColor(cSol);
            drawCircle(g, 220, 100, 150);

            //Nubes
            g.setColor(Color.black);
            drawCircle(g, 1000, 50, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 1000, 50, 55);

            g.setColor(Color.black);
            drawCircle(g, 970, 55, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 970, 55, 55);

            g.setColor(Color.black);
            drawCircle(g, 950, 45, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 950, 45, 55);

            g.setColor(Color.black);
            drawCircle(g, 920, 58, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 920, 58, 55);

            g.setColor(Color.black);
            drawCircle(g, 910, 40, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 910, 40, 55);

            g.setColor(Color.black);
            drawCircle(g, 900, 60, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 900, 60, 55);

            g.setColor(Color.black);
            drawCircle(g, 930, 72, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 930, 72, 55);

            g.setColor(Color.black);
            drawCircle(g, 900, 80, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 900, 80, 55);

            g.setColor(Color.black);
            drawCircle(g, 890, 50, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 890, 50, 55);

            g.setColor(Color.black);
            drawCircle(g, 850, 50, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 850, 50, 55);

            g.setColor(Color.black);
            drawCircle(g, 780, 72, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 780, 72, 55);

            g.setColor(Color.black);
            drawCircle(g, 750, 55, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 750, 55, 55);

            g.setColor(Color.black);
            drawCircle(g, 790, 55, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 790, 55, 55);

            g.setColor(Color.black);
            drawCircle(g, 810, 50, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 810, 50, 55);

            g.setColor(Color.black);
            drawCircle(g, 830, 70, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 830, 70, 55);

            g.setColor(Color.black);
            drawCircle(g, 860, 90, 56);
            g.setColor(Color.WHITE);
            drawCircle(g, 860, 90, 55);

            //Casa Naranja 
            Color cCasa = new Color(230, 120, 23);
            g.setColor(cCasa);
            g.fillRect(500, 300, 200, 200);

            //Ventana
            Color cVentana = new Color(0, 124, 194);
            g.setColor(cVentana);
            g.fillRect(540, 320, 130, 50);

            // Puerta
            Color cPuerta = new Color(255, 245, 0);
            g.setColor(cPuerta);
            g.fillRect(565, 425, 75, 75);

            //Camino
            Color cCamino = new Color(188, 130, 92);
            g.setColor(cCamino);
            g.fillRect(575, 500, 55, 500);

            //Techo
            int x[] = {500, 600, 700};
            int y[] = {300, 150, 300};

            Color cTecho = new Color(221, 18, 123);
            g.setColor(cTecho);
            g.fillPolygon(x, y, 3);

            //Tronco 1
            Color cTronco = new Color(113, 98, 91);
            g.setColor(cTronco);
            g.fillRect(200, 360, 55, 150);
            //Ramas 1
            int x1[] = {150, 225, 300};
            int y1[] = {360, 200, 360};

            Color cRamas = new Color(0, 146, 63);
            g.setColor(cRamas);
            g.fillPolygon(x1, y1, 3);

            //Frutos
            Color cFrutos = new Color(218, 37, 28);

            g.setColor(Color.black);
            g.drawOval(210, 240, 30, 20);
            g.setColor(cFrutos);
            g.fillOval(210, 240, 30, 20);

            g.setColor(Color.black);
            g.drawOval(200, 280, 30, 30);
            g.setColor(cFrutos);
            g.fillOval(200, 280, 30, 30);

            g.setColor(Color.black);
            g.drawOval(240, 285, 20, 40);
            g.setColor(cFrutos);
            g.fillOval(240, 285, 20, 40);
            
            g.setColor(Color.black);
            g.drawOval(220, 330, 40, 25);
            g.setColor(cFrutos);
            g.fillOval(220, 330, 40, 25);

            //Tronco 2
            g.setColor(cTronco);
            g.fillRect(1000, 460, 55, 150);
            //Ramas 2
            int x2[] = {950, 1025, 1100};
            int y2[] = {460, 300, 460};

            g.setColor(cRamas);
            g.fillPolygon(x2, y2, 3);
            
            //Frutos 2
            g.setColor(Color.black);
            g.drawOval(1010, 345, 30, 20);
            g.setColor(cFrutos);
            g.fillOval(1010, 345, 30, 20);

            g.setColor(Color.black);
            g.drawOval(1000, 380, 30, 30);
            g.setColor(cFrutos);
            g.fillOval(1000, 380, 30, 30);

            g.setColor(Color.black);
            g.drawOval(1040, 385, 20, 40);
            g.setColor(cFrutos);
            g.fillOval(1040, 385, 20, 40);
            
            g.setColor(Color.black);
            g.drawOval(1020, 430, 40, 25);
            g.setColor(cFrutos);
            g.fillOval(1020, 430, 40, 25);

            //Macetera 1
            Color cMacetera = new Color(188, 130, 92);
            Color cTallo = new Color(74, 142, 101);
            Color cPetalo = new Color(221, 18, 123);
            Color cHoja = new Color(58, 178, 195);

            g.setColor(cMacetera);
            g.fillRect(50, 590, 60, 60);

            g.setColor(Color.BLACK);
            g.fillRect(40, 575, 80, 21);

            g.setColor(cMacetera);
            g.fillRect(40, 575, 80, 20);

            g.setColor(cTallo);
            g.fillRect(75, 530, 5, 45);

            g.setColor(Color.YELLOW);
            drawCircle(g, 75, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 75, 510, 40);

            g.setColor(cPetalo);
            drawCircle(g, 48, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 100, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 75, 450, 40);

            int xh[] = {79, 89, 109};
            int yh[] = {555, 540, 560};
            g.setColor(cHoja);
            g.fillPolygon(xh, yh, 3);

            int xh1[] = {74, 62, 54};
            int yh1[] = {555, 540, 560};
            g.setColor(cHoja);
            g.fillPolygon(xh1, yh1, 3);

            //Macetera 2
            g.setColor(cMacetera);
            g.fillRect(300, 590, 60, 60);

            g.setColor(Color.BLACK);
            g.fillRect(290, 575, 80, 21);

            g.setColor(cMacetera);
            g.fillRect(290, 575, 80, 20);

            g.setColor(cTallo);
            g.fillRect(325, 530, 5, 45);

            g.setColor(Color.YELLOW);
            drawCircle(g, 325, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 325, 510, 40);

            g.setColor(cPetalo);
            drawCircle(g, 298, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 350, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 325, 450, 40);

            int xh2[] = {329, 339, 359};
            int yh2[] = {555, 540, 560};
            g.setColor(cHoja);
            g.fillPolygon(xh2, yh2, 3);

            int xh3[] = {324, 312, 304};
            int yh3[] = {555, 540, 560};
            g.setColor(cHoja);
            g.fillPolygon(xh3, yh3, 3);

            //Macetera 3
            g.setColor(cMacetera);
            g.fillRect(800, 590, 60, 60);

            g.setColor(Color.BLACK);
            g.fillRect(790, 575, 80, 21);

            g.setColor(cMacetera);
            g.fillRect(790, 575, 80, 20);

            g.setColor(cTallo);
            g.fillRect(825, 530, 5, 45);

            g.setColor(Color.YELLOW);
            drawCircle(g, 825, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 825, 510, 40);

            g.setColor(cPetalo);
            drawCircle(g, 798, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 850, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 825, 450, 40);

            int xh4[] = {829, 839, 859};
            g.setColor(cHoja);
            g.fillPolygon(xh4, yh2, 3);

            int xh5[] = {824, 812, 804};
            g.setColor(cHoja);
            g.fillPolygon(xh5, yh3, 3);

            //Macetera 4
            g.setColor(cMacetera);
            g.fillRect(1200, 590, 60, 60);

            g.setColor(Color.BLACK);
            g.fillRect(1190, 575, 80, 21);

            g.setColor(cMacetera);
            g.fillRect(1190, 575, 80, 20);

            g.setColor(cTallo);
            g.fillRect(1225, 530, 5, 45);

            g.setColor(Color.YELLOW);
            drawCircle(g, 1225, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 1225, 510, 40);

            g.setColor(cPetalo);
            drawCircle(g, 1198, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 1250, 480, 40);

            g.setColor(cPetalo);
            drawCircle(g, 1225, 450, 40);

            int xh6[] = {1229, 1239, 1259};
            g.setColor(cHoja);
            g.fillPolygon(xh6, yh2, 3);

            int xh7[] = {1224, 1212, 1204};
            g.setColor(cHoja);
            g.fillPolygon(xh7, yh3, 3);

        }
    }
}
