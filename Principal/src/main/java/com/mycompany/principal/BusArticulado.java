/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Cristian.ariasv
 */

public class BusArticulado extends SistemaTarifario {

    // Sobrescribimos el método calcularTarifa
    @Override
    public double calcularTarifa(double distancia) {
        // Tarifa fija, sin importar la distancia
        return 2950;
    }

    // Sobrescribimos el método mostrarRuta
    @Override
    public void mostrarRuta() {
        System.out.println("Ruta troncal (estándar de $2950 COP)");
    }
}


