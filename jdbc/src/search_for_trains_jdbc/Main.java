package search_for_trains_jdbc;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // fill your code here
        System.out.println("Enter the source");
        String source = sc.nextLine();
        System.out.println("Enter the destination");
        String dest = sc.nextLine();
        System.out.println("Enter the coach type");
        String coachType = sc.nextLine();
        if (coachType.toLowerCase(Locale.ROOT).equals("ac1") || coachType.toLowerCase(Locale.ROOT).equals("ac2") ||
                coachType.toLowerCase(Locale.ROOT).equals("ac3") || coachType.toLowerCase(Locale.ROOT).equals("sleeper")
                || coachType.toLowerCase(Locale.ROOT).equals("seater")) {
            TrainManagementSystem system = new TrainManagementSystem();
            List<Train> trains = system.viewTrain(coachType, source, dest);
            if ((trains != null)) {
                for (Train train : trains) {
                    System.out.println(train.toString());
                }
            } else {
                System.out.println("No trains found");
            }
        } else {
            System.out.println("Invalid Coach Type");
        }
    }
}