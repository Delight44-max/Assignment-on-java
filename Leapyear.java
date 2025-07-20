import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter any year");
int years = input.nextInt();
 
if (years > 9999 || years < 1000) {
 System.out.println("invalid year.");
return;
}

if ((years % 4 == 0 && years % 100 != 0) ||(years % 400 == 0 )) {
System.out.println("is a leap year.");
         } else {
 System.out.println("is not a leap year.");
}
}
}




