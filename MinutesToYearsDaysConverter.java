import java.util.Scanner;
class MinutesToYearsDaysConverter
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long years = minutes / (minutesInYear);
        long days = (minutes / (60 * 24)) % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }
}