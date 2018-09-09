import java.util.Scanner;
class combinationLock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            String temp = sc.nextLine();
            String[] temp1 = temp.split(" ");
            int d0= Integer.parseInt(temp1[0]);
            int d1= Integer.parseInt(temp1[1]);
            int d2= Integer.parseInt(temp1[2]);
            int d3= Integer.parseInt(temp1[3]);
            int sum =120;
            if (d0==0&&d1==0&&d2==0&&d3==0)
                break;
            sum+=d0-d1;
            if (d0<d1)
                sum+=40;
            sum+=d2-d1;
            if (d2<d1)
                sum+=40;
            sum+=d2-d3;
            if (d2<d3)
                sum+=40;
            System.out.println(sum*9);
        }
    }
}
