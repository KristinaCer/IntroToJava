package authority;

import java.util.Scanner;

public class Authority {
    public static void main(String[] args) {
        String name;
        String fatherName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inmate's name:");
        name = scanner.nextLine();
        System.out.println("Inmate's father's name:");
        fatherName = scanner.nextLine();
        String concat;
        // if name OR surname does not match the regex, then finish the program.
        if (!(name.matches("^^[a-zA-Z]+[a-zA-Z\\s]*$"))){
            System.out.println("Invalid name");
            System.exit(0);
        } else{
            concat = name.toUpperCase().concat(" ").concat(fatherName.toUpperCase());
            System.out.println(concat);
        }
    }
}
