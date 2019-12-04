/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario DAM 2
 */
public class PestaniaDiez extends JPanel implements ActionListener {

    JTable tabla;
    DefaultTableModel modeloSimple;
    JButton bAgregar, bBorrar, bSeleccinado;
    JPanel pSur;

    public PestaniaDiez() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void acciones() {
        bAgregar.addActionListener(this);
        bBorrar.addActionListener(this);
        bSeleccinado.addActionListener(this);
        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("cambio de selección");
            }
        });

    }

    private void configurarPanel() {
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(tabla), BorderLayout.CENTER);
        this.add(configurarSur(), BorderLayout.SOUTH);

    }

    private JPanel configurarSur() {
        pSur.setLayout(new GridLayout(3, 1));
        pSur.add(bAgregar);
        pSur.add(bBorrar);
        pSur.add(bSeleccinado);
        return pSur;
    }

    private void instancias() {

        String datos[][] = {{"Nombre", "Apellido", "123"}, {"Nombre", "Apellido", "123"}, {"Nombre", "Apellido", "123"},
        {"Nombre", "Apellido", "123"}};
        String columnas[] = {"Nombre", "Apellido", "Telefono"};
        modeloSimple = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modeloSimple);
        bAgregar = new JButton("Agregar");
        bBorrar = new JButton("Borrar");
        pSur = new JPanel();
        bSeleccinado = new JButton("Seleccionado");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAgregar) {

        } else if (e.getSource() == bBorrar) {

        } else if (e.getSource() == bSeleccinado) {

        }
    }
}
