import java.util.Scanner; 
class ScannerExample
 {
   public static void main(String []args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Name : ");
       String name = sc.next(); // Corrected variable name 'sc' to lowercase
       char ch = name.charAt(0); // Corrected method name to 'charAt'

       System.out.println("Hi, my name is " + name + " and my first character is " + ch);

       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
      {
           System.out.println("Character " + ch + " is a vowel.");
       } else {
           System.out.println("Character " + ch + " is a consonant.");
       }
   }
}
