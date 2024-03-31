import java.util.Scanner;
public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int newnum=num+1;
        boolean flag = false;
        int sqqrt=0;
    
        for(int i=1;i<num/2;i++)
        {
            if(i*i==num){
               flag =true;
                sqrrt=i;
                break;
            }
        }
        if(flag){
            System.out.println(sqrrt +"is a perfect sunnyNumber of num "+newnum);
        }else{
            System.out.println(newnum+"do not have a perfect SunnyNUmber");
        }


    }
