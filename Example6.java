public class Example6 {
    public static void main(String[] args) {
        int num =13;
        int Count = 0;
        for(int i = 2;i<num;i++)
        {
            if(num%i==0){
                Count++;
                break;
            }
        }
        boolean flag = Count1==0?true:false;
        {
            int rev=0;
            while(num>0)
            {
                int rem =num%10;
                rev = rev*10+rem;
                num/=10;
            }

            int Count1=0;
            for(int i=2;i<rev;i++);
            {
                if(rev%i=0){
                    Count1 ++;
                    break;
                }
            }
        }

        if(flag&&flag)
        {
            System.out.println("Emirp Number");
        }else{
            System.out.println("NOT A Emirp Number");
        }
    }
    
}
