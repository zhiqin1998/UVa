import java.util.Scanner;

public class _11332 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = Integer.parseInt(sc.nextLine());
            if (n==0){
                break;
            }
            while(n>=10){
                int sum = 0;
                while(n>0){
                    sum+=n%10;
                    n=n/10;
                }
                n=sum;
            }
            System.out.println(n);
        }
    }
}
