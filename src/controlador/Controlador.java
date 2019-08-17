/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  @author brayansebastian
 * @author tatiana almansa
 */
public class Controlador implements ActionListener{  //escucha los eventos de algun boton
    //Declara variables de tipo objeto
    private Vista view;
    private Modelo model;
    DefaultTableModel table;
    
    //Constructor de la clase Controlador que recibe dos parametros (vista, modelo)
    public Controlador(Vista view, Modelo model){
        
        //se igualan las propiedades
        this.view = view;
        this.model = model;
        this.view.jButton1.addActionListener(this);
        //se iguala tambien el modelo de la tabla
        table = new DefaultTableModel();
        view.jTable1.setModel(table);
        
        table.addColumn("Listado"); //nombre para la columna de la tabla
    
    }
    //Metodo para iniciar la vista
    public void iniciar(){
    
        view.setTitle("MVC Proyecto");
        view.setLocationRelativeTo(null); // null para que la ventana inicie en el centro de la pantalla
    }
    
    //Funcion que realiza el boton
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setText(view.jTextField1.getText());
        model.Content();
        Object []object = new Object[1];
        object [0] = view.jTextField1.getText();
        table.addRow(object);
        limpiar();
    }
    //Limpia el espacio de texto despues de almacenar
    private void limpiar() {
        view.jTextField1.setText("");
    }
    
    
}
