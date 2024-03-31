import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        sum = sum + num%10;
        num = num/10;
        sum = sum + num%10;
        num = num/10;
        sum = sum = num%10;

        System.out.println("sum of the digits is " + sum + "and the number" + dup);

      }
}