/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.cap12.fig12_19;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author maureen
 */
public class MarcoBotonOpcion extends JFrame {

    private final JTextField campoTexto;
    
    private final Font tipoLetraSimple; // tipo de letra para texto simple
    private final Font tipoLetraNegrita; // tipo de letra para texto en negrita
    private final Font tipoLetraCursiva; // tipo de letra para texto en cursiva
    private final Font tipoLetraNegritaCursiva; // tipo de letra para texto en negrita y cursiva
    private final Font tipoLetraArial; // tipo de letra subsaryada 

    private final JRadioButton simpleJRadioButton; // selecciona texto simple
    private final JRadioButton negritaJRadioButton; // selecciona texto en negrita
    private final JRadioButton cursivaJRadioButton; // selecciona texto en cursiva
    private final JRadioButton negritaCursivaJRadioButton; // negrita y cursiva
    private final JRadioButton tipLetraArialJRadioButton; // subrayada
    
    private ButtonGroup grupoOpciones; // contiene los botones de opción

    public MarcoBotonOpcion() {
        super("Prueba de RadioButton");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Observe el cambio en el estilo del tipo de letra", 35);
        add(campoTexto); // agrega campoTexto a JFrame 

        // crea los botones de opción
        simpleJRadioButton = new JRadioButton("Simple", true);
        negritaJRadioButton = new JRadioButton("Negrita", false);
        cursivaJRadioButton = new JRadioButton("Cursiva", false);        
        negritaCursivaJRadioButton = new JRadioButton("Negrita / Cursiva", false);        
        tipLetraArialJRadioButton = new JRadioButton("Arial", false);

        add(simpleJRadioButton); // agrega botón simple a JFrame
        add(negritaJRadioButton); // agrega botón negrita a JFrame
        add(cursivaJRadioButton); // agrega botón cursiva a JFrame
        add(negritaCursivaJRadioButton); // agrega botón negrita y cursiva
        add(tipLetraArialJRadioButton); // agrega boton Tipo de letra Arial
        
        
        // crea una relación lógica entre los objetos JRadioButton
        grupoOpciones = new ButtonGroup(); // crea ButtonGroup
        grupoOpciones.add(simpleJRadioButton); // agrega simple al grupo
        grupoOpciones.add(negritaJRadioButton); // agrega negrita al grupo
        grupoOpciones.add(cursivaJRadioButton); // agrega cursiva al grupo
        grupoOpciones.add(negritaCursivaJRadioButton); // agrega negrita y cursiva
        grupoOpciones.add(tipLetraArialJRadioButton); // agrega tipo de letra arial

        // crea objetos tipo de letra
        tipoLetraSimple = new Font("Serif", Font.PLAIN, 14);
        tipoLetraNegrita = new Font("Serif", Font.BOLD, 14);
        tipoLetraCursiva = new Font("Serif", Font.ITALIC, 14);   
        tipoLetraNegritaCursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tipoLetraArial = new Font("Arial", Font.PLAIN, 14);
        
        
        campoTexto.setFont(tipoLetraSimple);
        
       // registra eventos para los objetos JRadioButton
        simpleJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
        tipLetraArialJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraArial));
        

    }

    private class ManejadorBotonOpcion implements ItemListener {

        private Font tipoLetra; // tipo de letra asociado con este componente de escucha

        public ManejadorBotonOpcion(Font f) {
            tipoLetra = f;
        }
// maneja los eventos de botones de opción

        @Override
        public void itemStateChanged(ItemEvent evento) {
            campoTexto.setFont(tipoLetra);
        }
    }

}
