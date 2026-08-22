import java.util.Scanner;
public class Main{
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Bienvenido");
        log login = new log();
        login.password=read.nextLine();
    }
}
