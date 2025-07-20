import java.util.Scanner;
public class Selectmenu {

static Scanner input = new Scanner(System.in);

public static void phonebook() {

int choice;

while (true) {

System.out.println("\n=== PHONE BOOK MENU ===\n1. Search");
System.out.println("2. Add name");
System.out.println("3. Erase/Edit/Assign tone");
System.out.println("4. Speed dials");
System.out.println("5. Games");
System.out.println("6. Voice tags");
System.out.println("0. Back");
System.out.print("Choose an option ");

choice = input.nextInt();

switch (choice) {
case 1 ->System.out.println("Searching phone book...");
case 2 -> System.out.println("Adding new contact...");
case 3 -> System.out.println("Edit or assign tone...");
case 4 -> System.out.println("Managing speed dials...");
case 5 -> System.out.println("welcome lets Snakes");
case 6 -> System.out.println("Setting up voice tags...");
case 0 -> { return; }
default -> System.out.println("INVALID CHOICE!"); 
}
}
}

public static void message() {
int option;

while (true) {

System.out.println("\n=== MESSAGES === ");
System.out.println("1. Write messages");
System.out.println("2. inbox");
System.out.println("3. outbox");
System.out.println("4. sent items");
System.out.println("5. draft");
System.out.println("0. back");

option = input.nextInt();


switch (option) {
case 1 -> System.out.println("Opening message editor...");
case 2 -> System.out.println("Viewing inbox...");
case 3 -> System.out.println("Viewing outbox...");
case 4 -> System.out.println("Viewing sent items...");
case 5 -> System.out.println("Viewing draft...");
case 0 -> { return; }
default -> System.out.println("INVALID CHOICE!");
}
}
}

public static void settings() {

int select;
while (true) {
System.out.println("\n=== SETTINGS ==");
System.out.println("1. Tones");
System.out.println("2. Display");
System.out.println("0. back");

select = input.nextInt();


switch (select) {
case 1 -> System.out.print("Tone setting");
case 2 -> System.out.print(" Display Setting");
case 0 -> { return; }
default -> System.out.print(" INAVLID CHOICE !");
}
}
}

public static void callregister() {

int click;

while (true) {

System.out.println("\n=== CALL REGISTER ===");
System.out.println("1. missed call");
System.out.println("2. Received call");
System.out.println("3. Dailed number");
System.out.println("0. back");

click = input.nextInt();

switch(click) {
case 1 -> System.out.println("no missed calls");
case 2 -> System.out.println("recevied call....");
case 3 -> System.out.println(" Dailed number....");
case 0 -> { return; }
default -> System.out.println("INVALID CHOICE");
}
}
}
}
