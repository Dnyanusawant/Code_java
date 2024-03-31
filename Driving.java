import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age and test marks
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your RTO test marks: ");
        int testMarks = scanner.nextInt();

        // Check eligibility criteria
        if (age >= 18 && (testMarks > 60 || testMarks == -1)) {
            System.out.println("Congratulations! You are eligible for a driving license.");
        } else {
            System.out.println("Sorry, you are not eligible for a driving license.");
        }
    }
}
