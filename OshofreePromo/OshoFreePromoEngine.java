import java.util.Scanner;

public class OshoFreePromoEngine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter cartTotal: ");
        int cartTotal = input.nextInt();
        
        input.nextLine(); 
        
        System.out.print("enter PromoCode: ");
        String PromoCode = input.nextLine();
        
        int finale = Oshofree(cartTotal, PromoCode);
        System.out.print(finale);
        
        input.close();
    }
    
    public static int Oshofree(int cartTotal, String PromoCode) {
        int result = cartTotal;
        
        if (cartTotal < 5000) {
            result = cartTotal;
            System.out.println("No discount - cart below ₦5000");
        }
        else if (cartTotal >= 5000 && PromoCode.equals("starter10")) {
            int discount = (cartTotal * 10) / 100;
            result = cartTotal - discount;
            System.out.println(discount);
        }
        else if (cartTotal >= 15000 && PromoCode.equals("bigboy20")) {
            int discount = (cartTotal * 20) / 100;
            result = cartTotal - discount;
            System.out.println(discount);
        } 
        else if (cartTotal >= 30000 && PromoCode.equals("oshofree35")) {
            int discount = (cartTotal * 35) / 100;
            result = cartTotal - discount;
            System.out.println(discount);
        }
        else {
            System.out.println("Invalid promo code or insufficient cart total");
        }
        
        return result;
    }
}
