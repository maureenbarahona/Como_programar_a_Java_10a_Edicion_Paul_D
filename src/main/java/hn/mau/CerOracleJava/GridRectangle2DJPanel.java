/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author maureen
 */
public class GridRectangle2DJPanel extends JPanel {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponents(g);
        double width = getWidth(); // total width   
        double height = getHeight(); // total height
        int rRed;
        int rGreen;
        int rBlue;
        int offset = 60;  

        //Color of arc, below color is called "Taibao Lan"
        rRed = 21;
        rGreen = 101;
        rBlue = 192;
        Color color = new Color(rRed, rGreen, rBlue);

      
        for (int i = 100; i > 0; i--) {
            for (int j = 100; j > 0; j--) {
                g2d.setColor(color);
                g2d.draw(new Rectangle2D.Double(width / 2 - (j + 1) * 10 + offset, height / 2 - (i + 1) * 10 + offset, 10, 10));
            }

        }
    }

}
