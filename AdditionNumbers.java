import java.util.Scanner;
class AdditionNumbers
{
    public static void main(String []args) 
 {
    Scanner Sc = new Scanner(System.in);
    System.out.print("Entern num1 :");
    int num1 = Sc.nextInt();
    System.out.print("Entern num2 :");
    int num2 = Sc.nextInt();
    int add = num1+num2;
    System.out.println("Addition is :" +add);
  }
}
