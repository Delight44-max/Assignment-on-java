import java.util.Scanner;
public class Return {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while (true) {
System.out.println("Enter number one");
int userinput1 = sc.nextInt();

System.out.println("Enter number two");
int userinput2 = sc.nextInt();
int sum = userinput1 + userinput2;

System.out.println("Sum " + sum);

System.out.println("Do you want to perform this operation again? (yes/no)");
String answer = sc.next();

if (answer.equals("no")) {
System.out.println("Thanks, operation ended.");
break;
}
}
}
}