import java.util.Scanner;

public class Multiplyfactorfunction {

static Scanner input = new Scanner(System.in);

public static void multipyfunction() {

System.out.println("Enter an integer");
int userinput = input.nextInt();

int factorproduct = 1;

for (int i = 1; i <= userinput;  i++) {

if (userinput % i == 0) {
factorproduct*= i;
}
}
System.out.println(factorproduct);
}
}

