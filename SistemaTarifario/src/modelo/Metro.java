/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Metro extends SistemaTarifario {

    public Metro(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double procesarViaje(int distancia, int horaPico) {
        double tarifa = tarifaBase + 80 * distancia;
        if (horaPico == 1) tarifa += 300;
        return tarifa;
    }
}
