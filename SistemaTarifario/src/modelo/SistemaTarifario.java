/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public abstract class SistemaTarifario {
    protected double tarifaBase;

    public SistemaTarifario(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double procesarViaje(int distancia, int horaPico);

    public double getTarifaBase() {
        return tarifaBase;
    }
}
