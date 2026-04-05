import java.util.Scanner;
public class Ass6 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter subtotal = ? " );

double kils = input.nextDouble();

System.out.print("Enter Gratuity = ? ");

double kill = input.nextDouble();



double kilom = (kils * kill) / 100;

double kilomi = kilom + kils;

System.out.println(" Gratuity = $" + kilom);

System.out.println(" Total = $" + kilomi);

}



}
