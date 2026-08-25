package controller;
import model.modelRefugio;
import view.viewRefugio;
public class controllerRefugio {
    public static void main(String[] args){
        modelRefugio modelo = new modelRefugio();
        viewRefugio view = new viewRefugio();

        String key = view.password();
        boolean pasa = modelo.user(key);

        if (pasa){
            view.showMensaje("Correcto");
        }else{
            view.showMensaje("Incorrecto");
        }
    }
}
