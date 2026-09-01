package model;

public class Rescates {
    private RescateUrgente[] rescues = new RescateUrgente[100];
    int totalRescues=0;

    public boolean rescate(RescateUrgente caso) {
        if(totalRescues==rescues.length) {
            return false;
        }
        for(int i=0;i<totalRescues;i++) {
            if(rescues[i].getIdRescate().equals(caso.getIdRescate())) {
                return false;
            }
        }
        rescues[totalRescues] = caso;
        totalRescues++;
        return true;
    }
    public boolean asignacionPrioridad(String asignacion, String id){
        for(int i=0;i<totalRescues;i++) {
            if(rescues[i].getIdRescate().equals(id)) {
                rescues[i].setPriority(asignacion);
                return true;
            }
        }
        return false;
    }
    public boolean atencionAnimal(boolean atencion, String id){
        for(int i=0;i<totalRescues;i++) {
            if(rescues[i].getIdRescate().equals(id)) {
                rescues[i].setAtencion(atencion);
                return true;
            }
        }
        return false;
    }
    public RescateUrgente[] reporteActivo(){
      RescateUrgente[] listadeActivos= new RescateUrgente[totalRescues];
      int x = 0;
      for(int i=0; i<totalRescues; i++){
          if(!rescues[i].getAtencion()){
              listadeActivos[x]=rescues[i];
              x++;
          }
      }
      return listadeActivos;
    }
}
