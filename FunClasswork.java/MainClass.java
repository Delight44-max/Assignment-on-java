import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
        FunctionsClassWork.greetingChooser();
        FunctionsClassWork.petChooser();
        FunctionsClassWork.ageChecker();
        FunctionsClassWork.numberSignChecker();
        FunctionsClassWork.evenOddChecker();
        FunctionsClassWork.gradeCalculator();
        FunctionsClassWork.simpleInterestCalculator();
        FunctionsClassWork.areaOfCircle();
        FunctionsClassWork.temperatureConverter();
        FunctionsClassWork.discountCalculator();
        FunctionsClassWork.maxOfTwoNumbers();
        FunctionsClassWork.minOfTwoNumbers();
        FunctionsClassWork.sumOfNNumbers();
        FunctionsClassWork.factorialCalculator();
        FunctionsClassWork.multiplicationTable();
        FunctionsClassWork.fibonacciSeries();
        FunctionsClassWork.vowelChecker();
        FunctionsClassWork.palindromeChecker();
        FunctionsClassWork.positiveNumberCounter();
        FunctionsClassWork.averageCalculator();
    }
}

class FunctionsClassWork {
    static Scanner scanner = new Scanner(System.in);

    public static void greetingChooser() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("Alex")) {
            System.out.println("Hello, friend!");
        } else {
            System.out.println("Hi, stranger!");
        }
    }

    public static void petChooser() {
        System.out.print("Do you like cats or dogs? ");
        String pet = scanner.nextLine();
        if (pet.equalsIgnoreCase("cats")) System.out.println("Meow!");
        else if (pet.equalsIgnoreCase("dogs")) System.out.println("Woof!");
        else System.out.println("Interesting choice!");
    }

    public static void ageChecker() {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); scanner.nextLine();
        if (age >= 18) System.out.println("You are an adult.");
        else System.out.println("You are a minor.");
    }

    public static void numberSignChecker() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); scanner.nextLine();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    public static void evenOddChecker() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); scanner.nextLine();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }

    public static void gradeCalculator() {
        System.out.print("Enter score: ");
        int score = scanner.nextInt(); scanner.nextLine();
        if (score >= 70) System.out.println("Grade: A");
        else if (score >= 60) System.out.println("Grade: B");
        else if (score >= 50) System.out.println("Grade: C");
        else if (score >= 40) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }

    public static void simpleInterestCalculator() {
        System.out.print("Enter principal: ");
        double p = scanner.nextDouble();
        System.out.print("Enter rate: ");
        double r = scanner.nextDouble();
        System.out.print("Enter time: ");
        double t = scanner.nextDouble(); scanner.nextLine();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public static void areaOfCircle() {
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble(); scanner.nextLine();
        System.out.println("Area = " + (Math.PI * r * r));
    }

    public static void temperatureConverter() {
        System.out.print("Enter Celsius: ");
        double c = scanner.nextDouble(); scanner.nextLine();
        System.out.println("Fahrenheit = " + ((c * 9/5) + 32));
    }

    public static void discountCalculator() {
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter discount %: ");
        double discount = scanner.nextDouble(); scanner.nextLine();
        System.out.println("Final price = " + (price - (price * discount / 100)));
    }

    public static void maxOfTwoNumbers() {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt(); scanner.nextLine();
        System.out.println("Max = " + Math.max(a, b));
    }

    public static void minOfTwoNumbers() {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt(); scanner.nextLine();
        System.out.println("Min = " + Math.min(a, b));
    }

    public static void sumOfNNumbers() {
        System.out.print("Enter N: ");
        int n = scanner.nextInt(); scanner.nextLine();
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum = " + sum);
    }

    public static void factorialCalculator() {
        System.out.print("Enter number: ");
        int n = scanner.nextInt(); scanner.nextLine();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial = " + fact);
    }

    public static void multiplicationTable() {
        System.out.print("Enter number: ");
        int n = scanner.nextInt(); scanner.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void fibonacciSeries() {
        System.out.print("Enter terms: ");
        int n = scanner.nextInt(); scanner.nextLine();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void vowelChecker() {
        System.out.print("Enter a letter: ");
        char ch = scanner.nextLine().toLowerCase().charAt(0);
        if ("aeiou".indexOf(ch) != -1) System.out.println("Vowel");
        else System.out.println("Consonant");
    }

    public static void palindromeChecker() {
        System.out.print("Enter word: ");
        String word = scanner.nextLine();
        String rev = new StringBuilder(word).reverse().toString();
        System.out.println(word.equalsIgnoreCase(rev) ? "Palindrome" : "Not palindrome");
    }

    public static void positiveNumberCounter() {
        System.out.print("Enter count of numbers: ");
        int count = scanner.nextInt();
        int positives = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            if (scanner.nextInt() > 0) positives++;
        }
        scanner.nextLine();
        System.out.println("Positive numbers: " + positives);
    }

    public static void averageCalculator() {
        System.out.print("Enter count of numbers: ");
        int count = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            sum += scanner.nextDouble();
        }
        scanner.nextLine();
        System.out.println("Average = " + (sum / count));
    }
}