package controller;
import model.Animal;
import model.modelRefugio;
import view.MainFrame;

public class controllerRefugio {
    modelRefugio modelo = new modelRefugio();
    MainFrame view = new MainFrame();

    public static void main(String[] args){
        controllerRefugio app = new controllerRefugio();
        app.view.setController(app);
    }
    public void validarLogin(){
        String key = view.getPassword();
        boolean pasa = modelo.user(key);
        if(pasa == true && modelo.getTipoUser()==1){
            view.showMensaje("Bienvenido, Usuario Auxiliar");
            view.mostrarPaneles("Menu");
        }
        if(pasa == true && modelo.getTipoUser()==0){
            view.showMensaje("Bienvenido, Usuario Administrador");
            view.mostrarPaneles("Menu");
        }
        if(!pasa){
            view.showMensaje("Incorrecto");
        }
    }
    public void registrarAnimal(){
        String id = view.getPanelAnimales().getIdAnimal();
        String nombre = view.getPanelAnimales().getName();
        String especie= view.getPanelAnimales().getEspecie();
        int edad = Integer.parseInt(view.getPanelAnimales().getEdad());
        String estado = view.getPanelAnimales().getEstado();

        Animal nuevo = new Animal();
        nuevo.setId(id);
        nuevo.setName(nombre);
        nuevo.setEspecie(especie);
        nuevo.setEdad(edad);
        nuevo.setEstado(estado);

        boolean registrado = modelo.registrarAnimal(nuevo);
        if (registrado == true){
            view.showMensaje("Animal Registrado");
        }
        if(!registrado){
            view.showMensaje("No se pudo registrar el animal");
        }
    }
}
