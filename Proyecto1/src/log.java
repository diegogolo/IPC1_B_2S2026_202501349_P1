import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class log {
    public String password;
    static void main() {
        try{BufferedReader br = new BufferedReader(new FileReader("users.txt"));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
