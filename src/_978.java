import java.util.*;

public class _978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0;i<N;i++){
            if(i!=0){
                System.out.println();
            }
            int B = sc.nextInt();
            int SG = sc.nextInt();
            int SB = sc.nextInt();
            Integer[] green = new Integer[SG];
            for(int j=0;j<SG;j++){
                green[j] = sc.nextInt();
            }
            Integer [] blue = new Integer[SB];
            for(int j =0;j<SB;j++){
                blue[j] = sc.nextInt();
            }
            Queue<Integer> greenArmy = new PriorityQueue<Integer>(green.length, Collections.reverseOrder());
            greenArmy.addAll(Arrays.asList(green));
            Queue<Integer> blueArmy = new PriorityQueue<Integer>(blue.length, Collections.reverseOrder());
            blueArmy.addAll(Arrays.asList(blue));
            Stack<Integer> bluebuffer = new Stack<>();
            Stack<Integer> greenbuffer = new Stack<>();
            while(true){
                if(greenArmy.isEmpty()&&blueArmy.isEmpty()){
                    System.out.println("green and blue died");
                    break;
                }
                if(greenArmy.isEmpty()){
                    System.out.println("blue wins");
                    while(!blueArmy.isEmpty()){
                        System.out.println(blueArmy.poll());
                    }
                    break;
                }
                if(blueArmy.isEmpty()){
                    System.out.println("green wins");
                    while(!greenArmy.isEmpty()){
                        System.out.println(greenArmy.poll());
                    }
                    break;
                }

                for(int j=0;j<B;j++){
                    if(greenArmy.isEmpty()||blueArmy.isEmpty()){
                        continue;
                    }
                    int g = greenArmy.poll();
                    int b = blueArmy.poll();
                    if (g==b){
                        continue;
                    }
                    else if (g>b){
                        greenbuffer.push(g-b);
                    }
                    else{
                        bluebuffer.push(b-g);
                    }
                }
                while(!bluebuffer.isEmpty()){
                    blueArmy.add(bluebuffer.pop());
                }
                while(!greenbuffer.isEmpty()){
                    greenArmy.add(greenbuffer.pop());
                }
            }
        }
    }
}
