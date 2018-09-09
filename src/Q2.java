import java.util.Scanner;
class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String test ="`1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./";
        String s = sc.nextLine().toLowerCase();
        for (int i=0;i<s.length();i++){
                if (s.charAt(i)==' '){
                    System.out.print(" ");
                }
                else{
                    System.out.print(test.charAt(test.indexOf(s.charAt(i))-2));
                }
            }
        System.out.println();
        }
    }