import java.util.Scanner;
public class Largest {
public static void main(String[] args) {
System.out.println("Enter any number");

Scanner input = new Scanner(System.in);
System.out.println("enter first number");
int num1 = input.nextInt();

System.out.println("enter second number");
int num2 = input.nextInt();

System.out.println("enter third number");
int num3 = input.nextInt();

System.out.println("enter fourth number");
int num4 = input.nextInt();

System.out.println("enter fifth number");
int num5 = input.nextInt();

int largest = num1;
int smallest = num1;

if (num2 > largest) largest = num2;
if (num3 > largest) largest = num3;
if (num4 > largest) largest = num4; 
if (num5 > largest) largest = num5;

if (num2 < smallest) smallest = num2;
if (num3 < smallest) smallest = num3;
if (num4 < smallest) smallest = num4;
if (num5 < smallest) smallest = num5;

System.out.println("Largest number is: " + largest);
System.out.println("Smallest number is: " + smallest);

}
} 




