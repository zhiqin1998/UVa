import java.util.Scanner;
public class OddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for (int i=1;i<=max;i++){
            int sum=0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (;a<=b;a++){
                if (a%2!=0){
                    sum+=a;
                }
            }
            System.out.println("Case "+i+": "+sum);
        }
    }
}
