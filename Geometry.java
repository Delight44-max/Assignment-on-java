import java.util.Scanner;
public class Geometry {
public static void main(String[] args ) {
System.out.println("Area of a triangle");
System.out.println("Enter three sides of triangle");

Scanner input = new Scanner(System.in);
System.out.println("Enter first side");
int side1 = input.nextInt();
System.out.println("Enter second side");
int side2 = input.nextInt();
System.out.println("Enter third side");
int side3 = input.nextInt();

double s = (side1 + side2 + side3) / 2.0;
double s1 = s - side1;
double s2 = s - side2;
double s3 = s - side3;

double multiply = s * side1 * side2 * side3;

double area = Math.sqrt(multiply);
System.out.println("Area of the triangle is: " + area);
}
}   