import java.util.Scanner;
public class chin23 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("pls enter your number : ");

int digit = input.nextInt();


if (digit >= 100 && digit <= 999) {

System.out.print(" this is a three digit number ");
}

else {

System.out.print(" this is not a three digit number ");

}

}

}



