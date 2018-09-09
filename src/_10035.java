import java.util.Scanner;

public class _10035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==0 && b ==0){
                break;
            }
            // a < b
            if (b<a){
                int temp = b;
                b = a;
                a = temp;
            }
            String first = Integer.toString(a);
            String second = Integer.toString(b);
            int carryover = 0;
            int total = 0;
            int i,j;
            for(i = second.length()-1, j=first.length()-1;i>=0&&j>=0;i--,j--){
                int sum = Character.getNumericValue(first.charAt(j)) + Character.getNumericValue(second.charAt(i))+carryover;
                carryover = 0;
                while (sum >=10){
                    sum-=10;
                    carryover+=1;
                    total+=1;
                }
            }
            while(carryover!=0 && i>=0){
                int sum = Character.getNumericValue(second.charAt(i))+carryover;
                carryover = 0;
                i--;
                while (sum >=10){
                    sum-=10;
                    carryover+=1;
                    total+=1;
                }
            }
            if (total == 0){
                System.out.println("No carry operation.");
            }
            else if (total == 1){
                System.out.println(total+" carry operation.");
            }
            else{
                System.out.println(total+" carry operations.");
            }
        }
    }
}
