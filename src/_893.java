import java.util.Scanner;

public class _893 {
    static int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] input = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int D = Integer.parseInt(input[1]);
            int M = Integer.parseInt(input[2]);
            int Y = Integer.parseInt(input[3]);
            if(N==0&&D==0&&M==0&&Y==0){
                break;
            }
            D+=N;
            boolean leap = isLeapYear(Y);
            while(D>months[M]){
                D-=months[M];
                M++;
                if(M>12){
                    M=1;
                    Y++;
                    leap = isLeapYear(Y);
                }
            }
            System.out.printf("%d %d %d\n",D,M,Y);
        }
    }
    public static boolean isLeapYear(int year){
        if(year%400==0){
            months[2] = 29;
            return true;
        }
        else if(year%4==0&&year%100!=0){
            months[2] = 29;
            return true;
        }
        else{
            months[2] =28;
            return false;
        }
    }
}
