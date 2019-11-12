/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import javax.swing.SwingConstants;

/**
 *
 * @author irone
 */
public class PestaniaSiete extends JPanel {

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

        this.setLayout(new BorderLayout());
        this.add(pulsar, BorderLayout.CENTER);
        this.add(barraProg, BorderLayout.SOUTH);
    }

    private void configBarraProgress() {
        barraProg.getValue();
        barraProg.setStringPainted(true);
        barraProg.setIndeterminate(true);
    }

    private void acciones() {

    }

}
