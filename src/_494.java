import java.util.Scanner;

public class _494 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            int ans = 0;
            boolean start = false;
            for(int i =0;i<input.length();i++){
                if(Character.isLetter(input.charAt(i))){
                    if (!start) {
                        start = true;
                    }
                }
                else{
                    if(start){
                        ans+=1;
                        start = false;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
