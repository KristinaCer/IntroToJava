package bill_generation;

import java.util.Scanner;

public class BillGeneration {
    public static void main(String[] args) {
        int pizzaPrice = 100;
        int puffPrice = 20;
        int drinkPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizzasNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the no of puffs bought:");
        int puffsNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the no of cool drinks bought:");
        int drinksNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Bill Details");
        System.out.println("No of pizzas:" +pizzasNo);
        System.out.println("No of puffs:" +puffsNo);
        System.out.println("No of cooldrinks:" + drinksNo);

        int total = pizzasNo*pizzaPrice + puffsNo * puffPrice + drinksNo * drinkPrice;
        System.out.println("Total price="+ total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
