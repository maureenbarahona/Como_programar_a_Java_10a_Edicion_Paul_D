/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import javax.swing.JFrame;

/**
 *
 * @author maureen
 */
public class figurasJPanel3 extends JFrame {

    public figurasJPanel3() {
        super("Figura 3");
        setSize(400, 400);
        getContentPane().add(new Lienzo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new figurasJPanel3();
    }

    public void drawCircle(Graphics g, int x, int y, int r) {
        x = x - (r / 2);
        y = y - (r / 2);
        g.fillOval(x, y, r, r);
    }

    public void drawTriagle(Graphics g, int R, int G, int B) {
        int xpoints[] = {325, 325, 445, 445};
        int ypoints[] = {100, 160, 100, 160};
        int npoints = 4;

        Color cColor = new Color(R, G, B);
        g.setColor(cColor);
        g.fillPolygon(xpoints, ypoints, npoints);

    }

    public void paint(Polygon shape, Graphics g, Color color, int side) {
        g.setColor(color);
        g.fillPolygon(shape);
    }

    class Lienzo extends Canvas {

        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            //Area del cielo 
            Color cCielo = new Color(158, 210, 251);
            g.setColor(cCielo);
            g.fillRect(0, 0, getWidth(), getHeight());

            //Sol
            Color cSol = new Color(255, 245, 0);
            g.setColor(cSol);
            drawCircle(g, 1000, -20, 150);

            //Area de la montana 
            Color cMontana = new Color(35, 70, 104);
            g.setColor(cMontana);
            g.fillRect(0, 200, getWidth(), getHeight());
            //   g.setColor(Color.MAGENTA);
            g.fillOval(-5, 190, 15, 80);
            g.fillOval(5, 183, 15, 80);
            g.fillOval(15, 180, 15, 80);
            g.fillOval(25, 182, 15, 80);
            g.fillOval(35, 182, 15, 80);
            g.fillOval(45, 175, 15, 80);
            g.fillOval(55, 182, 15, 80);
            g.fillOval(65, 190, 15, 80);
            g.fillOval(75, 185, 15, 80);
            g.fillOval(85, 170, 15, 80);
            g.fillOval(95, 182, 15, 80);
            g.fillOval(105, 190, 15, 80);
            g.fillOval(115, 170, 15, 80);
            g.fillOval(125, 180, 15, 80);
            g.fillOval(135, 195, 15, 80);
            g.fillOval(145, 183, 15, 80);
            g.fillOval(155, 180, 15, 80);
            g.fillOval(165, 182, 15, 80);
            g.fillOval(175, 182, 15, 80);
            g.fillOval(185, 175, 15, 80);
            g.fillOval(195, 182, 15, 80);
            g.fillOval(200, 190, 15, 80);
            g.fillOval(205, 185, 15, 80);
            g.fillOval(215, 170, 15, 80);
            g.fillOval(225, 182, 15, 80);
            g.fillOval(235, 190, 15, 80);
            g.fillOval(245, 183, 15, 80);
            g.fillOval(255, 180, 15, 80);
            g.fillOval(265, 182, 15, 80);
            g.fillOval(275, 182, 15, 80);
            g.fillOval(285, 175, 15, 80);
            g.fillOval(295, 182, 15, 80);
            g.fillOval(305, 190, 15, 80);
            g.fillOval(315, 185, 15, 80);
            g.fillOval(325, 170, 15, 80);
            g.fillOval(335, 182, 15, 80);
            g.fillOval(345, 190, 15, 80);
            g.fillOval(355, 170, 15, 80);
            g.fillOval(365, 180, 15, 80);
            g.fillOval(375, 195, 15, 80);
            g.fillOval(385, 183, 15, 80);
            g.fillOval(395, 180, 15, 80);
            g.fillOval(405, 182, 15, 80);
            g.fillOval(415, 182, 15, 80);
            g.fillOval(425, 175, 15, 80);
            g.fillOval(435, 182, 15, 80);
            g.fillOval(445, 190, 15, 80);
            g.fillOval(455, 185, 15, 80);
            g.fillOval(465, 170, 15, 80);
            g.fillOval(475, 182, 15, 80);
            g.fillOval(485, 175, 15, 80);
            g.fillOval(495, 182, 15, 80);
            g.fillOval(500, 190, 15, 80);
            g.fillOval(505, 185, 15, 80);
            g.fillOval(515, 170, 15, 80);
            g.fillOval(525, 182, 15, 80);
            g.fillOval(535, 190, 15, 80);
            g.fillOval(545, 183, 15, 80);
            g.fillOval(555, 180, 15, 80);
            g.fillOval(565, 182, 15, 80);
            g.fillOval(575, 182, 15, 80);
            g.fillOval(585, 175, 15, 80);
            g.fillOval(595, 182, 15, 80);
            g.fillOval(605, 190, 15, 80);
            g.fillOval(615, 185, 15, 80);
            g.fillOval(625, 170, 15, 80);
            g.fillOval(635, 182, 15, 80);
            g.fillOval(645, 190, 15, 80);
            g.fillOval(655, 170, 15, 80);
            g.fillOval(665, 180, 15, 80);
            g.fillOval(675, 195, 15, 80);
            g.fillOval(685, 183, 15, 80);
            g.fillOval(695, 180, 15, 80);
            g.fillOval(705, 182, 15, 80);
            g.fillOval(715, 182, 15, 80);
            g.fillOval(725, 175, 15, 80);
            g.fillOval(735, 182, 15, 80);
            g.fillOval(745, 190, 15, 80);
            g.fillOval(755, 185, 15, 80);
            g.fillOval(765, 170, 15, 80);
            g.fillOval(775, 182, 15, 80);
            g.fillOval(785, 175, 15, 80);
            g.fillOval(795, 182, 15, 80);
            g.fillOval(800, 190, 15, 80);
            g.fillOval(805, 185, 15, 80);
            g.fillOval(815, 170, 15, 80);
            g.fillOval(825, 182, 15, 80);
            g.fillOval(835, 190, 15, 80);
            g.fillOval(845, 183, 15, 80);
            g.fillOval(855, 180, 15, 80);
            g.fillOval(865, 182, 15, 80);
            g.fillOval(875, 182, 15, 80);
            g.fillOval(885, 175, 15, 80);
            g.fillOval(895, 182, 15, 80);
            g.fillOval(905, 190, 15, 80);
            g.fillOval(915, 185, 15, 80);
            g.fillOval(925, 170, 15, 80);
            g.fillOval(935, 182, 15, 80);
            g.fillOval(945, 190, 15, 80);
            g.fillOval(955, 170, 15, 80);
            g.fillOval(965, 180, 15, 80);
            g.fillOval(975, 195, 15, 80);
            g.fillOval(985, 183, 15, 80);
            g.fillOval(995, 180, 15, 80);
            g.fillOval(1005, 182, 15, 80);
            g.fillOval(1015, 182, 15, 80);
            g.fillOval(1025, 175, 15, 80);
            g.fillOval(1035, 182, 15, 80);
            g.fillOval(1045, 190, 15, 80);
            g.fillOval(1055, 185, 15, 80);
            g.fillOval(1065, 170, 15, 80);
            g.fillOval(1075, 182, 15, 80);
            g.fillOval(1085, 175, 15, 80);
            g.fillOval(1095, 182, 15, 80);
            g.fillOval(1100, 190, 15, 80);
            g.fillOval(1115, 185, 15, 80);
            g.fillOval(1115, 170, 15, 80);
            g.fillOval(1125, 182, 15, 80);
            g.fillOval(1135, 190, 15, 80);
            g.fillOval(1145, 183, 15, 80);
            g.fillOval(1155, 180, 15, 80);
            g.fillOval(1165, 182, 15, 80);
            g.fillOval(1175, 182, 15, 80);
            g.fillOval(1185, 175, 15, 80);
            g.fillOval(1195, 182, 15, 80);
            g.fillOval(1205, 190, 15, 80);
            g.fillOval(1215, 185, 15, 80);
            g.fillOval(1225, 170, 15, 80);
            g.fillOval(1235, 182, 15, 80);
            g.fillOval(1245, 190, 15, 80);
            g.fillOval(1255, 170, 15, 80);
            g.fillOval(1265, 180, 15, 80);
            g.fillOval(1275, 195, 15, 80);
            g.fillOval(1285, 183, 15, 80);
            g.fillOval(1295, 180, 15, 80);
            g.fillOval(1205, 182, 15, 80);
            g.fillOval(1315, 182, 15, 80);
            g.fillOval(1325, 175, 15, 80);
            g.fillOval(1335, 182, 15, 80);
            g.fillOval(1345, 190, 15, 80);
            g.fillOval(1355, 185, 15, 80);
            g.fillOval(1365, 170, 15, 80);
            g.fillOval(1375, 182, 15, 80);

            //Area de la grama
            Color cGrama = new Color(193, 220, 103);
            g.setColor(cGrama);
            g.fillRect(0, 500, getWidth(), getHeight());

            g.setColor(cGrama);
            g.fillOval(-80, 350, 490, 355);
            g.fillOval(480, 400, 490, 355);

            //nubes
            //Nubes
            g.setColor(Color.WHITE);
            drawCircle(g, 800, 150, 100);
            drawCircle(g, 770, 155, 100);
            drawCircle(g, 750, 145, 100);
            drawCircle(g, 720, 158, 100);
            drawCircle(g, 710, 140, 100);
            drawCircle(g, 700, 160, 100);
            drawCircle(g, 730, 172, 100);
            drawCircle(g, 700, 180, 100);
            drawCircle(g, 690, 150, 100);
            drawCircle(g, 650, 150, 100);
            drawCircle(g, 580, 172, 100);
            drawCircle(g, 550, 155, 100);
            drawCircle(g, 590, 155, 100);
            drawCircle(g, 610, 150, 100);
            drawCircle(g, 630, 170, 100);
            drawCircle(g, 660, 190, 100);

            //Tree
            Color cTree = new Color(55, 184, 91);
            g.setColor(cTree);
            g.fillArc(-10, 90, 120, 80, 0, 120);
            g.fillArc(-10, 70, 130, 80, 0, 360);
            g.fillArc(-10, 140, 110, 100, 0, 360);
            g.fillArc(0, 90, 60, 90, 0, 360);
            g.fillArc(-10, 300, 120, 80, 0, 360);
            g.fillArc(-10, 270, 130, 80, 0, 360);
            g.fillArc(-10, 240, 110, 100, 0, 360);
            g.fillArc(0, 210, 60, 90, 0, 360);

//Train
            Color cCopiloto = new Color(250, 102, 6);
            g.setColor(Color.BLACK);
            g.fillRect(230, 350, 130, 205);

            g.setColor(cCopiloto);
            g.fillRect(230, 350, 125, 200);
            
         
            g.setColor(Color.BLACK);
            g.fillRect(240, 360, 110, 60);
            
            
            g.setColor(Color.BLACK);
            drawCircle(g, 290, 550, 110);

            Color cCorange = new Color(237, 109, 16);

            g.setColor(cCorange);
            g.fillRoundRect(220, 305, 150, 40, 20, 20);

            Color cTie = new Color(251, 202, 11);
            g.setColor(cTie);
            drawCircle(g, 290, 550, 100);

            Color cBagones = new Color(201, 9, 4);
            Color cLocomotore = new Color(254, 158, 93);
            TrainCar tc1 = new TrainCar(cBagones, 370, 450);

            TrainCar tc2 = new TrainCar(cBagones, 540, 450);
            TrainCar tc3 = new TrainCar(cBagones, 710, 450);

            int xPos = 70;
            int yPos = 450;

            TrainCar loc = new TrainCar(cLocomotore, xPos, yPos);

            Polygon funnel = new Polygon();
            funnel.addPoint(xPos + 20, yPos);
            funnel.addPoint(xPos + 20, yPos);
            funnel.addPoint(xPos, yPos - 50);
            funnel.addPoint(xPos, yPos - 60);
            funnel.addPoint(xPos + 60, yPos - 60);
            funnel.addPoint(xPos + 60, yPos - 50);
            funnel.addPoint(xPos + 40, yPos - 30);
            funnel.addPoint(xPos + 40, yPos);
            Color cfunnel = new Color(227, 112, 110);
            g.setColor(cfunnel);
            g.fillPolygon(funnel);

            Polygon scoop = new Polygon();
            scoop.addPoint(xPos, yPos + 50);
            scoop.addPoint(xPos, yPos + 100);
            scoop.addPoint(xPos - 50, yPos + 100);
            Color cScoop = new Color(206, 6, 7);
            g.setColor(cScoop);
            g.fillPolygon(scoop);

            loc.drawTrainCar(g);

            tc1.drawTrainCar(g);
            Color ctc1 = new Color(255, 251, 3);
            g.setColor(ctc1);

            drawCircle(g, 450, 500, 75);

            tc2.drawTrainCar(g);
            Color ctc2 = new Color(3,4,248);
            g.setColor(ctc2);
            g.fillRect(570, 480, 100, 40);
            
            tc3.drawTrainCar(g);
            //hexagono
            Color ctc3 = new Color(67,178,81);
            g.setColor(ctc3);
            Polygon hexa = new Polygon();
            g2d.setStroke(new BasicStroke(5.0f));
            
            hexa.addPoint(779, 460);
            hexa.addPoint(829, 460);
            hexa.addPoint(849, 490);
            hexa.addPoint(829, 520);
            hexa.addPoint(779, 520);
            hexa.addPoint(759, 490);
            hexa.addPoint(779,460);
            g.fillPolygon(hexa);
            

        }
    }
}
