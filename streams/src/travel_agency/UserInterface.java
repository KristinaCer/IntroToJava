package travel_agency;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the no of passengers");
        int passengersNo = Integer.parseInt(scanner.nextLine());
        double refund = 0.0;
        Ticket[] ticketArray = new Ticket[passengersNo];

        for (int i = 0; i < passengersNo; i++) {

            System.out.println("Details of Passenger " + (i+1) + ":");
            System.out.println("Enter the pnr no:");
            Long phoNo = Long.parseLong(scanner.nextLine());
            System.out.println("Enter passenger name:");
            String name = scanner.nextLine();
            System.out.println("Enter seat no:");
            int seatNo = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter class type:");
            String classType = scanner.nextLine();
            System.out.println("Enter ticket fare:");
            double ticketFare = Double.parseDouble(scanner.nextLine());
            ticketArray[i] = new Ticket(phoNo, name, seatNo, classType, ticketFare);
            CommissionInfo info = generateCommissionObtained();
            refund += info.calculateCommissionAmount(ticketArray[i]);
        }
        System.out.println("Commission Obtained");
        DecimalFormat formatter = new DecimalFormat("#.00");
        System.out.printf("Commission obtained per each person: Rs. %.2f", formatter.format(refund));
    }

    public static CommissionInfo generateCommissionObtained() {
        CommissionInfo info = ticketObj -> {
            double fee = ticketObj.getClassType().equalsIgnoreCase("sl") || ticketObj.getClassType().equalsIgnoreCase("2s") ? 60.0 : 100;
            return fee;
        };
        return info;
    }
}
