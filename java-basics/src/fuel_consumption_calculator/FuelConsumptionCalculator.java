package fuel_consumption_calculator;

import java.util.Locale;
import java.util.Scanner;

public class FuelConsumptionCalculator {

    public static void main(String[] args) {
        /* Fuel Consumption Calculator */
        Scanner scanner = new Scanner(System.in);
        double noLiters;
        double distance;
        final double kmToMiles = 0.6214;
        final double literToGallon =0.2642;

        System.out.println("Enter the number of liters to fill the tank \n");
        noLiters = scanner.nextDouble();
        if(noLiters <= 0){
            System.out.println(noLiters + " is an Invalid Output");
            System.exit(0);
        }
        System.out.println("Enter the distance covered \n");
        distance = scanner.nextDouble();
        if(distance <= 0){
            System.out.println(distance + " is an Invalid Output");
            System.exit(0);
        }
        double consumption =  (noLiters / distance)* 100;
        System.out.println(String.format("Liters/100 KM \n %.2f", consumption));
        double distanceInMiles = distance * kmToMiles;
        double consumptionInGallons = noLiters * literToGallon;
        double result = distanceInMiles/consumptionInGallons;
        System.out.println (String.format("Miles/gallons \n %.2f", result));
    }

}
