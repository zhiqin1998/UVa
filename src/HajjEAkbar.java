import java.util.*;
import java .io.*;

public class HajjEAkbar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =1;
        while (sc.hasNextLine()){
            String input = sc.nextLine();
            if (input.equals("*")){
                break;
            }
            if (input.equals("Hajj")){
                System.out.println("Case "+ count+": Hajj-e-Akbar");
            }
            else if (input.equals("Umrah")){
                System.out.println("Case "+ count+": Hajj-e-Asghar");
            }
            count++;
        }
    }
}
