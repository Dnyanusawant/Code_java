import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for balance
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        // Prompt user for annual interest rate
        System.out.print("Enter annual interest rate (e.g. 3 for 3%): ");
        double annualInterestRate = scanner.nextDouble();

        // Calculate monthly interest
        double monthlyInterest = calculateInterest(balance, annualInterestRate);

        // Display the interest for the next month
        System.out.println("The interest is " + monthlyInterest);

        scanner.close();
    }

    public static double calculateInterest(double balance, double annualInterestRate) {
        return balance * (annualInterestRate / 1200);
    }
}
