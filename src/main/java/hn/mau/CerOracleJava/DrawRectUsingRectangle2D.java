/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DrawRectUsingRectangle2D {

    static JTextArea statusBar = new JTextArea();

    public static void main(String[] args) {

        GridRectangle2DJPanel panel = new GridRectangle2DJPanel();

        MouseHandler handler = new MouseHandler();
        panel.addMouseMotionListener(handler);

        JFrame application = new JFrame();
        application.setTitle("Rectangulo 2D");

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel, BorderLayout.CENTER);
        application.add(statusBar, BorderLayout.SOUTH);
        application.setSize(280, 280);
        application.setVisible(true);
    }

    static class MouseHandler extends MouseMotionAdapter {

        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Coordenada del Mouse：[%d, %d]",
                    event.getX(), event.getY()));;
        }

    }

}
