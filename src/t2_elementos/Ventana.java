/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_elementos;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.MenuBar;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import paneles.PestaniaCuatro;
import paneles.PestaniaDos;
import paneles.PestaniaTres;
import paneles.PestaniaUno;
import paneles.PestaniaCinco;
import paneles.PestaniaSeis;
import paneles.PestaniaSiete;
import paneles.PestaniaPerson;
import paneles.PestaniaNueve;
import paneles.PestaniaDiez;

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
    PestaniaCuatro pestaniaCuatro;
    PestaniaCinco pestaniaCinco;
    PestaniaSeis pestaniaSeis;
    PestaniaSiete pestaniaSiete;
    PestaniaPerson pestaniaPerson;
    PestaniaNueve pestaniaNueve;
    PestaniaDiez pestaniaDiez;
    JTabbedPane panelPestanias;
    
    JMenuBar menu;
    JMenu menu1;
    JMenuItem opcion1;
   

    public void initGUI() {

        instancias();
        configurarContainer();
        configMenu();
        this.setSize(new Dimension(800, 450));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.pack();
    }

    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Botones", pestaniaUno);
        panelPestanias.addTab("Check y radios", pestaniaDos);
        panelPestanias.addTab("Textos", pestaniaTres);
        panelPestanias.addTab("TextoRepaso", pestaniaCuatro);
        panelPestanias.addTab("Form", pestaniaCinco);
        panelPestanias.addTab("Agregar elementos", pestaniaSeis);
        panelPestanias.addTab("Barra Progreso", pestaniaSiete);
        panelPestanias.addTab("Personalizar", pestaniaPerson);
        panelPestanias.addTab("Tabla simple", pestaniaNueve);
        panelPestanias.addTab("Tabla avanzada", pestaniaDiez);
        
    }

    private void instancias() {
        container = this.getContentPane();
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaUno = new PestaniaUno();
        pestaniaDos = new PestaniaDos();
        pestaniaTres = new PestaniaTres();
        pestaniaCuatro = new PestaniaCuatro();
        pestaniaCinco = new PestaniaCinco();
        pestaniaSeis = new PestaniaSeis();
        pestaniaSiete = new PestaniaSiete();
        pestaniaPerson = new PestaniaPerson();
        pestaniaNueve = new PestaniaNueve();
        pestaniaDiez = new PestaniaDiez();
        
        menu = new JMenuBar();
        menu1 = new JMenu("Menu 1");
        
        opcion1 = new JMenuItem("Opcion1", KeyEvent.VK_CONTROL);
      
    }

    private void configMenu() {
        setJMenuBar(menu);
        menu.add(menu1);
        menu1.add("opcion1");
        menu1.add("opcion2");
        menu1.add("opcion3");
        menu1.addSeparator();
        menu1.add("opcion4");
        menu1.add("opcion5");
        menu1.add("opcion6");
        opcion1.setMnemonic(KeyEvent.VK_CONTROL);
    }
}
