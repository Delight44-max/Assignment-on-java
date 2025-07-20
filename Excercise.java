// CHAPTER 1 EXCERCISE. 

import java.util.Scanner;
public class Excercise {  
public static void main(String[] args) {

System.out.println("convert kilometers to miles then divide it by total time");

System.out.println( (14 * 0.62137) / (45 + 30));
System.out.println("Is the Average speed."); 


System.out.println("  J     A  V     V   A");
System.out.println("  J    A A  V   V   A A");
System.out.println("J J   AAAAA  V V   AAAAA");

int number = (365 * 24 * 60 * 60);
number = ((number / 7) - (number / 13 ) + (number / 45));
number = 312032486 + number; 
System.out.println( "year one is \n" + number); 

number = 312032486 + (365 * 24 * 60 * 60) ;
System.out.println( "year two is\n" + number); 

number = number + (365 * 24 * 60 * 60);
System.out.println( "year three is\n" + number);

number = number + (365 * 24 * 60 * 60);
System.out.println( "year four is\n" + number);

number = number + (365 * 24 * 60 * 60);
System.out.println( "year five is\n" + number);   

// CHAPTER 2 EXCERCISES

final double KILOMETERS_PER_MILE = 1.609;

double miles = 100;
double kilometers = (miles * KILOMETERS_PER_MILE);
kilometers = kilometers;

System.out.println("kilometers is\n" + kilometers); 

int numbers = (7 + 100) % 7;  
System.out.println(numbers +"\nso day 2 after tuesday is thursday" );
System.out.println(Math.pow(2, 3.5));
System.out.println(Math.pow(2, 2));

Scanner input = new Scanner(System.in);
System.out.println("Enter a degree in celscius:");

double celsius = input.nextDouble();

double fehrenheit = (9.0 / 5) * celsius + 32;
System.out.println( fehrenheit + "is Fehrenheit");
}
} 