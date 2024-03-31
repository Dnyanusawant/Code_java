//write a java program to find a charchter is alphabet or not.
import java.util.Scanner;

class Alphabet
{
public static void main(String[] args)
 {
  Scanner SC = new Scanner(System.in);
  
  System.out.println (" Enter the Charchter : ");  

  char ch=SC.next().charAt(0);


  System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?"alphabet":"not alphabet");
  }
}