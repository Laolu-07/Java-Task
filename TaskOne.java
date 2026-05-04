//import java.util.Scanner;
//public class TenScore{
//    public static void main (String [] args){
//    
//int [] score = new int[10];
//for (int number = 0; number < score.length; number++) {
//Scanner input = new Scanner (System.in);
//System.out.print ("enter your numbers");
//int count = input.nextInt();
//
//
// for (count = 0; count <= 10; count++);
// System.out.print(count);     
// }  
//    }
//}
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10]; 
        for (int amount = 0; amount < 10; amount++) {
            System.out.print("Enter number " + (amount + 1) + ": ");
            numbers[amount] = input.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int count = 0; count < numbers.length; count++) {
            System.out.println(numbers[count]);
        }

    }
}
