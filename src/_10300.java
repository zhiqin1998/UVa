import java.util.Scanner;

public class _10300 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int f = sc.nextInt();
            int total = 0;
            for(int j=0;j<f;j++){
                int size = sc.nextInt();
                int nAnimal = sc.nextInt();
                int friendly = sc.nextInt();
                int sum = size*friendly;
                total+=sum;
            }
            System.out.println(total);
        }
    }
}
