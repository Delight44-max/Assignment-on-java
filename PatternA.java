public class patternA {
public static void main(String[] args) {

int row = 1;
while(true) {
int number = 1;
while(true) {

System.out.print(number + " ");
if (number == row) break;
number++;
}
row++;
System.out.println();
if (row > 6) break;
}
}
}


public class PatternB {
public static void main(String[] args) {


int column = 6;
while(true) {

column--;


int number = 1;
while(true) {
number++;
System.out.print(number + " ");
if (column < number) break;
}
}
}
}

