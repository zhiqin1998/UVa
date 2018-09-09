import java.util.Scanner;

public class _10812 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int y;
            if(s==d){
                y=0;
            }
            else{
                y= (s-d)/2;
            }
            if((s-d)%2!=0){
                System.out.println("impossible");
                continue;
            }
            int x = s-y;
            if(x<0 || y<0){
                System.out.println("impossible");
                continue;
            }
            System.out.println(x+" "+y);
        }
    }
}
