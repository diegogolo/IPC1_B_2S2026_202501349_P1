package model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class modelRefugio {
    private Animal animales;
    private Adoptantes adoptante;
    private Rescates rescate;
    private EspaciosRefugio espacios;

    public modelRefugio() {
        animales = new Animal();
        adoptante = new Adoptantes();
        rescate = new Rescates();
        espacios = new EspaciosRefugio();
    }

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
}
