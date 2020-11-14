package hn.mau.cap12.Temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class ConvertirTemperatura extends JFrame {

    // Componentes
    JTextField txtFromTemp, txtToTemp;
    JLabel lblFromTemp, lblToTemp, lblToTempbox;
    JRadioButton radFromCelsius, radFromFahrenheit, radFromKelvin, radToCelsius, radToFahrenheit, radToKelvin;
    JPanel pnlFromRadioButton, pnlToRadioButton, pnlFrom, pnlTo, pnlButton, pnlEnterTemp, pnlComparableTemp;
    ButtonGroup bgFrom, bgTo;
    JButton btnConvert, btnExit;

    // Constructor
    
    public ConvertirTemperatura() {
        super("Temperatura");

        // assign objects
        radFromCelsius = new JRadioButton("Celsius", true);
        radFromFahrenheit = new JRadioButton("Fahrenheit");
        radFromKelvin = new JRadioButton("Kelvin");
        lblFromTemp = new JLabel("Ingrese Temperatura: ");
        pnlFrom = new JPanel();
        btnConvert = new JButton("Convertir");
        btnExit = new JButton("Salir");
        pnlButton = new JPanel();
        txtFromTemp = new JTextField(3);
        lblToTemp = new JLabel("Comparar Temperatura: ");
        txtToTemp = new JTextField(3);
        pnlTo = new JPanel();
        pnlEnterTemp = new JPanel();
        pnlComparableTemp = new JPanel();
        pnlFromRadioButton = new JPanel();
        pnlToRadioButton = new JPanel();

        // register the button to a listener
        btnExit.addActionListener(new MyButtonListener());
        btnConvert.addActionListener(new MyButtonListener());

        // make the multiple choice exclusive but not a container
        bgFrom = new ButtonGroup();
        bgFrom.add(radFromCelsius);
        bgFrom.add(radFromFahrenheit);
        bgFrom.add(radFromKelvin);

        // radio buttons
        radToCelsius = new JRadioButton("Celsius");
        radToFahrenheit = new JRadioButton("Fahrenheit", true);
        radToKelvin = new JRadioButton("Kelvin");

        // make the multiple choice exclusive
        bgTo = new ButtonGroup();
        bgTo.add(radToCelsius);
        bgTo.add(radToFahrenheit);
        bgTo.add(radToKelvin);

        pnlFrom.setLayout(new GridLayout(2, 1));
        pnlFrom.add(pnlFromRadioButton);
        pnlFrom.add(pnlEnterTemp);

        pnlTo.setLayout(new GridLayout(2, 1));
        pnlTo.add(pnlToRadioButton);
        pnlTo.add(pnlComparableTemp);

        // decorate the panel
        pnlFrom.setBorder(BorderFactory.createTitledBorder("Desde"));
        pnlTo.setBorder(BorderFactory.createTitledBorder("A"));

        // add radiobutton to panel
        pnlFromRadioButton.add(radFromCelsius);
        pnlFromRadioButton.add(radFromFahrenheit);
        pnlFromRadioButton.add(radFromKelvin);
        pnlToRadioButton.add(radToCelsius);
        pnlToRadioButton.add(radToFahrenheit);
        pnlToRadioButton.add(radToKelvin);

        // add button to panel
        pnlButton.add(btnConvert);
        pnlButton.add(btnExit);

        // add label and txt field to panel
        pnlEnterTemp.add(lblFromTemp);
        pnlEnterTemp.add(txtFromTemp);
        pnlComparableTemp.add(lblToTemp);
        txtToTemp.setEditable(false);
        pnlComparableTemp.add(txtToTemp);

        // add panels to the frame
        add(pnlFrom, BorderLayout.NORTH);
        add(pnlTo, BorderLayout.CENTER);
        add(pnlButton, BorderLayout.SOUTH);

        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    // private inner class to handle button event
    private class MyButtonListener implements ActionListener {
        // must override actionPerformed method

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnConvert) {
                if (radFromCelsius.isSelected() && radToFahrenheit.isSelected()) {
                    int strInput = Integer.parseInt(txtFromTemp.getText());
                    int celsius = strInput * 9 / 5 + 32;
                    txtToTemp.setText(Integer.toString(celsius));
                } else if (radFromCelsius.isSelected() && radToCelsius.isSelected()
                        || radFromFahrenheit.isSelected() && radToFahrenheit.isSelected()
                        || radFromKelvin.isSelected() && radToKelvin.isSelected()) {
                    txtToTemp.setText(txtFromTemp.getText());
                } else if (radToCelsius.isSelected() && radFromFahrenheit.isSelected()) {
                    int strInput = Integer.parseInt(txtFromTemp.getText());
                    int fahrenheit = (strInput - 32) * 5 / 9;
                    txtToTemp.setText(Integer.toString(fahrenheit));
                } else if (radFromKelvin.isSelected() && radToCelsius.isSelected()) {
                    double strInput = Integer.parseInt(txtFromTemp.getText());
                    double celsius = strInput - 273.15;
                    txtToTemp.setText(Double.toString(celsius));
                } else if (radFromKelvin.isSelected() && radToFahrenheit.isSelected()) {
                    double strInput = Integer.parseInt(txtFromTemp.getText());
                    double fahrenheit = strInput - 459.67;
                    txtToTemp.setText(Double.toString(fahrenheit));
                } else if (radFromCelsius.isSelected() && radToKelvin.isSelected()) {
                    double strInput = Integer.parseInt(txtFromTemp.getText());
                    double celsius = strInput + 273.15;
                    txtToTemp.setText(Double.toString(celsius));
                } else if (radFromFahrenheit.isSelected() && radToKelvin.isSelected()) {
                    double strInput = Integer.parseInt(txtFromTemp.getText());
                    double fahrenheit = strInput + 255.37;
                    txtToTemp.setText(Double.toString(fahrenheit));
                }
            } else if (e.getSource() == btnExit) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new ConvertirTemperatura();
    }
}
