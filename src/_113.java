import java.util.Scanner;

public class _113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double n = sc.nextDouble();
            double p = sc.nextDouble();
            System.out.printf("%.0f\n",Math.pow(p,1/n));
        }
    }
}
