public class PrintPattern3 {
    public static void main(String[] args) {
        int n = 1; // Starting number
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n += 2; // Incrementing the number by 2 for the next iteration
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
