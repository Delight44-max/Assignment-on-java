import java.util.Scanner;
public class OddEven {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter any number");
int number1 = input.nextInt();
 
if (number1 % 2 == 0 ) {
System.out.println("this is an Even Number");
} else {
System.out.println("this is odd number");
}
}
}



