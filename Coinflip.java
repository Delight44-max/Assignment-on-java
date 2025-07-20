import java.util.Scanner;
public class Coinflip {
public static void main(String[] args) {
final int HEAD = 1;
final int TAIL = 0;
Scanner input = new Scanner(System.in);

System.out.println("Enter Tail or Head");
int guess = input.nextInt();

if (guess == HEAD) {
System.out.println("WOW! YOU GOT HEAD"); 

} else if (guess == TAIL) { 

System.out.println("WOW! YOU GOT TAIL");
return;
} else {
System.out.println("INVALID! TRY AGAIN");
}

}
}


