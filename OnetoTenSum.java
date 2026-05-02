public class OnetoTenSum {
    public static void main(String[] args) {
        int sum = 0;   
        int count = 1;    

        while (x <= 10) {  
            sum = sum + count; 
            count = count + 1;     
        }

        System.out.print("The sum is: "); 
        System.out.println(sum);
    }
}
