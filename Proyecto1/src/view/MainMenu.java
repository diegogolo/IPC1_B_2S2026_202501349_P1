package view;
import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {
    private MainFrame mainframe;
    public MainMenu (MainFrame mainframe){
        this.mainframe=mainframe;
        JButton boton1 = new JButton("Animales");
        boton1.addActionListener( e-> {
            mainframe.mostrarPaneles("Animales");
        });
        add(boton1);

        JButton boton2 = new JButton("Adoptantes");
        boton2.addActionListener( e-> {
            mainframe.mostrarPaneles("Adoptantes");
        });
        add(boton2);
        JButton boton3 = new JButton("Solicitudes");
        boton3.addActionListener( e-> {
            mainframe.mostrarPaneles("Solicitudes");
        });
        add(boton3);
        JButton boton4 = new JButton("Rescates");
        boton4.addActionListener( e-> {
            mainframe.mostrarPaneles("Rescates");
        });
        add(boton4);
        JButton boton5 = new JButton("Ubicaciones");
        boton5.addActionListener( e-> {
            mainframe.mostrarPaneles("Ubicaciones");
        });
        add(boton5);
        JButton boton6 = new JButton("Reportes");
        boton6.addActionListener( e-> {
            mainframe.mostrarPaneles("Reportes");
        });
        add(boton6);
        JButton boton7 = new JButton("Datos del Estudiante");
        boton7.addActionListener( e-> {
            mainframe.mostrarPaneles("Datos del estudiante");
        });
        add(boton7);
    }
}
