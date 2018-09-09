import java.util.Scanner;

public class ThreeNPlusOne {
    public static void main(String[] args){
        int[] cache = new int[1000000];
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int i = sc.nextInt(), j = sc.nextInt(), maxCycle=0;
            for (int count =i;i<=j;count++){
                int test = count,cycle=0;
                if (cache[count]!=0){
                    cycle = cache[count];
                }
                else {
                    while (test != 1) {
                        if (test % 2 != 0) {
                            test = 3 * test + 1;
                        } else {
                            test /= 2;
                        }
                        cycle++;
                    }
                    cache[count]=cycle;
                }
                if (cycle>maxCycle){
                    maxCycle=cycle;
                }
            }
            System.out.println(i+" "+j+" "+maxCycle);
        }
    }
}
