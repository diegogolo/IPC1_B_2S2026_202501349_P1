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
        if(pasa == true){
            view.showMensaje("Bienvenido");
        }else{
            view.showMensaje("Incorrecto");
        }
    }
}
