import java.util.Scanner;

class Eligible 
{
    public static void main(String[] args)
   {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = SC.nextInt();

        System.out.print("Enter the property: ");
        double property = SC.nextDouble();

        System.out.print("Enter your surname: ");
        String surname = SC.next().toUpperCase();

        if ((age >= 21 && property >= 10000000) || surname.equals("AMBANI")) {
            System.out.println("You are eligible");
        } 
           else
        {
            System.out.println("You are not eligible");
        }
    }
}

