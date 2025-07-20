import java.util.Scanner;
public class Numbers {
public static void main(String[] args ) {
System.out.println("Miss Okpe enter two integers a and b");

Scanner input = new Scanner(System.in);

System.out.println("Enter for integer1");
int a = input.nextInt();

System.out.println("Enter for integer2");
int b = input.nextInt();

a = a + b;
b = a - b;

a = a - b;

System.out.println("After Swapping");
System.out.println("a = " + a);
System.out.println("b = " + b);
}
}
