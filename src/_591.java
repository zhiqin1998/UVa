import java.util.Arrays;
import java.util.Scanner;

public class _591 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int[] stacks = new int[n];
            int total = 0;
            for (int i = 0;i<n;i++){
                stacks[i] = sc.nextInt();
                total += stacks[i];
            }
            int ave = total/n;
            int moves = 0;
            for(int i = 0;i<stacks.length;i++){
                while(stacks[i]<ave){
                    for(int j =0;j<stacks.length;j++){
                        if (stacks[j]>ave){
                            stacks[j]--;
                            stacks[i]++;
                            moves++;
                            break;
                        }
                    }
                }
            }
            System.out.println("Set #"+ cases);
            cases++;
            System.out.println("The minimum number of moves is "+moves+".");
            System.out.println();
        }
    }
}
