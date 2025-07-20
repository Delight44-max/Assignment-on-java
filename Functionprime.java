import java.util.Scanner;

public class Functionprime {

static Scanner input = new Scanner(System.in);
 
public static void prime() {

System.out.println("Enter any integer");
int userinput = input.nextInt();

boolean isPrime = true;
if ( userinput <= 1) {
isPrime = false; 
} else { 
for ( int i = 2; i < userinput; i++) {

if (userinput % i == 0) {
isPrime = false; 
break;

}
}
}

System.out.println(isPrime);
}
}