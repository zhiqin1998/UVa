import java.util.Scanner;
public class Nlogonia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        while ((t=sc.nextInt())!=0){
            int x = sc.nextInt(),y = sc.nextInt();
            for (int i=0;i<t;i++){
                int x1= sc.nextInt(), y1 =sc.nextInt();
                if (x1>x&&y1>y)
                    System.out.println("NE");
                else if (x1>x&&y1<y)
                    System.out.println("SE");
                else if (x1<x&&y1>y)
                    System.out.println("NO");
                else if (x1<x&&y1<y)
                    System.out.println("SO");
                else
                    System.out.println("divisa");
            }
        }
    }
}
