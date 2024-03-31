import java.util.Scanner;

class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.println("Enter num2: ");
        double num2 = sc.nextDouble();

        double output = 0;
        switch(op) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    output = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + output);
    }
}

