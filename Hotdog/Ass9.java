import java.util.Scanner;
public class Ass9 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print(" Initial velocity U = ? ");

int kill = input.nextInt();

System.out.print(" Time span t = ? ");

int kilom = input.nextInt();

System.out.print(" Acceleration a = ? ");

int kilomi = input.nextInt();

double kilomit = kill * kilom + 1/2 * kilomi *  kilom * kilom;

System.out.println(" ans = " + kilomit);

}



}
