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
        frame.setTitle("Login");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,2));
        JLabel name = new JLabel("Centro de Rescate Animal");
        name.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel tag = new JLabel("Contraseña");
        tag.setHorizontalAlignment(SwingConstants.CENTER);
        pass = new JPasswordField();
        JButton boton = new JButton("Ingresar");
        boton.setPreferredSize(new Dimension(250,250));
        boton.addActionListener(e ->{
            controller.validarLogin();
        });
        frame.add(name);
        frame.add(tag);
        frame.add(pass);
        frame.add(boton);

        frame.setVisible(true);
    }
    public void showMensaje(String mensaje){
        JOptionPane.showMessageDialog(frame,mensaje);
    }
    public String getPassword(){
        return new String(pass.getPassword());
    }
}
