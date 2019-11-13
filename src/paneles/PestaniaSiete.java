/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author irone
 */
public class PestaniaSiete extends JPanel implements ActionListener, ChangeListener{

    JButton pulsar;
    JProgressBar barraProg;

    public PestaniaSiete() {
        initGUI();
    }

    public void initGUI() {
        instancias();
        acciones();
        configPanel();
        configBarraProgress();
    }

    private void instancias() {
        pulsar = new JButton("Pulsar");
        barraProg = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
    }

    private void configPanel() {

        this.add(pulsar);
        this.add(barraProg);
    }

    private void configBarraProgress() {
        barraProg.setMinimum(0);
        barraProg.setMaximum(100);
        barraProg.setValue(0);
        //barraProgreso.getValue();
        barraProg.setStringPainted(true);
        barraProg.setBorderPainted(true);
    }

    private void acciones() {
        pulsar.addActionListener(this);
        barraProg.addChangeListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pulsar) {
            barraProg.setValue(barraProg.getValue()+25);
            if (barraProg.getValue()==100){
                getToolkit().beep();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent arg0) {
        if(barraProg.getValue()==100){
        System.out.println("Completado");
        }
    }
}