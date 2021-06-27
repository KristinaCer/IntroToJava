package bank_account_details;


import java.util.Scanner;

public class AccountDetails {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account acc = getAccountDetails();
        acc.withdraw(getWithdrawAmount());
    }

    public static Account getAccountDetails() {
        Account account = new Account();
        int accId;
        String accType;
        int balance;
        System.out.println("Enter account id:");
        accId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter account type:");
        accType = scanner.nextLine();
        System.out.println("Enter balance:");
        balance = scanner.nextInt();
        while (balance<= 0){
            System.out.println("Balance should be positive");
            System.out.println("Enter balance:");
            balance = scanner.nextInt();
        }
        account.setAccountId(accId);
        account.setAccountType(accType);
        account.setBalance(balance);
        return account;
    }
    public static int getWithdrawAmount(){
        int moneyWithdrawn;
        System.out.println("Enter amount to be withdrawn:");
        moneyWithdrawn = scanner.nextInt();
        while (moneyWithdrawn <= 0){
            System.out.println("Amount should be positive");
            System.out.println("Enter amount to be withdrawn:");
            moneyWithdrawn = scanner.nextInt();
        }
        return moneyWithdrawn;
    }
}
