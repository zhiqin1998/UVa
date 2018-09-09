import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            if(N==0&&n==0){
                break;
            }
            char[][] big = new char[N][N];
            char[][] small = new char[n][n];
            for(int i =0;i<N;i++){
                big[i] = br.readLine().toCharArray();
            }
            for(int i =0;i<n;i++){
                small[i] = br.readLine().toCharArray();
            }
            int _0 = checkContain(big,small);
            small = rotate(small);
            int _90 = checkContain(big,small);
            small = rotate(small);
            int _180 = checkContain(big,small);
            small = rotate(small);
            int _270 = checkContain(big,small);
            System.out.printf("%d %d %d %d\n",_0,_90,_180,_270);
        }
    }
    public static int checkContain(char[][] big, char[][] small){
        int count = 0;
        for(int i =0;i<=big.length-small.length;i++){
            check:
            for(int j =0;j<=big.length-small.length;j++){
                for(int ii =0;ii<small.length;ii++){
                    for(int jj =0;jj<small.length;jj++){
                        if(small[ii][jj]!=big[i+ii][j+jj]){
                            continue check;
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }
    public static char[][] rotate(char[][] arr){
        char[][] ans = arr.clone();
        for(int i = 0;i<ans.length;i++){
            char[] temp = new char[ans[i].length];
            for(int j=0,k=temp.length-1;j<temp.length&&k>=0;k--,j++){
                temp[j] = arr[k][i];
            }
            ans[i] = temp;
        }
        return ans;
    }
}
