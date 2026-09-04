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
        frame.setVisible(true);
    }
    public void mostrarPaneles(String Panel){
        CardLayout cl = (CardLayout) frame.getContentPane().getLayout();
        cl.show(frame.getContentPane(), Panel);
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

    public JPanel mainMenu(){
        JPanel menu = new JPanel(new GridLayout(2,2));
        return menu;
    }
}
