import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Getting the middle number");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number:");
        int number2 = input.nextInt();

        System.out.println("Enter third number:");
        int number3 = input.nextInt();

        int largest = number1;
        int smallest = number1;
        int middle = 0;

        // Find largest
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        // Find smallest
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        // Find middle
        if (number1 != largest && number1 != smallest) {
            middle = number1;
        } else if (number2 != largest && number2 != smallest) {
            middle = number2;
        } else {
            middle = number3;
        }

        // Output results
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Middle number is: " + middle);
    }
}