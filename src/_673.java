import java.util.Scanner;
import java.util.Stack;

public class _673 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0;i<n;i++){
            boolean correct = true;
            Stack<Character> stacks = new Stack<>();
            String input = sc.nextLine();
            for(int j = 0;j<input.length();j++){
                char temp = input.charAt(j);
                if(temp=='('|| temp=='['){
                    stacks.push(temp);
                }
                else {
                    if(stacks.isEmpty()){
                        correct = false;
                        break;
                    }
                    char poptemp = stacks.pop();
                    if (temp==')'&&poptemp!='('){
                        correct = false;
                        break;
                    }
                    else if(temp==']'&&poptemp!='['){
                        correct = false;
                        break;
                    }
                }
            }
            if(!stacks.isEmpty()){
                correct = false;
            }
            System.out.println(correct?"Yes":"No");
        }
    }
}
