import java.util.Scanner;

public class _10370 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0;i<C;i++){
            int N = sc.nextInt();
            int[] scores = new int[N];
            int total = 0;
            for(int j = 0;j<N;j++){
                scores[j] = sc.nextInt();
                total+=scores[j];
            }
            double ave = total/N;
            int amount = 0;
            for(int j = 0;j<N;j++){
                if(scores[j]>ave){
                    amount+=1;
                }
            }
            System.out.printf("%.3f%%\n",(double)amount*100/N);
        }
    }
}
