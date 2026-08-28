package model;

public class Solicitud {
    private String estadoSolicitud;
    private String idAdoptante;
    private String idAnimal;
    private String id;


    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }
    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    public String getIdAdoptante() {
        return idAdoptante;
    }
    public void setIdAdoptante(String idAdoptante){
        this.idAdoptante=idAdoptante;
    }
    public String getIdAnimal(){
        return idAnimal;
    }
    public void setIdAnimal(String idAnimal){
        this.idAnimal=idAnimal;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
}

