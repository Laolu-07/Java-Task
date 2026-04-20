import java.util.Scanner;

public class Factors {
    public static void main(String [] args){
  Scanner input = new Scanner (System.in);
    System.out.print("Enter number: ");
    int number = input.nextInt();
    System.out.print("Factor of " + number + ": ");
for (int i = 1; i <= number; i++){
    if (number% i == 0) {
System.out.println(i + "");
        }
    }
}
}

