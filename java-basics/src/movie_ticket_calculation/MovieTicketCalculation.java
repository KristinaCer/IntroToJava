package movie_ticket_calculation;

import java.util.Scanner;

public class MovieTicketCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of ticket:");
        int ticketNo = sc.nextInt();
        sc.nextLine();
        if (ticketNo < 5 || ticketNo > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }

        System.out.println("Do you want refreshment:");
        String refresh = sc.next();
        sc.nextLine();
        double refreshFee = 0;
        if (refresh.equals("y")) {
            refreshFee = ticketNo * 50.00;
        }

        System.out.println("Do you have coupon code:");
        String hasCode = sc.next();
        sc.nextLine();
        Boolean hasCoupon = false;
        if (hasCode.equals("y")) {
            hasCoupon = true;
        }

        System.out.println("Enter the circle:");
        String circle = sc.next();
        sc.nextLine();
        if (!circle.equals("k") && !circle.equals("q")) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        double ticketFee = 0;
        if (circle.equals("k")) {
            ticketFee = ticketNo * 75.0;
        } else if (circle.equals("q")) {
            ticketFee = ticketNo * 150.0;
        } else {
            System.out.println("Invalid Input");
        }

        double price = calcPrice(ticketNo, refreshFee, hasCoupon, ticketFee);
        System.out.printf("Ticket cost:%.2f", price);
    }

    public static double calcPrice(int ticketNo, double refreshmentFee, boolean hasCoupon, double ticketFee) {
        double ticketFeeFinal = ticketFee;
        if (hasCoupon) {
            if (hasCoupon) {
                ticketFeeFinal = ticketFee - (ticketFee * 0.02);
            }
            if (ticketNo > 20) {
                ticketFeeFinal = ticketFee - (ticketFee * 0.1);
            }
        }
        return ticketFeeFinal + refreshmentFee;
    }
}


