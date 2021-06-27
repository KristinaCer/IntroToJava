package employee_loan_eligibility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Kristina", 100);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(102, "Anna", 6, 100);

        Loan loan = new Loan();
        double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);
        double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);

        System.out.println(permanentEmployeeLoan);
        System.out.println(temporaryEmployeeLoan);
    }
}
