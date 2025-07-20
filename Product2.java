import java.util.Scanner;
public class Product2 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
long userinput = sc.nextLong();

long answer = 1;

for (long i = 1; i <= userinput; i++) {
if (i % 2 == 0) {
answer = answer * i;
}
}
System.out.print(answer);
}
}