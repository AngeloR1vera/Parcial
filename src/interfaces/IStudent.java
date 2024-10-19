package interfaces;

import javax.swing.*;

public class IStudent extends JFrame {

    public IStudent() {
        // Configuración básica de la ventana
        setTitle("Gestión de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar esta ventana sin salir del programa

        // Crear elementos de la interfaz
        JLabel label = new JLabel("Lista de Estudiantes:");
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setText("Estudiante 1\nEstudiante 2\nEstudiante 3"); // Puedes cambiar esto para cargar datos reales
        textArea.setEditable(false);

        // Añadir elementos al panel
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(new JScrollPane(textArea)); // Añadir scroll

        // Añadir panel a la ventana
        add(panel);
        setVisible(true);
    }
}