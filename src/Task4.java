public class Task4 {
    public static void main(String[] args) {
        double firstPayment = 5000;
        double SALES_TAX = .17;
        double monthOne = (firstPayment * SALES_TAX) + firstPayment;
        double monthTwo = (monthOne * SALES_TAX) + monthOne;
        
        System.out.println("In the first month you will have $" + monthOne + ", in the second month you will have $" + monthTwo + ".");
        
    }
}
