import java.util.Scanner;

public class _11547 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            n*=567;
            n/=9;
            n+=7492;
            n*=235;
            n/=47;
            n-=498;
            String str = String.valueOf(n);
            System.out.println(str.charAt(str.length()-2));
        }
    }
}
