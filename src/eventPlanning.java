import java.util.Scanner;

public class eventPlanning {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        s= sc.nextLine();
        while (true) {
            if (s==null||s.isEmpty())
                break;
            String[] test=s.split(" ");
            int n=Integer.parseInt(test[0]), b = Integer.parseInt(test[1]), h = Integer.parseInt(test[2]),w=Integer.parseInt(test[3]), min = b;
            int[][] hotel = new int[h][w + 1];
            boolean stayHome = true;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j <= w; j++) {
                    hotel[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < h; i++) {
                int sum = n * hotel[i][0];
                if (sum <= min) {
                    min = sum;

                } else {
                    stayHome = true;
                    continue;
                }
                for (int j = 1; j <= w; j++) {
                    if (hotel[i][j] > w) {
                        stayHome = false;
                        break;
                    } else {
                        min = b;
                        stayHome = true;
                    }
                }
            }
            if (stayHome)
                System.out.println("stay home");
            else
                System.out.println(min);
            sc.nextLine();
            s=sc.nextLine();
        }
    }
}
