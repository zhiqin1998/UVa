import java.util.Scanner;
class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        if (test<20) {
            for (int i = 1; i <= test; i++) {
                long a = sc.nextInt();
                long b = sc.nextInt();
                long c = sc.nextInt();
                if (a>0&&b>0&&c>0) {
                    if (((a + b > c) && (a + c > b) && (b + c > a))) {
                        if (a == b && a == c) {
                            System.out.println("Case " + i + ": Equilateral");
                        } else if (a == b || a == c || b == c) {
                            System.out.println("Case " + i + ": Isosceles");
                        } else {
                            System.out.println("Case " + i + ": Scalene");
                        }
                    }
                    else {
                        System.out.println("Case " + i + ": Invalid");
                    }
                }
                else
                    System.out.println("Case " + i + ": Invalid");
            }
        }
    }
}
