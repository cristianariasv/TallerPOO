/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaTarifarioDAO {

    private List<String> registros;

    public SistemaTarifarioDAO() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(String descripcion) {
        registros.add(descripcion);
    }

    public List<String> obtenerTodos() {
        return registros;
    }
}
