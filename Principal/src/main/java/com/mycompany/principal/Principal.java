/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Cristian.ariasv
 */
public class Principal {
    
    // Método polimórfico
    public static void procesarViaje(SistemaTarifario vehiculo, double km) {
        vehiculo.mostrarRuta();
        double tarifa = vehiculo.calcularTarifa(km);
        System.out.println("Distancia recorrida: " + km + " km");
        System.out.println("Tarifa total: $" + tarifa + " COP");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        // Creamos los vehículos
        BusArticulado miBus = new BusArticulado();
        Teleferico miTeleferico = new Teleferico();
        
        // Probamos el polimorfismo
        procesarViaje(miBus, 5);
        procesarViaje(miTeleferico, 2);
    }
}

    