import java.util.Scanner;

public class TheDecoder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String input = sc.nextLine();
            for (int i =0;i<input.length();i++){
                System.out.print((char)(((int)input.charAt(i)-32-7)%95+32));
            }
            System.out.println();
        }
    }
}
