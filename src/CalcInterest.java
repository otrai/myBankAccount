import java.util.Scanner;

public class CalcInterest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double initialSavings;
        double interestRate;
        double currSavings;
        int i;

        System.out.print("Enter initial savings: ");
        initialSavings = scnr.nextDouble();

        System.out.print("Enter interest rate: ");
        interestRate = scnr.nextDouble();

        System.out.println("\nAnnual Savings for next 10 years: ");

        currSavings = initialSavings;
        for (i = 0; i < 10; ++i) {
            System.out.println("$" + currSavings);
            currSavings = currSavings + (currSavings * interestRate);

        }

    }
}
