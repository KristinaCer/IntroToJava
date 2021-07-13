package mobiles_within_the_range_JDBC;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MobileManagementSystem system = new MobileManagementSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum range");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the maximum range");
        int max = scanner.nextInt();
        scanner.nextLine();

        Map<Integer, Integer> values = system.viewMobileWithInTheRange(min, max);
        if (values != null && !values.isEmpty()) {
            values.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            });
        } else {
            System.out.println("No mobiles found for the given range");
        }
    }
}
