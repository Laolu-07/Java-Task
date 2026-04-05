import java.util.Scanner;
public class Ass12 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print(" accelearation = ? ");

int water = input.nextInt();

System.out.print(" take-off speed = ? ");

int initemp = input.nextInt();

double runway = water * water / (2 * initemp);

System.out.println(" ans = " + runway);

}



}
