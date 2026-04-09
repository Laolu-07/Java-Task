import java.util.Scanner;

public class loop6 {

    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Put in your number here ");

        int n = input.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= n; i++) {
    sum += i;
            System.out.println(sum);
            
        }

    }
}
