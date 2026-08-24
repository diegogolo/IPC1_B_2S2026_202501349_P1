package controller;
import model.MainModel;
import view.MainView;
public class MainController {
    public static void main(String[] args){
        MainModel modelo = new MainModel();
        MainView view = new MainView();

        String key = view.password();
        boolean pasa = modelo.user(key);

        if (pasa){
            view.showMensaje("Correcto");
        }else{
            view.showMensaje("Incorrecto");
        }
    }
}
