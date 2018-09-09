import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Spiral Tap
public class _10920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] input = br.readLine().split(" ");
            int SZ = Integer.parseInt(input[0]);
            long P = Long.parseLong(input[1]);
            if(SZ==0&&P==0){
                break;
            }
            long i = 1;
            while(P>i*i){
                i+=2;
            }
            if(i==1){
                System.out.printf("Line = %d, column = %d.\n",(SZ/2)+1,(SZ/2)+1);
            }
            long x,y;
            long lb = (i-2)*(i-2), pad = (SZ-i)/2;
            if(P <= lb + i-1) {
                // NORTH side
                x = lb+i-P+pad;
                y = SZ-pad;
            } else if(lb + i-1 < P && P <= lb + 2*(i-1)) {
                // WEST side
                x = pad+1;
                y = lb+(i-1)*2+1-P+pad;
            } else if(lb + 2*(i-1) < P && P <= lb + 3*(i-1)) {
                // SOUTH side
                x = P-(lb+2*(i-1))+pad+1;
                y = pad+1;
            } else {
                // EAST side
                x = SZ-pad;
                y = P-(lb+3*(i-1))+pad+1;
            }
        }
    }
}
