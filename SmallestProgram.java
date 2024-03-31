import java.util.Scanner;

class SmallestNumberFinder
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare the two numbers and find the smallest one
        int smallest = (num1 < num2) ? num1 : num2;

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
