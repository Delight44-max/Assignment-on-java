import java.util.Scanner;
public class Quadratic {
public static void main(String[] args ) {
System.out.println("Enter the coeffecient of X ");

Scanner input = new Scanner(System.in);
System.out.println("A");
int A = input.nextInt();

System.out.println("B");
int B = input.nextInt();

System.out.println("C");
int C = input.nextInt();

double discriminant = (B * B) - (4 * A * C);
double denominator = 2.0 * A;

if (discriminant > 0) {
double x1 = (-B + Math.sqrt(discriminant)) / denominator;
double x2 = (-B - Math.sqrt(discriminant)) / denominator;
System.out.println("there is'nt root for this number:");
System.out.println("x1 = " + x1);
System.out.println("x2 = " + x2);

} else if (discriminant == 0)
{
double root = -B / denominator;
System.out.println("there is root and is equal:");
System.out.println("x = " + root);

} else {
System.out.println("roots are complex.");
}
}    
}



