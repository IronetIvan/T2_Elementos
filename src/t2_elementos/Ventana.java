/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_elementos;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import paneles.PestaniaDos;
import paneles.PestaniaTres;
import paneles.PestaniaUno;

/**
 *
 * @author irone
 */
public class Ventana extends JFrame {

    Container container;
    // panel personalizado
    PestaniaUno pestaniaUno;
    PestaniaDos pestaniaDos;
    PestaniaTres pestaniaTres;
    JTabbedPane panelPestanias;

    public void initGUI(){

        instancias();
        configurarContainer();
        this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.pack();
    }

    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Botones",pestaniaUno);
        panelPestanias.addTab("Check y radios",pestaniaDos);
        panelPestanias.addTab("Textos", pestaniaTres);
    }

    private void instancias() {
        container = this.getContentPane();
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaUno = new PestaniaUno();
        pestaniaDos = new PestaniaDos();
        pestaniaTres = new PestaniaTres();
    }
}