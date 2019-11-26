/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;




/**
 *
 * @author irone
 */
public class PestaniaPerson extends JPanel implements ActionListener{

    JLabel letras, tamano, tipo, estilo;
    JComboBox letrasC, tamanoC, tipoC, estiloC;
         

    public PestaniaPerson() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        acciones();
        configPanel();
        
    }

 

    private void acciones() {
      
  

    }

  

    private void instancias() {
     
        letras = new JLabel("Letras");
        tamano = new JLabel("Tamaño");
        tipo = new JLabel("Tipo");
        estilo = new JLabel("Estilo");
        letrasC = new JComboBox();
        tamanoC = new JComboBox();
        tipoC = new JComboBox();
        estiloC = new JComboBox();

    }
        private void configPanel() {

            this.setLayout(new GridLayout(2,2));
            this.add(letrasC);
            this.add(letras);
            this.add(tamanoC);
            this.add(tamano);
            this.add(tipoC);
            this.add(tipo);
            this.add(estiloC);
            this.add(estilo);
            
            
            
        }

    @Override
    public void actionPerformed(ActionEvent arg0) {
       
    }


}

 