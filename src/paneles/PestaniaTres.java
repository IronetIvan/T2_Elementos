/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author irone
 */
public class PestaniaTres extends JPanel implements ActionListener, ChangeListener, FocusListener, KeyListener {

    JTextField textoVal, textoValDos;
    JButton btnValidar;

    public PestaniaTres() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void acciones() {
        textoVal.addActionListener(this);
        textoValDos.addActionListener(this);
        btnValidar.addActionListener(this);
        textoValDos.addKeyListener(this);
    }

    private void configurarPanel() {
        this.add(textoVal);
        this.add(textoValDos);
        this.add(btnValidar);
    }

    private void instancias() {
        textoVal = new JTextField("Texto", 20);
        textoValDos = new JTextField("", 20);
        btnValidar = new JButton("Validar");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    @Override
    public void focusGained(FocusEvent arg0) {
       if(textoVal.getText().equals("Aviso")){
           textoVal.setText("");
       }
    }

    @Override
    public void focusLost(FocusEvent arg0) {
        if(textoVal.getText().length()==0){
            textoVal.setText("Aviso");
        }
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        System.out.println("typed");
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        System.out.println("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        System.out.println("Released");
    }
}
