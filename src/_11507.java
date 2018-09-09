import java.util.Scanner;

public class _11507 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int L = Integer.parseInt(sc.nextLine());
            if(L==0){
                break;
            }
            String direction = "+x";
            String[] input = sc.nextLine().split(" ");
            for(int i =0;i<input.length;i++){
                switch (input[i]) {
                    case "No":
                        break;
                    case "+y":
                        switch (direction) {
                            case "+x":
                                direction = "+y";
                                break;
                            case "-x":
                                direction = "-y";
                                break;
                            case "+y":
                                direction = "-x";
                                break;
                            case "-y":
                                direction = "+x";
                                break;
                        }
                        break;
                    case "-y":
                        switch (direction) {
                            case "+x":
                                direction = "-y";
                                break;
                            case "-x":
                                direction = "+y";
                                break;
                            case "+y":
                                direction = "+x";
                                break;
                            case "-y":
                                direction = "-x";
                                break;
                        }
                        break;
                    case "+z":
                        switch (direction) {
                            case "+x":
                                direction = "+z";
                                break;
                            case "-x":
                                direction = "-z";
                                break;
                            case "+z":
                                direction = "-x";
                                break;
                            case "-z":
                                direction = "+x";
                                break;
                        }
                        break;
                    case "-z":
                        switch (direction) {
                            case "+x":
                                direction = "-z";
                                break;
                            case "-x":
                                direction = "+z";
                                break;
                            case "+z":
                                direction = "+x";
                                break;
                            case "-z":
                                direction = "-x";
                                break;
                        }
                        break;
                }
            }
            System.out.println(direction);
        }
    }
}
