/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author maureen
 */
class TrainCar {

    private Color carColor;
    private int xPos;
    private int yPos;

    public TrainCar(Color cC, int xP, int yP) {
        carColor = cC;
        xPos = xP;
        yPos = yP;
    }

    public void drawTrainCar(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(xPos, yPos, 155, 105);
        g.setColor(carColor);
        g.fillRect(xPos, yPos, 150, 100);

        g.setColor(Color.BLACK);
        g.fillOval(xPos + 5, yPos + 80, 75, 75);
        g.fillOval(xPos + 95, yPos + 75, 75, 75);
        Color cTie = new Color(251, 202, 11);
        g.setColor(cTie);
        g.fillOval(xPos + 5, yPos + 80, 70, 70);
        g.fillOval(xPos + 95, yPos + 75, 70, 70);

        g.setColor(Color.BLACK);
        g.fillRoundRect(xPos - 10, yPos - 20, 170, 25, 20, 20);

        Color cCorange = new Color(237, 109, 16);

        g.setColor(cCorange);
        g.fillRoundRect(xPos - 10, yPos - 20, 170, 20, 20, 20);

    }

    public void drawScoop(Graphics g) {
        Polygon scoop = new Polygon();
        scoop.addPoint(xPos, yPos + 50);
        scoop.addPoint(xPos, yPos + 100);
        scoop.addPoint(xPos - 50, yPos + 100);
        Color cScoop = new Color(208, 7, 5);
        g.setColor(cScoop);

    }

    public void drawFunner(Graphics g) {
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

    }

}
