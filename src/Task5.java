import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double temperatureFahrenheit;
        double temperatureCelsius;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the temperature in fahrenheit");
        temperatureFahrenheit = scan.nextDouble();
        temperatureCelsius = (double) 5/9 * (temperatureFahrenheit - 32);
        System.out.println("The temperature you entered when converted from fahrenheit to celsius is " + temperatureCelsius + ".");

    }
}
