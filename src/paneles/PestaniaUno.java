/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author irone
 */
public class PestaniaUno extends JPanel implements ActionListener, ChangeListener {

    JButton botonNormal, botonImagen;
    JToggleButton botonTog;
    JToggleButton botonUno, botonDos, botonTres;
    ButtonGroup grupoBotones;


    public PestaniaUno() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void acciones() {
        botonNormal.addActionListener(this);
        botonImagen.addActionListener(this);
        botonTog.addChangeListener(this);
    }

    private void configurarPanel() {
        this.add(botonNormal);
        this.add(botonImagen);
        this.add(botonTog);
        this.add(botonUno);
        this.add(botonDos);
        this.add(botonTres);
    }

    private void instancias() {
        botonNormal = new JButton("Pulsar");
        botonImagen = new JButton();
        //botonImagen.setPreferredSize(new Dimension(32,32));
        botonImagen.setIcon(new ImageIcon(getClass().getResource("../recursos" +"/on.png")));

        botonImagen.setPressedIcon(new ImageIcon(getClass().getResource("../recursos/play.png")));
        botonImagen.setRolloverIcon(new ImageIcon(getClass().getResource("../recursos/error.png")));
        botonImagen.setToolTipText("El boton vale para lo que sea");
        botonImagen.setBackground(null);
        botonImagen.setBorderPainted(false);
        botonImagen.setFocusPainted(false);

        botonTog = new JToggleButton("Activado", true);
        botonTog.setIcon(new ImageIcon(getClass().getResource("../recursos/on.png")));
        //botonTog.setDisabledSelectedIcon(new ImageIcon(getClass().getResource("../recursos/switch_off.png")));
        botonTog.setBackground(null);
        botonTog.setBorderPainted(false);
        botonTog.setFocusPainted(false);

        botonUno = new JToggleButton("Opción 1");
        botonDos = new JToggleButton("Opción 2");
        botonTres = new JToggleButton("Opción 3");

        grupoBotones = new ButtonGroup();
        grupoBotones.add(botonUno);
        grupoBotones.add(botonDos);
        grupoBotones.add(botonTres);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonNormal) {
            // System.out.println("Boton Pulsado");
            if (botonTog.isSelected()) {
                botonTog.setSelected(false);
            } else
                botonTog.setSelected(true);
        } else if (e.getSource() == botonImagen) {

        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        if (botonTog.isSelected()) {
            botonTog.setIcon(new ImageIcon(getClass().getResource("../recursos/on.png")));
        } else {
            botonTog.setIcon(new ImageIcon(getClass().getResource("../recursos/off.png")));
        }

    }
    
    //BorderLayout JFrame      FlowLayout --> JPanel
}