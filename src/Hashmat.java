import java.util.Scanner;
public class Hashmat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int i = sc.nextInt(),j=sc.nextInt();
            if (j>i)
            System.out.println(j-i);
            else
                System.out.println(i-j);
        }
    }
}
