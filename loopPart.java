import java.util.Scanner;

public class loopPart { 
    public static void main(String[] args) { 
        // Printing uppercase letters
        for(char ch ='A'; ch<='Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); // Move to the next line
        
        // Printing lowercase letters
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); // Move to the next line
        
        // Printing digits
        for(char ch = '0'; ch <= '9'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); // Move to the next line
    }
}


