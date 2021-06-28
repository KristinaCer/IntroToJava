package insurance_bazaar;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        getUserInput();
    }

    public static void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Policy names you want to store");
        int noOfPolicies = scanner.nextInt();
        scanner.nextLine();
        Bazaar bazaar = new Bazaar();

        for (int i = 0; i < noOfPolicies; i++){
            System.out.println("Enter the Policy ID");
            int policyId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the Policy Name");
            String policyName = scanner.nextLine();
            System.out.println();
            bazaar.addPolicyDetails(policyId, policyName);
        }

        System.out.println(bazaar.toString());

        System.out.println("Enter the policy type to be searched");
        String searchPolicyType = scanner.nextLine();
        List<Integer> codes = bazaar.searchBasedOnPolicyType(searchPolicyType);
        for (Integer code: codes){
            System.out.println(code);
        }
    }
}
