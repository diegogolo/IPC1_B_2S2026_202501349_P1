package controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class MainController {
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args){
        String password=read.nextLine();
        String[] pass = new String[2];
        try{
            BufferedReader br = new BufferedReader(new FileReader("Proyecto1/src/controller/users.txt"));
            for(int i=0; i<2; i++){
                pass[i] = br.readLine();
                if(pass[i].equals(password)){
                    System.out.println("Correcto");
                    break;
                }else{
                    System.out.println("Incorrecto");
                }
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
