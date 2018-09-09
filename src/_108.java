import java.util.Scanner;

public class _108 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[][] sum = new int[N+1][N+1];
        for(int i = 1;i<=N;i++){
            for (int j = 1;j<=N;j++){
                sum[i][j]=sc.nextInt()+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
            }
        }
        for(int i =1;i<=N;i++){
            for(int j =1;j<=N;j++){
                for (int k=i;k<=N;k++){
                    for(int l=j;l<=N;l++){
                        max = Math.max(max,sum[k][l]-sum[i-1][l]-sum[k][j-1]+sum[i-1][j-1]);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
