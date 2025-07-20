import java.util.Scanner;
public class Health {
public static void main(String[] args ) {
System.out.println("BMI");
System.out.println("Enter your weight and height");

Scanner input = new Scanner(System.in);
System.out.println("Enter weight in pounds (ib): ");
double weightValue = input.nextDouble();
double weightKg = weightValue * 0.453592;

System.out.println("Enter height inches(in): ");
double heightValue = input.nextDouble();
double heightM = heightValue * 0.0254;

double bmi = weightKg / (heightM * heightM);

System.out.printf("your weight in kg: %.2f kg%n", weightKg);
System.out.printf("your height meters: %.2f m%n", heightM);

System.out.printf("your BMI is: %.2f%n", bmi);
}
}
