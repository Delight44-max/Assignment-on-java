import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter any number");
int number = sc.nextInt();
int factor = 1;
int i = 1;

if ( number < 0) {
System.out.println(" this is a negative number");

} else {

do {
factor *= i; i++;

} while (i <= number);
System.out.println(factor);
}
}
}
