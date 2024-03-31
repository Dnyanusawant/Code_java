import java.util.*;
class Passward {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int attempt = 1;

        for (;;) {
            int StoredPin = 123;
            int count = 3;

            do {
                System.out.println("Enter Your PIN: ");
                int UserPin = SC.nextInt();

                if (UserPin == StoredPin) {
                    System.out.println("WELCOME");
                    return; // Exit program on successful login
                } else {
                    count--;
                    System.out.println("Wrong PIN. Attempts left: " + count);
                    if (count == 0) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("You can try to enter your PIN again.");
                        count = 3; // Reset attempts
                    }
                }
            } while (count > 0);

            if (attempt++ == 2) {
                System.out.println("Maximum attempts reached. Exiting program.");
                return;
            }
        }
    }
}



