import java.util.Scanner;

public class _11947 {
    static int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int N = 280;
        for(int i = 1;i<=T;i++){
            String input = sc.nextLine();
            int M = Integer.parseInt(input.substring(0,2));
            int D = Integer.parseInt(input.substring(2,4));
            int Y = Integer.parseInt(input.substring(4));
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
            String zodiac = checkZodiac(D,M);
            System.out.printf("%d %02d/%02d/%04d %s\n",i,M,D,Y,zodiac);
        }
    }
    public static String checkZodiac(int D,int M){
        if(M==1){
            if(D>=21){
                return "aquarius";
            }
            else{
                return "capricorn";
            }
        }
        else if(M==2){
            if(D>=20){
                return "pisces";
            }
            else{
                return "aquarius";
            }
        }
        else if(M==3){
            if(D>=21) {
                return "aries";
            }
            else{
                return "pisces";
            }
        }
        else if(M==4){
            if(D>=21){
                return "taurus";
            }
            else{
                return "aries";
            }
        }
        else if(M==5){
            if (D>=22){
                return "gemini";
            }
            else{
                return "taurus";
            }
        }
        else if(M==6){
            if(D>=22){
                return "cancer";
            }
            else{
                return "gemini";
            }
        }
        else if(M==7){
            if(D>=23){
                return "leo";
            }
            else{
                return "cancer";
            }
        }
        else if(M==8){
            if(D>=22){
                return "virgo";
            }
            else{
                return "leo";
            }
        }
        else if (M==9){
            if(D>=24){
                return "libra";
            }
            else{
                return "virgo";
            }
        }
        else if(M==10){
            if(D>=24){
                return "scorpio";
            }
            else{
                return "libra";
            }
        }
        else if(M==11){
            if(D>=23){
                return "sagittarius";
            }
            else{
                return "scorpio";
            }
        }
        else if(M==12){
            if(D>=23){
                return "capricorn";
            }
            else{
                return "sagittarius";
            }
        }
        else{
            return "";
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
