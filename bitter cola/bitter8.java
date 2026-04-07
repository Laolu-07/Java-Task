import java.util.Scanner;
public class bitter8 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("pls enter your 4 digit pin here : ");

int digit = input.nextInt();


if (digit >= 1000 && digit <= 9999) {

System.out.println(" this is a four digit number ");
}

else {

System.out.println(" this is not a four digit number ");

}

}

}

