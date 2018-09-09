import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//unsolved
//Grid Successors
public class _11581 {
    static int[] x = {-1,0,0,1},y={0,1,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i =0;i<n;i++){
            br.readLine();
            int[][] grid = new int[3][3];
            for(int j =0;j<3;j++){
                String input = br.readLine();
                for(int k =0;k<3;k++){
                    grid[j][k] = Integer.parseInt(input.substring(k,k+1));
                }
            }
            System.out.println(f(0,grid));
        }
    }
    public static int f(int l,int[][] grid){
        int[][] pass = grid.clone();
        if (done(grid)){
            return -1;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int cell = 0;
                for(int k =0;k<x.length;k++){
                    int r = i+x[k],c=j+y[k];
                    if(r>=0&&r<grid.length&&c>=0&&c<grid.length){
                        cell+=grid[r][c];
                    }
                }
                pass[i][j] = cell%2==1 ? 1 : 0;
            }
        }
        return 1+f(l+1,pass);
    }
    public static boolean done(int[][] grid){
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }
}
