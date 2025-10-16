/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.*;
import vista.VistaSwing;

public class Main {
    public static void main(String[] args) {
        VistaSwing vista = new VistaSwing();
        SistemaTarifarioDAO dao = new SistemaTarifarioDAO();
        ControladorTarifas controlador = new ControladorTarifas(vista, dao);
        vista.setVisible(true);
    }
}



