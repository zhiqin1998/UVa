import java.util.Scanner;
public class loansomeCarBuyer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int term;
        while ((term=sc.nextInt())>=0){
            double downPayment = sc.nextDouble();
            double loan =sc.nextDouble();

            double initialValue = downPayment + loan;
            double payment;
            if (term==0)
                payment = loan;
            else
                payment =loan/term;
            int numRecords =sc.nextInt();
            int[] months = new int[numRecords];
            double[] values = new double[numRecords];
            for (int i =0;i<numRecords;i++){
                months[i]=sc.nextInt();
                values[i]=sc.nextDouble();
            }
            double prev = values[0];
            double currentValue = initialValue -initialValue*prev;
            double owe = loan;
            int currentMonth;
            if (currentValue>owe)
                currentMonth=0;
            else{
                int i =1;
                currentMonth=1;
                while (true){
                    if (i<numRecords&&currentMonth==months[i]){
                        prev = values[i];
                        i++;
                    }
                    currentValue=currentValue-currentValue*prev;
                    owe-=payment;
                    if (currentValue>owe)
                        break;
                    currentMonth++;
                }
            }
            switch (currentMonth){
                case 1:
                    System.out.println(currentMonth + " month");
                    break;
                default:
                    System.out.println(currentMonth+" months");
                    break;
            }
        }
    }
}
