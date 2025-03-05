// src/main/java/TripCostCalculator.java
import java.util.Scanner;

public class TripCostCalculator {
    private static final double FUEL_CONSUMPTION_RATE = 5.0; // liters per 100 km

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to travel (in kilometers): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();

        double totalFuelNeeded = calculateTotalFuelNeeded(distance);
        double totalCost = calculateTotalCost(distance, fuelPrice);

        System.out.printf("The total cost of the trip is: %.2f\n", totalCost);

        scanner.close();
    }

    public static double calculateTotalFuelNeeded(double distance) {
        return (distance / 100) * FUEL_CONSUMPTION_RATE;
    }

    public static double calculateTotalCost(double distance, double fuelPrice) {
        double totalFuelNeeded = calculateTotalFuelNeeded(distance);
        return totalFuelNeeded * fuelPrice;
    }
}