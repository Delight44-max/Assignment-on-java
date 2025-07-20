import java.util.Scanner;

public class Pallinfunc {

static Scanner input = new Scanner(System.in);

public static void pallindrome() {

System.out.println("Enter numbers");
int userinput = input.nextInt();

int numbers = userinput;
int reversed = 0;

while (userinput > 0) {

int digit = userinput % 10;
reversed = reversed * 10 + digit; 
userinput = userinput / 10;
}

if ( numbers == reversed ) {
System.out.println(true);
} else {
System.out.println(false);
}
}
}