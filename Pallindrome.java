import java.util.Scanner;
public class Pallindrome {
public static void main(String[] args) {
System.out.println("enter any number");

Scanner input = new Scanner(System.in);
int originalNumber = input.nextInt();

int number = originalNumber;
int reversed = 0;

while (number > 0) {
int digit = number % 10;
reversed = reversed * 10 + digit;
number = number / 10;
}

if (originalNumber == reversed) {
System.out.println(" it is a palindrome");
} else {
System.out.println("it is not a palindrome");
}
}
}
