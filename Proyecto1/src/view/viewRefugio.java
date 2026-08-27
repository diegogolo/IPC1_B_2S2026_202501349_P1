package view;
import java.util.Scanner;
public class viewRefugio {
    private Scanner read = new Scanner(System.in);

    public String password(){
        return read.nextLine();
    }

    public void showMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
