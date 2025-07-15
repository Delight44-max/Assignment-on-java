import java.util.Scanner;
public class Converter {
public static void main(String[] args ) {

Scanner input = new Scanner(System.in);
System.out.println("Enter weight in pounds (ib): ");
double weightValue = input.nextDouble();
double weightKg = weightValue * 0.453592;

System.out.println("Result");
System.out.println("weight in kilograms: " + weightKg);

}
}