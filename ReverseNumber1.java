import java.util.*;
class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        String rev ="";
        while(num>0)
        {
            int rem = num%10;
            rev = rev+rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
