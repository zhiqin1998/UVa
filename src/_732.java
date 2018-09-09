import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Anagrams by Stack
public class _732 {
    static String in, out;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((in=br.readLine())!=null){
            out = br.readLine();
            System.out.println("[");
            dfsSearch(in,"","","",0);
            System.out.println("]");
        }
    }
    public static void dfsSearch(String a, String b, String stack, String path, int n){
        if(n==in.length()*2){
            if(b.equals(out)){
                System.out.println(path);
            }
            return;
        }

        if(a.length()>0){
            dfsSearch(a.substring(1),b,stack+a.charAt(0),path+(n==0?"i": " i"),n+1);
        }
        if(stack.length()>0&&stack.charAt(stack.length()-1)==out.charAt(b.length())){
            dfsSearch(a,b+stack.charAt(stack.length()-1),stack.substring(0,stack.length()-1),path+" o",n+1);
        }
    }
}
