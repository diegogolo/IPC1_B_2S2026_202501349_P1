package controller;
import model.modelRefugio;
import view.viewRefugio;

public class controllerRefugio {
    modelRefugio modelo = new modelRefugio();
    viewRefugio view = new viewRefugio();

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
}
