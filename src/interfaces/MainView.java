package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    // Constructor de la ventana principal
    public MainView() {
        // Configurar la ventana principal
        setTitle("ACADEMICO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLayout(new BorderLayout());

        // Panel izquierdo con botones (Inscripción, Cursos, Grados)
        JPanel panelLateral = new JPanel();
        panelLateral.setLayout(new GridLayout(3, 1));
        JButton btnInscripcion = new JButton("INSCRIPCIÓN");
        JButton btnCursos = new JButton("CURSOS");
        JButton btnGrados = new JButton("GRADOS");
        panelLateral.add(btnInscripcion);
        panelLateral.add(btnCursos);
        panelLateral.add(btnGrados);

        // Panel principal para mostrar la información seleccionada
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        JLabel labelPrincipal = new JLabel("(Mostrar información de la opción seleccionada)", SwingConstants.CENTER);
        panelPrincipal.add(labelPrincipal, BorderLayout.CENTER);

        // Panel adicional para mostrar información complementaria
        JPanel panelAdicional = new JPanel();
        JLabel labelAdicional = new JLabel("(Mostrar información adicional)", SwingConstants.CENTER);
        panelAdicional.add(labelAdicional);

        // Añadir los paneles a la ventana principal
        add(panelLateral, BorderLayout.WEST);
        add(panelPrincipal, BorderLayout.CENTER);
        add(panelAdicional, BorderLayout.SOUTH);

        // Acciones de los botones
        btnInscripcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPrincipal.setText("Información de Inscripción");
                labelAdicional.setText("Información adicional sobre Inscripción");
            }
        });

        btnCursos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPrincipal.setText("Información de Cursos");
                labelAdicional.setText("Información adicional sobre Cursos");
            }
        });

        btnGrados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPrincipal.setText("Información de Grados");
                labelAdicional.setText("Información adicional sobre Grados");
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new MainView();
    }
}