import java.util.Scanner;
public class Divisionfunction {

static Scanner input = new Scanner(System.in);

public static void divide() {

System.out.println("Enter first number");
float number1 = input.nextFloat();

System.out.println("Enter second number");
float number2 = input.nextFloat();

float result;

if (number2 != 0) {
result = number1 / number2;
System.out.println(result);

} else {
result = 0;

}
}
}