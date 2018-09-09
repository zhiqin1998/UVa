import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=1;
        while(true){
            String input = br.readLine();
            if(input.equals("end")){
                break;
            }
            ArrayList<Character> stacks = new ArrayList<>();
            for(int i=0;i<input.length();i++){
                char curr = input.charAt(i);
                boolean set = false;
                for (int i1 = 0; i1 < stacks.size(); i1++) {
                    Character c = stacks.get(i1);
                    if (curr <= c) {
                        stacks.set(i1,curr);
                        set = true;
                        break;
                    }
                }
                if(!set){
                    stacks.add(curr);
                }
            }
            System.out.printf("Case %d: %d\n",count,stacks.size());
            count++;
        }
    }
}
