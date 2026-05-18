import java.util.Scanner;

public class SemicolonCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] productNames = new String[100];
        int[] quantities = new int[100];
        double[] unitPrices = new double[100];

        int itemCount = 0;
        String addMore;

        System.out.println("=== Semicolon Store Checkout ===");

        do {
            System.out.print("Enter product name: ");
            productNames[itemCount] = input.nextLine();

            System.out.print("Enter quantity: ");
            quantities[itemCount] = input.nextInt();

            System.out.print("Enter unit price: ");
            unitPrices[itemCount] = input.nextDouble();
            input.nextLine(); // clear newline

            itemCount++;

            System.out.print("Add another item? (yes/no): ");
            addMore = input.nextLine();

        } while (addMore.equalsIgnoreCase("yes") && itemCount < 100);

        // Compute totals
        double subtotal = 0;
        for (int i = 0; i < itemCount; i++) {
            subtotal += quantities[i] * unitPrices[i];
        }

        // Discount rule: 5% if subtotal > 5000
        double discountRate = 0;
        if (subtotal > 5000) {
            discountRate = 0.05;
        }
        double discount = subtotal * discountRate;

        double vat = (subtotal - discount) * 0.075;
        double total = subtotal - discount + vat;

        // Print invoice
        System.out.println("\n========== INVOICE ==========");
        System.out.printf("%-15s %-8s %-10s %-10s\n", "Product", "Qty", "Price", "Total");
        System.out.println("----------------------------------------");

        for (int i = 0; i < itemCount; i++) {
            double itemTotal = quantities[i] * unitPrices[i];
            System.out.printf("%-15s %-8d %-10.2f %-10.2f\n",
                productNames[i], quantities[i], unitPrices[i], itemTotal);
        }

        System.out.println("----------------------------------------");
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Discount (%.0f%%): %.2f\n", discountRate * 100, discount);
        System.out.printf("VAT 7.5%%: %.2f\n", vat);
        System.out.printf("Total: %.2f\n", total);
        System.out.println("========== Thank You! ==========");

        input.close();
    }
}
