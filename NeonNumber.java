class NeonNumber {
    public static void main(String[] args) {
        int num = 1;
        int sqr=num*num;
        int sum = 0;
        while(sqr>0)
        {
            int rem = sqr%10;
            sum+= rem;
            sqr/=10;

        }
        if(sum==sum){
            System.out.println(num + "Neon Number");
        }else{
            System.out.println(num + "Not A Neon Number");
        }
    }
    
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
