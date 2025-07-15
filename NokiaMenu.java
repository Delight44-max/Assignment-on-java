import java.util.Scanner;
public class NokiaMenu {
public static void main(String[] args) {
  
Scanner sc = new Scanner(System.in);

System.out.println("=== SELECT MENU ===");
System.out.println("1. Phone Book");
System.out.println("2. Messages");
System.out.println("3. Chat");
System.out.println("4. Call Register");
System.out.println("5. Tones");
System.out.println("6. Settings");
System.out.println("7. Call Divert");
System.out.println("8. Games");
System.out.println("9. Calculator");
System.out.println("10. Reminders");
System.out.println("11. Clock");
System.out.println("12. Profiles");
System.out.println("13. SIM Services");
System.out.println("0. EXIT");
System.out.println("SELECT A FUNCTION FROM (1-13) or 0 to EXIT ");

while (true) {

System.out.println("Enter any number");
int choice = sc.nextInt();

switch(choice) {
case 1 -> System.out.println("=== PHONE BOOK LIST ===\n 1. Search\n 2. Add name\n Erase/ Edit/ Assign tone\n 3. Speed dails\n 4. Voice tags");
case 2 -> System.out.println("=== MESSAGES ===\n 1. Write messages\n 2. Inbox\n 3. Outbox\n 4. Picture messages\n 5. Templates\n 6. Message settings");
case 3 -> System.out.println("=== CHAT ===\n 1. SMS");
case 4 -> System.out.println("=== CALL REGISTER ===\n 1. Missed\n 2. Recieved\n 3. Dialled calls\n 4. Call duration");
case 5 -> System.out.println("=== TONES ===\n 1. Ringing tone and volumn\n 2. Composer\n 3. Message tone / Keypad tone\n 4. Vibrating alert/Screen saver");
case 6 -> System.out.println("=== SETTINGS ===\n 1. Call setting\n 2. Phone settings\n 3. Security settings\n 4. Restore factory settings");
case 7 -> System.out.println("=== CALL DIVERT ===\n 1. Divert when busy\n 2. unreachable");
case 8 -> System.out.println("=== GAMES ===\n 1. Snakes||\n 2. Space Impact\n 3. Bantumi\n 4. Paira||");
case 9 -> System.out.println("=== CALCULATOR ===\n 1. Simple calculator\n");
case 10 -> System.out.println("=== REMINDERS ===\n 1. Short text notes with alarm");
case 11 -> System.out.println("=== CLOCKS ===\n 1. Alarm clock\n 2. Stopwatch / Countdown timer\n 3. Date & time settings");
case 12 -> System.out.println("=== PROFILES ===\n 1. General\n 2. Silent\n 3. Loud\n");
case 13 -> System.out.println(" === SIM services ==\n 1. Mobile bank");
case 0 -> { System.out.println("THANKS FOR USING NOKIA\n GOODBYE");
return;
}
default -> System.out.println("INVALID CHOICE!"); 

}
} 
}
}
