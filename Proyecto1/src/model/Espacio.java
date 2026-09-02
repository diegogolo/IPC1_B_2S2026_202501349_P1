package model;

public class Espacio {
    private String idAnimal;
    private boolean occupied;

    public String getIdAnimal(){
        return idAnimal;
    }
    public void setIdAnimal(String idAnimal){
        this.idAnimal=idAnimal;
    }
    public boolean getOccupied(){
        return occupied;
    }
    public void setOccupied(boolean occupied){
        this.occupied=occupied;
    }
}
