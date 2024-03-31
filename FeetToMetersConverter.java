import java.util.Scanner;
class FeetToMetersConverter
 {
    public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();

        double meters = feet * 0.305;

        System.out.println(feet + " feet is " + meters + " meters.");

        scanner.close();
    }
}