import java.util.Scanner;

public class _11799 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i = 1;i<=cases;i++){
            int N = sc.nextInt();
            int max = Integer.MIN_VALUE;
            for(int j =0;j<N;j++){
                max = Math.max(max,sc.nextInt());
            }
            System.out.printf("Case %d: %d\n",i,max);
        }
    }
}
