package view;
import controller.controllerRefugio;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class viewRefugio {
    final private Scanner read = new Scanner(System.in);
    JFrame frame = new JFrame();
    private controllerRefugio controller;
    public void setController(controllerRefugio controller){
        this.controller = controller;
    }
    JPasswordField pass;
    public viewRefugio(){
        frame.setTitle("Centro de Rescate Animal");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new CardLayout());
        frame.add(panelLogin(), "Login");
        frame.add(mainMenu(), "Menu");
        frame.add(animales(), "Animales");
        frame.setVisible(true);
    }
    public void mostrarPaneles(String panel){
        CardLayout cl = (CardLayout) frame.getContentPane().getLayout(); //cast de layoutmanager a cardlayout
        cl.show(frame.getContentPane(), panel);
    }
    public JPanel panelLogin(){
        JPanel panelLog = new JPanel(new GridLayout(2,1));
        JLabel tag = new JLabel("Contraseña");
        tag.setHorizontalAlignment(SwingConstants.CENTER);
        pass = new JPasswordField();
        JButton boton = new JButton("Ingresar");
        boton.setPreferredSize(new Dimension(250,250));
        boton.addActionListener(e ->{
            controller.validarLogin();
        });
        panelLog.add(tag);
        panelLog.add(pass);
        panelLog.add(boton);
        return panelLog;
    }
    public void showMensaje(String mensaje){
        JOptionPane.showMessageDialog(frame,mensaje);
    }
    public String getPassword(){
        return new String(pass.getPassword());
    }
        //animales, adoptantes, solicitudes, rescates, ubicaciones, reportes y datos (7)
    public JPanel mainMenu(){
        JPanel menu = new JPanel(new GridLayout(5, 2));
        JButton boton1 = new JButton("Animales");
        boton1.addActionListener( e-> {
            mostrarPaneles("Animales");
        });
        menu.add(boton1);

        JButton boton2 = new JButton("Adoptantes");
        boton2.addActionListener( e-> {
            mostrarPaneles("Adoptantes");
        });
        menu.add(boton2);
        JButton boton3 = new JButton("Solicitudes");
        boton3.addActionListener( e-> {
            mostrarPaneles("Solicitudes");
        });
        menu.add(boton3);
        JButton boton4 = new JButton("Rescates");
        boton4.addActionListener( e-> {
            mostrarPaneles("Rescates");
        });
        menu.add(boton4);
        JButton boton5 = new JButton("Ubicaciones");
        boton5.addActionListener( e-> {
            mostrarPaneles("Ubicaciones");
        });
        menu.add(boton5);
        JButton boton6 = new JButton("Reportes");
        boton6.addActionListener( e-> {
            mostrarPaneles("Reportes");
        });
        menu.add(boton6);
        JButton boton7 = new JButton("Datos del Estudiante");
        boton7.addActionListener( e-> {
            mostrarPaneles("Datos del estudiante");
        });
        menu.add(boton7);
        return menu;
    }
    JTextField campo_id, campo_name, campo_especie, campo_edad, campo_estado;
    public JPanel animales(){
        JPanel mod_animales = new JPanel(new GridLayout(7,2));

        JLabel name = new JLabel("Módulo de animales");
        mod_animales.add(name);
        name.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel animales_id = new JLabel("Ingresa el id: ");
        animales_id.setHorizontalAlignment(SwingConstants.LEFT);
        campo_id = new JTextField();
        mod_animales.add(campo_id);
        mod_animales.add(animales_id);


        JLabel animales_name = new JLabel("Ingresa el nombre: ");
        animales_name.setHorizontalAlignment(SwingConstants.LEFT);
        campo_name = new JTextField();
        mod_animales.add(campo_name);
        mod_animales.add(animales_name);


        JLabel animales_especie = new JLabel("Ingresa la especie: ");
        animales_especie.setHorizontalAlignment(SwingConstants.LEFT);
        campo_especie = new JTextField();
        mod_animales.add(campo_especie);
        mod_animales.add(animales_especie);


        JLabel animales_edad = new JLabel("Ingresa la edad: ");
        animales_edad.setHorizontalAlignment(SwingConstants.LEFT);
        campo_edad = new JTextField();
        mod_animales.add(campo_edad);
        mod_animales.add(animales_edad);




        JLabel animales_estado = new JLabel("Ingresa el estado: ");
        animales_estado.setHorizontalAlignment(SwingConstants.LEFT);
        campo_estado = new JTextField();
        mod_animales.add(campo_estado);
        mod_animales.add(animales_estado);



        JButton registrar = new JButton("Registrar");
        registrar.addActionListener(e ->{
                controller.registrarAnimal();
        });
        mod_animales.add(registrar);
        return mod_animales;
    }
    public String getIdAnimal(){
        return campo_id.getText();
    }
    public String getName(){
        return campo_name.getText();
    }
    public String getEspecie(){
        return campo_especie.getText();
    }
    public String getEdad(){
        return campo_edad.getText();
    }
    public String getEstado(){
        return campo_estado.getText();
    }
}
