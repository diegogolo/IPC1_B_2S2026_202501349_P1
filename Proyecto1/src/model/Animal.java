package model;
public class Animal {
    private String id;
    private String name;
    private String especie;
    private int edad;
    private String estado;
    private boolean activo;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado=estado;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
