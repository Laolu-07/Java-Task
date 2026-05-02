import java.util.Scanner;
    public class FireDrill{
public static void main (String [] args){

Scanner input = new Scanner (System.in);
        
int Total = 0;
int counter = 1;

while (counter <= 10){
System.out.println("enter grade");
int grade = input.nextInt();
Total = Total + grade;
counter = counter + 1;
   }
int average = Total/2;
System.out.println(Total);
System.out.println(average);
    
}
}
