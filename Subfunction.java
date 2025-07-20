import java.util.Scanner;

public class Subfunction {

static Scanner input = new Scanner(System.in);

public static void substraction() {

System.out.println("Enter first intergers");
int userinput1 = input.nextInt();

System.out.println("Enter Second interger");
int userinput2 = input.nextInt();

int numbers;

if (userinput1 > userinput2) {
numbers = userinput1 - userinput2;
} else { 
numbers = userinput2 - userinput1;
}

System.out.println(numbers);
}
}






