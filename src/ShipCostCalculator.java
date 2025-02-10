import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost = (itemPrice >= 100) ? 0 : itemPrice * 0.02;
        double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total cost: $" + totalPrice);

        scanner.close();
    }
}