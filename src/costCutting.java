import java.util.Scanner;
public class costCutting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            int a = sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
            System.out.println("Case "+ i+": "+ ((a>b&&c>a||a>c&&b>a)?a:(b>c&&a>b||b>a&&c>b)?b:c));
        }
    }
}
