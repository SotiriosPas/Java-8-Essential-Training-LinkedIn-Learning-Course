import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two decimal numbers, positive or negative. " +
                           "They will be stored as String objects. " +
                           "Then they will be added and their rounded sum will be printed.");

        System.out.print("Enter the first number: ");
        String stringValue1 = getValidNumber(scanner);

        System.out.print("Enter the second number: ");
        String stringValue2 = getValidNumber(scanner);

        double result = Math.round(Double.parseDouble(stringValue1) + Double.parseDouble(stringValue2));

        System.out.println("The sum is: " + result);

        scanner.close();
        }

    private static String getValidNumber(Scanner scanner) {

        boolean validInput = false;
        String userInput = scanner.nextLine();

        while(!validInput) {

            if (userInput.matches("-?\\d*\\.\\d+|-?\\d+")){
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                userInput = scanner.nextLine();
            }
        }
        return userInput;
    }
}
