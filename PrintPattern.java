public class PrintPattern {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

