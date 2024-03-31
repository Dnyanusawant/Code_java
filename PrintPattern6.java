public class PrintPattern6 {
        public static void main(String[] args) {
            char currentChar = 'A'; // Starting character
            int rowCount = 1; // Variable to keep track of the number of characters in each row
    
            // Outer loop for rows
            for (int i = 1; i <= 5; i++) {
                // Inner loop for printing characters in each row
                for (int j = 1; j <= rowCount; j++) {
                    System.out.print(currentChar + " ");
                    currentChar++; // Incrementing the character for the next iteration
                }
                System.out.println(); // Move to the next line after printing each row
                rowCount++; // Increment the number of characters for the next row
            }
        }
    }
    

