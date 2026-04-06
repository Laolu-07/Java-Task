import java.util.Scanner;
public class chin5 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("i just flipped a coin. Guess \nif it is a tail enter 0 : \n If it a head enter 1 :");

int digit = input.nextInt();


if (digit == 0) {

System.out.print(" Wrong ");
}

if (digit == 1) {

System.out.print(" correct ");

}

}

}



