import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2,operationSelector;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();
        System.out.println("1)Addition \n 2)Subtraction \n 3)Multiplication \n 4)Division");
        System.out.println("Your Selection(1-2-3-4): ");
        operationSelector = input.nextInt();

        switch (operationSelector){
            case 1: System.out.println("Addition = " + (number1 + number2)); break;
            case 2: System.out.println("Subtraction = " + (number1 - number2)); break;
            case 3: System.out.println("Multiplication = " + (number1 * number2)); break;
            case 4: System.out.println("Division = " + (number1 / number2)); break;

        }

    }
}