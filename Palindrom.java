public class Palindrom {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = SC.nextInt();
        int dup = num;
        int rev = 0;
        while(num>0)
        {
            int rem = num%10;
            rev=rev*10+rem;
            num/=10;
        }
            System.out.println((dup==rem)?"palindrom Number ":  "Not a pallindrom Number");
    }
    
}
