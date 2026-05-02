import java.util.Scanner;
public class CollectionOfNumbers{
    public static void main (String [] args){
Scanner input = new Scanner (System.in);
 int[] numbers = new int[10];
for (int amount = 0; amount < 10; amount++) {
  System.out.print("Enter number: ");
     numbers[amount] = input.nextInt();
    
    }
for (int amount = 0; amount < numbers.length; amount++) {
   System.out.print(numbers[amount] + "  ");
        }
    }
}
