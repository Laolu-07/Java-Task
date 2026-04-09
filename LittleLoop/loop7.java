import java.util.Scanner;

public class loop7 {

    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Put in your number here ");

        int n = input.nextInt();
        
        for (int i = n ; i >= 1; i--) {
    
            System.out.println(i);
            
        }

    }
}
