/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;




/**
 *
 * @author irone
 */
public class PestaniaPerson extends JPanel implements ItemListener{

    JLabel letras, tamano, tipo, estilo;
    JComboBox letrasC, tamanoC, tipoC, estiloC;
    DefaultComboBoxModel modeloLetra, modeloTam, modeloTipo, modeloEstilo;
         

    public PestaniaPerson() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        acciones();
        configPanel();
        rellenarLetras();
        
    }
    
    private void rellenarLetras(){
        Font [] fuente =GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        
        for(Font item :fuente){
           modeloLetra.addElement(item.getName());
        }
    }
 

    private void acciones() {
      
        letrasC.addItemListener(this);

    }

  

    private void instancias() {
     
        letras = new JLabel("Letras");
        tamano = new JLabel("Tamaño");
        tipo = new JLabel("Tipo");
        estilo = new JLabel("Estilo");
        
        modeloLetra = new DefaultComboBoxModel();
        letrasC = new JComboBox(modeloLetra);
        
        modeloTam = new DefaultComboBoxModel();
        tamanoC = new JComboBox(modeloTam);
        
        modeloTipo = new DefaultComboBoxModel();
        tipoC = new JComboBox(modeloTipo);
        
        modeloEstilo = new DefaultComboBoxModel();
        estiloC = new JComboBox(modeloEstilo);

    }
        private void configPanel() {

            this.setLayout(new GridLayout(4,2));
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
    public void itemStateChanged(ItemEvent e) {
        
        if(e.getSource()== letrasC){
           String tipo =  (String) modeloLetra.getSelectedItem();
            System.out.println(tipo);
            Font fuente = new Font(tipo,Font.BOLD,13);
            //letras.setFont(fuente);
            Component [] componentes = this.getComponents();
            for(Component item : componentes){
                item.setFont(fuente);
            }
        }
    }


  


}

 