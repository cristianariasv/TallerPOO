/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import modelo.*;
import vista.VistaSwing;

public class ControladorTarifas {

    private VistaSwing vista;
    private SistemaTarifarioDAO dao;

    public ControladorTarifas(VistaSwing vista, SistemaTarifarioDAO dao) {
        this.vista = vista;
        this.dao = dao;

        vista.addCalcularListener(e -> procesarViaje());
    }

    private void procesarViaje() {
        String tipo = vista.getTipoTransporte();
        int distancia = vista.getDistancia();
        if (distancia < 0) return; // no continuar si hay error

        int horaPico = vista.getHoraPico();

        SistemaTarifario sistema;
        switch (tipo) {
            case "Bus" -> sistema = new Bus(2000);
            case "Metro" -> sistema = new Metro(1800);
            case "Taxi" -> sistema = new Taxi(2500);
            default -> {
                vista.mostrarResultado(0);
                return;
            }
        }

        double tarifa = sistema.procesarViaje(distancia, horaPico);
        vista.mostrarResultado(tarifa);

        String registro = tipo + " - Distancia: " + distancia + " km - Tarifa: $" + tarifa;
        dao.agregarRegistro(registro);
        vista.agregarAlHistorial(registro);
    }
}
