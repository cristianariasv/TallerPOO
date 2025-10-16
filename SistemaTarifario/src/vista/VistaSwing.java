/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaSwing extends JFrame {

    private JComboBox<String> comboTransporte;
    private JTextField txtDistancia;
    private JCheckBox chkHoraPico;
    private JButton btnCalcular;
    private JTextArea areaHistorial;

    public VistaSwing() {
        // 🪟 Configuración básica
        setTitle("Sistema de Tarifas de Transporte");
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // 🎛️ Panel de entrada (superior)
        JPanel panelSuperior = new JPanel(new GridLayout(4, 2, 10, 10));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Datos del viaje"));

        panelSuperior.add(new JLabel("Tipo de transporte:"));
        comboTransporte = new JComboBox<>(new String[]{"Bus", "Metro", "Taxi"});
        panelSuperior.add(comboTransporte);

        panelSuperior.add(new JLabel("Distancia (km):"));
        txtDistancia = new JTextField();
        panelSuperior.add(txtDistancia);

        panelSuperior.add(new JLabel("¿Hora pico?"));
        chkHoraPico = new JCheckBox("Sí");
        panelSuperior.add(chkHoraPico);

        btnCalcular = new JButton("Calcular tarifa");
        panelSuperior.add(new JLabel()); // Espacio vacío
        panelSuperior.add(btnCalcular);

        add(panelSuperior, BorderLayout.NORTH);

        // 🧾 Área de historial (centro)
        JPanel panelHistorial = new JPanel(new BorderLayout());
        panelHistorial.setBorder(BorderFactory.createTitledBorder("Historial de viajes"));

        areaHistorial = new JTextArea();
        areaHistorial.setEditable(false);
        areaHistorial.setFont(new Font("Monospaced", Font.PLAIN, 13));

        JScrollPane scroll = new JScrollPane(areaHistorial);
        panelHistorial.add(scroll, BorderLayout.CENTER);

        add(panelHistorial, BorderLayout.CENTER);
    }

    // 🔽 Métodos para acceder a los datos
    public String getTipoTransporte() {
        return (String) comboTransporte.getSelectedItem();
    }

    public int getDistancia() {
        try {
            return Integer.parseInt(txtDistancia.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa una distancia válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public int getHoraPico() {
        return chkHoraPico.isSelected() ? 1 : 0;
    }

    // 💬 Mostrar resultados
    public void mostrarResultado(double tarifa) {
        JOptionPane.showMessageDialog(this, "Tarifa calculada: $" + tarifa);
    }

    public void agregarAlHistorial(String texto) {
        areaHistorial.append(texto + "\n");
    }

    // 🎯 Listener del botón
    public void addCalcularListener(ActionListener listener) {
        btnCalcular.addActionListener(listener);
    }
}
