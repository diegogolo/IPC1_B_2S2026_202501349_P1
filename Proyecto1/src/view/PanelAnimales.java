package view;
import javax.swing.*;
import java.awt.*;
import controller.controllerRefugio;
public class PanelAnimales extends JPanel {
    private MainFrame mainframe;
    JTextField campo_id, campo_name, campo_especie, campo_edad, campo_estado;
    public PanelAnimales(MainFrame mainframe) {
        setLayout(new GridLayout(7, 2));
        this.mainframe = mainframe;
        JLabel name = new JLabel("Módulo de animales");
        add(name);
        name.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel animales_id = new JLabel("Ingresa el id: ");
        animales_id.setHorizontalAlignment(SwingConstants.LEFT);
        campo_id = new JTextField();
        add(campo_id);
        add(animales_id);


        JLabel animales_name = new JLabel("Ingresa el nombre: ");
        animales_name.setHorizontalAlignment(SwingConstants.LEFT);
        campo_name = new JTextField();
        add(campo_name);
        add(animales_name);


        JLabel animales_especie = new JLabel("Ingresa la especie: ");
        animales_especie.setHorizontalAlignment(SwingConstants.LEFT);
        campo_especie = new JTextField();
        add(campo_especie);
        add(animales_especie);


        JLabel animales_edad = new JLabel("Ingresa la edad: ");
        animales_edad.setHorizontalAlignment(SwingConstants.LEFT);
        campo_edad = new JTextField();
        add(campo_edad);
        add(animales_edad);

        JLabel animales_estado = new JLabel("Ingresa el estado: ");
        animales_estado.setHorizontalAlignment(SwingConstants.LEFT);
        campo_estado = new JTextField();
        add(campo_estado);
        add(animales_estado);

        JButton registrar = new JButton("Registrar");
        registrar.addActionListener(e -> {
            mainframe.getController().registrarAnimal();
        });
        add(registrar);
    }

    public String getIdAnimal() {
        return campo_id.getText();
    }

    public String getName() {
        return campo_name.getText();
    }

    public String getEspecie() {
        return campo_especie.getText();
    }

    public String getEdad() {
        return campo_edad.getText();
    }

    public String getEstado() {
        return campo_estado.getText();
    }
}
