import java.util.Scanner;

public class Factorefunction {

static Scanner input = new Scanner(System.in);

public static void factor() {

System.out.println("Enter an integer");
int userinput = input.nextInt();

int factorcount = 0;

for (int i = 1; i <= userinput;  i++) {

if (userinput % i == 0) {
factorcount++;
}
}
System.out.println(factorcount);
}
}

