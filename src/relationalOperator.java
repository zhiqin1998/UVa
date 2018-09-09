import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            check(sc.nextInt(),sc.nextInt());
            n--;
        }
    }
    public static void check(int a, int b){
        if (a<b)
            System.out.println("<");
        else if (a>b)
            System.out.println(">");
        else
            System.out.println("=");
    }
}
