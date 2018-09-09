import java.util.Scanner;

public class _488 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] amplitude = {"\n","1\n","22\n","333\n","4444\n","55555\n",
                "666666\n","7777777\n","88888888\n","999999999\n"};
        int cases = sc.nextInt();
        for(int i = 0;i<cases;i++){
            int amp = sc.nextInt();
            int fre = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if(i!=0){
                sb.append("\n");
            }
            for (int j=0;j<fre;j++){
                if(j!=0){
                    sb.append("\n");
                }
                for(int k =1;k<amp;k++){
                    sb.append(amplitude[k]);
                }
                for(int k =amp;k>0;k--){
                    sb.append(amplitude[k]);
                }
            }
            System.out.print(sb.toString());
        }
    }
}
