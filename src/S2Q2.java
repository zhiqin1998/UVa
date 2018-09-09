import java.util.Scanner;
class S2Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input,min=0,hour=0,angle;
        boolean exist=true;
        while (sc.hasNext()){
            input = sc.nextInt();
            if (input==0||input==180){
                System.out.println("Y");
                continue;
            }
            while (input>=0&&input<=180){
                for (int i=0;i<720;i++){
                    if (min<60){
                        min++;
                    }
                    else{
                        min=0;
                    }
                    if (i%12==0&&hour<60){
                        hour++;
                    }
                    else{
                        hour=0;
                    }
                    if (min>hour){
                        angle=min-hour;
                    }
                    else{
                        angle=hour-min;
                    }
                    if (angle*6==input){
                        exist=true;
                        break;
                    }
                    else{
                        exist=false;
                    }
                }
                if (exist){
                    System.out.println("Y");
                    break;
                }
                else {
                    System.out.println("N");
                    break;
                }
            }
        }
    }
}
