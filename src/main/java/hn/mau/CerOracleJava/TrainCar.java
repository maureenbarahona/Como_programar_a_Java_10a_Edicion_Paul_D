/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Color;
import java.awt.Graphics;

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
        g.setColor(carColor);
        g.fillRect(xPos, yPos, 150, 100);

        g.setColor(Color.BLACK);
        g.fillOval(xPos + 5, yPos + 80, 73, 73);
        g.fillOval(xPos + 95, yPos + 75, 73, 73);
        Color cTie = new Color(251, 202, 11);
        g.setColor(cTie);
        g.fillOval(xPos + 5, yPos + 80, 70, 70);
        g.fillOval(xPos + 95, yPos + 75, 70, 70);

    }
}
