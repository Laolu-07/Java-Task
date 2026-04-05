import java.util.Scanner;
public class Ass14 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print(" Weight = ");

int weight = input.nextInt();

System.out.print(" Height = ? ");

int height = input.nextInt();

double pounds = weight * 0.45359237;

double inches = height * 0.0254;

System.out.println(" ans = " + pounds + height);

}



}
