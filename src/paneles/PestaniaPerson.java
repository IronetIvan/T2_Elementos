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

    JComboBox comboLetra, comboTamanio, comboTipo, comboEstilo;
    DefaultComboBoxModel modeloLetra, modeloTamanio, modeloTipo, modeloEstilo;
    JLabel labelLetra, labelTamanio, labelTipo, labelEstilo;

    public PestaniaPerson() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        rellenarLetras();
        rellenarTamanio();
        rellenarTipo();
        rellenarEstilos();
        configurarPanel();
        acciones();
    }

    private void rellenarEstilos() {
        UIManager.LookAndFeelInfo[] estilos =
                UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo item:estilos) {
            //System.out.println(item.getClassName());
            modeloEstilo.addElement(item.getClassName());
        }

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    private void rellenarLetras() {
        Font[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAllFonts();

        for (Font item : fuentes) {

            modeloLetra.addElement(item.getName());
        }


    }

    private void rellenarTamanio() {
        for (int i = 8; i <= 50; i++) {
            modeloTamanio.addElement(i);
        }
    }

    private void rellenarTipo() {

        modeloTipo.addElement("NORMAL");
        modeloTipo.addElement("BOLD");
        modeloTipo.addElement("ITALIC");
    }

    private void acciones() {
        comboLetra.addItemListener(this);
        comboTamanio.addItemListener(this);
        comboTipo.addItemListener(this);

    }

    private void configurarPanel() {
        this.setLayout(new GridLayout(4, 2));
        this.add(labelLetra);
        this.add(comboLetra);
        this.add(labelTamanio);
        this.add(comboTamanio);
        this.add(labelTipo);
        this.add(comboTipo);
        this.add(labelEstilo);
        this.add(comboEstilo);

    }

    private void instancias() {

        modeloLetra = new DefaultComboBoxModel();
        modeloEstilo = new DefaultComboBoxModel();
        modeloTipo = new DefaultComboBoxModel();
        modeloTamanio = new DefaultComboBoxModel();

        comboLetra = new JComboBox(modeloLetra);
        comboTamanio = new JComboBox(modeloTamanio);
        comboEstilo = new JComboBox(modeloEstilo);
        comboTipo = new JComboBox(modeloTipo);

        labelEstilo = new JLabel("Estilo");
        labelTipo = new JLabel("Tipo");
        labelTamanio = new JLabel("Tamaño");
        labelLetra = new JLabel("Letra");

    }

    private void cambiarLetras() {
        Font fuente = new Font((String) modeloLetra.getSelectedItem(),
                comboTipo.getSelectedIndex(),
                (int) modeloTamanio.getSelectedItem());
        Component[] components = this.getComponents();
        for (Component item : components) {
            item.setFont(fuente);
        }
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboLetra) {
            cambiarLetras();
        } else if (e.getSource() == comboTamanio) {
            cambiarLetras();
        } else if (e.getSource() == comboTipo) {
            cambiarLetras();
        }
    }
}