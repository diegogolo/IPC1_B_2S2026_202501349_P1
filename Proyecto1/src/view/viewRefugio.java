package view;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class viewRefugio {
    final private Scanner read = new Scanner(System.in);
    JFrame frame = new JFrame();
    JPasswordField pass;
    public viewRefugio(){
        frame.setTitle("Login");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,2));
        JLabel tag = new JLabel("Contraseña");
        pass = new JPasswordField();
        JButton boton = new JButton("Ingresar");
        frame.add(tag);
        frame.add(pass);
        frame.add(boton);
        frame.setVisible(true);
    }
}
