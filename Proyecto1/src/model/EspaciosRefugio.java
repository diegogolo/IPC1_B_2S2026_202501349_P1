package model;

public class EspaciosRefugio {
    private Espacio[][] refugio = new Espacio[10][10];
    private int contador =0;

    public void EspaciosRefugio(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                refugio[i][j]= new Espacio();
                refugio[i][j].setOccupied(false);
            }
        }
    }
}
