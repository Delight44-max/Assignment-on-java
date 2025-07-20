import java.util.Scanner;

public class Squarefunction {

static Scanner input = new Scanner(System.in);

public static void square() {

System.out.println("Enter an integer");
int userinput = input.nextInt();

boolean isSquare = false;

for (int i = 1; i <= userinput; i++) {
if (i * i == userinput) {
isSquare = true;
break;
}
}
System.out.println(isSquare);
}
}
