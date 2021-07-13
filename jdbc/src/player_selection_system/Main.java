package player_selection_system;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum height");
        double height =sc.nextDouble();
        System.out.println("Enter the maximum weight");
        double weight = sc.nextDouble();
        PlayerSelectionsSystem sys = new PlayerSelectionsSystem();
        List<String> stats = sys.playersBasedOnHeightWeight(height, weight);
        if (stats != null && !stats.isEmpty()) {
            stats.forEach(System.out::println);
        } else {
            System.out.printf("No players are with minimum height of %.1f and maximum weight of %.1f", height, weight);
        }
    }
}
