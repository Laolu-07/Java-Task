import java.util.Scanner;
public class pyramid {
    public static void main (String [] args) {

Scanner input = new Scanner (System.in);
System.out.print(" enter amount of times to loop: ");
    int count = input.nextInt();

for (int row = 1; row <= count; row++) {
    for (int column = 1; column <= count - row; column++){
        System.out.print (" ");
    }
   

       for (int third = 1; third <= row; third++){
            System.out.print ("  *");
        }
    System.out.println();
    }
}
}
