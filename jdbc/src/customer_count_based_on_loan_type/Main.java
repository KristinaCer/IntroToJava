package customer_count_based_on_loan_type;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanManagementSystem system = new LoanManagementSystem();
        boolean cont = true;
        while (cont) {
            System.out.println("Enter the type of loan to be searched");
            String type = sc.nextLine();
            int no = system.viewLoanCountBasedOnType(type);
            System.out.println("Number of customers who have taken " +type+" loan:" + no);
            System.out.println("Do you want to searched again the loan type (yes/no)");
            String answ = sc.nextLine();
            if (answ.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the Application");
                cont = false;
            }
        }
    }
}
