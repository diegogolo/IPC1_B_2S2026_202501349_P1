package model;

public class Adoptantes {
    private Adoptante[] adoptantes = new Adoptante[100];
    private int totalAdoptantes=0;

    public boolean adoptanteNuevo(Adoptante nuevo){
        if(totalAdoptantes == adoptantes.length){
            return false;
        }
        for (int i = 0; i < totalAdoptantes; i++) {
            if(adoptantes[i].getId().equals(nuevo.getId())) {
                return false;
            }
        }
        adoptantes[totalAdoptantes]=nuevo;
        totalAdoptantes++;
        return true;
    }
    public boolean searchAdoptante(String lookingfor){
        for(int i = 0; i < totalAdoptantes; i++){
            if(lookingfor.equals(adoptantes[i].getId())){
                return true;
            }
        }
        return false;
    }
    public boolean editNombreAdoptante(String id, String cambioNombre){
        for(int i = 0; i < totalAdoptantes; i++){
            if(id.equals(adoptantes[i].getId())){
                adoptantes[i].setNombreAdoptante(cambioNombre);
                return true;
            }
        }
        return false;
    }
    public Adoptante[] listarAdoptantes(){
        Adoptante[] lista = new Adoptante[totalAdoptantes];
        for(int i = 0; i < totalAdoptantes; i++){
            lista[i] = adoptantes[i];
        }
        return lista;
    }
}
