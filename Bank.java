import java.util.Scanner;
public class Bank {
public static void main(String[] args ) {
System.out.println("Interest Calculator ");

Scanner input = new Scanner(System.in);
System.out.println("Enter your real account balance sir Chibuzor");
double balance = input.nextDouble();
double interest = balance * (30.0 / 1200);

double newBalance = balance + interest;

System.out.println("interest Earned: " + interest);
System.out.println("New Balance: " + newBalance);
}
}




