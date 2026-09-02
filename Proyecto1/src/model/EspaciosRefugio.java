package model;

public class EspaciosRefugio {
    private Espacio[][] refugio = new Espacio[10][10];
    private int contador =0;

    public EspaciosRefugio(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                refugio[i][j]= new Espacio();
                refugio[i][j].setOccupied(false);
            }
        }
    }
    public boolean asignacion(int f, int c, String idAnimal){
     if(refugio[f][c].getOccupied()==true){
         return false;
     }else{
         refugio[f][c].setOccupied(true);
         refugio[f][c].setIdAnimal(idAnimal);
         return true;
     }
    }
    public boolean liberarEspacio(int f, int c){
        if(refugio[f][c].getOccupied()==true){
            refugio[f][c].setOccupied(false);
            refugio[f][c].setIdAnimal(null);
            return true;
        }else{
            return false;
        }
    }

}
