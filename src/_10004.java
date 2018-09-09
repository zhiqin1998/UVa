import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class _10004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            Node[] nodes = new Node[n];
            for(int i = 0;i<n;i++){
                nodes[i] = new Node();
            }
            if (n==0){
                break;
            }
            int l = sc.nextInt();
            for (int j = 0; j < l; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                nodes[a].childs.add(b);
                nodes[b].childs.add(a);
            }
            if(DFS(0, nodes)){
                System.out.println("BICOLORABLE.");
            }
            else{
                System.out.println("NOT BICOLORABLE.");
            }
        }
    }
    public static boolean DFS(int root, Node[] nodes){
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        Node current = nodes[root];
        current.color = 1;
        while(!stack.isEmpty()){
            current = nodes[stack.pop()];
            for(Integer child:current.childs){
                if(nodes[child].color ==  current.color){
                    return false;
                }
                if(nodes[child].color == 0){
                    if (current.color==1) {
                        nodes[child].color = 2;
                    }
                    else{
                        nodes[child].color = 1;
                    }
                    stack.push(child);
                }
            }
        }
        return true;
    }
}

class Node{
    int color = 0;
    LinkedList<Integer> childs = new LinkedList<>();
}
