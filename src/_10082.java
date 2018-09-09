import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _10082 {
    public static void main(String[] args){
        Character[] arr = {'`','1','2','3','4','5','6','7','8','9','0','-','=','Q','W','E','R','T','Y','U','I','O','P','[',']','\\','A','S','D','F','G','H','J','K','L',';','\'','Z','X','C','V','B','N','M',',','.','/'};
        List<Character> checker = Arrays.asList(arr);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            for(int i =0;i<input.length();i++){
                if (input.charAt(i) == ' '){
                    System.out.print(' ');
                    continue;
                }
                Character chr = input.charAt(i);
                Character output = checker.get(checker.indexOf(chr)-1);
                System.out.print(output);
            }
            System.out.println();
        }
    }
}
