import java.util.Scanner;

public class CollectAndPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10]; // array to hold 10 numbers

        // collect 10 numbers
        for (int amount = 0; amount < 10; amount++) {
            System.out.print("Enter number " + (amount + 1) + ": ");
            numbers[amount] = input.nextInt();
        }

        System.out.println("\nYou entered:");
        // print all numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
