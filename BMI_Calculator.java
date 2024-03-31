import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Prompt user for height in inches
        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Convert height from inches to meters
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = calculateBMI(weightInKilograms, heightInMeters);

        // Display the BMI
        System.out.println("BMI is " + bmi);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

