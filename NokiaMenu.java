import java.util.Scanner;

public class NokiaMenu {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;

while (true) {
System.out.println("\n=== SELECT MENU ===");
System.out.println("1. Phone Book");
System.out.println("2. Messages");
System.out.println("0. EXIT");
System.out.print("SELECT A FUNCTION FROM (1-2) or 0 to EXIT: ");
choice = sc.nextInt();

switch (choice) {
case 1 -> phoneBookMenu(sc);
case 2 -> messageMenu(sc);
case 0 -> {
System.out.println("THANKS FOR USING NOKIA\nGOODBYE");
return;
}
default -> System.out.println("INVALID CHOICE!");
}
}
}

static void phoneBookMenu(Scanner sc) {
while (true) {
System.out.println("\n=== PHONE BOOK MENU ===");
System.out.println("1. Search");
System.out.println("2. Add name");
System.out.println("3. Erase/Edit/Assign tone");
System.out.println("4. Speed dials");
System.out.println("5. Voice tags");
System.out.println("0. Back");
System.out.print("Choose an option: ");
int subChoice = sc.nextInt();

switch (subChoice) {
case 1 -> System.out.println("Searching phone book...");
case 2 -> System.out.println("Adding new contact...");
case 3 -> System.out.println("Edit or assign tone...");
case 4 -> System.out.println("Managing speed dials...");
case 5 -> System.out.println("Setting up voice tags...");
case 0 -> { return; }
default -> System.out.println("INVALID CHOICE!");
}
}
}

static void messageMenu(Scanner sc) {
while (true) {
System.out.println("\n=== MESSAGES MENU ===");
System.out.println("1. Write message");
System.out.println("2. Inbox");
System.out.println("3. Outbox");
System.out.println("0. Back");
System.out.print("Choose an option: ");
int subChoice = sc.nextInt();

switch (subChoice) {
case 1 -> System.out.println("Opening message editor...");
case 2 -> System.out.println("Viewing inbox...");
case 3 -> System.out.println("Viewing outbox...");
case 0 -> { return; }
default -> System.out.println("INVALID CHOICE!");
}
}
}
}