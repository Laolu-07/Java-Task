import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter score " + counter + ":");
            int score = input.nextInt();
            
            if (counter % 2 == 0) {
                total = total + score;
            }
            
            counter++; 
        }
        
        System.out.println("The sum of even-indexed scores is: " + total);
    }
}

