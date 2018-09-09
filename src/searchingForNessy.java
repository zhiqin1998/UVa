import java.util.Scanner;
class searchingForNessy {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int need = ((x)/3)*((y)/3);
            System.out.println(need);
        }
    }
}
