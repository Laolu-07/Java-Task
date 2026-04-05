import java.util.Scanner;
public class Ass7 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter number from 0-1000 = ? ");

int kill = input.nextInt();

int kilom = kill % 10;

int kilomi = kill/10;

int kilomit = kilomi % 10;

int kilomiter = kilomi/10;

int killerBean = kilom + kilomit + kilomiter; 

System.out.println(" ans = " + killerBean);

}



}
