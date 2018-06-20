import java.util.Scanner;

public class Shopping {

    /**
     * This main() method is the entry point for every Java program
     * @param args
     */
    public static void main(String[] args) {
        String itemName = getItemName();
        double itemPrice = getItemPrice();
        double discountPrice = getItemDiscountPrice(itemPrice);
        double taxPrice = getItemTaxPrice(itemPrice, discountPrice);

        calculateFinalPriceAndDisplayOutput(itemName, itemPrice, discountPrice, taxPrice);
    }

    /**
     * Read the item name from keyboard and return it
     * @return String
     */
    private static String getItemName() {
        return read("Enter your item name: ");
    }

    /**
     * Read the item price from keyboard and return it
     * @return double
     */
    private static double getItemPrice() {
        return readDouble("Enter your item price: ");
    }

    /**
     * Read the discount rate from keyboard and calculate how much we will be saving
     *
     * @param itemPrice - the original item's price
     * @return double
     */
    private static double getItemDiscountPrice(double itemPrice) {
        double discountRate =  readDouble("Enter a discount rate: ");
        return itemPrice * discountRate;
    }

    /**
     * Read the tax rate from keyboard and calculate how much tax we have to pay
     * NOTE: We pay tax on the discounted price
     *
     * @param itemPrice - original item's price
     * @param discountPrice - discount price
     * @return double
     */
    private static double getItemTaxPrice(double itemPrice, double discountPrice) {
        double taxRate = readDouble("Enter a tax rate: ");
        return (itemPrice - discountPrice) * taxRate;
    }

    /**
     * Calculate the final price we have to pay for the item and display result
     *
     * @param itemName
     * @param itemPrice
     * @param discountPrice
     * @param taxPrice
     */
    private static void calculateFinalPriceAndDisplayOutput(
            String itemName, double itemPrice, double discountPrice, double taxPrice) {

        double finalPrice = itemPrice - discountPrice + taxPrice;

        System.out.println();
        System.out.println("*****RECEIPT*****");
        System.out.println(itemName + "  $" + itemPrice);
        System.out.println("You've saved $" + discountPrice + " on discount!");
        System.out.println("Tax: $" + taxPrice);
        System.out.println("You pay $" + finalPrice + " final price.");
        System.out.println("===Thank you for shopping at ComIT===");
    }

    /**
     * Display a question on screen and read input from keyboard as String
     *
     * @param command
     * @return String
     */
    private static String read(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextLine();
    }

    /**
     * Display a question on screen and read input from keyboard as double
     *
     * @param command
     * @return double
     */
    private static double readDouble(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextDouble();
    }
}
