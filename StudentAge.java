import java.util.Scanner;
public class StudentAge {
public static void main(String[] args ) {
System.out.println("AGES OF SEMICOLON STUDENTS IN COHORT 26");
System.out.println("Enter your Age");
Scanner input = new Scanner(System.in);
System.out.println("Enter for Student 1:");
int age1 = input.nextInt();
System.out.println("Enter for Student 2:");
int age2 = input.nextInt();
System.out.println("Enter for Student 3:");
int age3 = input.nextInt();
System.out.println("Enter for Student 4:");
int age4 = input.nextInt();
System.out.println("Enter for Student 5:");
int age5 = input.nextInt();

int highest = age1;
int lowest = age1;

if (age2 > highest) highest = age2;
if (age2 < lowest) lowest = age2;
if (age3 > highest) highest = age3;
if (age3 < lowest) lowest = age3;
if (age4 > highest) highest = age4;
if (age4 < lowest) lowest = age4;
if (age5 > highest) highest = age5;
if (age5 < lowest) lowest = age5;

System.out.println("Highest age is: " + highest);
System.out.println("Lowest age is: " + lowest);

}
}