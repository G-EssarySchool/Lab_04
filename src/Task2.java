import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double priceOfPurchase;
        double salesTax = 1.05;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the price of your purchase.");
        priceOfPurchase = scan.nextDouble();
        double totalPrice = priceOfPurchase * salesTax;
        System.out.println("Your total with a 5% sales tax is $" + totalPrice);

    }
}