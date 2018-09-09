import java.util.Scanner;

public class _10189 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(true){
            String[] first = sc.nextLine().split(" ");
            int n = Integer.parseInt(first[0]);
            int m = Integer.parseInt(first[1]);
            if (n==0||m==0){
                break;
            }
            char[][] field = new char[n][m];
            for (int i = 0;i<n;i++){
                field[i] = sc.nextLine().toCharArray();
            }
            if (count!=1){
                System.out.println();
            }
            System.out.println("Field #"+ count+":");
            count++;
            for(int i = 0;i<field.length;i++) {
                for (int k = 0; k < field[i].length; k++) {
                    if (field[i][k] == '*') {
                        System.out.print('*');
                    } else {
                        System.out.print(check(i, k, field));
                    }
                }
                System.out.println();
            }
        }
    }
    public static int check(int i, int j, char[][] field){
        int ans = 0;
        for (int ii = i-1;ii<=i+1;ii++){
            for( int jj = j-1;jj<=j+1;jj++){
                if (ii < 0 || ii >= field.length || jj < 0 || jj >= field[ii].length || (ii == i && jj == j)) {
                    continue;
                }
                if(field[ii][jj]=='*'){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}
