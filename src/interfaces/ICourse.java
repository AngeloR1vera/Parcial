package interfaces;

import javax.swing.*;

public class ICourse extends JFrame {

    public ICourse() {
        // Configuración básica de la ventana
        setTitle("Gestión de Cursos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar esta ventana sin salir del programa

        // Crear elementos de la interfaz
        JLabel label = new JLabel("Lista de Cursos:");
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setText("Curso 1\nCurso 2\nCurso 3"); // Puedes cambiar esto para que cargue datos reales
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
