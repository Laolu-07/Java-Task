import java.util.Scanner;

public class bitter7 {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

System.out.println ("please enter a digit : ");

int bit = input.nextInt();

if (bit%5 == 0) { 

System.out.println("Buzz");

}

if (bit%3 == 0) {

System.out.println("Fizz");

}

if (bit% 3  == 0 &&  bit% 5 == 0) {

System.out.println("FizzBuzz");

}

}






}
