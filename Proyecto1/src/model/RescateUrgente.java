package model;

public class RescateUrgente {
    private String idRescate;
    private String caso;
    private String priority;
    private boolean atencion;

    public String getIdRescate() {
        return idRescate;
    }
    public void setIdRescate(String idRescate) {
        this.idRescate = idRescate;
    }
    //caso es para la información de qué le pasó al animal recordar de usarla más adelante*****
    public String getCaso() {
        return caso;
    }
    public void setCaso(String caso) {
        this.caso=caso;
    }
    public String getPriority(){
        return priority;
    }
    public void setPriority(String priority){
        this.priority=priority;
    }
    public boolean getAtencion() {
        return atencion;
    }
    public void setAtencion(boolean atencion) {
        this.atencion = atencion;
    }
}
