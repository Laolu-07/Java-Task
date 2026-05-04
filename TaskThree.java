import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10]; 
        for (int amount = 0; amount < 10; amount++) {
            System.out.print("Enter number " + (amount + 1) + ": ");
            numbers[amount] = input.nextInt();
        }

        System.out.print("\nYou entered:");
        for (int count = 0; count < numbers.length; count++) {
            System.out.println(numbers[count]);
        }

    }
}
