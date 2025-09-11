import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double springMaintenance;
        double summerMaintenance;
        double fallMaintenance;
        double winterMaintenance;
        Scanner scan = new Scanner(System.in);

        System.out.println("What was the home maintenance cost of spring?");
        springMaintenance = scan.nextDouble();
        System.out.println("What was the home maintenance cost of summer?");
        summerMaintenance = scan.nextDouble();
        System.out.println("What was the home maintenance cost of fall?");
        fallMaintenance = scan.nextDouble();
        System.out.println("What was the home maintenance cost of winter?");
        winterMaintenance = scan.nextDouble();
        double totalCost = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;
        System.out.println("Your total home maintenance cost for the year is $" + totalCost);

    }
}
