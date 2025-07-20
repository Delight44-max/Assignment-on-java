import java.util.Scanner;

public class Nokia3_0 {

static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
mainmenu();
}
public static void mainmenu() {

int choice;

while (true) {
System.out.println("\n=== NOKIA 3.0 ===");
System.out.println("1. phone book");
System.out.println("2. messages");
System.out.println("3. settings");
System.out.println("4. call register");
System.out.println("0. EXIT");

choice = input.nextInt();

switch (choice) {

case 1 -> Selectmenu.phonebook();
case 2 -> Selectmenu.message();
case 3 -> Selectmenu.settings();
case 4 -> Selectmenu.callregister();
case 0 -> { 
System.out.println("THANKS FOR USING NOKIA BYE!");

return; }

default -> System.out.println("INVALID CHOICE!");
}
}
}
}








