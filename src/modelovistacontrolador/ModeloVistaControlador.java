/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelovistacontrolador;

import Modelo.Modelo;
import Vista.Vista;
import controlador.Controlador;

/**
 *
 * @author brayansebastian
 * @author tatiana almansa
 */
public class ModeloVistaControlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se instancian los objetos para poder ejecutar el proyecto
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
