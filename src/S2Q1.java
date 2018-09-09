import java.util.Scanner;
import java.lang.StringBuilder;

class S2Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder test = new StringBuilder(sc.nextLine());
        while (sc.hasNext()){
            test.append("\t"+sc.nextLine());
        }
        String[] store = test.toString().split("\t");
        int max =0;
        for (String i :store){
            if (i.length()>max){
                max=i.length();
            }
        }
        for (int i=0;i<max;i++){
            for (int j=store.length-1;j>=0;j--){
                if (i<store[j].length())
                     System.out.print(store[j].charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
