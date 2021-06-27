package find_average_age;

import java.util.Arrays;
import java.util.Scanner;

public class AvgAgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int empNo = scanner.nextInt();
        if (empNo < 2) {
            System.out.println("Please enter a valid employee count");
            System.exit(0);
        }
        int[] ages = new int[empNo];
        scanner.nextLine();
        System.out.println("Enter the age for "+ empNo+ " employees:");
        for (int i = 0; i < empNo; i++) {
            int age = scanner.nextInt();
            if(age < 28 || age > 40){
                System.out.println("Invalid age encountered!");
                System.exit(0);
            }
            ages[i] = age;
        }

        System.out.printf("The average age is %.2f", calculateAverage(ages));
    }

    public static double calculateAverage(int[] age) {
        return Arrays.stream(age)
                .average()
                .orElse(0);
    }
}
