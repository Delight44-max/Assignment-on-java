public class PatternB {
public static void main(String[] args) {

for (int i = 1; i <= 6; i++){
for (int j = 1; j <= i; j++){
System.out.print(j);

}

System.out.print("    ");



for (int k = 1; k <= 7 - i; k++){

System.out.print(k);
}


System.out.println();


}


for (int m = 1; m <= 6; m++){
for (int n = 1; n <= m; n++){

System.out.print(n);
}


System.out.print("    ");

for (int p = 1; p <= 7 - m; p++){

System.out.print(p);
}
System.out.println();


}
}
}