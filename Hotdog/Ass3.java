import java.util.Scanner;
public class Ass3 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Length = ? ");

int kill = input.nextInt();

int kilom = kill * kill * 3/4;

int kilomi = kilom * kill;

System.out.println(" volume = " + kilomi);

}



}
