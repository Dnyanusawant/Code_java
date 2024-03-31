import java.util.Scanner;

class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Do you have a voter ID (yes/no)");
            String voterID = sc.next().toUpperCase();
            if (voterID.equals("YES")) {
                System.out.println("*****WELCOME*****");
                System.out.println("1. BJP");
                System.out.println("2. Congress");
                System.out.println("3. AAP");
                System.out.println("4. MNS");
                System.out.println("5. Shivsena");
                System.out.println("6. NCP");
                System.out.println("7. NOTA");

                System.out.println("Enter the option to vote for your Favorite Party:");
                String vote = sc.next().toUpperCase();
                if (vote.equals("BJP")) {
                    System.out.println("You have voted for BJP");
                } else if (vote.equals("CONGRESS")) {
                    System.out.println("You have voted for Congress");
                } else if (vote.equals("AAP")) {
                    System.out.println("You have voted for AAP");
                } else if (vote.equals("MNS")) {
                    System.out.println("You have voted for MNS");
                } else if (vote.equals("SHIVSENA")) {
                    System.out.println("You have voted for Shivsena");
                } else if (vote.equals("NCP")) {
                    System.out.println("You have voted for NCP");
                } else if (vote.equals("NOTA")) {
                    System.out.println("Thank you for spending your valuable time.");
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("Jaldi yaha se bhagooo");
            }
        } else {
            System.out.println("You are not mature enough to vote. Try after " + (18 - age) + " years.");
        }
    }
}
