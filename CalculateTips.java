import java.util.Scanner;
class CalculateTips
 {
    public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();

        System.out.print("Enter the tip rate: ");
        double tipRate = scanner.nextDouble();

        double tip = subtotal * (tipRate / 100);
        double total = subtotal + tip;

        System.out.printf("The tip is %.2f and total is %.2f.\n", tip, total);

        scanner.close();
    }
}

