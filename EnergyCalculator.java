import java.util.Scanner;

class EnergyCalculator
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemp = scanner.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = scanner.nextDouble();

        double energy = calculateEnergy(weight, initialTemp, finalTemp);
        System.out.println("The energy needed is " + energy + " joules.");

        scanner.close();
    }

    public static double calculateEnergy(double weight, double initialTemp, double finalTemp) 
{
        return weight * (finalTemp - initialTemp) * 4184;
    }
}