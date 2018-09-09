import java.util.Scanner;

public class _299 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            int l = sc.nextInt();
            int[] numbers = new int[l];
            for (int j = 0;j<numbers.length;j++){
                numbers[j] = sc.nextInt();
            }
            int ans = 0;
            for (int j = 0 ;j<numbers.length;j++){
                for (int k = 1;k<numbers.length;k++){
                    if(numbers[k]<numbers[k-1]){
                        int temp = numbers[k-1];
                        numbers[k-1] =  numbers[k];
                        numbers[k] = temp;
                        ans+=1;
                    }
                }
            }
            System.out.println("Optimal train swapping takes "+ans+" swaps.");
        }
    }
}
