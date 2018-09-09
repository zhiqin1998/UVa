import java.util.Scanner;
// unsolved
public class _556 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] input = sc.nextLine().split(" ");
            int b = Integer.parseInt(input[0]);
            int w = Integer.parseInt(input[1]);
            if(b==0&&w==0){
                break;
            }
            String[] maze = new String[b];
            for(int i = 0;i<b;i++){
                maze[i] = sc.nextLine();
            }
            int[][] count = new int[b][w];
            int robotyloc = b-1;
            int robotxloc = 0;
            char robotdirection = 'E';
            do{
                switch (robotdirection){
                    case 'E':
                        if (robotxloc + 1 < w)
                            if (maze[robotyloc].charAt(robotxloc + 1) != '1') {
                                robotxloc += 1;
                                count[robotyloc][robotxloc] += 1;
                            } else {
                                robotdirection = 'N';
                            }
                        else {
                            robotdirection = 'N';
                        }
                        break;
                    case 'W':
                        if (robotxloc - 1 >= 0)
                            if (maze[robotyloc].charAt(robotxloc - 1) != '1') {
                                robotxloc -= 1;
                                count[robotyloc][robotxloc] += 1;
                            } else {
                                robotdirection = 'S';
                            }
                        else {
                            robotdirection = 'S';
                        }
                        break;
                    case 'N':
                        if (robotyloc - 1 >= 0)
                            if (maze[robotyloc - 1].charAt(robotxloc) != '1') {
                                robotyloc -= 1;
                                count[robotyloc][robotxloc] += 1;
                            } else {
                                robotdirection = 'W';
                            }
                        else {
                            robotdirection = 'W';
                        }
                        break;
                    case 'S':
                        if (robotyloc + 1 < b)
                            if (maze[robotyloc + 1].charAt(robotxloc) != '1') {
                                robotyloc += 1;
                                count[robotyloc][robotxloc] += 1;
                            } else {
                                robotdirection = 'E';
                            }
                        else {
                            robotdirection = 'E';
                        }
                        break;
                }
            }while(!(robotxloc==0&&robotyloc==b-2));
            int none=0,once=0,twice=0,thrice=0,four=0;
            for(int i =0;i<b;i++){
                for(int j =0;j<w;j++){
                    if(count[i][j]==0){
                        none++;
                    }
                    else if(count[i][j]==1){
                        once++;
                    }
                    else if(count[i][j]==2){
                        twice++;
                    }
                    else if(count[i][j]==3){
                        thrice++;
                    }
                    else{
                        four++;
                    }
                }
            }
            System.out.printf("%3d%3d%3d%3d%3d\n",none,once,twice,thrice,four);
        }
    }
}
