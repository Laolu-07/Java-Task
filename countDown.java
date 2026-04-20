import java.util.Scanner;

public class countDown {
    public static void main(String [] args){
  Scanner input = new Scanner (System.in);
    System.out.print("Enter starting number: ");
    int number = input.nextInt();
for (int i = number; i >= 1; i--){
    System.out.println(i);  
    }
System.out.println("blast off"); 
        }
}
