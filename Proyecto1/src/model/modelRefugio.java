package model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class modelRefugio {
    private Animales animales;
    private Adoptantes adoptante;
    private Rescates rescate;
    private EspaciosRefugio espacios;
    private Solicitudes solicitud;
    private int tipoUser=-1;
    public int getTipoUser(){
        return tipoUser;
    }

    public modelRefugio() {
        animales = new Animales();
        adoptante = new Adoptantes();
        rescate = new Rescates();
        espacios = new EspaciosRefugio();
        solicitud = new Solicitudes();
    }

    public boolean user(String match) {
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader("Proyecto1/src/model/users.txt"));
            for (int i = 0; i < 2; i++) {
                line = br.readLine();
                if (line != null && line.equals(match)) {
                    tipoUser=i;
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
    public boolean registrarAnimal(Animal nuevo){
        return animales.registro(nuevo);
    }
}
