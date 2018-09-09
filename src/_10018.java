import java.util.Scanner;

public class _10018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            long total = 0;
            long num = sc.nextLong();
            while(!isPalindrome(num)){
                total+=1;
                num+=reverse(num);
            }
            System.out.println(total+" "+num);
        }
    }
    public static boolean isPalindrome(long num){
        StringBuilder str = new StringBuilder(String.valueOf(num));
        return str.toString().equals(str.reverse().toString());
    }
    public static long reverse(long num){
        StringBuilder str = new StringBuilder(String.valueOf(num));
        return Long.parseLong(str.reverse().toString());
    }
}
