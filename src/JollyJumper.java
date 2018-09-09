import java.util.Scanner;
public class JollyJumper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            boolean jolly = true;
            int n = sc.nextInt();
            int[] value = new int[n];
            for (int i=0;i<n;i++){
                value[i]=sc.nextInt();
            }
            for (int i=n-1,j=0;i>0;i--,j++){
                if (Math.abs(value[j]-value[j+1])!=i){
                    jolly=false;
                }
            }
            if (jolly){
                System.out.println("Jolly");
            }
            else{
                System.out.println("Not Jolly");
            }
        }
    }
}
