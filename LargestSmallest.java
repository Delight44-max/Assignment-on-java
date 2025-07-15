import java.util.Scanner;
public class LargestSmallest {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int number1 = input.nextInt();

System.out.println("Enter the second number");
int number2 = input.nextInt();

System.out.println("Enter the third number");
int number3 = input.nextInt();

System.out.println("Enter the fourth number");
int number4 = input.nextInt();

System.out.println("Enter the fifth number");
int number5 = input.nextInt();

int Largest = number1;
int Smallest = number1;


if (number2 > Largest) Largest = number2;
if (number3 > Largest) Largest = number3; 
if (number4 > Largest) Largest = number4;
if (number5 > Largest) Largest = number5;



if (number2 < Smallest)Smallest = number2;
if (number3 < Smallest) Smallest = number3;
if (number4 < Smallest) Smallest = number4;
if (number5 < Smallest) Smallest = number5;

System.out.println("Largest number is: " + Largest);
System.out.println("Smallest number is: " + Smallest );


}
} 



