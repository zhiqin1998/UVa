import java.util.Scanner;

public class BackToHighSchoolPhysic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int v = sc.nextInt(), t = sc.nextInt();
            if (v>=-100&&v<=100&&t>=0&&t<=200){
                System.out.println(v*t*2);
            }
        }
    }
}

