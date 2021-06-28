package exceptions.array_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException extends Exception {
    public static void main(String[] args) {
        new ArrayException().getPriceDetails();
    }

    public String getPriceDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int arrSize = 0;
        try {
            arrSize = Integer.parseInt(scanner.nextLine());
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        }
        int[] prices = new int[arrSize];
        System.out.println("Enter the price details");
        for (int i = 0; i < arrSize; i++) {
            try {
                prices[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                return "Input was not in the correct format";
            }
        }
        System.out.println("Enter the index of the array element you want to access");
        try {
            int index = scanner.nextInt();
            return "The array element is " + prices[index];
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }
    }
}
