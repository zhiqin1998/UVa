import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _11340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0;i<N;i++){
            int K = Integer.parseInt(br.readLine());
            Map<Character,Integer> map = new HashMap<>();
            for(int j=0;j<K;j++){
                String input = br.readLine();
                map.put(input.charAt(0),Integer.parseInt(input.substring(2)));
            }
            int M = Integer.parseInt(br.readLine());
            double cents = 0;
            for(int j=0;j<M;j++){
                char[] input = br.readLine().toCharArray();
                for(int k=0;k<input.length;k++){
                    Integer price = map.get(input[k]);
                    if(price==null){
                        price=0;
                    }
                    cents+=price;
                }
            }
            System.out.printf("%.2f$\n",cents/100);
        }
    }
}
