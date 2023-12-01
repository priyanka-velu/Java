import java.util.Scanner;

public class CT2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int income = 0;
        double taxRate = 0;
        double withholding = 0;

        System.out.print("Enter your weekly income: ");
        income = scnr.nextInt();

        if (income < 500) {
            taxRate = 0.1;
            withholding = income * taxRate;
        }
        else if ((income >= 500) && (income < 1500)) {
            taxRate = 0.15;
            withholding = income * taxRate;
        }
        else if ((income >= 1500) && (income < 2500)) {
            taxRate = 0.2;
            withholding = income * taxRate;
        }
        else if (income >= 2500) {
            taxRate = 0.3;
            withholding = income * taxRate;
        }
        
        System.out.println("According to your weekly income of $" + income + ", your tax rate is " + taxRate*100 + "% and your weekly average tax withholding is $" + withholding + ".");
    }
}
