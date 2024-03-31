import java.util.Scanner;

class MonthNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a month number :");
        int monthnum = SC.nextInt();
        String month = null;
        switch(monthnum) {
            case 1: month = "JAN"; break;
            case 2: month = "FEB"; break;
            case 3: month = "MAR"; break;
            case 4: month = "APR"; break;
            case 5: month = "MAY"; break;
            case 6: month = "JUNE"; break;
            case 7: month = "JULY"; break;
            case 8: month = "AUG"; break;
            case 9: month = "SEP"; break;
            case 10: month = "OCT"; break;
            case 11: month = "NOV"; break;
            case 12: month = "DEC"; break;
            default: System.out.println("Invalid Input");
        }
        System.out.println((month != null) ? (monthnum + " - " + month) : "");
    }
}
