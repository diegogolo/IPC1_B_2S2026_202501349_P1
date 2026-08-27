package model;

public class Animales {
    private Animal[] animales = new Animal[50];
    private int total = 0;
    public boolean registro(Animal nuevo) {
        if (total >= animales.length) {
            return false;
        }
        for (int i = 0; i < total; i++) {
            if (animales[i].getId().equals(nuevo.getId())) {
                return false;
            }
        }
        animales[total]=nuevo;
        total++;
        return true;
    }
    //busqueda por código
    public Animal search(String identi){
        for (int i = 0; i < total; i++) {
            if (animales[i].getId().equals(identi)) {
                return animales[i];
            }
        }
        return null;
    }
    //búsqueda por nombre
    public Animal nameSearch(String nombre){
        for (int i = 0; i < total; i++) {
            if(animales[i].getName().equals(nombre)) {
                return animales[i];
            }
        }
        return null;
    }
    //búsqueda por estado
    public Animal state(String estado){
        for (int i = 0; i < total; i++) {
            if(animales[i].getEstado().equals(estado)) {
                return animales[i];
            }
        }
        return null;
    }
    public boolean editEstado(String id, String newEstado){
        for (int i = 0; i < total; i++) {
            if(animales[i].getId().equals(id)) {
                animales[i].setEstado(newEstado);
                return true;
            }
        }
        return false;
    }
    public boolean delete(String id){
        for (int i = 0; i < total; i++) {
            if(animales[i].getId().equals(id)) {
                animales[i].setActivo(false);
                return true;
            }
        }
        return false;
    }
    public Animal[] listar(){
       Animal[] activos = new Animal[total];
       int imprimir=0;
       for (int i = 0; i < total; i++) {
           if(animales[i].getActivo()) {
               activos[imprimir]=animales[i];
               imprimir++;
           }
       }
       return activos;
    }
}


