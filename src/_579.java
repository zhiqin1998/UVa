import java.util.Scanner;

public class _579 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double minPerAngle = 6;
        double hourMinPerAngle = 0.5;
        double hourPerAngle = 30;
        while(true){
            String[] input = sc.nextLine().split(":");
            int H = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            if (H==0&&M==0){
                break;
            }
            double hAngle = H*hourPerAngle+M*hourMinPerAngle;
            double mAngle = M*minPerAngle;
            double diff = Math.abs(hAngle-mAngle);
            if(diff>=360){
                diff -=360;
            }
            if(diff>180){
                diff = 360 - diff;
            }
            System.out.printf("%.3f\n",diff);
        }
    }
}
