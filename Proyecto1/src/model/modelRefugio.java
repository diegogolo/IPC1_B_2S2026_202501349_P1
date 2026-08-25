package model;
import view.viewRefugio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class modelRefugio {
    public String id;
    public String name;
    public String especie;
    public int edad;
    public String estado;
    public boolean activo;

    viewRefugio vista = new viewRefugio();

    public boolean user(String match) {
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader("Proyecto1/src/model/users.txt"));
            for (int i = 0; i < 2; i++) {
                line = br.readLine();
                if (line != null && line.equals(match)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado=estado;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
