import java.util.Scanner;

public class menstrualApp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("you are welcome to MENSTRUAL APP.\n An app that helps you calculate everything that has to do wit your MENSTRUAL CYCLE ");
        
        System.out.print("\nEnter flow day: ");
        int day = input.nextInt();
        
        System.out.print("Enter flow month: ");
        int month = input.nextInt();
        
        System.out.print("Enter cycle length: ");
        
        int length = input.nextInt();
        
        calculate(day, month, length);
        
        input.close();
    }
    
    public static void calculate(int flowDay, int flowMonth, int length) {
    
        int eggDay = length - 14;  
              
        int riskStart = eggDay - 5;      
        int riskEnd = eggDay;          
        
        int safe1Start = 1;              
        int safe1End = riskStart - 1;    
        
        int safe2Start = eggDay + 1;     
        int safe2End = length;           
        
        int nextPeriodDay = length + 1;  
        
        System.out.println("\n=== Result ===");
        
        System.out.println("Period start: Day 1 = " + flowDay + "/" + flowMonth);
        
        System.out.println("Egg release day: Day " + eggDay);
        
        System.out.println("Pregnancy risk: Day " + riskStart + " to Day " + riskEnd);
        
        System.out.println("Safe days: Day " + safe1Start + " to Day " + safe1End);
        
        System.out.println("Safe days: Day " + safe2Start + " to Day " + safe2End);
        
        System.out.println("Next period starts: Day " + nextPeriodDay);
    }
}
