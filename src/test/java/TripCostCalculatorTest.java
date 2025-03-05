// src/test/java/TripCostCalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripCostCalculatorTest {

    @Test
    public void testCalculateTotalFuelNeeded() {
        double distance = 200.0;
        double expectedFuelNeeded = (distance / 100) * 5.0;
        assertEquals(expectedFuelNeeded, TripCostCalculator.calculateTotalFuelNeeded(distance));
    }

    @Test
    public void testCalculateTotalCost() {
        double distance = 200.0;
        double fuelPrice = 1.5;
        double totalFuelNeeded = (distance / 100) * 5.0;
        double expectedTotalCost = totalFuelNeeded * fuelPrice;
        assertEquals(expectedTotalCost, TripCostCalculator.calculateTotalCost(distance, fuelPrice));
    }
}