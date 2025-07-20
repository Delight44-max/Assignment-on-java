import java.util.Scanner;

public class Squareofintfunction {

static Scanner input = new Scanner(System.in);

public static void squareint() {

System.out.println("Enter an integer");
long userinput = input.nextLong();

long product = 1;

for (long i = 1; i <= userinput; i++) {
if (userinput % i == 0) {
product*= i;
}
}
System.out.println(product);
}
}