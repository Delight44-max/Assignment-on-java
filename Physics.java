import java.util.Scanner;
public class Physics {
public static void main(String[] args ) {
System.out.println("CALUCULATE YOUR AVERAGE VELOCITY SIR CHIBUZO");
System.out.println("Enter your intial velocity, final velocity and time");

Scanner input = new Scanner(System.in);
System.out.println("initial velocity (m/s):");
int v0 = input.nextInt();
System.out.println("finial velocity (m/s):");
int v1 = input.nextInt();

System.out.println("Time (seconds):");
int t = input.nextInt();

int result = (v1 - v0) / t;

System.out.println("Average acceleration: " + result + " m/s²");
}
}


