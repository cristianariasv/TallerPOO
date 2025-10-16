/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Cristian.ariasv
 */

// Hereda de la clase SistemaTarifario
public class Teleferico extends SistemaTarifario {

    @Override
    public double calcularTarifa(double distancia) {
        double tarifaBase = 1000;
        double adicionalPorKm = 500;
        return tarifaBase + (adicionalPorKm * distancia);
    }

    @Override
    public void mostrarRuta() {
        System.out.println("Ruta de conexión veredal (tarifa variable, base $1000 COP)");
    }
}

