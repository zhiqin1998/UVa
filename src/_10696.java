import java.util.Scanner;

public class _10696 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N==0){
                break;
            }
            int ans = f91(N);
            System.out.printf("f91(%d) = %d\n",N,ans);
        }
    }
    public static int f91(int N){
        if (N<=100){
            return f91(f91(N+11));
        }
        else{
            return N-10;
        }
    }
}
