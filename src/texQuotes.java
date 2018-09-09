import java.io.IOException;
import java.util.Scanner;
public class texQuotes {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        boolean open=true;
        for (String line =sc.nextLine();!line.isEmpty();line =sc.nextLine()){
            for (int i =0;i<line.length();i++) {
                if (line.charAt(i) == '\"') {
                    if (open) {
                        System.out.print("``");
                        open = false;
                        continue;
                    } else
                        System.out.print("''");
                    continue;
                }
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }
}
