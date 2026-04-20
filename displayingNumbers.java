import java.util.Scanner;

public class displayingNumbers {
    public static void main(String [] args){
  Scanner input = new Scanner (System.in);
    System.out.print("Enter n: ");
    int n = input.nextInt();
int power = 1;
for (int i = 1; i <= n; i++) {
power = power * 2;

    System.out.println ("2^" + i + " = " + power);
}
    }
}
