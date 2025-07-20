import java.util.Scanner;

public class Evencheck {

static Scanner input = new Scanner(System.in);


public static void even() {

System.out.println("Enter any interger");
int userinput = input.nextInt();

boolean isEven = userinput % 2 == 0;
System.out.println(isEven);
}
}

