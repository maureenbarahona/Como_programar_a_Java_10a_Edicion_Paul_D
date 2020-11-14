/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.cap12.fig12_6;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author maureen
 */
public class LabelFrame extends JFrame {

    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;

    public LabelFrame() {
        super("Prueba de JLabel");
        setLayout(new FlowLayout());

        // Constructor de JLabel con un argumento String
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1); // agrega etiqueta1 a JFrame
        
        
        // Constructor de JLabel con argumentos de cadena, Icono y alineación
        Icon insecto = new ImageIcon(getClass().getResource("Insecto1.png"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add(etiqueta2); // agrega etiqueta2 a JFrame
        
        
        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3); // agrega etiqueta3 a JFrame 

    }
}
