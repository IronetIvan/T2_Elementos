/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Component;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import static javax.swing.text.StyleConstants.Italic;

/**
 *
 * @author irone
 */
public class PestaniaPerson extends JPanel implements ItemListener {

    JLabel letras, tamano, tipo, estilo;
    JComboBox letrasC, tamanoC, tipoC, estiloC;
    DefaultComboBoxModel modeloLetra, modeloTam, modeloTipo, modeloEstilo;

    public PestaniaPerson() {

        initGUI();
    }

    public void initGUI(){
        instancias();
        acciones();
        configPanel();
        rellenarLetras();
        rellenarTipo();
        rellenarTamano();
        rellenarEstilos();
        cambiarLetras();

    }
    
    private void rellenarEstilos(){
        try {
            UIManager.LookAndFeelInfo[] estilos = UIManager.getInstalledLookAndFeels();
            
            for(UIManager.LookAndFeelInfo item : estilos){
                System.out.println(item.getClassName());
            }
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(PestaniaPerson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(PestaniaPerson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(PestaniaPerson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(PestaniaPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void rellenarLetras() {
        Font[] fuente = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

        for (Font item : fuente) {
            modeloLetra.addElement(item.getName());
        }
    }

    private void rellenarTamano() {
        for (int i = 8; i < 61; i++) {
            modeloTam.addElement(i);
        }
    }

    private void rellenarTipo() {
        modeloTipo.addElement("NORMAL");
        modeloTipo.addElement("BOLD");
        modeloTipo.addElement("ITALIC");

    }

    private void acciones() {

        letrasC.addItemListener(this);
        tamanoC.addItemListener(this);
        tipoC.addItemListener(this);
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

        this.setLayout(new GridLayout(4, 2));
        this.add(letrasC);
        this.add(letras);
        this.add(tamanoC);
        this.add(tamano);
        this.add(tipoC);
        this.add(tipo);
        this.add(estiloC);
        this.add(estilo);

    }

    private void cambiarLetras() {
        //Font fuente = new Font((String) modeloLetra.getSelectedItem(), tipoC.getSelectedIndex(), (int) modeloTam.getSelectedItem());
        //letras.setFont(fuente);
        Component[] componentes = this.getComponents();
        for (Component item : componentes) {
            //item.setFont(fuente);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == letrasC) {
            cambiarLetras();
        } else if (e.getSource() == tamanoC) {
            cambiarLetras();
        } else if (e.getSource() == tipoC) {
            cambiarLetras();
        }

    }

}
