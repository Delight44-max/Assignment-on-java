import java.util.Scanner;
public class Integers {
public static void main(String[] args ) {
System.out.println("SUM OF ODD AND EVEN NUMBERS");
System.out.println("Enter Two odd numbers and two even numbers");

Scanner input = new Scanner(System.in);
System.out.println("Enter first odd number");
int num1 = input.nextInt();
System.out.println("Enter second odd number");
int num2 = input.nextInt();
System.out.println("Enter first even number");
int num3 = input.nextInt();
System.out.println("Enter second even number");
int num4 = input.nextInt();

int oddSum = 0;
int evenSum = 0;

if (num1 % 2 != 0) {
oddSum += num1; }
else { 
evenSum += num1;
}

if (num2 % 2 != 0) {
oddSum += num2; }
else {
evenSum += num2; }

if (num3 % 2 != 0) {
oddSum += num3; }
else {
evenSum += num3; }

if (num4 % 2 != 0) {
oddSum += num4; }
else {
evenSum += num4; }

System.out.println("Sum of odd numbers: " + oddSum);
System.out.println("Sum of even numbers: " + evenSum);
}
}
 


