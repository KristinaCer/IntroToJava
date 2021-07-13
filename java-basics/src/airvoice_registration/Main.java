package airvoice_registration;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Customer customer = new Customer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        System.out.println("Enter the ContactNumber:");
        long number = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the EmailId:");
        String emailId = sc.nextLine();
        System.out.println("Enter the Age:");
        int age = sc.nextInt();
        sc.nextLine();
        customer.setCustomerName(name);
        customer.setContactNumber(number);
        customer.setEmailId(emailId);
        customer.setAge(age);
        System.out.println("Name:" +customer.getCustomerName());
        System.out.println("ContactNumber:"+ customer.getContactNumber());
        System.out.println("EmailId:"+ customer.getEmailId());
        System.out.println("Age:"+customer.getAge());

    }
}
