import java.util.Scanner;
public class Ass10 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print(" amount of water = ? ");

int water = input.nextInt();

System.out.print(" Initial temperature = ? ");

int initemp = input.nextInt();

System.out.print(" Final temperature = ? ");

int finaltemp = input.nextInt();

double Energy = water * (finaltemp - initemp) * 4184;

System.out.println(" ans = " + Energy);

}



}
