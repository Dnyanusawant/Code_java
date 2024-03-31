public class PrintPattern4 {
    public static void main(String[] args) {
        int n = 1; // Starting number
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++; // Incrementing the number for the next iteration
            }
            System.out.println(); // Move to the next line after printing each row
            if (i % 2 == 1) { // Reverse the order of numbers in odd rows
                n += i; // Jump to the next number in the sequence
                for (int k = i; k >= 1; k--) {
                    System.out.print(n + " ");
                    n--; // Decrementing the number for the next iteration
                }
                n += i + 1; // Jump to the next number in the sequence for the next row
                System.out.println(); // Move to the next line after printing each row
            }
        }
    }
}

