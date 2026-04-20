import java.util.Scanner;

public class studentData{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two characters: Major and Year: ");
        String userInput = input.nextLine();
        
        if (userInput.length() != 2) {
            System.out.println("Invalid input: Enter exactly 2 characters");
        } else {
            char majorCode = Character.toUpperCase(userInput.charAt(0));
            char yearCode = userInput.charAt(1);
            
            String major;
            String year;
            
            // Check major with if-else: I, C, A
            if (majorCode == 'I') {
                major = "Information Management";
            } else if (majorCode == 'C') {
                major = "Computer Science";
            } else if (majorCode == 'A') {
                major = "Accounting";
            } else {
                major = "Invalid major";
            }
            
           
            if (yearCode == '1') {
                year = "Freshman";
            } else if (yearCode == '2') {
                year = "Sophomore";
            } else if (yearCode == '3') {
                year = "Junior";
            } else if (yearCode == '4') {
                year = "Senior";
            } else {
                year = "Invalid year";
            }
            
            System.out.println(major + " " + year);
        }
        
    }
}

